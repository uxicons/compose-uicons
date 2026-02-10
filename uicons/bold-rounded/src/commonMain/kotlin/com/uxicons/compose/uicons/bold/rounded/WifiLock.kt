package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiLock: ImageVector? = null

val Icons.Br.WifiLock: ImageVector
    get() = _WifiLock ?: UXIcon(name = "WifiLock") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 4f)
            curveToRelative(-3.13f, 0f, -6.16f, 1.13f, -8.52f, 3.18f)
            curveToRelative(-0.62f, 0.54f, -1.57f, 0.48f, -2.12f, -0.15f)
            curveToRelative(-0.54f, -0.62f, -0.48f, -1.57f, 0.15f, -2.12f)
            curveToRelative(2.9f, -2.52f, 6.63f, -3.91f, 10.48f, -3.91f)
            reflectiveCurveToRelative(7.58f, 1.39f, 10.48f, 3.91f)
            curveToRelative(0.63f, 0.54f, 0.69f, 1.49f, 0.15f, 2.12f)
            curveToRelative(-0.54f, 0.63f, -1.49f, 0.69f, -2.12f, 0.15f)
            curveToRelative(-2.36f, -2.05f, -5.38f, -3.18f, -8.52f, -3.18f)
            close()
            moveTo(24f, 18f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.89f, 0.39f, -1.67f, 1f, -2.22f)
            verticalLineToRelative(-1.28f)
            curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
            verticalLineToRelative(1.28f)
            curveToRelative(0.61f, 0.55f, 1f, 1.34f, 1f, 2.22f)
            close()
            moveTo(17f, 14.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            close()
            moveTo(20f, 19.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            close()
            moveTo(16.81f, 8.23f)
            curveToRelative(-3.33f, -1.84f, -7.48f, -1.66f, -10.7f, 0.68f)
            curveToRelative(-0.67f, 0.49f, -0.82f, 1.43f, -0.33f, 2.1f)
            curveToRelative(0.49f, 0.67f, 1.43f, 0.82f, 2.1f, 0.33f)
            curveToRelative(1.72f, -1.26f, 3.83f, -1.62f, 5.76f, -1.15f)
            curveToRelative(0.83f, -0.94f, 1.92f, -1.63f, 3.17f, -1.96f)
            close()
            moveTo(9f, 17f)
            curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
            verticalLineToRelative(-1.82f)
            curveToRelative(0f, -1.11f, 0.38f, -2.13f, 1f, -2.96f)
            verticalLineToRelative(-1.04f)
            curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
            close()
        }
    }.also { _WifiLock = it }
