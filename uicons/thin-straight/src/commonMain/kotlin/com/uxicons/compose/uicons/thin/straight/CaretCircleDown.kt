package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretCircleDown: ImageVector? = null

val Icons.Ts.CaretCircleDown: ImageVector
    get() = _CaretCircleDown ?: UXIcon(name = "CaretCircleDown") {
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
                moveTo(10.65f, 16.39f)
                curveToRelative(0.34f, 0.39f, 0.84f, 0.61f, 1.35f, 0.61f)
                reflectiveCurveToRelative(1.01f, -0.22f, 1.35f, -0.61f)
                lineToRelative(5.78f, -6.39f)
                lineTo(4.88f, 10f)
                lineToRelative(5.77f, 6.39f)
                close()
                moveTo(12.61f, 15.73f)
                curveToRelative(-0.31f, 0.35f, -0.89f, 0.36f, -1.21f, -0.0f)
                lineToRelative(-4.27f, -4.72f)
                horizontalLineToRelative(9.75f)
                lineToRelative(-4.27f, 4.73f)
                close()
            }
        }.also { _CaretCircleDown = it}
