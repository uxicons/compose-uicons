package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseFlood: ImageVector? = null

val Icons.Ts.HouseFlood: ImageVector
    get() = _HouseFlood ?: UXIcon(name = "HouseFlood") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 18f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(12.91f, 0.32f)
                curveToRelative(-0.54f, -0.41f, -1.28f, -0.41f, -1.82f, 0f)
                lineTo(0f, 8.76f)
                verticalLineToRelative(9.24f)
                lineTo(1f, 18f)
                lineTo(1f, 9.26f)
                lineTo(11.7f, 1.11f)
                curveToRelative(0.18f, -0.14f, 0.43f, -0.14f, 0.61f, 0f)
                lineToRelative(10.7f, 8.14f)
                verticalLineToRelative(8.74f)
                horizontalLineToRelative(1f)
                lineTo(24f, 8.76f)
                lineTo(12.91f, 0.32f)
                close()
                moveTo(22.5f, 23f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                curveToRelative(-0.38f, 0f, -0.75f, -0.07f, -1.1f, -0.21f)
                lineToRelative(-0.37f, 0.93f)
                curveToRelative(0.47f, 0.19f, 0.96f, 0.28f, 1.47f, 0.28f)
                curveToRelative(1.5f, 0f, 2.82f, -0.83f, 3.5f, -2.06f)
                curveToRelative(0.68f, 1.23f, 2.0f, 2.06f, 3.5f, 2.06f)
                reflectiveCurveToRelative(2.82f, -0.83f, 3.5f, -2.06f)
                curveToRelative(0.68f, 1.23f, 2.0f, 2.06f, 3.5f, 2.06f)
                reflectiveCurveToRelative(2.82f, -0.83f, 3.5f, -2.06f)
                curveToRelative(0.68f, 1.23f, 2.0f, 2.06f, 3.5f, 2.06f)
                curveToRelative(0.51f, 0f, 1.01f, -0.1f, 1.48f, -0.28f)
                lineToRelative(-0.37f, -0.93f)
                curveToRelative(-0.35f, 0.14f, -0.73f, 0.21f, -1.11f, 0.21f)
                close()
            }
        }.also { _HouseFlood = it}
