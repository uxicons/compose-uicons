package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _9: ImageVector? = null

val Icons.Br.Nine: ImageVector
    get() = _9 ?: UXIcon(name = "Nine") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.99f, 7.8f)
            curveTo(19.76f, 3.64f, 16.42f, 0.18f, 12.35f, 0.01f)
            curveToRelative(-2.15f, -0.1f, -4.21f, 0.66f, -5.78f, 2.12f)
            curveToRelative(-1.58f, 1.46f, -2.49f, 3.44f, -2.56f, 5.59f)
            curveToRelative(-0.07f, 2.1f, 0.74f, 4.21f, 2.23f, 5.77f)
            curveToRelative(1.48f, 1.56f, 3.54f, 2.48f, 5.64f, 2.51f)
            curveToRelative(1.9f, 0.01f, 3.65f, -0.58f, 5.09f, -1.72f)
            curveToRelative(-0.39f, 3.77f, -3.59f, 6.72f, -7.46f, 6.72f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(5.79f, 0f, 10.5f, -4.71f, 10.5f, -10.5f)
            curveToRelative(0f, 0f, -0.0f, -5.63f, -0.01f, -5.7f)
            close()
            moveTo(12f, 13f)
            curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
            reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
            reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
            close()
        }
    }.also { _9 = it }
