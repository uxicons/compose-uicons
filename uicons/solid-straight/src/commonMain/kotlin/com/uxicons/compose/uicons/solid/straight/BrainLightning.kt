package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrainLightning: ImageVector? = null

val Icons.Ss.BrainLightning: ImageVector
    get() = _BrainLightning ?: UXIcon(name = "BrainLightning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.05f, 11f)
                curveToRelative(0f, -1.08f, -0.38f, -2.57f, -2.1f, -3.75f)
                verticalLineToRelative(-0.49f)
                curveToRelative(0f, -1.82f, -1.31f, -3.21f, -3.23f, -3.54f)
                curveTo(18.35f, 1.37f, 16.87f, 0.01f, 15.06f, 0f)
                curveToRelative(-1.15f, -0.0f, -2.19f, 0.41f, -2.93f, 1.15f)
                curveToRelative(-0.05f, 0.05f, -0.08f, 0.11f, -0.13f, 0.16f)
                curveTo(11.22f, 0.45f, 10.09f, 0f, 8.95f, 0f)
                curveTo(7.13f, 0f, 5.65f, 1.35f, 5.28f, 3.22f)
                curveToRelative(-1.92f, 0.33f, -3.23f, 1.72f, -3.23f, 3.54f)
                verticalLineToRelative(0.49f)
                curveTo(0.33f, 8.43f, -0.05f, 9.91f, -0.05f, 11f)
                curveToRelative(0f, 0.95f, 0.27f, 1.87f, 0.79f, 2.67f)
                curveTo(0.26f, 14.42f, 0f, 15.29f, 0f, 16.19f)
                curveTo(0f, 17.96f, 1.03f, 19.59f, 2.61f, 20.37f)
                curveToRelative(1.08f, 2.35f, 2.98f, 3.63f, 5.39f, 3.63f)
                curveToRelative(1.55f, 0f, 3.06f, -0.89f, 4f, -2.16f)
                curveToRelative(0.94f, 1.27f, 2.44f, 2.16f, 4f, 2.16f)
                curveToRelative(2.41f, 0f, 4.31f, -1.28f, 5.39f, -3.63f)
                curveToRelative(1.58f, -0.78f, 2.61f, -2.4f, 2.61f, -4.18f)
                curveToRelative(0f, -0.9f, -0.26f, -1.77f, -0.74f, -2.52f)
                curveToRelative(0.52f, -0.81f, 0.79f, -1.72f, 0.79f, -2.67f)
                close()
                moveTo(15.87f, 11.25f)
                lineToRelative(-4.3f, 5.75f)
                horizontalLineToRelative(-1.07f)
                lineToRelative(1.06f, -4f)
                horizontalLineToRelative(-2.73f)
                curveToRelative(-0.55f, 0f, -0.94f, -0.53f, -0.79f, -1.06f)
                lineToRelative(2.14f, -5.94f)
                horizontalLineToRelative(3.83f)
                lineToRelative(-1.52f, 4f)
                horizontalLineToRelative(2.72f)
                curveToRelative(0.64f, 0f, 1.02f, 0.71f, 0.67f, 1.25f)
                close()
            }
        }.also { _BrainLightning = it}
