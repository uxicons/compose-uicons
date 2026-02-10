package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wifi1: ImageVector? = null

val Icons.Tc.Wifi1: ImageVector
    get() = _Wifi1 ?: UXIcon(name = "Wifi1") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 9.5f)
                curveToRelative(-1.68f, 0f, -2.5f, 0.82f, -2.5f, 2.5f)
                reflectiveCurveToRelative(0.82f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -0.82f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-0.82f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(12f, 13.5f)
                curveToRelative(-1.26f, 0f, -1.5f, -0.53f, -1.5f, -1.5f)
                curveToRelative(0f, -0.99f, 0.23f, -1.5f, 1.5f, -1.5f)
                curveToRelative(1.26f, 0f, 1.5f, 0.53f, 1.5f, 1.5f)
                curveToRelative(0f, 0.99f, -0.23f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Wifi1 = it}
