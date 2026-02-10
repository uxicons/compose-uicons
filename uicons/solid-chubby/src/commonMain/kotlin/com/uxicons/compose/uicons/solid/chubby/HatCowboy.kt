package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatCowboy: ImageVector? = null

val Icons.Sc.HatCowboy: ImageVector
    get() = _HatCowboy ?: UXIcon(name = "HatCowboy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 7.25f)
                curveToRelative(0f, 11.04f, -4.71f, 15.75f, -15.75f, 15.75f)
                curveToRelative(-1.89f, 0f, -3.53f, -0.13f, -5.02f, -0.4f)
                curveToRelative(-0.81f, -0.15f, -1.36f, -0.93f, -1.21f, -1.74f)
                curveToRelative(0.15f, -0.81f, 0.92f, -1.35f, 1.74f, -1.21f)
                curveToRelative(1.27f, 0.23f, 2.75f, 0.35f, 4.41f, 0.35f)
                curveToRelative(-0.49f, -0.6f, -1.02f, -1.28f, -1.53f, -2.02f)
                curveToRelative(6.28f, -0.13f, 9.95f, -2.25f, 11.48f, -6.64f)
                curveToRelative(0.18f, -0.52f, -0.09f, -1.09f, -0.61f, -1.27f)
                curveToRelative(-0.52f, -0.18f, -1.09f, 0.09f, -1.27f, 0.61f)
                curveToRelative(-1.3f, 3.73f, -4.36f, 5.31f, -10.22f, 5.31f)
                horizontalLineToRelative(-0.63f)
                curveToRelative(-1.28f, -2.23f, -2.31f, -4.82f, -2.38f, -7.47f)
                curveToRelative(-0.01f, -0.4f, 0.22f, -0.77f, 0.58f, -0.94f)
                curveToRelative(0.06f, -0.03f, 1.32f, -0.6f, 4.02f, -0.98f)
                curveToRelative(0.39f, -2.7f, 0.96f, -3.97f, 0.98f, -4.02f)
                curveToRelative(0.17f, -0.36f, 0.55f, -0.6f, 0.94f, -0.58f)
                curveToRelative(4.45f, 0.11f, 8.79f, 2.98f, 11.47f, 5.18f)
                curveToRelative(-0.0f, -1.65f, -0.12f, -3.14f, -0.35f, -4.41f)
                curveToRelative(-0.15f, -0.81f, 0.39f, -1.6f, 1.21f, -1.74f)
                curveToRelative(0.81f, -0.15f, 1.6f, 0.39f, 1.74f, 1.21f)
                curveToRelative(0.27f, 1.49f, 0.4f, 3.13f, 0.4f, 5.02f)
                close()
            }
        }.also { _HatCowboy = it}
