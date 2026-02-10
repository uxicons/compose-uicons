package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltCircleLeft: ImageVector? = null

val Icons.Ts.ArrowAltCircleLeft: ImageVector
    get() = _ArrowAltCircleLeft ?: UXIcon(name = "ArrowAltCircleLeft") {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(12f, 5.79f)
                lineToRelative(-5.46f, 5.0f)
                curveToRelative(-0.34f, 0.31f, -0.54f, 0.74f, -0.54f, 1.2f)
                reflectiveCurveToRelative(0.2f, 0.9f, 0.54f, 1.2f)
                lineToRelative(5.46f, 5f)
                verticalLineToRelative(-5.69f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                lineTo(12f, 5.79f)
                close()
                moveTo(11f, 15.92f)
                lineToRelative(-3.79f, -3.47f)
                lineToRelative(-0.0f, -0.0f)
                curveToRelative(-0.13f, -0.12f, -0.2f, -0.28f, -0.2f, -0.46f)
                reflectiveCurveToRelative(0.07f, -0.34f, 0.21f, -0.46f)
                lineToRelative(3.79f, -3.47f)
                verticalLineToRelative(7.86f)
                close()
            }
        }.also { _ArrowAltCircleLeft = it}
