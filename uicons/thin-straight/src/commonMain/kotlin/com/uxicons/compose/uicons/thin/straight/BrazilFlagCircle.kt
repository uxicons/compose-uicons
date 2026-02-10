package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrazilFlagCircle: ImageVector? = null

val Icons.Ts.BrazilFlagCircle: ImageVector
    get() = _BrazilFlagCircle ?: UXIcon(name = "BrazilFlagCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 3.87f)
                lineTo(1.31f, 12.0f)
                lineToRelative(10.69f, 8.13f)
                lineToRelative(10.61f, -8.03f)
                lineTo(12.0f, 3.87f)
                close()
                moveTo(2.96f, 12.0f)
                lineTo(12.0f, 5.13f)
                lineToRelative(8.97f, 6.96f)
                lineToRelative(-8.97f, 6.79f)
                lineTo(2.96f, 12.0f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(12f, 9f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 0.25f, -0.04f, 0.5f, -0.1f, 0.73f)
                curveToRelative(-1.99f, -1.7f, -4.31f, -2.19f, -5.43f, -2.33f)
                curveToRelative(0.53f, -0.84f, 1.46f, -1.4f, 2.53f, -1.4f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -0.22f, 0.03f, -0.43f, 0.07f, -0.64f)
                curveToRelative(0.86f, 0.08f, 3.38f, 0.46f, 5.4f, 2.33f)
                curveToRelative(-0.54f, 0.79f, -1.45f, 1.3f, -2.47f, 1.3f)
                close()
                moveTo(12f, 0f)
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
            }
        }.also { _BrazilFlagCircle = it}
