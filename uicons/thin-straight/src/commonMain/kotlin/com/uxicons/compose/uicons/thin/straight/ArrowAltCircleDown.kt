package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltCircleDown: ImageVector? = null

val Icons.Ts.ArrowAltCircleDown: ImageVector
    get() = _ArrowAltCircleDown ?: UXIcon(name = "ArrowAltCircleDown") {
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
                moveTo(12.5f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                lineTo(5.73f, 12f)
                lineToRelative(5.0f, 5.46f)
                curveToRelative(0.31f, 0.34f, 0.74f, 0.54f, 1.2f, 0.54f)
                reflectiveCurveToRelative(0.9f, -0.2f, 1.2f, -0.54f)
                lineToRelative(5f, -5.46f)
                horizontalLineToRelative(-5.63f)
                lineTo(12.5f, 6f)
                close()
                moveTo(12.4f, 16.79f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.24f, 0.26f, -0.68f, 0.27f, -0.92f, -0.0f)
                lineToRelative(-3.47f, -3.79f)
                horizontalLineToRelative(7.86f)
                lineToRelative(-3.47f, 3.79f)
                close()
            }
        }.also { _ArrowAltCircleDown = it}
