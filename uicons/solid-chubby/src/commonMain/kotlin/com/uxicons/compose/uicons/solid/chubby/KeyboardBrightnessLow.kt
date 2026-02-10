package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyboardBrightnessLow: ImageVector? = null

val Icons.Sc.KeyboardBrightnessLow: ImageVector
    get() = _KeyboardBrightnessLow ?: UXIcon(name = "KeyboardBrightnessLow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 7.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(2.5f, 18f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(21.5f, 18f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(17f, 10.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(5.5f, 9f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(16.69f, 17.41f)
                curveToRelative(0.5f, -0.66f, 0.38f, -1.6f, -0.28f, -2.1f)
                curveToRelative(-0.18f, -0.13f, -1.79f, -1.31f, -4.41f, -1.31f)
                reflectiveCurveToRelative(-4.23f, 1.17f, -4.41f, 1.31f)
                curveToRelative(-0.65f, 0.5f, -0.78f, 1.42f, -0.29f, 2.08f)
                curveToRelative(0.49f, 0.66f, 1.42f, 0.8f, 2.09f, 0.32f)
                curveToRelative(0.04f, -0.03f, 1f, -0.7f, 2.61f, -0.7f)
                reflectiveCurveToRelative(2.57f, 0.68f, 2.59f, 0.69f)
                curveToRelative(0.65f, 0.5f, 1.6f, 0.38f, 2.1f, -0.28f)
                close()
            }
        }.also { _KeyboardBrightnessLow = it}
