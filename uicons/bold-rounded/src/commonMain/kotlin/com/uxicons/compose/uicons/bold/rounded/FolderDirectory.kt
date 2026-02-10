package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderDirectory: ImageVector? = null

val Icons.Br.FolderDirectory: ImageVector
    get() = _FolderDirectory ?: UXIcon(name = "FolderDirectory") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 11.34f)
            verticalLineToRelative(4.52f)
            curveToRelative(0f, 1.01f, -1.23f, 1.52f, -1.94f, 0.81f)
            lineToRelative(-1.36f, -1.36f)
            curveToRelative(-1.16f, 1.05f, -1.7f, 1.91f, -1.7f, 2.69f)
            curveToRelative(0.02f, 0.59f, 0.29f, 2f, 2.5f, 2f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-4.04f, 0f, -5.5f, -2.99f, -5.5f, -5f)
            curveToRelative(0f, -1.88f, 1.08f, -3.44f, 2.57f, -4.82f)
            lineToRelative(-1.24f, -1.24f)
            curveToRelative(-0.72f, -0.72f, -0.21f, -1.94f, 0.81f, -1.94f)
            horizontalLineToRelative(4.52f)
            curveToRelative(0.74f, 0f, 1.34f, 0.6f, 1.34f, 1.34f)
            close()
            moveTo(18.5f, 3f)
            horizontalLineToRelative(-5.53f)
            curveToRelative(-0.08f, 0f, -0.15f, -0.02f, -0.22f, -0.05f)
            lineToRelative(-3.16f, -1.58f)
            curveToRelative(-0.48f, -0.24f, -1.02f, -0.37f, -1.56f, -0.37f)
            horizontalLineToRelative(-2.53f)
            curveTo(2.47f, 1f, 0f, 3.47f, 0f, 6.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 8f)
            lineTo(20.95f, 8f)
            curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 8.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
        }
    }.also { _FolderDirectory = it }
