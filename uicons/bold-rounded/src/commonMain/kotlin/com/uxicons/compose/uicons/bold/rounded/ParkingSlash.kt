package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingSlash: ImageVector? = null

val Icons.Br.ParkingSlash: ImageVector
    get() = _ParkingSlash ?: UXIcon(name = "ParkingSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 14.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(5.5f, 3f)
            curveToRelative(-0.12f, 0f, -0.24f, 0.01f, -0.35f, 0.03f)
            lineToRelative(3.23f, 3.23f)
            curveToRelative(0.82f, -0.79f, 1.93f, -1.26f, 3.12f, -1.26f)
            horizontalLineToRelative(1.5f)
            curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
            curveToRelative(0f, 1.58f, -0.75f, 3.02f, -1.94f, 3.94f)
            lineToRelative(4.91f, 4.91f)
            curveToRelative(0.02f, -0.12f, 0.03f, -0.23f, 0.03f, -0.35f)
            lineTo(21.0f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
            close()
            moveTo(15f, 10f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.38f, 0f, -0.73f, 0.14f, -1.0f, 0.38f)
            lineToRelative(3.4f, 3.4f)
            curveToRelative(0.65f, -0.33f, 1.1f, -1.02f, 1.1f, -1.78f)
            close()
            moveTo(18.5f, 21f)
            curveToRelative(0.12f, 0f, 0.24f, -0.01f, 0.35f, -0.03f)
            lineTo(3.02f, 5.15f)
            curveToRelative(-0.02f, 0.12f, -0.03f, 0.23f, -0.03f, 0.35f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            close()
        }
    }.also { _ParkingSlash = it }
