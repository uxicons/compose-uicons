package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TicketsAirline: ImageVector? = null

val Icons.Bs.TicketsAirline: ImageVector
    get() = _TicketsAirline ?: UXIcon(name = "TicketsAirline") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 8.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-12f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(21f, 5.76f)
                curveToRelative(-1.75f, 0.62f, -3f, 2.29f, -3f, 4.24f)
                reflectiveCurveToRelative(1.25f, 3.62f, 3f, 4.24f)
                verticalLineToRelative(1.26f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                lineTo(8f, 4.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(12f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(1.26f)
                close()
                moveTo(17f, 10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                lineToRelative(-1.91f, 2.42f)
                curveToRelative(-0.2f, 0.36f, -0.57f, 0.58f, -0.97f, 0.58f)
                horizontalLineToRelative(-1.11f)
                lineToRelative(1.36f, -3f)
                horizontalLineToRelative(-1.71f)
                lineToRelative(-1.55f, -1.83f)
                curveToRelative(-0.3f, -0.52f, 0.08f, -1.17f, 0.68f, -1.17f)
                curveToRelative(0.21f, 0f, 0.41f, 0.08f, 0.55f, 0.23f)
                lineToRelative(0.92f, 0.77f)
                horizontalLineToRelative(1.12f)
                lineToRelative(-1.38f, -3f)
                horizontalLineToRelative(1.1f)
                curveToRelative(0.41f, 0f, 0.78f, 0.22f, 0.97f, 0.58f)
                lineToRelative(1.93f, 2.42f)
                horizontalLineToRelative(1f)
                curveToRelative(0.8f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(8.5f, 21f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10.5f)
                curveTo(3.81f, 24f, 0f, 20.19f, 0f, 15.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                close()
            }
        }.also { _TicketsAirline = it}
