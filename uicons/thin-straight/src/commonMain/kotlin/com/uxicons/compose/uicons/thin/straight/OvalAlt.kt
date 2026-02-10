package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OvalAlt: ImageVector? = null

val Icons.Ts.OvalAlt: ImageVector
    get() = _OvalAlt ?: UXIcon(name = "OvalAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                curveToRelative(-4.41f, 0f, -8f, -5.38f, -8f, -12f)
                reflectiveCurveTo(7.59f, 0f, 12f, 0f)
                reflectiveCurveToRelative(8f, 5.38f, 8f, 12f)
                reflectiveCurveToRelative(-3.59f, 12f, -8f, 12f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-3.86f, 0f, -7f, 4.93f, -7f, 11f)
                reflectiveCurveToRelative(3.14f, 11f, 7f, 11f)
                reflectiveCurveToRelative(7f, -4.93f, 7f, -11f)
                reflectiveCurveTo(15.86f, 1f, 12f, 1f)
                close()
            }
        }.also { _OvalAlt = it}
