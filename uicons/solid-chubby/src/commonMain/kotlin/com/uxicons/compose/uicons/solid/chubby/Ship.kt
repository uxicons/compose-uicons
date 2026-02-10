package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ship: ImageVector? = null

val Icons.Sc.Ship: ImageVector
    get() = _Ship ?: UXIcon(name = "Ship") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.32f, 19.43f)
                curveToRelative(-0.64f, -0.53f, -1.58f, -0.44f, -2.11f, 0.19f)
                curveToRelative(-0.23f, 0.27f, -0.36f, 0.22f, -0.33f, 0.17f)
                curveToRelative(1.23f, -2.03f, 1.45f, -4.3f, 1.46f, -4.4f)
                curveToRelative(0.02f, -0.22f, -0.03f, -0.45f, -0.15f, -0.64f)
                curveToRelative(-2.2f, -3.42f, -5.54f, -5.09f, -8.18f, -5.92f)
                verticalLineToRelative(7.89f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-7.89f)
                curveToRelative(-2.65f, 0.82f, -5.98f, 2.5f, -8.18f, 5.92f)
                curveToRelative(-0.12f, 0.19f, -0.18f, 0.41f, -0.15f, 0.64f)
                curveToRelative(0.01f, 0.1f, 0.24f, 2.37f, 1.46f, 4.4f)
                curveToRelative(0.03f, 0.05f, -0.18f, 0.0f, -0.33f, -0.17f)
                curveToRelative(-0.54f, -0.62f, -1.48f, -0.72f, -2.11f, -0.19f)
                curveToRelative(-0.64f, 0.53f, -0.72f, 1.48f, -0.19f, 2.11f)
                curveToRelative(1.22f, 1.46f, 3.32f, 1.85f, 4.89f, 0.96f)
                curveToRelative(1.15f, 0.65f, 2.6f, 0.65f, 3.74f, 0f)
                curveToRelative(1.15f, 0.65f, 2.6f, 0.65f, 3.74f, 0f)
                curveToRelative(1.15f, 0.65f, 2.6f, 0.65f, 3.74f, 0f)
                curveToRelative(0.57f, 0.32f, 1.22f, 0.5f, 1.87f, 0.5f)
                curveToRelative(1.15f, 0f, 2.25f, -0.53f, 3.02f, -1.46f)
                curveToRelative(0.53f, -0.64f, 0.45f, -1.58f, -0.19f, -2.11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6.59f)
                curveToRelative(0.26f, 0f, 0.53f, 0.04f, 0.78f, 0.1f)
                curveToRelative(1.84f, 0.49f, 4.11f, 1.37f, 6.23f, 2.91f)
                verticalLineToRelative(-2.72f)
                curveToRelative(0f, -0.32f, -0.15f, -0.61f, -0.4f, -0.8f)
                curveToRelative(-0.06f, -0.04f, -0.99f, -0.72f, -2.81f, -1.19f)
                verticalLineToRelative(-0.09f)
                curveToRelative(0f, -2.09f, -1.7f, -3.8f, -3.8f, -3.8f)
                curveToRelative(-2.09f, 0f, -3.79f, 1.7f, -3.79f, 3.8f)
                verticalLineToRelative(0.09f)
                curveToRelative(-1.82f, 0.47f, -2.75f, 1.14f, -2.81f, 1.19f)
                curveToRelative(-0.26f, 0.19f, -0.41f, 0.49f, -0.41f, 0.81f)
                verticalLineToRelative(2.72f)
                curveToRelative(2.11f, -1.54f, 4.38f, -2.42f, 6.23f, -2.91f)
                curveToRelative(0.25f, -0.07f, 0.51f, -0.1f, 0.78f, -0.1f)
                close()
            }
        }.also { _Ship = it}
