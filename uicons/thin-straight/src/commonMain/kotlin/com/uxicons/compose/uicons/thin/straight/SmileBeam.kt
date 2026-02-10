package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileBeam: ImageVector? = null

val Icons.Ts.SmileBeam: ImageVector
    get() = _SmileBeam ?: UXIcon(name = "SmileBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                curveToRelative(-2.92f, 0f, -5.24f, -2.04f, -5.33f, -2.13f)
                lineToRelative(0.67f, -0.75f)
                curveToRelative(0.02f, 0.02f, 2.14f, 1.87f, 4.67f, 1.87f)
                reflectiveCurveToRelative(4.65f, -1.85f, 4.67f, -1.87f)
                lineToRelative(0.67f, 0.75f)
                curveToRelative(-0.1f, 0.09f, -2.41f, 2.13f, -5.33f, 2.13f)
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
                moveTo(7.5f, 7f)
                curveToRelative(-1.43f, 0f, -2.5f, 2.11f, -2.5f, 4f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -1.43f, 0.79f, -3f, 1.5f, -3f)
                reflectiveCurveToRelative(1.5f, 1.57f, 1.5f, 3f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -1.89f, -1.07f, -4f, -2.5f, -4f)
                close()
                moveTo(16.5f, 7f)
                curveToRelative(-1.43f, 0f, -2.5f, 2.11f, -2.5f, 4f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -1.43f, 0.79f, -3f, 1.5f, -3f)
                reflectiveCurveToRelative(1.5f, 1.57f, 1.5f, 3f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -1.89f, -1.07f, -4f, -2.5f, -4f)
                close()
            }
        }.also { _SmileBeam = it}
