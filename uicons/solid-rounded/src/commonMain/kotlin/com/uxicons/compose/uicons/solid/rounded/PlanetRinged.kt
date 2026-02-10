package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlanetRinged: ImageVector? = null

val Icons.Sr.PlanetRinged: ImageVector
    get() = _PlanetRinged ?: UXIcon(name = "PlanetRinged") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.43f, 21.33f)
                curveToRelative(2.22f, -1.51f, 4.65f, -3.55f, 7.0f, -5.9f)
                curveToRelative(4.58f, -4.58f, 5.9f, -7.0f, 5.89f, -7.01f)
                curveToRelative(2.17f, -3.17f, 3.52f, -6.29f, 2.03f, -7.78f)
                curveToRelative(-1.6f, -1.6f, -5.04f, 0.13f, -7.81f, 2.02f)
                curveToRelative(-1.11f, -0.42f, -2.3f, -0.66f, -3.55f, -0.66f)
                curveTo(6.48f, 1.99f, 1.99f, 6.48f, 1.99f, 11.99f)
                curveToRelative(0f, 1.25f, 0.24f, 2.45f, 0.66f, 3.55f)
                curveToRelative(-1.89f, 2.77f, -3.63f, 6.21f, -2.02f, 7.81f)
                curveToRelative(0.42f, 0.42f, 0.99f, 0.64f, 1.7f, 0.64f)
                curveToRelative(1.15f, 0f, 2.68f, -0.56f, 4.56f, -1.67f)
                curveToRelative(0.26f, -0.15f, 1.29f, -0.82f, 1.53f, -0.99f)
                close()
                moveTo(21.94f, 2.05f)
                curveToRelative(0.32f, 0.32f, -0.15f, 1.92f, -1.67f, 4.34f)
                curveToRelative(-0.72f, -1.05f, -1.63f, -1.97f, -2.69f, -2.68f)
                curveToRelative(3.01f, -1.89f, 4.23f, -1.78f, 4.35f, -1.66f)
                close()
                moveTo(5.88f, 20.59f)
                curveToRelative(-2.69f, 1.59f, -3.73f, 1.44f, -3.83f, 1.34f)
                curveToRelative(-0.12f, -0.12f, -0.23f, -1.34f, 1.66f, -4.35f)
                curveToRelative(0.72f, 1.06f, 1.63f, 1.97f, 2.69f, 2.69f)
                curveToRelative(-0.17f, 0.11f, -0.35f, 0.22f, -0.52f, 0.32f)
                close()
                moveTo(21.94f, 11.01f)
                curveToRelative(0.03f, 0.32f, 0.05f, 0.65f, 0.05f, 0.98f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                curveToRelative(-0.33f, 0f, -0.66f, -0.02f, -0.98f, -0.05f)
                curveToRelative(1.9f, -1.43f, 3.9f, -3.17f, 5.83f, -5.1f)
                curveToRelative(0.82f, -0.82f, 3.05f, -3.12f, 5.1f, -5.83f)
                close()
            }
        }.also { _PlanetRinged = it}
