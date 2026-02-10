package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThanEqual: ImageVector? = null

val Icons.Br.LessThanEqual: ImageVector
    get() = _LessThanEqual ?: UXIcon(name = "LessThanEqual") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(4.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(15f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(20.09f, 16.12f)
            lineToRelative(-13.69f, -5.89f)
            curveToRelative(-0.4f, -0.17f, -0.43f, -0.6f, -0.43f, -0.73f)
            reflectiveCurveToRelative(0.03f, -0.56f, 0.43f, -0.73f)
            lineToRelative(13.69f, -5.89f)
            curveToRelative(0.76f, -0.33f, 1.11f, -1.21f, 0.79f, -1.97f)
            curveToRelative(-0.33f, -0.76f, -1.21f, -1.11f, -1.97f, -0.79f)
            lineTo(5.22f, 6.02f)
            curveToRelative(-1.38f, 0.6f, -2.24f, 1.93f, -2.24f, 3.48f)
            reflectiveCurveToRelative(0.86f, 2.89f, 2.24f, 3.48f)
            lineToRelative(13.69f, 5.89f)
            curveToRelative(0.19f, 0.08f, 0.4f, 0.12f, 0.59f, 0.12f)
            curveToRelative(0.58f, 0f, 1.13f, -0.34f, 1.38f, -0.91f)
            curveToRelative(0.33f, -0.76f, -0.02f, -1.64f, -0.79f, -1.97f)
            close()
        }
    }.also { _LessThanEqual = it }
