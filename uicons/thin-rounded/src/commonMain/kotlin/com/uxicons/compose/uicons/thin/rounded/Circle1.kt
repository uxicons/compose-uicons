package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Circle1: ImageVector? = null

val Icons.Tr.Circle1: ImageVector
    get() = _Circle1 ?: UXIcon(name = "Circle1") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(13f, 17.5f)
                lineTo(13f, 7.08f)
                curveToRelative(0f, -0.44f, -0.26f, -0.83f, -0.66f, -0.99f)
                curveToRelative(-0.41f, -0.17f, -0.86f, -0.07f, -1.23f, 0.3f)
                lineToRelative(-2.02f, 2.83f)
                curveToRelative(-0.16f, 0.23f, -0.11f, 0.54f, 0.12f, 0.7f)
                curveToRelative(0.23f, 0.16f, 0.54f, 0.11f, 0.7f, -0.12f)
                lineToRelative(1.99f, -2.8f)
                lineToRelative(0.1f, 0.08f)
                verticalLineToRelative(10.42f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                close()
            }
        }.also { _Circle1 = it}
