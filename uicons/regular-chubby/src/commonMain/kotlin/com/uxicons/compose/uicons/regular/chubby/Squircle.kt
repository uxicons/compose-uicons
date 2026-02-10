package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Squircle: ImageVector? = null

val Icons.Rc.Squircle: ImageVector
    get() = _Squircle ?: UXIcon(name = "Squircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23f)
                curveToRelative(-8.94f, 0f, -11f, -2.06f, -11f, -11f)
                reflectiveCurveToRelative(2.06f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 2.06f, 11f, 11f)
                reflectiveCurveToRelative(-2.06f, 11f, -11f, 11f)
                close()
                moveTo(12f, 3f)
                curveToRelative(-7.82f, 0f, -9f, 1.18f, -9f, 9f)
                reflectiveCurveToRelative(1.18f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -1.18f, 9f, -9f)
                reflectiveCurveToRelative(-1.18f, -9f, -9f, -9f)
                close()
            }
        }.also { _Squircle = it}
