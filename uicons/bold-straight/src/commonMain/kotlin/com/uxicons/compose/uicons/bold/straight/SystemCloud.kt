package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SystemCloud: ImageVector? = null

val Icons.Bs.SystemCloud: ImageVector
    get() = _SystemCloud ?: UXIcon(name = "SystemCloud") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 3f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 0.69f, 0.23f, 1.81f, 0.23f, 1.81f)
                lineToRelative(-0.92f, 0.51f)
                curveToRelative(-0.81f, 0.44f, -1.31f, 1.28f, -1.31f, 2.18f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
                verticalLineToRelative(3.02f)
                curveToRelative(-2.8f, -0.25f, -5f, -2.61f, -5f, -5.47f)
                curveToRelative(0f, -1.65f, 0.75f, -3.19f, 2.01f, -4.23f)
                curveToRelative(-0.0f, -0.09f, -0.01f, -0.18f, -0.01f, -0.27f)
                curveTo(3f, 3.59f, 6.59f, 0f, 11f, 0f)
                curveToRelative(3.03f, 0f, 5.74f, 1.67f, 7.1f, 4.32f)
                curveToRelative(2.88f, 0.9f, 4.9f, 3.6f, 4.9f, 6.68f)
                curveToRelative(0f, 3.16f, -2.11f, 5.84f, -5f, 6.71f)
                verticalLineToRelative(-3.26f)
                curveToRelative(1.19f, -0.69f, 2f, -1.97f, 2f, -3.44f)
                curveToRelative(0f, -1.92f, -1.36f, -3.57f, -3.24f, -3.93f)
                lineToRelative(-0.81f, -0.15f)
                lineToRelative(-0.3f, -0.77f)
                curveToRelative(-0.76f, -1.92f, -2.58f, -3.15f, -4.64f, -3.15f)
                close()
                moveTo(20.5f, 19f)
                curveToRelative(-0.81f, 0f, -1.53f, 0.4f, -1.99f, 1f)
                horizontalLineToRelative(-2.51f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(5.51f)
                curveToRelative(0.46f, 0.6f, 1.17f, 1f, 1.99f, 1f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(8f, 20f)
                horizontalLineToRelative(-2.51f)
                curveToRelative(-0.46f, -0.6f, -1.17f, -1f, -1.99f, -1f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.81f, 0f, 1.53f, -0.4f, 1.99f, -1f)
                horizontalLineToRelative(5.51f)
                lineTo(11f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _SystemCloud = it}
