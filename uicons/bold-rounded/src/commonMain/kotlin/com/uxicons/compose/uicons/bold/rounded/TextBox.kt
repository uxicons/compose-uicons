package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextBox: ImageVector? = null

val Icons.Br.TextBox: ImageVector
    get() = _TextBox ?: UXIcon(name = "TextBox") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 18.17f)
            lineTo(22f, 5.83f)
            curveToRelative(1.17f, -0.41f, 2f, -1.52f, 2f, -2.83f)
            curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
            curveToRelative(-1.31f, 0f, -2.42f, 0.83f, -2.83f, 2f)
            lineTo(5.83f, 2f)
            curveToRelative(-0.41f, -1.17f, -1.52f, -2f, -2.83f, -2f)
            curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
            curveToRelative(0f, 1.31f, 0.83f, 2.42f, 2f, 2.83f)
            verticalLineToRelative(12.34f)
            curveToRelative(-1.17f, 0.41f, -2f, 1.52f, -2f, 2.83f)
            curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
            curveToRelative(1.31f, 0f, 2.42f, -0.83f, 2.83f, -2f)
            horizontalLineToRelative(12.34f)
            curveToRelative(0.41f, 1.17f, 1.52f, 2f, 2.83f, 2f)
            curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
            curveToRelative(0f, -1.31f, -0.83f, -2.42f, -2f, -2.83f)
            close()
            moveTo(5f, 18.76f)
            lineTo(5f, 5.24f)
            curveToRelative(0.08f, -0.07f, 0.16f, -0.15f, 0.23f, -0.23f)
            horizontalLineToRelative(13.53f)
            curveToRelative(0.07f, 0.08f, 0.15f, 0.16f, 0.23f, 0.23f)
            verticalLineToRelative(13.53f)
            curveToRelative(-0.08f, 0.07f, -0.16f, 0.15f, -0.23f, 0.23f)
            lineTo(5.24f, 19.0f)
            curveToRelative(-0.07f, -0.08f, -0.15f, -0.16f, -0.23f, -0.23f)
            close()
            moveTo(16f, 8.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _TextBox = it }
