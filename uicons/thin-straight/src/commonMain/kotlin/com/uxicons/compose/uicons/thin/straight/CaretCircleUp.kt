package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretCircleUp: ImageVector? = null

val Icons.Ts.CaretCircleUp: ImageVector
    get() = _CaretCircleUp ?: UXIcon(name = "CaretCircleUp") {
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
                moveTo(19.13f, 15f)
                lineTo(4.88f, 15f)
                lineToRelative(5.78f, -6.39f)
                curveToRelative(0.68f, -0.77f, 2.02f, -0.77f, 2.7f, 0.0f)
                lineToRelative(5.77f, 6.39f)
                close()
                moveTo(7.13f, 14f)
                horizontalLineToRelative(9.75f)
                lineToRelative(-4.27f, -4.72f)
                curveToRelative(-0.32f, -0.36f, -0.9f, -0.36f, -1.21f, -0.0f)
                lineToRelative(-4.27f, 4.73f)
                close()
            }
        }.also { _CaretCircleUp = it}
