package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RadioButton: ImageVector? = null

val Icons.Br.RadioButton: ImageVector
    get() = _RadioButton ?: UXIcon(name = "RadioButton") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 11f)
            curveTo(2.47f, 11f, 0f, 8.53f, 0f, 5.5f)
            reflectiveCurveTo(2.47f, 0f, 5.5f, 0f)
            reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
            reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
            close()
            moveTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
            reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
            reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
            close()
            moveTo(5.5f, 16f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(24f, 5.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            close()
            moveTo(24f, 18.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _RadioButton = it }
