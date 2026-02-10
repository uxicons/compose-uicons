package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SeaWave: ImageVector? = null

val Icons.Rs.SeaWave: ImageVector
    get() = _SeaWave ?: UXIcon(name = "SeaWave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.05f, 12.76f)
                verticalLineToRelative(11.24f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-11.24f)
                curveToRelative(0f, -6.03f, -5.05f, -10.76f, -11.49f, -10.76f)
                curveToRelative(-1.37f, 0f, -2.47f, 0.23f, -3.33f, 0.53f)
                curveToRelative(4.48f, 0.28f, 8.77f, 3.08f, 8.77f, 8.97f)
                curveToRelative(0f, 0.81f, -0.16f, 1.62f, -0.45f, 2.38f)
                curveToRelative(0.92f, 1.49f, 1.45f, 3.23f, 1.45f, 5.12f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -4.49f, -3.73f, -8f, -8.5f, -8f)
                curveToRelative(-0.91f, 0f, -1.78f, 0.2f, -2.52f, 0.49f)
                curveToRelative(1.5f, 0.19f, 2.84f, 0.75f, 3.87f, 1.64f)
                curveToRelative(1.41f, 1.22f, 2.15f, 3.0f, 2.15f, 5.15f)
                curveToRelative(0f, 3.16f, -2.57f, 5.72f, -5.74f, 5.72f)
                horizontalLineToRelative(-4.26f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.26f)
                curveToRelative(2.06f, 0f, 3.74f, -1.67f, 3.74f, -3.73f)
                curveToRelative(0f, -1.43f, -0.42f, -2.55f, -1.22f, -3.38f)
                curveToRelative(-0.33f, 0.65f, -1.0f, 1.1f, -1.78f, 1.1f)
                curveToRelative(-0.87f, 0f, -1.61f, -0.56f, -1.88f, -1.34f)
                curveToRelative(-0.32f, 0.22f, -0.7f, 0.34f, -1.12f, 0.34f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -2.25f, 3.49f, -4f, 6.5f, -4f)
                curveToRelative(2.95f, 0f, 5.58f, 1.1f, 7.47f, 2.91f)
                curveToRelative(0.01f, -0.14f, 0.03f, -0.27f, 0.03f, -0.41f)
                curveToRelative(0f, -3.19f, -1.54f, -5.11f, -3.54f, -6.11f)
                curveToRelative(-0.18f, 0.92f, -0.99f, 1.61f, -1.96f, 1.61f)
                curveToRelative(-1.01f, 0f, -1.84f, -0.75f, -1.97f, -1.73f)
                curveToRelative(-0.37f, 0.44f, -0.91f, 0.72f, -1.53f, 0.72f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0.01f, -0.46f, 0.18f, -0.93f, 0.47f, -1.27f)
                curveToRelative(0.96f, -1.37f, 3.4f, -2.73f, 7.09f, -2.73f)
                curveToRelative(7.57f, 0f, 13.49f, 5.6f, 13.49f, 12.76f)
                close()
            }
        }.also { _SeaWave = it}
