package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppleCore: ImageVector? = null

val Icons.Ss.AppleCore: ImageVector
    get() = _AppleCore ?: UXIcon(name = "AppleCore") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.0f, 6.0f)
                reflectiveCurveToRelative(-0.16f, -2.86f, 1.51f, -4.53f)
                reflectiveCurveTo(20.99f, 0.01f, 20.99f, 0.01f)
                curveToRelative(0f, 0f, 0.21f, 2.81f, -1.46f, 4.48f)
                curveToRelative(-1.67f, 1.67f, -4.53f, 1.51f, -4.53f, 1.51f)
                close()
                moveTo(17f, 15f)
                curveToRelative(0f, -2.98f, 1.38f, -5.62f, 3.49f, -7.25f)
                curveToRelative(-0.34f, -0.27f, -0.7f, -0.51f, -1.08f, -0.72f)
                curveToRelative(-1.65f, 0.87f, -3.42f, 0.97f, -4.18f, 0.97f)
                curveToRelative(-0.1f, 0f, -1.32f, 0f, -2.23f, 0f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.86f, -0.94f, -4.47f, -1.57f, -5.53f)
                curveToRelative(-0.09f, -0.15f, -0.17f, -0.29f, -0.24f, -0.42f)
                lineToRelative(-1.76f, 0.96f)
                curveToRelative(0.08f, 0.15f, 0.17f, 0.31f, 0.27f, 0.48f)
                curveToRelative(0.57f, 0.98f, 1.29f, 2.19f, 1.29f, 4.51f)
                verticalLineToRelative(0.41f)
                curveToRelative(-0.81f, -0.26f, -1.65f, -0.41f, -2.5f, -0.41f)
                curveToRelative(-1.87f, 0f, -3.6f, 0.65f, -5.01f, 1.75f)
                curveToRelative(2.12f, 1.64f, 3.51f, 4.27f, 3.51f, 7.25f)
                reflectiveCurveToRelative(-1.38f, 5.62f, -3.5f, 7.26f)
                curveToRelative(1.41f, 1.09f, 3.13f, 1.74f, 5f, 1.74f)
                curveToRelative(1.2f, 0f, 2.4f, -0.28f, 3.5f, -0.8f)
                curveToRelative(1.1f, 0.53f, 2.3f, 0.8f, 3.5f, 0.8f)
                curveToRelative(1.87f, 0f, 3.6f, -0.65f, 5f, -1.74f)
                curveToRelative(-2.12f, -1.64f, -3.5f, -4.28f, -3.5f, -7.26f)
                close()
            }
        }.also { _AppleCore = it}
