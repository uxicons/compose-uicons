package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderOpen: ImageVector? = null

val Icons.Br.FolderOpen: ImageVector
    get() = _FolderOpen ?: UXIcon(name = "FolderOpen") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.39f, 11.23f)
            curveToRelative(-0.57f, -0.77f, -1.44f, -1.21f, -2.4f, -1.23f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            horizontalLineToRelative(-4.06f)
            curveToRelative(-0.08f, 0f, -0.15f, -0.02f, -0.22f, -0.05f)
            lineToRelative(-3.15f, -1.58f)
            curveToRelative(-0.48f, -0.24f, -1.02f, -0.37f, -1.56f, -0.37f)
            horizontalLineToRelative(-2f)
            curveTo(2.02f, 1f, 0f, 3.02f, 0f, 5.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(11.56f)
            curveToRelative(2.45f, 0f, 4.57f, -1.57f, 5.27f, -3.92f)
            lineToRelative(1.54f, -5.15f)
            curveToRelative(0.28f, -0.94f, 0.11f, -1.92f, -0.48f, -2.7f)
            close()
            moveTo(4.87f, 13.02f)
            lineToRelative(-1.78f, 5.12f)
            curveToRelative(-0.05f, -0.2f, -0.08f, -0.42f, -0.08f, -0.64f)
            verticalLineToRelative(-9.5f)
            horizontalLineToRelative(14.95f)
            curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(-8.88f)
            curveToRelative(-1.91f, 0f, -3.62f, 1.21f, -4.25f, 3.02f)
            close()
            moveTo(19.45f, 18.22f)
            curveToRelative(-0.32f, 1.07f, -1.28f, 1.78f, -2.4f, 1.78f)
            lineTo(5.61f, 20.0f)
            lineToRelative(2.09f, -5.99f)
            curveToRelative(0.21f, -0.6f, 0.78f, -1.01f, 1.42f, -1.01f)
            horizontalLineToRelative(11.88f)
            lineToRelative(-1.54f, 5.22f)
            close()
        }
    }.also { _FolderOpen = it }
