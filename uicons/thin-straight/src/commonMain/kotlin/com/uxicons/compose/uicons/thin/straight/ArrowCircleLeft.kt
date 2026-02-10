package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowCircleLeft: ImageVector? = null

val Icons.Ts.ArrowCircleLeft: ImageVector
    get() = _ArrowCircleLeft ?: UXIcon(name = "ArrowCircleLeft") {
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
                moveTo(7.24f, 11.5f)
                horizontalLineToRelative(10.76f)
                verticalLineToRelative(1f)
                lineTo(7.24f, 12.5f)
                lineToRelative(4.75f, 4.75f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-4.8f, -4.8f)
                curveToRelative(-0.64f, -0.64f, -0.64f, -1.67f, 0f, -2.31f)
                lineToRelative(4.8f, -4.8f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.75f, 4.75f)
                close()
            }
        }.also { _ArrowCircleLeft = it}
