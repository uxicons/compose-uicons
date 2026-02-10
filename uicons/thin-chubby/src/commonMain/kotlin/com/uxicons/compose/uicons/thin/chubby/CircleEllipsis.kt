package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleEllipsis: ImageVector? = null

val Icons.Tc.CircleEllipsis: ImageVector
    get() = _CircleEllipsis ?: UXIcon(name = "CircleEllipsis") {
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
                moveTo(7.75f, 12f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                close()
                moveTo(17.75f, 12f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                close()
                moveTo(12.75f, 12f)
                curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                reflectiveCurveToRelative(0.34f, -0.75f, 0.75f, -0.75f)
                reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f)
                close()
            }
        }.also { _CircleEllipsis = it}
