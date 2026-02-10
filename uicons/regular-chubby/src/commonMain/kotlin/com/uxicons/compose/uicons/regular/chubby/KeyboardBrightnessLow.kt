package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KeyboardBrightnessLow: ImageVector? = null

val Icons.Rc.KeyboardBrightnessLow: ImageVector
    get() = _KeyboardBrightnessLow ?: UXIcon(name = "KeyboardBrightnessLow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.55f, 16.16f)
                curveToRelative(0.46f, 0.31f, 0.58f, 0.93f, 0.28f, 1.39f)
                curveToRelative(-0.31f, 0.46f, -0.93f, 0.58f, -1.39f, 0.28f)
                curveToRelative(-0.01f, -0.0f, -1.31f, -0.83f, -3.45f, -0.83f)
                reflectiveCurveToRelative(-3.44f, 0.82f, -3.45f, 0.83f)
                curveToRelative(-0.46f, 0.3f, -1.08f, 0.17f, -1.38f, -0.29f)
                curveToRelative(-0.3f, -0.46f, -0.18f, -1.07f, 0.28f, -1.38f)
                curveToRelative(0.07f, -0.05f, 1.78f, -1.16f, 4.55f, -1.16f)
                reflectiveCurveToRelative(4.48f, 1.12f, 4.55f, 1.16f)
                close()
                moveTo(12f, 9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(3f, 16f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(21f, 16f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(18.5f, 9.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(5.5f, 9.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _KeyboardBrightnessLow = it}
