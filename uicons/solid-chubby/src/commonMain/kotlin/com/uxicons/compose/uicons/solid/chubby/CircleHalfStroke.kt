package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHalfStroke: ImageVector? = null

val Icons.Sc.CircleHalfStroke: ImageVector
    get() = _CircleHalfStroke ?: UXIcon(name = "CircleHalfStroke") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.61f, 0f, -11f, 3.39f, -11f, 11f)
                reflectiveCurveToRelative(3.39f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.39f, 11f, -11f)
                reflectiveCurveToRelative(-3.39f, -11f, -11f, -11f)
                close()
                moveTo(12f, 20f)
                verticalLineToRelative(-16f)
                curveToRelative(5.98f, 0f, 8f, 2.02f, 8f, 8f)
                reflectiveCurveToRelative(-2.02f, 8f, -8f, 8f)
                close()
            }
        }.also { _CircleHalfStroke = it}
