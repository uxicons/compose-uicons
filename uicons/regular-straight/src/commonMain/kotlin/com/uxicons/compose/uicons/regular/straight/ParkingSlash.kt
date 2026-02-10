package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingSlash: ImageVector? = null

val Icons.Rs.ParkingSlash: ImageVector
    get() = _ParkingSlash ?: UXIcon(name = "ParkingSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.76f, 14f)
                horizontalLineToRelative(-0.76f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7.76f)
                lineToRelative(2.76f, 2.76f)
                close()
                moveTo(24f, 3f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(21f, 2f)
                lineTo(3.41f, 2f)
                lineTo(7.61f, 6.19f)
                curveToRelative(0.55f, -0.72f, 1.42f, -1.19f, 2.39f, -1.19f)
                horizontalLineToRelative(3.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 1.91f, -1.2f, 3.55f, -2.89f, 4.2f)
                lineToRelative(6.89f, 6.89f)
                lineTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(13.5f, 12f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.43f, 0f, -0.79f, 0.27f, -0.94f, 0.65f)
                lineToRelative(4.35f, 4.35f)
                horizontalLineToRelative(0.09f)
                close()
                moveTo(2f, 22f)
                lineTo(20.59f, 22f)
                lineTo(2f, 3.41f)
                lineTo(2f, 22f)
                close()
            }
        }.also { _ParkingSlash = it}
