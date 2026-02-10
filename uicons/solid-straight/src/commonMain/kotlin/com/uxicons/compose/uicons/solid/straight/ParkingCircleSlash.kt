package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingCircleSlash: ImageVector? = null

val Icons.Ss.ParkingCircleSlash: ImageVector
    get() = _ParkingCircleSlash ?: UXIcon(name = "ParkingCircleSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 11.24f)
                verticalLineToRelative(7.75f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(0.76f)
                lineToRelative(8.33f, 8.33f)
                curveToRelative(-1.79f, 1.06f, -3.86f, 1.67f, -6.08f, 1.67f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                curveToRelative(0f, -2.22f, 0.62f, -4.29f, 1.67f, -6.08f)
                moveToRelative(22.33f, 6.08f)
                curveToRelative(0f, 3.67f, -1.66f, 6.95f, -4.26f, 9.16f)
                lineTo(2.84f, 4.26f)
                curveTo(5.05f, 1.66f, 8.33f, 0f, 12f, 0f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                close()
                moveTo(16f, 9.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.09f)
                lineToRelative(1.69f, 1.69f)
                curveToRelative(1.69f, -0.65f, 2.9f, -2.28f, 2.9f, -4.19f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.98f, 0f, -1.84f, 0.48f, -2.38f, 1.2f)
                lineToRelative(1.46f, 1.46f)
                curveToRelative(0.14f, -0.38f, 0.5f, -0.66f, 0.93f, -0.66f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _ParkingCircleSlash = it}
