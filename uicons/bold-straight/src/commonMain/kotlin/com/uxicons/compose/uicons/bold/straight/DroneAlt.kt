package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DroneAlt: ImageVector? = null

val Icons.Bs.DroneAlt: ImageVector
    get() = _DroneAlt ?: UXIcon(name = "DroneAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.8f)
                curveToRelative(-1.77f, -1.15f, -3.86f, -1.8f, -6f, -1.8f)
                reflectiveCurveToRelative(-4.23f, 0.65f, -6f, 1.8f)
                verticalLineToRelative(-3.8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7.6f)
                lineToRelative(0.42f, 0.44f)
                curveToRelative(0.07f, 0.07f, 0.9f, 0.92f, 2.23f, 1.81f)
                lineToRelative(-1.65f, 3.29f)
                verticalLineToRelative(2.85f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.15f)
                lineToRelative(1.3f, -2.6f)
                curveToRelative(1.11f, 0.44f, 2.36f, 0.75f, 3.7f, 0.75f)
                reflectiveCurveToRelative(2.58f, -0.31f, 3.7f, -0.75f)
                lineToRelative(1.3f, 2.6f)
                verticalLineToRelative(2.15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.85f)
                lineToRelative(-1.65f, -3.29f)
                curveToRelative(1.33f, -0.89f, 2.16f, -1.74f, 2.23f, -1.81f)
                lineToRelative(0.42f, -0.44f)
                verticalLineToRelative(-7.6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(6.76f, 12.96f)
                curveToRelative(0.5f, -0.43f, 1.04f, -0.79f, 1.62f, -1.08f)
                lineToRelative(1.13f, 1.13f)
                horizontalLineToRelative(5f)
                lineToRelative(1.13f, -1.13f)
                curveToRelative(0.57f, 0.29f, 1.12f, 0.65f, 1.61f, 1.08f)
                curveToRelative(-1.18f, 0.89f, -3.12f, 2.04f, -5.24f, 2.04f)
                curveToRelative(-2.13f, 0f, -4.07f, -1.16f, -5.24f, -2.04f)
                close()
            }
        }.also { _DroneAlt = it}
