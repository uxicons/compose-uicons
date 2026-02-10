package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OvalAlt: ImageVector? = null

val Icons.Ss.OvalAlt: ImageVector
    get() = _OvalAlt ?: UXIcon(name = "OvalAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                curveToRelative(-4.49f, 0f, -8f, -5.27f, -8f, -12f)
                reflectiveCurveTo(7.51f, 0f, 12f, 0f)
                reflectiveCurveToRelative(8f, 5.27f, 8f, 12f)
                reflectiveCurveToRelative(-3.51f, 12f, -8f, 12f)
                close()
            }
        }.also { _OvalAlt = it}
