package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TicketsAirline: ImageVector? = null

val Icons.Sr.TicketsAirline: ImageVector
    get() = _TicketsAirline ?: UXIcon(name = "TicketsAirline") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 24f)
                horizontalLineToRelative(-9f)
                curveToRelative(-2.4f, 0f, -4.66f, -0.94f, -6.36f, -2.64f)
                curveTo(0.94f, 19.66f, 0f, 17.4f, 0f, 15f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.87f, 0.73f, 3.63f, 2.05f, 4.95f)
                curveToRelative(1.32f, 1.32f, 3.08f, 2.05f, 4.95f, 2.05f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(21f, 11f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-10f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(4f, 7f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(17f, 11f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-1.93f, -2.42f)
                curveToRelative(-0.2f, -0.36f, -0.57f, -0.58f, -0.97f, -0.58f)
                horizontalLineToRelative(-0.12f)
                curveToRelative(-0.38f, 0f, -0.65f, 0.39f, -0.51f, 0.74f)
                lineToRelative(0.89f, 2.26f)
                horizontalLineToRelative(-1.42f)
                lineToRelative(-1.11f, -0.77f)
                curveToRelative(-0.15f, -0.15f, -0.34f, -0.23f, -0.55f, -0.23f)
                curveToRelative(-0.6f, 0f, -0.97f, 0.65f, -0.68f, 1.17f)
                lineToRelative(1.1f, 1.3f)
                curveToRelative(0.28f, 0.34f, 0.7f, 0.53f, 1.15f, 0.53f)
                horizontalLineToRelative(1.5f)
                lineToRelative(-0.88f, 2.26f)
                curveToRelative(-0.14f, 0.36f, 0.12f, 0.74f, 0.51f, 0.74f)
                horizontalLineToRelative(0.14f)
                curveToRelative(0.41f, 0f, 0.78f, -0.22f, 0.97f, -0.58f)
                lineToRelative(1.91f, -2.42f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _TicketsAirline = it}
