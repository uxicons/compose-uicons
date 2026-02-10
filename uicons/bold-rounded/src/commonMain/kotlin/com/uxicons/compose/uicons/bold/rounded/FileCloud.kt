package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileCloud: ImageVector? = null

val Icons.Br.FileCloud: ImageVector
    get() = _FileCloud ?: UXIcon(name = "FileCloud") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 15.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5.67f)
            curveToRelative(-1.01f, 0f, -1.83f, -0.82f, -1.83f, -1.83f)
            curveToRelative(0f, -0.97f, 0.76f, -1.75f, 1.71f, -1.81f)
            curveToRelative(-0.13f, -0.35f, -0.21f, -0.72f, -0.21f, -1.11f)
            curveToRelative(0f, -1.79f, 1.46f, -3.25f, 3.25f, -3.25f)
            curveToRelative(1.73f, 0f, 3.12f, 1.35f, 3.23f, 3.05f)
            curveToRelative(1.15f, 0.22f, 2.02f, 1.24f, 2.02f, 2.45f)
            close()
            moveTo(22f, 8.16f)
            verticalLineToRelative(10.34f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(7.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(2f, 5.5f)
            curveTo(2f, 2.47f, 4.47f, 0f, 7.5f, 0f)
            horizontalLineToRelative(6.34f)
            curveToRelative(1.47f, 0f, 2.85f, 0.57f, 3.89f, 1.61f)
            lineToRelative(2.66f, 2.66f)
            curveToRelative(1.04f, 1.04f, 1.61f, 2.42f, 1.61f, 3.89f)
            close()
            moveTo(19f, 18.5f)
            lineTo(19f, 9f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            lineTo(13f, 3f)
            lineTo(7.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
    }.also { _FileCloud = it }
