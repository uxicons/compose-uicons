package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotEqual: ImageVector? = null

val Icons.Br.NotEqual: ImageVector
    get() = _NotEqual ?: UXIcon(name = "NotEqual") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 16.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-11.44f)
            lineToRelative(-2.18f, 5.09f)
            curveToRelative(-0.24f, 0.57f, -0.8f, 0.91f, -1.38f, 0.91f)
            curveToRelative(-0.2f, 0f, -0.4f, -0.04f, -0.59f, -0.12f)
            curveToRelative(-0.76f, -0.33f, -1.11f, -1.21f, -0.79f, -1.97f)
            lineToRelative(1.68f, -3.91f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(7.58f)
            lineToRelative(2.57f, -6f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(11.44f)
            lineTo(15.12f, 0.91f)
            curveToRelative(0.33f, -0.76f, 1.21f, -1.11f, 1.97f, -0.79f)
            curveToRelative(0.76f, 0.33f, 1.11f, 1.21f, 0.79f, 1.97f)
            lineToRelative(-1.68f, 3.91f)
            horizontalLineToRelative(6.3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7.58f)
            lineToRelative(-2.57f, 6f)
            horizontalLineToRelative(10.15f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _NotEqual = it }
