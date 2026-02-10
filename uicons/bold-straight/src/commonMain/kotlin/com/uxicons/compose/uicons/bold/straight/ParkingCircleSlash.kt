package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingCircleSlash: ImageVector? = null

val Icons.Bs.ParkingCircleSlash: ImageVector
    get() = _ParkingCircleSlash ?: UXIcon(name = "ParkingCircleSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 1.94f, -0.62f, 3.74f, -1.67f, 5.21f)
                lineToRelative(-3.27f, -3.27f)
                curveToRelative(1.18f, -0.92f, 1.94f, -2.36f, 1.94f, -3.94f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.93f, 0f, -1.78f, 0.37f, -2.41f, 0.97f)
                lineToRelative(-1.3f, -1.3f)
                curveToRelative(1.47f, -1.05f, 3.27f, -1.67f, 5.21f, -1.67f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                close()
                moveTo(13.9f, 11.78f)
                lineToRelative(-3.69f, -3.69f)
                curveToRelative(0.08f, -0.06f, 0.18f, -0.09f, 0.29f, -0.09f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 0.77f, -0.44f, 1.45f, -1.1f, 1.78f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -1.94f, 0.62f, -3.74f, 1.67f, -5.21f)
                lineToRelative(12.54f, 12.54f)
                curveToRelative(-1.47f, 1.05f, -3.27f, 1.67f, -5.21f, 1.67f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                close()
                moveTo(7f, 11.95f)
                lineToRelative(3.05f, 3.05f)
                horizontalLineToRelative(-0.05f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7.05f)
                close()
            }
        }.also { _ParkingCircleSlash = it}
