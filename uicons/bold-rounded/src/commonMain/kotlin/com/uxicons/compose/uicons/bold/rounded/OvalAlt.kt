package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OvalAlt: ImageVector? = null

val Icons.Br.OvalAlt: ImageVector
    get() = _OvalAlt ?: UXIcon(name = "OvalAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 24f)
            curveToRelative(-4.49f, 0f, -8f, -5.27f, -8f, -12f)
            reflectiveCurveTo(7.51f, 0f, 12f, 0f)
            reflectiveCurveToRelative(8f, 5.27f, 8f, 12f)
            reflectiveCurveToRelative(-3.51f, 12f, -8f, 12f)
            close()
            moveTo(12f, 3f)
            curveToRelative(-2.71f, 0f, -5f, 4.12f, -5f, 9f)
            reflectiveCurveToRelative(2.29f, 9f, 5f, 9f)
            reflectiveCurveToRelative(5f, -4.12f, 5f, -9f)
            reflectiveCurveTo(14.71f, 3f, 12f, 3f)
            close()
        }
    }.also { _OvalAlt = it }
