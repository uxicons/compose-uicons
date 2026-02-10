package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileBeam: ImageVector? = null

val Icons.Tr.SmileBeam: ImageVector
    get() = _SmileBeam ?: UXIcon(name = "SmileBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 11f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -1.22f, -0.77f, -2.5f, -1.5f, -2.5f)
                reflectiveCurveToRelative(-1.5f, 1.28f, -1.5f, 2.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -1.65f, 1.07f, -3.5f, 2.5f, -3.5f)
                reflectiveCurveToRelative(2.5f, 1.85f, 2.5f, 3.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(19f, 10.5f)
                curveToRelative(0f, -1.65f, -1.07f, -3.5f, -2.5f, -3.5f)
                reflectiveCurveToRelative(-2.5f, 1.85f, -2.5f, 3.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -1.22f, 0.77f, -2.5f, 1.5f, -2.5f)
                reflectiveCurveToRelative(1.5f, 1.28f, 1.5f, 2.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
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
                moveTo(17.82f, 15.89f)
                curveToRelative(0.21f, -0.17f, 0.25f, -0.49f, 0.07f, -0.7f)
                curveToRelative(-0.17f, -0.21f, -0.49f, -0.25f, -0.7f, -0.07f)
                curveToRelative(-0.02f, 0.02f, -2.37f, 1.89f, -5.19f, 1.89f)
                reflectiveCurveToRelative(-5.16f, -1.87f, -5.19f, -1.89f)
                curveToRelative(-0.22f, -0.17f, -0.53f, -0.14f, -0.7f, 0.07f)
                curveToRelative(-0.17f, 0.21f, -0.14f, 0.53f, 0.07f, 0.7f)
                curveToRelative(0.11f, 0.09f, 2.64f, 2.11f, 5.82f, 2.11f)
                reflectiveCurveToRelative(5.71f, -2.02f, 5.82f, -2.11f)
                close()
            }
        }.also { _SmileBeam = it}
