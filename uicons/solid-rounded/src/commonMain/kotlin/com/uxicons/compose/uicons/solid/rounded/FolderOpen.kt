package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderOpen: ImageVector? = null

val Icons.Sr.FolderOpen: ImageVector
    get() = _FolderOpen ?: UXIcon(name = "FolderOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 18f)
                lineTo(0f, 5f)
                curveTo(0f, 2.79f, 1.79f, 1f, 4f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.46f, 0f, 0.93f, 0.11f, 1.34f, 0.32f)
                lineToRelative(3.15f, 1.58f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.1f, 0.45f, 0.1f)
                horizontalLineToRelative(5.06f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                horizontalLineToRelative(-10.98f)
                curveToRelative(-2.64f, 0f, -5.0f, 1.77f, -5.75f, 4.3f)
                lineToRelative(-2.67f, 9.34f)
                curveToRelative(-0.98f, -0.91f, -1.6f, -2.2f, -1.6f, -3.64f)
                close()
                moveTo(23.49f, 11.02f)
                curveToRelative(-0.48f, -0.64f, -1.21f, -1.01f, -2.01f, -1.02f)
                curveToRelative(-0.01f, 0f, -0.03f, 0.01f, -0.04f, 0.01f)
                horizontalLineToRelative(-11.42f)
                curveToRelative(-1.76f, 0f, -3.33f, 1.18f, -3.83f, 2.86f)
                lineToRelative(-2.82f, 9.84f)
                curveToRelative(0.51f, 0.18f, 1.05f, 0.29f, 1.63f, 0.29f)
                horizontalLineToRelative(12.56f)
                curveToRelative(2.23f, 0f, 4.15f, -1.43f, 4.8f, -3.61f)
                lineToRelative(1.53f, -6.12f)
                curveToRelative(0.23f, -0.78f, 0.09f, -1.6f, -0.4f, -2.26f)
                close()
            }
        }.also { _FolderOpen = it}
