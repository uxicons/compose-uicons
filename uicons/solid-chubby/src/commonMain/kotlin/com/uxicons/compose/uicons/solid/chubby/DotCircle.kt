package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DotCircle: ImageVector? = null

val Icons.Sc.DotCircle: ImageVector
    get() = _DotCircle ?: UXIcon(name = "DotCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-2.02f, 0f, -3f, -0.98f, -3f, -3f)
                reflectiveCurveToRelative(0.98f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 0.98f, 3f, 3f)
                reflectiveCurveToRelative(-0.98f, 3f, -3f, 3f)
                close()
            }
        }.also { _DotCircle = it}
