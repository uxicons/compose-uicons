package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowCircleRight: ImageVector? = null

val Icons.Ts.ArrowCircleRight: ImageVector
    get() = _ArrowCircleRight ?: UXIcon(name = "ArrowCircleRight") {
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
                moveTo(17.52f, 10.85f)
                curveToRelative(0.64f, 0.64f, 0.64f, 1.67f, 0f, 2.31f)
                lineToRelative(-4.8f, 4.8f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(4.75f, -4.75f)
                lineTo(6f, 12.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10.76f)
                lineToRelative(-4.75f, -4.75f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.8f, 4.8f)
                close()
            }
        }.also { _ArrowCircleRight = it}
