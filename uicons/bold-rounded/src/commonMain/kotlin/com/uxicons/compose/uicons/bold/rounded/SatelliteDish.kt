package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SatelliteDish: ImageVector? = null

val Icons.Br.SatelliteDish: ImageVector
    get() = _SatelliteDish ?: UXIcon(name = "SatelliteDish") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19f, 11.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
            close()
            moveTo(12.5f, 0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveTo(24f, 5.16f, 18.84f, 0f, 12.5f, 0f)
            close()
            moveTo(16.13f, 17.76f)
            curveToRelative(0.64f, 0.64f, 0.95f, 1.51f, 0.85f, 2.41f)
            curveToRelative(-0.1f, 0.9f, -0.59f, 1.71f, -1.35f, 2.2f)
            curveToRelative(-1.67f, 1.09f, -3.58f, 1.62f, -5.49f, 1.62f)
            curveToRelative(-2.62f, 0f, -5.23f, -1.01f, -7.18f, -2.96f)
            curveTo(-0.4f, 17.68f, -0.96f, 12.35f, 1.63f, 8.37f)
            curveToRelative(0.5f, -0.76f, 1.3f, -1.26f, 2.2f, -1.35f)
            curveToRelative(0.9f, -0.1f, 1.77f, 0.22f, 2.41f, 0.85f)
            lineToRelative(3.88f, 3.88f)
            lineToRelative(1.31f, -1.31f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            reflectiveCurveToRelative(0.59f, 1.53f, 0f, 2.12f)
            lineToRelative(-1.31f, 1.31f)
            lineToRelative(3.88f, 3.88f)
            close()
            moveTo(13.99f, 19.86f)
            lineTo(4.12f, 9.99f)
            curveToRelative(-1.79f, 2.81f, -1.4f, 6.56f, 0.97f, 8.92f)
            curveToRelative(2.36f, 2.36f, 6.11f, 2.76f, 8.9f, 0.95f)
            close()
        }
    }.also { _SatelliteDish = it }
