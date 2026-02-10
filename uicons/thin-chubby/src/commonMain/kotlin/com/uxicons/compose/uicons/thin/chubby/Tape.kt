package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tape: ImageVector? = null

val Icons.Tc.Tape: ImageVector
    get() = _Tape ?: UXIcon(name = "Tape") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 12f)
                curveToRelative(0f, -2.77f, -1.23f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.23f, -4f, 4f)
                reflectiveCurveToRelative(1.23f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.23f, 4f, -4f)
                close()
                moveTo(8f, 12f)
                curveToRelative(0f, -2.21f, 0.79f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 0.79f, 3f, 3f)
                reflectiveCurveToRelative(-0.79f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -0.79f, -3f, -3f)
                close()
                moveTo(22.98f, 20.38f)
                curveToRelative(-0.07f, -0.27f, -0.34f, -0.43f, -0.61f, -0.36f)
                curveToRelative(-0.03f, 0.01f, -1.82f, 0.44f, -5.17f, 0.73f)
                curveToRelative(2.63f, -1.46f, 3.79f, -4.27f, 3.79f, -8.74f)
                curveToRelative(0f, -7.1f, -2.9f, -10f, -10f, -10f)
                reflectiveCurveToRelative(-10f, 2.9f, -10f, 10f)
                reflectiveCurveToRelative(2.9f, 10f, 10f, 10f)
                curveToRelative(7.48f, 0f, 11.46f, -0.97f, 11.62f, -1.01f)
                curveToRelative(0.27f, -0.07f, 0.43f, -0.34f, 0.36f, -0.61f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -6.48f, 2.52f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.52f, 9f, 9f)
                reflectiveCurveToRelative(-2.52f, 9f, -9f, 9f)
                reflectiveCurveToRelative(-9f, -2.52f, -9f, -9f)
                close()
            }
        }.also { _Tape = it}
