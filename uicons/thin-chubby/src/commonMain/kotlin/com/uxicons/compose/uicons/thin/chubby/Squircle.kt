package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Squircle: ImageVector? = null

val Icons.Tc.Squircle: ImageVector
    get() = _Squircle ?: UXIcon(name = "Squircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23f)
                curveToRelative(-9.15f, 0f, -11f, -1.85f, -11f, -11f)
                reflectiveCurveToRelative(1.85f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 1.85f, 11f, 11f)
                reflectiveCurveToRelative(-1.85f, 11f, -11f, 11f)
                close()
                moveTo(12f, 2f)
                curveToRelative(-8.6f, 0f, -10f, 1.4f, -10f, 10f)
                reflectiveCurveToRelative(1.4f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -1.4f, 10f, -10f)
                reflectiveCurveToRelative(-1.4f, -10f, -10f, -10f)
                close()
            }
        }.also { _Squircle = it}
