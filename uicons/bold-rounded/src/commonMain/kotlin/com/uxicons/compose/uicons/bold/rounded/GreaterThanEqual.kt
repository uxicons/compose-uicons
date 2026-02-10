package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThanEqual: ImageVector? = null

val Icons.Br.GreaterThanEqual: ImageVector
    get() = _GreaterThanEqual ?: UXIcon(name = "GreaterThanEqual") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.98f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(4.48f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(15f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(17.57f, 10.23f)
            lineToRelative(-13.69f, 5.89f)
            curveToRelative(-0.76f, 0.33f, -1.11f, 1.21f, -0.78f, 1.97f)
            curveToRelative(0.24f, 0.57f, 0.8f, 0.91f, 1.38f, 0.91f)
            curveToRelative(0.2f, 0f, 0.4f, -0.04f, 0.59f, -0.12f)
            lineToRelative(13.69f, -5.89f)
            curveToRelative(1.38f, -0.59f, 2.24f, -1.93f, 2.24f, -3.48f)
            reflectiveCurveToRelative(-0.86f, -2.89f, -2.24f, -3.48f)
            lineTo(5.07f, 0.12f)
            curveToRelative(-0.76f, -0.33f, -1.64f, 0.02f, -1.97f, 0.78f)
            curveToRelative(-0.33f, 0.76f, 0.02f, 1.64f, 0.78f, 1.97f)
            lineToRelative(13.69f, 5.89f)
            curveToRelative(0.4f, 0.17f, 0.43f, 0.6f, 0.43f, 0.73f)
            reflectiveCurveToRelative(-0.03f, 0.56f, -0.43f, 0.73f)
            close()
        }
    }.also { _GreaterThanEqual = it }
