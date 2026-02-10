package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angry: ImageVector? = null

val Icons.Tc.Angry: ImageVector
    get() = _Angry ?: UXIcon(name = "Angry") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.99f, 8.8f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-1.68f, 0.01f, -2.62f, 0.95f, -2.65f, 2.65f)
                curveToRelative(-0.01f, 0.28f, 0.22f, 0.51f, 0.5f, 0.51f)
                curveToRelative(0.27f, 0f, 0.49f, -0.22f, 0.5f, -0.49f)
                curveToRelative(0.02f, -1.15f, 0.53f, -1.66f, 1.65f, -1.67f)
                curveToRelative(0.28f, -0.0f, 0.5f, -0.23f, 0.5f, -0.5f)
                curveToRelative(-0.0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.01f, 8.8f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.68f, 0.01f, 2.62f, 0.95f, 2.65f, 2.65f)
                curveToRelative(0.01f, 0.28f, -0.22f, 0.51f, -0.5f, 0.51f)
                curveToRelative(-0.27f, 0f, -0.49f, -0.22f, -0.5f, -0.49f)
                curveToRelative(-0.02f, -1.15f, -0.53f, -1.66f, -1.65f, -1.67f)
                curveToRelative(-0.28f, -0.0f, -0.5f, -0.23f, -0.5f, -0.5f)
                curveToRelative(0.0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.07f, 17.1f)
                curveToRelative(-0.2f, 0.19f, -0.21f, 0.51f, -0.01f, 0.71f)
                curveToRelative(0.29f, 0.28f, 0.61f, 0.1f, 0.71f, 0.01f)
                curveToRelative(2.88f, -2.79f, 5.65f, -2.79f, 8.46f, -0.0f)
                curveToRelative(0.2f, 0.19f, 0.51f, 0.19f, 0.71f, -0.0f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.0f, -0.71f)
                curveToRelative(-3.19f, -3.15f, -6.6f, -3.16f, -9.86f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 1f)
                curveTo(4.95f, 1.04f, 1.03f, 5.2f, 1.03f, 11.99f)
                curveToRelative(0f, 6.97f, 3.82f, 10.97f, 10.98f, 11.01f)
                curveToRelative(7.15f, -0.04f, 10.84f, -3.74f, 10.97f, -11.01f)
                curveToRelative(-0.12f, -7.04f, -4.02f, -10.95f, -10.98f, -10.99f)
                close()
                moveTo(12.0f, 22f)
                curveToRelative(-6.59f, -0.04f, -9.85f, -3.31f, -9.98f, -10f)
                curveToRelative(0.12f, -6.59f, 3.48f, -9.96f, 9.97f, -10f)
                curveToRelative(4.47f, 0.03f, 9.84f, 1.79f, 9.98f, 9.99f)
                curveToRelative(-0.12f, 6.7f, -3.38f, 9.97f, -9.97f, 10.01f)
                close()
            }
        }.also { _Angry = it}
