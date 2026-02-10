package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Circle1: ImageVector? = null

val Icons.Ts.Circle1: ImageVector
    get() = _Circle1 ?: UXIcon(name = "Circle1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 18f)
                horizontalLineToRelative(-1f)
                lineTo(12f, 7.64f)
                lineToRelative(-2.44f, 2.51f)
                lineToRelative(-0.72f, -0.7f)
                lineToRelative(3.36f, -3.45f)
                horizontalLineToRelative(0.8f)
                verticalLineToRelative(12f)
                close()
                moveTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 6.07f, -4.93f, 11f, -11f, 11f)
                reflectiveCurveTo(1f, 18.07f, 1f, 12f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                close()
            }
        }.also { _Circle1 = it}
