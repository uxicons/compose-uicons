package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SeaWave: ImageVector? = null

val Icons.Bs.SeaWave: ImageVector
    get() = _SeaWave ?: UXIcon(name = "SeaWave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.71f, 0f)
                curveToRelative(-3.61f, 0f, -6.35f, 0.98f, -7.32f, 2.48f)
                curveToRelative(-0.24f, 0.38f, -0.39f, 0.81f, -0.39f, 1.27f)
                curveToRelative(0f, 1.24f, 1.01f, 2.25f, 2.25f, 2.25f)
                curveToRelative(0.36f, 0f, 0.7f, -0.09f, 1.0f, -0.24f)
                curveToRelative(0.37f, 0.73f, 1.12f, 1.24f, 2.0f, 1.24f)
                curveToRelative(1.15f, 0f, 2.1f, -0.88f, 2.22f, -2.0f)
                curveToRelative(2.19f, 1.2f, 3.62f, 3.72f, 3.51f, 6.68f)
                curveToRelative(-1.82f, -1.7f, -4.36f, -2.69f, -7.34f, -2.69f)
                curveToRelative(-3.27f, 0f, -6.64f, 1.4f, -6.64f, 3.75f)
                curveToRelative(0f, 1.24f, 1.01f, 2.25f, 2.25f, 2.25f)
                curveToRelative(0.36f, 0f, 0.7f, -0.09f, 1.0f, -0.24f)
                curveToRelative(0.37f, 0.73f, 1.12f, 1.24f, 2.0f, 1.24f)
                curveToRelative(0.75f, 0f, 1.41f, -0.37f, 1.82f, -0.93f)
                curveToRelative(0.56f, 0.61f, 0.93f, 1.54f, 0.93f, 2.93f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -2.64f, -1.03f, -4.7f, -2.81f, -5.88f)
                curveToRelative(3.58f, 0.57f, 5.81f, 3.14f, 5.81f, 6.88f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.52f, -0.29f, -2.93f, -0.82f, -4.17f)
                curveToRelative(0.53f, -1.04f, 0.82f, -2.18f, 0.82f, -3.33f)
                curveToRelative(0f, -3.41f, -1.42f, -6.33f, -3.71f, -8.18f)
                curveToRelative(4.48f, 1.09f, 7.71f, 4.95f, 7.71f, 9.68f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -7.29f, -5.84f, -13f, -13.29f, -13f)
                close()
            }
        }.also { _SeaWave = it}
