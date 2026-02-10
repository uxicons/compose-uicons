package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wifi: ImageVector? = null

val Icons.Sc.Wifi: ImageVector
    get() = _Wifi ?: UXIcon(name = "Wifi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.56f, 7.54f)
                curveToRelative(-6.12f, -6.11f, -15.0f, -6.11f, -21.12f, 0f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.0f, 2.12f)
                reflectiveCurveToRelative(1.53f, 0.59f, 2.12f, 0.0f)
                curveToRelative(4.89f, -4.88f, 11.99f, -4.88f, 16.88f, 0f)
                curveToRelative(0.29f, 0.29f, 1.19f, 0.82f, 2.12f, -0.0f)
                curveToRelative(0.62f, -0.55f, 0.58f, -1.54f, -0.0f, -2.12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.24f, 12.38f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.53f, -0.0f, 2.12f)
                reflectiveCurveToRelative(1.53f, 0.59f, 2.12f, 0.0f)
                curveToRelative(2.82f, -2.81f, 6.46f, -2.81f, 9.28f, 0f)
                curveToRelative(0.29f, 0.29f, 1.24f, 0.82f, 2.12f, -0.0f)
                curveToRelative(0.61f, -0.56f, 0.58f, -1.54f, -0.0f, -2.12f)
                curveToRelative(-3.98f, -3.98f, -9.54f, -3.98f, -13.52f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 15.2f)
                curveToRelative(-1.83f, 0f, -2.92f, 1.09f, -2.92f, 2.92f)
                reflectiveCurveToRelative(1.09f, 2.91f, 2.92f, 2.91f)
                reflectiveCurveToRelative(2.92f, -1.09f, 2.92f, -2.91f)
                reflectiveCurveToRelative(-1.09f, -2.92f, -2.92f, -2.92f)
                close()
            }
        }.also { _Wifi = it}
