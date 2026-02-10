package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DroneAlt: ImageVector? = null

val Icons.Rs.DroneAlt: ImageVector
    get() = _DroneAlt ?: UXIcon(name = "DroneAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-0.0f, -1.0f)
                lineToRelative(-2f, 0.01f)
                lineToRelative(0.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.01f)
                lineToRelative(0.02f, 4.39f)
                curveToRelative(-2.02f, -1.49f, -4.49f, -2.32f, -7.03f, -2.32f)
                reflectiveCurveToRelative(-4.98f, 0.83f, -7f, 2.3f)
                verticalLineToRelative(-4.37f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                lineTo(0f, 4.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7.99f)
                lineToRelative(0.34f, 0.3f)
                curveToRelative(0.48f, 0.43f, 1.28f, 1.07f, 2.3f, 1.7f)
                lineToRelative(-1.64f, 3.28f)
                verticalLineToRelative(2.74f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.26f)
                lineToRelative(1.4f, -2.81f)
                curveToRelative(1.35f, 0.61f, 2.92f, 1.07f, 4.6f, 1.07f)
                reflectiveCurveToRelative(3.25f, -0.46f, 4.6f, -1.07f)
                lineToRelative(1.4f, 2.8f)
                verticalLineToRelative(2.26f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.74f)
                lineToRelative(-1.64f, -3.28f)
                curveToRelative(1.04f, -0.65f, 1.85f, -1.3f, 2.34f, -1.74f)
                lineToRelative(0.34f, -0.3f)
                lineToRelative(-0.03f, -7.95f)
                horizontalLineToRelative(2.99f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15.4f, 10.68f)
                lineToRelative(-1.32f, 1.32f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(-1.32f, -1.32f)
                curveToRelative(1.07f, -0.39f, 2.22f, -0.61f, 3.4f, -0.61f)
                reflectiveCurveToRelative(2.33f, 0.22f, 3.4f, 0.61f)
                close()
                moveTo(12f, 16.0f)
                curveToRelative(-3.03f, 0f, -5.71f, -1.86f, -7f, -2.93f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0.52f, -0.53f, 1.1f, -0.99f, 1.71f, -1.38f)
                lineToRelative(2.38f, 2.38f)
                horizontalLineToRelative(5.83f)
                lineToRelative(2.38f, -2.38f)
                curveToRelative(0.63f, 0.4f, 1.21f, 0.87f, 1.75f, 1.42f)
                verticalLineToRelative(0.0f)
                curveToRelative(-1.29f, 1.07f, -3.98f, 2.96f, -7.04f, 2.96f)
                close()
            }
        }.also { _DroneAlt = it}
