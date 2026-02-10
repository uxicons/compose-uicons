package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DroneAlt: ImageVector? = null

val Icons.Ss.DroneAlt: ImageVector
    get() = _DroneAlt ?: UXIcon(name = "DroneAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                horizontalLineToRelative(-2.99f)
                lineToRelative(0.03f, 7.95f)
                lineToRelative(-0.34f, 0.3f)
                curveToRelative(-0.49f, 0.44f, -1.3f, 1.09f, -2.34f, 1.74f)
                lineToRelative(1.64f, 3.28f)
                verticalLineToRelative(2.74f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.26f)
                lineToRelative(-1.4f, -2.8f)
                curveToRelative(-1.35f, 0.61f, -2.92f, 1.07f, -4.6f, 1.07f)
                reflectiveCurveToRelative(-3.25f, -0.46f, -4.6f, -1.07f)
                lineToRelative(-1.4f, 2.81f)
                verticalLineToRelative(2.26f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.74f)
                lineToRelative(1.64f, -3.28f)
                curveToRelative(-1.02f, -0.63f, -1.81f, -1.27f, -2.3f, -1.7f)
                lineToRelative(-0.34f, -0.3f)
                verticalLineToRelative(-7.99f)
                lineTo(0f, 6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4.37f)
                curveToRelative(0.3f, -0.22f, 0.61f, -0.42f, 0.93f, -0.61f)
                lineToRelative(3.24f, 3.24f)
                horizontalLineToRelative(5.83f)
                lineToRelative(3.17f, -3.17f)
                curveToRelative(0.29f, 0.18f, 0.58f, 0.37f, 0.85f, 0.57f)
                lineToRelative(-0.02f, -4.4f)
                horizontalLineToRelative(-3.01f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-0.0f, -1.0f)
                lineToRelative(2f, -0.01f)
                lineToRelative(0.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 11f)
                horizontalLineToRelative(4.17f)
                lineToRelative(2.11f, -2.11f)
                curveToRelative(-1.35f, -0.53f, -2.8f, -0.82f, -4.28f, -0.82f)
                curveToRelative(-1.43f, 0f, -2.84f, 0.27f, -4.16f, 0.77f)
                lineToRelative(2.16f, 2.16f)
                close()
            }
        }.also { _DroneAlt = it}
