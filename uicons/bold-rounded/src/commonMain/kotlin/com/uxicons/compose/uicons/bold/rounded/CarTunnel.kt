package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarTunnel: ImageVector? = null

val Icons.Br.CarTunnel: ImageVector
    get() = _CarTunnel ?: UXIcon(name = "CarTunnel") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 12f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-10.5f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            reflectiveCurveTo(3f, 7.04f, 3f, 12f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-10.5f)
            curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            close()
            moveTo(18.54f, 16.36f)
            curveToRelative(0.31f, 0.85f, 0.46f, 1.74f, 0.46f, 2.64f)
            curveToRelative(0f, 1.31f, -0.85f, 2.41f, -2.02f, 2.82f)
            curveToRelative(0.01f, 0.06f, 0.02f, 0.12f, 0.02f, 0.18f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            horizontalLineToRelative(-2f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            curveToRelative(0f, -0.06f, 0.01f, -0.12f, 0.02f, -0.18f)
            curveToRelative(-1.17f, -0.41f, -2.02f, -1.51f, -2.02f, -2.82f)
            curveToRelative(0f, -0.9f, 0.15f, -1.79f, 0.46f, -2.64f)
            lineToRelative(1.22f, -3.38f)
            curveToRelative(0.64f, -1.78f, 2.34f, -2.97f, 4.23f, -2.97f)
            horizontalLineToRelative(2.17f)
            curveToRelative(1.89f, 0f, 3.59f, 1.2f, 4.23f, 2.97f)
            lineToRelative(1.22f, 3.38f)
            close()
            moveTo(15f, 17.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(7.5f, 19f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            close()
            moveTo(15.22f, 16f)
            lineToRelative(-0.72f, -2.01f)
            curveToRelative(-0.21f, -0.59f, -0.78f, -0.99f, -1.41f, -0.99f)
            horizontalLineToRelative(-2.17f)
            curveToRelative(-0.63f, 0f, -1.2f, 0.4f, -1.41f, 0.99f)
            lineToRelative(-0.72f, 2.01f)
            horizontalLineToRelative(6.44f)
            close()
        }
    }.also { _CarTunnel = it }
