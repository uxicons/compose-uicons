package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InternetSpeedWifi: ImageVector? = null

val Icons.Ts.InternetSpeedWifi: ImageVector
    get() = _InternetSpeedWifi ?: UXIcon(name = "InternetSpeedWifi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 4f)
                curveToRelative(-4.01f, 0f, -7.77f, 1.56f, -10.61f, 4.39f)
                lineToRelative(-0.71f, -0.71f)
                curveTo(3.71f, 4.67f, 7.73f, 3f, 12f, 3f)
                curveToRelative(3.43f, 0f, 6.68f, 1.09f, 9.4f, 3.07f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-2.52f, -1.8f, -5.52f, -2.78f, -8.68f, -2.78f)
                close()
                moveTo(15.6f, 11.86f)
                lineToRelative(0.74f, -0.74f)
                curveToRelative(-1.32f, -0.73f, -2.8f, -1.12f, -4.34f, -1.12f)
                curveToRelative(-2.4f, 0f, -4.66f, 0.94f, -6.36f, 2.64f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(1.51f, -1.51f, 3.52f, -2.34f, 5.66f, -2.34f)
                curveToRelative(1.27f, 0f, 2.5f, 0.3f, 3.6f, 0.86f)
                close()
                moveTo(13.72f, 17.99f)
                curveToRelative(0.18f, 0.3f, 0.28f, 0.64f, 0.28f, 1.01f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                curveToRelative(0.37f, 0f, 0.71f, 0.11f, 1.01f, 0.28f)
                lineToRelative(9.89f, -9.89f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-9.89f, 9.89f)
                close()
                moveTo(13f, 19.0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _InternetSpeedWifi = it}
