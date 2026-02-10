package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleD: ImageVector? = null

val Icons.Ts.CircleD: ImageVector
    get() = _CircleD ?: UXIcon(name = "CircleD") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(11.75f, 5.75f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.25f)
                curveToRelative(3.45f, 0f, 6.25f, -2.8f, 6.25f, -6.25f)
                reflectiveCurveToRelative(-2.8f, -6.25f, -6.25f, -6.25f)
                close()
                moveTo(11.75f, 17.25f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.25f)
                curveToRelative(2.9f, 0f, 5.25f, 2.35f, 5.25f, 5.25f)
                reflectiveCurveToRelative(-2.35f, 5.25f, -5.25f, 5.25f)
                close()
            }
        }.also { _CircleD = it}
