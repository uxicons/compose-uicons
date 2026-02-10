package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingCircleSlash: ImageVector? = null

val Icons.Br.ParkingCircleSlash: ImageVector
    get() = _ParkingCircleSlash ?: UXIcon(name = "ParkingCircleSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 14.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 12f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            reflectiveCurveTo(0f, 18.62f, 0f, 12f)
            reflectiveCurveTo(5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            close()
            moveTo(12f, 3f)
            curveToRelative(-1.94f, 0f, -3.74f, 0.62f, -5.21f, 1.67f)
            lineToRelative(1.59f, 1.59f)
            curveToRelative(0.82f, -0.79f, 1.93f, -1.26f, 3.12f, -1.26f)
            horizontalLineToRelative(1.5f)
            curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
            curveToRelative(0f, 1.58f, -0.75f, 3.02f, -1.94f, 3.94f)
            lineToRelative(3.27f, 3.27f)
            curveToRelative(1.05f, -1.47f, 1.67f, -3.27f, 1.67f, -5.21f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            close()
            moveTo(15f, 10f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.38f, 0f, -0.73f, 0.14f, -1.0f, 0.38f)
            lineToRelative(3.4f, 3.4f)
            curveToRelative(0.65f, -0.33f, 1.1f, -1.02f, 1.1f, -1.78f)
            close()
            moveTo(12f, 21f)
            curveToRelative(1.94f, 0f, 3.74f, -0.62f, 5.21f, -1.67f)
            lineTo(4.67f, 6.79f)
            curveToRelative(-1.05f, 1.47f, -1.67f, 3.27f, -1.67f, 5.21f)
            curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
            close()
        }
    }.also { _ParkingCircleSlash = it }
