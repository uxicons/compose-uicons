package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SeatAirline: ImageVector? = null

val Icons.Rs.SeatAirline: ImageVector
    get() = _SeatAirline ?: UXIcon(name = "SeatAirline") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.07f, 15.5f)
                curveToRelative(-0.23f, -1.43f, -1.55f, -2.5f, -3.07f, -2.5f)
                lineTo(10.84f, 13f)
                lineToRelative(-0.82f, -3f)
                horizontalLineToRelative(8.98f)
                verticalLineToRelative(-2f)
                lineTo(9.47f, 8f)
                lineToRelative(-1.55f, -5.67f)
                curveTo(7.52f, 0.78f, 6.08f, -0.21f, 4.56f, 0.01f)
                curveToRelative(-0.84f, 0.12f, -1.6f, 0.6f, -2.07f, 1.31f)
                curveToRelative(-0.47f, 0.71f, -0.61f, 1.59f, -0.4f, 2.42f)
                lineToRelative(3.33f, 12.3f)
                curveToRelative(0.25f, 0.93f, 0.82f, 1.71f, 1.57f, 2.23f)
                lineToRelative(-0.69f, 1.38f)
                curveToRelative(-0.47f, 0.94f, -0.42f, 2.03f, 0.13f, 2.92f)
                reflectiveCurveToRelative(1.5f, 1.42f, 2.55f, 1.42f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                lineTo(9f, 22f)
                curveToRelative(-0.5f, 0f, -0.76f, -0.33f, -0.85f, -0.47f)
                curveToRelative(-0.09f, -0.14f, -0.27f, -0.52f, -0.04f, -0.97f)
                lineToRelative(0.79f, -1.57f)
                curveToRelative(0.13f, 0.01f, 0.27f, 0.02f, 0.4f, 0.02f)
                horizontalLineToRelative(9.81f)
                curveToRelative(0.88f, 0f, 1.72f, -0.39f, 2.29f, -1.06f)
                reflectiveCurveToRelative(0.82f, -1.56f, 0.67f, -2.44f)
                close()
                moveTo(19.87f, 16.65f)
                curveToRelative(-0.19f, 0.22f, -0.47f, 0.35f, -0.76f, 0.35f)
                lineTo(9.29f, 17.0f)
                curveToRelative(-0.9f, 0f, -1.7f, -0.61f, -1.93f, -1.48f)
                lineTo(4.03f, 3.23f)
                curveToRelative(-0.07f, -0.28f, -0.03f, -0.56f, 0.13f, -0.8f)
                curveToRelative(0.16f, -0.24f, 0.46f, -0.45f, 0.81f, -0.45f)
                curveToRelative(0.45f, 0f, 0.88f, 0.36f, 1.02f, 0.87f)
                lineToRelative(3.32f, 12.15f)
                horizontalLineToRelative(9.69f)
                curveToRelative(0.54f, 0f, 1.02f, 0.36f, 1.09f, 0.82f)
                curveToRelative(0.05f, 0.3f, -0.03f, 0.59f, -0.22f, 0.82f)
                close()
            }
        }.also { _SeatAirline = it}
