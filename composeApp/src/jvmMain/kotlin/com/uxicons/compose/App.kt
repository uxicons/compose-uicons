package com.uxicons.compose

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun App() {
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    var searchQuery by remember { mutableStateOf("") }
    var selectedIcon by remember { mutableStateOf<ImageVector?>(null) }
    var selectedStyle by remember { mutableStateOf(IconStyle.BRAND) }

    // Get icons for the selected style
    val currentIcons = remember(selectedStyle) {
        IconRegistry.getIcons(selectedStyle)
    }

    // Filter icons based on search query
    val filteredIcons by remember(searchQuery, currentIcons) {
        derivedStateOf {
            if (searchQuery.isBlank()) {
                currentIcons
            } else {
                currentIcons.filter { it.name.contains(searchQuery, ignoreCase = true) }
            }
        }
    }

    MaterialTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxSize()) {
                // Search bar
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    placeholder = { Text("Search icons...") },
                    singleLine = true,
                    shape = MaterialTheme.shapes.medium
                )

                // Style filter chips (responsive wrapping)
                FlowRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 4.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    IconStyle.entries.forEach { style ->
                        FilterChip(
                            selected = selectedStyle == style,
                            onClick = { selectedStyle = style },
                            label = { Text(style.displayName) }
                        )
                    }
                }

                // Results count
                Text(
                    text = "${filteredIcons.size} icons in ${selectedStyle.displayName}",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 4.dp)
                )

                // Icon grid
                if (filteredIcons.isEmpty()) {
                    Box(
                        modifier = Modifier.fillMaxSize().weight(1f),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "No icons found",
                            style = MaterialTheme.typography.headlineSmall
                        )
                    }
                } else {
                    LazyVerticalGrid(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f)
                            .padding(horizontal = 8.dp),
                        columns = GridCells.Adaptive(minSize = 56.dp),
                        contentPadding = PaddingValues(8.dp)
                    ) {
                        items(
                            items = filteredIcons,
                            key = { "${selectedStyle.name}_${it.name}" }
                        ) { icon ->
                            IconButton(onClick = { selectedIcon = icon }) {
                                Icon(
                                    imageVector = icon,
                                    modifier = Modifier
                                        .size(48.dp)
                                        .padding(8.dp),
                                    contentDescription = icon.name
                                )
                            }
                        }
                    }
                }
            }

            if (selectedIcon != null) {
                IconDetailDialog(
                    icon = selectedIcon!!,
                    onDismissRequest = { selectedIcon = null }
                )
            }

            SnackbarHost(
                hostState = snackbarHostState,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(16.dp)
            )
        }
    }
}