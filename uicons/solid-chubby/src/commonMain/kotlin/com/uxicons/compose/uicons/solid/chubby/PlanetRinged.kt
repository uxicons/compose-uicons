package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlanetRinged: ImageVector? = null

val Icons.Sc.PlanetRinged: ImageVector
    get() = _PlanetRinged ?: UXIcon(name = "PlanetRinged") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.97f, 2.04f)
                curveToRelative(-2.22f, -2.22f, -5.3f, -0.43f, -7.46f, 1.17f)
                curveToRelative(-0.77f, -0.12f, -1.58f, -0.2f, -2.5f, -0.2f)
                curveToRelative(-6.22f, 0f, -9.0f, 2.77f, -9.0f, 9f)
                curveToRelative(0f, 0.92f, 0.08f, 1.73f, 0.2f, 2.5f)
                curveToRelative(-1.6f, 2.16f, -3.39f, 5.23f, -1.17f, 7.46f)
                curveToRelative(0.71f, 0.71f, 1.52f, 1.04f, 2.44f, 1.04f)
                curveToRelative(2.78f, 0f, 6.49f, -3.04f, 10.99f, -7.54f)
                curveToRelative(3.45f, -3.45f, 5.56f, -5.99f, 6.64f, -7.98f)
                curveToRelative(1.24f, -2.29f, 1.19f, -4.12f, -0.14f, -5.45f)
                close()
                moveTo(3.46f, 20.55f)
                curveToRelative(-0.3f, -0.3f, -1.03f, -1.04f, 0.48f, -3.55f)
                curveToRelative(0.66f, 1.4f, 1.66f, 2.43f, 3.06f, 3.08f)
                curveToRelative(-1.7f, 1.03f, -2.85f, 1.17f, -3.54f, 0.47f)
                close()
                moveTo(20.35f, 6.53f)
                curveToRelative(-0.08f, 0.15f, -0.18f, 0.31f, -0.27f, 0.46f)
                curveToRelative(-0.65f, -1.4f, -1.68f, -2.4f, -3.08f, -3.05f)
                curveToRelative(2.51f, -1.52f, 3.26f, -0.79f, 3.56f, -0.49f)
                curveToRelative(0.28f, 0.28f, 0.95f, 0.95f, -0.21f, 3.08f)
                close()
                moveTo(16.88f, 16.87f)
                curveToRelative(1.66f, -1.66f, 3.01f, -3.11f, 4.11f, -4.42f)
                curveToRelative(-0.13f, 5.75f, -2.79f, 8.41f, -8.54f, 8.54f)
                curveToRelative(1.31f, -1.11f, 2.77f, -2.46f, 4.43f, -4.12f)
                close()
            }
        }.also { _PlanetRinged = it}
