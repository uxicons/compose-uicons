package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InternetSpeedWifi: ImageVector? = null

val Icons.Bs.InternetSpeedWifi: ImageVector
    get() = _InternetSpeedWifi ?: UXIcon(name = "InternetSpeedWifi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(-1.87f, 0f, -3.63f, 0.73f, -4.95f, 2.05f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(1.89f, -1.89f, 4.4f, -2.93f, 7.07f, -2.93f)
                curveToRelative(1.46f, 0f, 2.86f, 0.32f, 4.14f, 0.91f)
                lineToRelative(-2.34f, 2.34f)
                curveToRelative(-0.58f, -0.15f, -1.19f, -0.24f, -1.81f, -0.24f)
                close()
                moveTo(18.37f, 7.68f)
                lineToRelative(2.19f, -2.19f)
                curveToRelative(-2.54f, -1.61f, -5.48f, -2.49f, -8.56f, -2.49f)
                curveTo(7.73f, 3f, 3.71f, 4.67f, 0.69f, 7.69f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(2.46f, -2.46f, 5.72f, -3.81f, 9.19f, -3.81f)
                curveToRelative(2.27f, 0f, 4.45f, 0.59f, 6.37f, 1.68f)
                close()
                moveTo(24.01f, 9.11f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-9.12f, 9.12f)
                curveToRelative(-0.25f, -0.07f, -0.5f, -0.11f, -0.77f, -0.11f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                curveToRelative(0f, -0.27f, -0.05f, -0.52f, -0.11f, -0.77f)
                lineToRelative(9.12f, -9.12f)
                close()
            }
        }.also { _InternetSpeedWifi = it}
