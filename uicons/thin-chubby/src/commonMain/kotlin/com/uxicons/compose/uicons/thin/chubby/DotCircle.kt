package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DotCircle: ImageVector? = null

val Icons.Tc.DotCircle: ImageVector
    get() = _DotCircle ?: UXIcon(name = "DotCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 8f)
                curveToRelative(-2.62f, 0f, -4f, 1.38f, -4f, 4f)
                reflectiveCurveToRelative(1.38f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.38f, 4f, -4f)
                reflectiveCurveToRelative(-1.38f, -4f, -4f, -4f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-2.08f, 0f, -3f, -0.93f, -3f, -3f)
                reflectiveCurveToRelative(0.93f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 0.93f, 3f, 3f)
                reflectiveCurveToRelative(-0.93f, 3f, -3f, 3f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-7.81f, 0f, -11f, 3.19f, -11f, 11f)
                reflectiveCurveToRelative(3.19f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.19f, 11f, -11f)
                reflectiveCurveToRelative(-3.19f, -11f, -11f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.2f, 0f, -10f, -2.8f, -10f, -10f)
                reflectiveCurveToRelative(2.8f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.8f, 10f, 10f)
                reflectiveCurveToRelative(-2.8f, 10f, -10f, 10f)
                close()
            }
        }.also { _DotCircle = it}
