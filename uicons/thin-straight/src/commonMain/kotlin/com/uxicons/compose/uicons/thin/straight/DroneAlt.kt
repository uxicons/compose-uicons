package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DroneAlt: ImageVector? = null

val Icons.Ts.DroneAlt: ImageVector
    get() = _DroneAlt ?: UXIcon(name = "DroneAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-0.0f, -1.0f)
                lineToRelative(-1f, 0.0f)
                lineToRelative(0.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.01f)
                lineToRelative(0.02f, 5.88f)
                curveToRelative(-2.1f, -1.75f, -5.19f, -2.88f, -8.03f, -2.88f)
                reflectiveCurveToRelative(-5.9f, 1.12f, -8f, 2.85f)
                verticalLineToRelative(-5.85f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                lineTo(0f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8.26f)
                lineToRelative(0.17f, 0.15f)
                curveToRelative(0.45f, 0.4f, 1.33f, 1.05f, 2.47f, 1.69f)
                lineToRelative(-1.64f, 3.28f)
                verticalLineToRelative(2.62f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.38f)
                lineToRelative(1.52f, -3.05f)
                curveToRelative(1.58f, 0.78f, 3.52f, 1.43f, 5.47f, 1.43f)
                reflectiveCurveToRelative(3.89f, -0.65f, 5.47f, -1.43f)
                lineToRelative(1.52f, 3.05f)
                verticalLineToRelative(2.38f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.62f)
                lineToRelative(-1.64f, -3.28f)
                curveToRelative(1.16f, -0.65f, 2.06f, -1.32f, 2.51f, -1.73f)
                lineToRelative(0.17f, -0.15f)
                lineToRelative(-0.03f, -8.22f)
                horizontalLineToRelative(2.99f)
                verticalLineToRelative(-1f)
                close()
                moveTo(15.66f, 9.63f)
                lineToRelative(-1.37f, 1.37f)
                horizontalLineToRelative(-4.59f)
                lineToRelative(-1.37f, -1.37f)
                curveToRelative(1.19f, -0.4f, 2.45f, -0.63f, 3.67f, -0.63f)
                reflectiveCurveToRelative(2.47f, 0.23f, 3.67f, 0.63f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-3.42f, 0f, -6.78f, -2.18f, -8f, -3.19f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0.88f, -0.89f, 2.03f, -1.65f, 3.31f, -2.2f)
                lineToRelative(1.98f, 1.98f)
                horizontalLineToRelative(5.41f)
                lineToRelative(1.98f, -1.98f)
                curveToRelative(1.3f, 0.56f, 2.46f, 1.32f, 3.35f, 2.23f)
                lineToRelative(0.0f, 0.52f)
                curveToRelative(-1.23f, 1.02f, -4.6f, 3.23f, -8.04f, 3.23f)
                close()
            }
        }.also { _DroneAlt = it}
