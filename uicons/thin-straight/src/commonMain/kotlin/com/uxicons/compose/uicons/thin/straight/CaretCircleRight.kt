package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretCircleRight: ImageVector? = null

val Icons.Ts.CaretCircleRight: ImageVector
    get() = _CaretCircleRight ?: UXIcon(name = "CaretCircleRight") {
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
                moveTo(10f, 19.12f)
                lineTo(10f, 4.88f)
                lineToRelative(6.39f, 5.78f)
                curveToRelative(0.39f, 0.34f, 0.61f, 0.83f, 0.61f, 1.35f)
                reflectiveCurveToRelative(-0.22f, 1.01f, -0.61f, 1.35f)
                lineToRelative(-6.39f, 5.77f)
                close()
                moveTo(11f, 7.12f)
                verticalLineToRelative(9.75f)
                lineToRelative(4.72f, -4.27f)
                curveToRelative(0.18f, -0.16f, 0.28f, -0.38f, 0.28f, -0.61f)
                reflectiveCurveToRelative(-0.1f, -0.45f, -0.27f, -0.6f)
                lineToRelative(-4.73f, -4.27f)
                close()
            }
        }.also { _CaretCircleRight = it}
