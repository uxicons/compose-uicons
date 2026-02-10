package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InternetSpeedWifi: ImageVector? = null

val Icons.Br.InternetSpeedWifi: ImageVector
    get() = _InternetSpeedWifi ?: UXIcon(name = "InternetSpeedWifi") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(7.76f, 14.76f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(1.83f, -1.83f, 4.38f, -2.79f, 6.96f, -2.62f)
            curveToRelative(0.83f, 0.06f, 1.45f, 0.77f, 1.4f, 1.6f)
            curveToRelative(-0.06f, 0.83f, -0.77f, 1.45f, -1.6f, 1.4f)
            curveToRelative(-1.73f, -0.11f, -3.42f, 0.52f, -4.64f, 1.74f)
            close()
            moveTo(17.38f, 7.16f)
            curveToRelative(0.76f, 0.34f, 1.64f, 0.01f, 1.99f, -0.75f)
            curveToRelative(0.34f, -0.75f, 0.01f, -1.64f, -0.74f, -1.99f)
            curveTo(12.58f, 1.69f, 5.38f, 3.0f, 0.69f, 7.69f)
            lineToRelative(-0.27f, 0.28f)
            curveToRelative(-0.57f, 0.6f, -0.55f, 1.55f, 0.05f, 2.12f)
            curveToRelative(0.29f, 0.28f, 0.66f, 0.41f, 1.04f, 0.41f)
            curveToRelative(0.4f, 0f, 0.79f, -0.16f, 1.08f, -0.46f)
            lineToRelative(0.22f, -0.23f)
            curveToRelative(3.81f, -3.81f, 9.67f, -4.87f, 14.57f, -2.65f)
            close()
            moveTo(23.56f, 7.44f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            lineToRelative(-8.67f, 8.67f)
            curveToRelative(-0.25f, -0.07f, -0.5f, -0.11f, -0.77f, -0.11f)
            curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
            reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
            curveToRelative(0f, -0.27f, -0.05f, -0.52f, -0.11f, -0.77f)
            lineToRelative(8.67f, -8.67f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            close()
        }
    }.also { _InternetSpeedWifi = it }
