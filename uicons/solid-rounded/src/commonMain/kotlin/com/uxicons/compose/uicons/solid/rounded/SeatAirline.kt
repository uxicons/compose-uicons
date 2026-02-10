package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SeatAirline: ImageVector? = null

val Icons.Sr.SeatAirline: ImageVector
    get() = _SeatAirline ?: UXIcon(name = "SeatAirline") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 22f)
                horizontalLineTo(9f)
                curveToRelative(-0.5f, 0f, -0.76f, -0.33f, -0.85f, -0.47f)
                curveToRelative(-0.09f, -0.14f, -0.27f, -0.52f, -0.04f, -0.97f)
                lineToRelative(0.99f, -1.98f)
                curveToRelative(0.71f, 0.27f, 1.48f, 0.43f, 2.28f, 0.43f)
                horizontalLineToRelative(8.13f)
                curveToRelative(0.73f, 0f, 1.43f, -0.32f, 1.91f, -0.88f)
                reflectiveCurveToRelative(0.68f, -1.3f, 0.56f, -2.04f)
                curveToRelative(-0.19f, -1.19f, -1.3f, -2.08f, -2.57f, -2.08f)
                horizontalLineTo(11.38f)
                curveToRelative(-0.67f, 0f, -1.27f, -0.45f, -1.45f, -1.1f)
                lineToRelative(-0.79f, -2.9f)
                horizontalLineToRelative(9.85f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(8.61f)
                lineTo(6.97f, 1.98f)
                curveTo(6.63f, 0.7f, 5.4f, -0.15f, 4.16f, 0.02f)
                curveToRelative(-0.7f, 0.1f, -1.33f, 0.5f, -1.72f, 1.09f)
                curveToRelative(-0.39f, 0.59f, -0.51f, 1.32f, -0.33f, 2.02f)
                lineToRelative(2.99f, 11.07f)
                curveToRelative(0.37f, 1.38f, 1.18f, 2.55f, 2.25f, 3.39f)
                lineToRelative(-1.03f, 2.06f)
                curveToRelative(-0.47f, 0.94f, -0.42f, 2.03f, 0.13f, 2.92f)
                reflectiveCurveToRelative(1.5f, 1.42f, 2.55f, 1.42f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _SeatAirline = it}
