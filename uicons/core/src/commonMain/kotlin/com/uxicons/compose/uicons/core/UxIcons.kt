package com.uxicons.compose.uicons.core

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

inline fun UXIcon(
    name: String,
    viewportWidth: Float = 24.0f,
    viewportHeight: Float = 24.0f,
    block: ImageVector.Builder.() -> Unit
): ImageVector =
    ImageVector.Builder(
        name = name,
        defaultWidth = viewportWidth.dp,
        defaultHeight = viewportHeight.dp,
        viewportWidth = viewportWidth,
        viewportHeight = viewportHeight
    ).apply(block).build()
