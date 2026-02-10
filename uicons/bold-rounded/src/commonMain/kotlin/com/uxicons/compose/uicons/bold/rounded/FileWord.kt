package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileWord: ImageVector? = null

val Icons.Br.FileWord: ImageVector
    get() = _FileWord ?: UXIcon(name = "FileWord") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 8.16f)
            curveToRelative(0f, -1.47f, -0.57f, -2.85f, -1.61f, -3.89f)
            lineToRelative(-2.66f, -2.66f)
            curveToRelative(-1.04f, -1.04f, -2.42f, -1.61f, -3.89f, -1.61f)
            lineTo(7.5f, -0f)
            curveTo(4.47f, 0f, 2f, 2.47f, 2f, 5.5f)
            verticalLineToRelative(6.5f)
            horizontalLineToRelative(0f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-4.5f)
            reflectiveCurveToRelative(0f, 0f, 0f, 0f)
            verticalLineToRelative(-5.84f)
            close()
            moveTo(16.47f, 15.25f)
            lineToRelative(-1.42f, 5.66f)
            curveToRelative(-0.15f, 0.61f, -0.68f, 1.05f, -1.31f, 1.09f)
            curveToRelative(-0.62f, 0.03f, -1.21f, -0.32f, -1.44f, -0.91f)
            lineToRelative(-0.55f, -1.38f)
            lineToRelative(-0.55f, 1.38f)
            curveToRelative(-0.22f, 0.56f, -0.75f, 0.91f, -1.34f, 0.91f)
            curveToRelative(-0.03f, 0f, -0.07f, 0f, -0.1f, 0f)
            curveToRelative(-0.63f, -0.04f, -1.15f, -0.48f, -1.31f, -1.1f)
            lineToRelative(-1.41f, -5.66f)
            curveToRelative(-0.13f, -0.54f, 0.19f, -1.08f, 0.73f, -1.21f)
            curveToRelative(0.53f, -0.13f, 1.08f, 0.19f, 1.21f, 0.73f)
            lineToRelative(1f, 4f)
            lineToRelative(0.85f, -2.13f)
            curveToRelative(0.15f, -0.38f, 0.52f, -0.63f, 0.93f, -0.63f)
            horizontalLineToRelative(0f)
            curveToRelative(0.41f, 0f, 0.78f, 0.25f, 0.93f, 0.63f)
            lineToRelative(0.84f, 2.13f)
            lineToRelative(1.01f, -4f)
            curveToRelative(0.13f, -0.54f, 0.68f, -0.86f, 1.21f, -0.73f)
            curveToRelative(0.54f, 0.13f, 0.86f, 0.68f, 0.73f, 1.21f)
            close()
            moveTo(5f, 12.01f)
            lineTo(5f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5.5f)
            lineTo(13f, 7f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(3f)
            lineTo(5f, 12f)
            close()
        }
    }.also { _FileWord = it }
