package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartHomeKey: ImageVector? = null

val Icons.Ss.SmartHomeKey: ImageVector
    get() = _SmartHomeKey ?: UXIcon(name = "SmartHomeKey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.0f, 10f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 0.57f, 0.12f, 1.11f, 0.29f, 1.62f)
                lineToRelative(-0.32f, 0.3f)
                verticalLineToRelative(2.07f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.98f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.6f)
                lineToRelative(4.41f, -4.41f)
                curveToRelative(0.61f, 0.26f, 1.28f, 0.41f, 1.98f, 0.41f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(20.0f, 12.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(8.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-13.93f)
                curveToRelative(0f, -0.96f, 0.43f, -1.85f, 1.19f, -2.44f)
                lineToRelative(8.9f, -6.98f)
                curveToRelative(1.12f, -0.88f, 2.69f, -0.88f, 3.81f, 0f)
                lineToRelative(8.9f, 6.98f)
                curveToRelative(0.76f, 0.59f, 1.19f, 1.48f, 1.19f, 2.44f)
                verticalLineToRelative(0.03f)
                curveToRelative(-1.27f, -1.3f, -3.04f, -2.11f, -5.0f, -2.11f)
                curveToRelative(-1.18f, 0f, -2.3f, 0.3f, -3.28f, 0.82f)
                curveToRelative(-3.32f, -1.5f, -7.36f, -0.91f, -10.09f, 1.82f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(1.84f, -1.84f, 4.46f, -2.44f, 6.81f, -1.79f)
                curveToRelative(-0.49f, 0.53f, -0.9f, 1.14f, -1.21f, 1.81f)
                curveToRelative(-1.49f, -0.2f, -3.05f, 0.26f, -4.19f, 1.4f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.6f, -0.6f, 1.41f, -0.89f, 2.2f, -0.87f)
                curveToRelative(-0.05f, 0.32f, -0.08f, 0.65f, -0.08f, 0.99f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.02f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.98f)
                verticalLineToRelative(5.0f)
                close()
            }
        }.also { _SmartHomeKey = it}
