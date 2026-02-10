package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InternetSpeedWifi: ImageVector? = null

val Icons.Rs.InternetSpeedWifi: ImageVector
    get() = _InternetSpeedWifi ?: UXIcon(name = "InternetSpeedWifi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                curveToRelative(-3.74f, 0f, -7.25f, 1.46f, -9.9f, 4.1f)
                lineToRelative(-1.41f, -1.41f)
                curveTo(3.71f, 4.67f, 7.73f, 3f, 12f, 3f)
                curveToRelative(3.26f, 0f, 6.36f, 0.97f, 8.99f, 2.77f)
                lineToRelative(-1.45f, 1.45f)
                curveToRelative(-2.23f, -1.44f, -4.83f, -2.21f, -7.54f, -2.21f)
                close()
                moveTo(14.35f, 12.41f)
                lineToRelative(1.53f, -1.53f)
                curveToRelative(-1.2f, -0.57f, -2.51f, -0.88f, -3.87f, -0.88f)
                curveToRelative(-2.4f, 0f, -4.66f, 0.94f, -6.36f, 2.64f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(1.32f, -1.32f, 3.08f, -2.05f, 4.95f, -2.05f)
                curveToRelative(0.81f, 0f, 1.6f, 0.15f, 2.35f, 0.41f)
                close()
                moveTo(23.96f, 8.45f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-10.04f, 10.04f)
                curveToRelative(-0.16f, -0.04f, -0.33f, -0.07f, -0.51f, -0.07f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.18f, -0.03f, -0.35f, -0.07f, -0.51f)
                lineToRelative(10.04f, -10.04f)
                close()
            }
        }.also { _InternetSpeedWifi = it}
