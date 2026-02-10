package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQuartersAlt: ImageVector? = null

val Icons.Sc.CircleQuartersAlt: ImageVector
    get() = _CircleQuartersAlt ?: UXIcon(name = "CircleQuartersAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.61f, 0f, -11f, 3.39f, -11f, 11f)
                reflectiveCurveToRelative(3.39f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.39f, 11f, -11f)
                reflectiveCurveToRelative(-3.39f, -11f, -11f, -11f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 2.15f, -0.27f, 3.78f, -0.88f, 5.0f)
                lineToRelative(-5.0f, -5.0f)
                lineToRelative(5.0f, -5.0f)
                curveToRelative(0.61f, 1.22f, 0.88f, 2.85f, 0.88f, 5.0f)
                close()
                moveTo(17.0f, 4.88f)
                lineTo(12f, 9.88f)
                lineTo(7.0f, 4.88f)
                curveToRelative(1.22f, -0.61f, 2.85f, -0.88f, 5.0f, -0.88f)
                reflectiveCurveToRelative(3.78f, 0.27f, 5.0f, 0.88f)
                close()
                moveTo(4.88f, 17.0f)
                curveToRelative(-0.61f, -1.22f, -0.88f, -2.85f, -0.88f, -5.0f)
                reflectiveCurveToRelative(0.27f, -3.78f, 0.88f, -5.0f)
                lineToRelative(5.0f, 5.0f)
                close()
                moveTo(7.0f, 19.12f)
                lineTo(12f, 14.12f)
                lineTo(17.0f, 19.12f)
                curveToRelative(-1.22f, 0.61f, -2.85f, 0.88f, -5.0f, 0.88f)
                reflectiveCurveToRelative(-3.78f, -0.27f, -5.0f, -0.88f)
                close()
            }
        }.also { _CircleQuartersAlt = it}
