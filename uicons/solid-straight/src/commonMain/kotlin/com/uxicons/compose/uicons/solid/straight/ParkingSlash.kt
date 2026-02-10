package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingSlash: ImageVector? = null

val Icons.Ss.ParkingSlash: ImageVector
    get() = _ParkingSlash ?: UXIcon(name = "ParkingSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.69f, 14f)
                lineToRelative(10f, 10f)
                horizontalLineTo(0f)
                verticalLineTo(4.31f)
                lineToRelative(7f, 7f)
                verticalLineToRelative(7.69f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(0.69f)
                close()
                moveTo(24f, 3f)
                verticalLineTo(24f)
                horizontalLineToRelative(-1.48f)
                lineTo(0.28f, 1.76f)
                curveTo(0.75f, 0.72f, 1.79f, 0f, 3f, 0f)
                horizontalLineTo(21f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(7.62f, 6.2f)
                lineToRelative(1.46f, 1.46f)
                curveToRelative(0.14f, -0.38f, 0.5f, -0.66f, 0.93f, -0.66f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.09f)
                lineToRelative(1.69f, 1.69f)
                curveToRelative(1.69f, -0.65f, 2.9f, -2.28f, 2.9f, -4.19f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.98f, 0f, -1.84f, 0.48f, -2.38f, 1.2f)
                close()
            }
        }.also { _ParkingSlash = it}
