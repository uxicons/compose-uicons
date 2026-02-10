package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dolphin: ImageVector? = null

val Icons.Rs.Dolphin: ImageVector
    get() = _Dolphin ?: UXIcon(name = "Dolphin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 7f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(-0.45f, -3.62f, -3.33f, -7f, -8.44f, -7f)
                curveToRelative(-2.0f, 0f, -4.13f, 0.49f, -6.01f, 1.61f)
                curveTo(5.99f, 0.91f, 3.95f, 0.25f, 1.31f, 0.0f)
                curveTo(0.39f, -0.08f, -0.45f, 1.13f, 0.27f, 1.7f)
                curveToRelative(1.59f, 1.26f, 2.66f, 2.67f, 3.38f, 3.94f)
                curveToRelative(-1.02f, 1.89f, -1.65f, 4.31f, -1.65f, 7.37f)
                curveToRelative(0f, 2.43f, 0.61f, 4.7f, 1.08f, 6.07f)
                curveToRelative(-1.82f, 0.9f, -3.08f, 2.79f, -3.08f, 4.96f)
                curveToRelative(4.17f, 0f, 5.5f, -2.78f, 5.5f, -2.78f)
                curveToRelative(0f, 0f, 1.38f, 2.78f, 5.5f, 2.78f)
                curveToRelative(0f, -2.31f, -1.42f, -4.29f, -3.43f, -5.12f)
                curveToRelative(0.21f, -1.71f, 0.86f, -3.54f, 1.75f, -4.84f)
                curveToRelative(0.81f, -1.17f, 1.86f, -1.92f, 2.98f, -2.38f)
                curveToRelative(0.49f, 0.85f, 1.04f, 2.17f, 1.7f, 3.81f)
                curveToRelative(0.99f, -1.98f, 1.45f, -3.41f, 1.64f, -4.49f)
                curveToRelative(0.16f, -0.01f, 8.36f, -0.01f, 8.36f, -0.01f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(20f, 9f)
                horizontalLineToRelative(-3.9f)
                curveToRelative(-3.74f, 0f, -6.65f, 1.36f, -8.42f, 3.93f)
                curveToRelative(-1.05f, 1.52f, -1.81f, 3.59f, -2.07f, 5.57f)
                curveToRelative(-0.04f, 0f, -0.44f, 0.01f, -0.6f, 0.02f)
                curveToRelative(-0.42f, -1.22f, -1.01f, -3.32f, -1.01f, -5.53f)
                curveTo(4f, 2.53f, 11.91f, 2f, 13.5f, 2f)
                curveToRelative(4.47f, 0f, 6.5f, 3.11f, 6.5f, 6f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _Dolphin = it}
