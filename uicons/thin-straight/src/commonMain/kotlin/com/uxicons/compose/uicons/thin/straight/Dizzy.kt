package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dizzy: ImageVector? = null

val Icons.Ts.Dizzy: ImageVector
    get() = _Dizzy ?: UXIcon(name = "Dizzy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(18.85f, 6.85f)
                lineToRelative(-2.15f, 2.15f)
                lineToRelative(2.15f, 2.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.15f, -2.15f)
                lineToRelative(-2.15f, 2.15f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2.15f, -2.15f)
                lineToRelative(-2.15f, -2.15f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.15f, 2.15f)
                lineToRelative(2.15f, -2.15f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(8f, 9.71f)
                lineToRelative(-2.15f, 2.15f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2.15f, -2.15f)
                lineToRelative(-2.15f, -2.15f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.15f, 2.15f)
                lineToRelative(2.15f, -2.15f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-2.15f, 2.15f)
                lineToRelative(2.15f, 2.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.15f, -2.15f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
            }
        }.also { _Dizzy = it}
