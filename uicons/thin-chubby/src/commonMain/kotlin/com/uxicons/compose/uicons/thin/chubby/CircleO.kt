package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleO: ImageVector? = null

val Icons.Tc.CircleO: ImageVector
    get() = _CircleO ?: UXIcon(name = "CircleO") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
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
                moveTo(12f, 6f)
                curveToRelative(-3.5f, 0f, -5f, 1.79f, -5f, 6f)
                reflectiveCurveToRelative(1.5f, 6f, 5f, 6f)
                reflectiveCurveToRelative(5f, -1.79f, 5f, -6f)
                reflectiveCurveToRelative(-1.5f, -6f, -5f, -6f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-2.92f, 0f, -4f, -1.35f, -4f, -5f)
                reflectiveCurveToRelative(1.08f, -5f, 4f, -5f)
                reflectiveCurveToRelative(4f, 1.35f, 4f, 5f)
                reflectiveCurveToRelative(-1.08f, 5f, -4f, 5f)
                close()
            }
        }.also { _CircleO = it}
