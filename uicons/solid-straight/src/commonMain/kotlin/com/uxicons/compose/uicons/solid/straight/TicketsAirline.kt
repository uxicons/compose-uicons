package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TicketsAirline: ImageVector? = null

val Icons.Ss.TicketsAirline: ImageVector
    get() = _TicketsAirline ?: UXIcon(name = "TicketsAirline") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(7f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(17f, 12f)
                horizontalLineToRelative(-2f)
                lineToRelative(-1.91f, 2.42f)
                curveToRelative(-0.2f, 0.36f, -0.57f, 0.58f, -0.97f, 0.58f)
                horizontalLineToRelative(-1.11f)
                lineToRelative(1.36f, -3f)
                horizontalLineToRelative(-2.71f)
                lineToRelative(-1.55f, -1.83f)
                curveToRelative(-0.3f, -0.52f, 0.08f, -1.17f, 0.68f, -1.17f)
                curveToRelative(0.21f, 0f, 0.41f, 0.08f, 0.55f, 0.23f)
                lineToRelative(0.92f, 0.77f)
                horizontalLineToRelative(2.12f)
                lineToRelative(-1.38f, -3f)
                horizontalLineToRelative(1.1f)
                curveToRelative(0.41f, 0f, 0.78f, 0.22f, 0.97f, 0.58f)
                lineToRelative(1.93f, 2.42f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.8f, 0f, 1.25f, 0.45f, 1.25f, 1f)
                verticalLineToRelative(1f)
                close()
                moveTo(19f, 24f)
                lineTo(7f, 24f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _TicketsAirline = it}
