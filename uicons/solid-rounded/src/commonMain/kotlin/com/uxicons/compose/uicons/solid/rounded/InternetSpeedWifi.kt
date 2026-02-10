package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InternetSpeedWifi: ImageVector? = null

val Icons.Sr.InternetSpeedWifi: ImageVector
    get() = _InternetSpeedWifi ?: UXIcon(name = "InternetSpeedWifi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                curveToRelative(-3.88f, 0f, -7.62f, 1.63f, -10.27f, 4.48f)
                curveToRelative(-0.2f, 0.21f, -0.47f, 0.32f, -0.73f, 0.32f)
                curveToRelative(-0.24f, 0f, -0.49f, -0.09f, -0.68f, -0.27f)
                curveToRelative(-0.41f, -0.38f, -0.43f, -1.01f, -0.05f, -1.41f)
                curveTo(3.29f, 4.87f, 7.56f, 3f, 12f, 3f)
                curveToRelative(2.81f, 0f, 5.58f, 0.74f, 8.0f, 2.14f)
                curveToRelative(0.48f, 0.28f, 0.64f, 0.89f, 0.36f, 1.37f)
                curveToRelative(-0.28f, 0.48f, -0.89f, 0.64f, -1.37f, 0.36f)
                curveToRelative(-2.12f, -1.23f, -4.54f, -1.87f, -7.0f, -1.87f)
                close()
                moveTo(13.76f, 12.22f)
                curveToRelative(0.53f, 0.13f, 1.08f, -0.19f, 1.21f, -0.73f)
                curveToRelative(0.14f, -0.54f, -0.19f, -1.08f, -0.73f, -1.21f)
                curveToRelative(-0.73f, -0.18f, -1.48f, -0.28f, -2.24f, -0.28f)
                curveToRelative(-2.54f, 0f, -4.99f, 1.07f, -6.72f, 2.94f)
                curveToRelative(-0.38f, 0.41f, -0.35f, 1.04f, 0.05f, 1.41f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.27f, 0.68f, 0.27f)
                curveToRelative(0.27f, 0f, 0.54f, -0.11f, 0.73f, -0.32f)
                curveToRelative(1.76f, -1.9f, 4.54f, -2.7f, 7.01f, -2.08f)
                close()
                moveTo(23.71f, 7.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-9.78f, 9.78f)
                curveToRelative(-0.16f, -0.04f, -0.33f, -0.07f, -0.51f, -0.07f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.18f, -0.03f, -0.35f, -0.07f, -0.51f)
                lineToRelative(9.78f, -9.78f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _InternetSpeedWifi = it}
