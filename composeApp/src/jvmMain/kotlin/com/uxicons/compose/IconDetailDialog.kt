package com.uxicons.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.solid.chubby.CopyAlt
import com.uxicons.compose.uicons.solid.chubby.Cross
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection

@Composable
fun IconDetailDialog(
    icon: ImageVector,
    onDismissRequest: () -> Unit
) {
    var selectedColor by remember { mutableStateOf(Color.Black) }
    
    // Simple color palette
    val colors = listOf(
        Color.Black,
        Color.DarkGray,
        Color.Gray,
        Color(0xFF6200EE), // Purple
        Color(0xFF03DAC5), // Teal
        Color(0xFFB00020), // Red
        Color(0xFFE91E63), // Pink
        Color(0xFF4CAF50), // Green
        Color(0xFFFF9800), // Orange
        Color(0xFF2196F3)  // Blue
    )

    AlertDialog(
        onDismissRequest = onDismissRequest,
        confirmButton = {
            TextButton(onClick = onDismissRequest) {
                Text("Close")
            }
        },
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Icon Details")
                IconButton(onClick = onDismissRequest) {
                    Icon(Icons.Sc.Cross, contentDescription = "Close")
                }
            }
        },
        text = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                // Large Icon Preview
                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .border(1.dp, MaterialTheme.colorScheme.outlineVariant, RoundedCornerShape(16.dp))
                        .padding(24.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = icon.name,
                        modifier = Modifier.fillMaxSize(),
                        tint = selectedColor
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Icon Name
                Text(
                    text = icon.name,
                    style = MaterialTheme.typography.titleMedium
                )
                
                Spacer(modifier = Modifier.height(16.dp))
                
                // Color Chooser
                Text("Preview Color", style = MaterialTheme.typography.labelMedium)
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    colors.forEach { color ->
                        Box(
                            modifier = Modifier
                                .padding(4.dp)
                                .size(24.dp)
                                .clip(CircleShape)
                                .background(color)
                                .border(
                                    width = if (selectedColor == color) 2.dp else 0.dp,
                                    color = if (selectedColor == color) MaterialTheme.colorScheme.primary else Color.Transparent,
                                    shape = CircleShape
                                )
                                .clickable { selectedColor = color }
                        )
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // Copy Code Feature
                val codeSnippet = "Icon(Icons.${getIconStylePrefix(icon.name)}.${icon.name}, contentDescription = \"${icon.name}\")"
                
                OutlinedTextField(
                    value = codeSnippet,
                    onValueChange = {},
                    readOnly = true,
                    label = { Text("Compose Code") },
                    trailingIcon = {
                        IconButton(onClick = {
                            val selection = StringSelection(codeSnippet)
                            Toolkit.getDefaultToolkit().systemClipboard.setContents(selection, selection)
                        }) {
                            Icon(Icons.Sc.CopyAlt, contentDescription = "Copy")
                        }
                    },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    )
}

// Helper to guess style prefix based on icon name pattern (heuristic)
fun getIconStylePrefix(name: String): String {
    return when {
         name.startsWith("Sc") -> "Sc" // Solid Chubby
         name.startsWith("Rr") -> "Rr" // Regular Rounded
         name.startsWith("Br") -> "Br" // Bold Rounded
         name.startsWith("Bs") -> "Bs" // Bold Straight
         name.startsWith("Rc") -> "Rc" // Regular Chubby
         name.startsWith("Rs") -> "Rs" // Regular Straight
         name.startsWith("Sr") -> "Sr" // Solid Rounded
         name.startsWith("Ss") -> "Ss" // Solid Straight
         name.startsWith("Tc") -> "Tc" // Thin Chubby
         name.startsWith("Tr") -> "Tr" // Thin Rounded
         name.startsWith("Ts") -> "Ts" // Thin Straight
         else -> "Brand" // Default/Brand
    }
}
