package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dolphin: ImageVector? = null

val Icons.Ss.Dolphin: ImageVector
    get() = _Dolphin ?: UXIcon(name = "Dolphin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 7f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(-0.45f, -3.62f, -3.33f, -7f, -8.44f, -7f)
                curveToRelative(-2.0f, 0f, -4.14f, 0.49f, -6.01f, 1.61f)
                curveTo(5.99f, 0.91f, 3.96f, 0.25f, 1.31f, 0.0f)
                curveTo(0.39f, -0.08f, -0.45f, 1.13f, 0.27f, 1.7f)
                curveToRelative(1.59f, 1.26f, 2.66f, 2.67f, 3.38f, 3.94f)
                curveToRelative(-1.02f, 1.89f, -1.65f, 4.31f, -1.65f, 7.36f)
                curveToRelative(0f, 2.44f, 0.61f, 4.71f, 1.08f, 6.08f)
                curveToRelative(-1.82f, 0.9f, -3.08f, 2.79f, -3.08f, 4.95f)
                curveToRelative(4.17f, 0f, 5.5f, -2.78f, 5.5f, -2.78f)
                curveToRelative(0f, 0f, 1.38f, 2.78f, 5.5f, 2.78f)
                curveToRelative(0f, -2.3f, -1.42f, -4.29f, -3.42f, -5.11f)
                curveToRelative(0.2f, -1.71f, 0.85f, -3.55f, 1.75f, -4.85f)
                curveToRelative(0.81f, -1.17f, 1.87f, -1.9f, 2.98f, -2.37f)
                curveToRelative(0.49f, 0.85f, 1.04f, 2.15f, 1.7f, 3.8f)
                curveToRelative(0.99f, -1.97f, 1.45f, -3.4f, 1.63f, -4.48f)
                curveToRelative(0.16f, -0.01f, 0.32f, -0.02f, 0.47f, -0.02f)
                horizontalLineToRelative(7.9f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _Dolphin = it}
