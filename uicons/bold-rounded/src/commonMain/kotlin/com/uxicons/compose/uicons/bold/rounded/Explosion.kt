package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Explosion: ImageVector? = null

val Icons.Br.Explosion: ImageVector
    get() = _Explosion ?: UXIcon(name = "Explosion") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.5f, 15f)
            horizontalLineToRelative(-2.38f)
            lineTo(23.93f, 1.75f)
            curveToRelative(0.31f, -0.95f, -0.45f, -1.75f, -1.28f, -1.75f)
            curveToRelative(-0.3f, 0f, -0.62f, 0.11f, -0.89f, 0.36f)
            lineToRelative(-7.83f, 8.81f)
            lineToRelative(-3.52f, -6.6f)
            curveToRelative(-0.28f, -0.39f, -0.68f, -0.56f, -1.07f, -0.56f)
            curveToRelative(-0.68f, 0f, -1.34f, 0.51f, -1.34f, 1.33f)
            verticalLineToRelative(7.58f)
            lineToRelative(-5.29f, -1.84f)
            curveToRelative(-0.14f, -0.05f, -0.29f, -0.07f, -0.42f, -0.07f)
            curveToRelative(-0.95f, 0f, -1.64f, 1.07f, -1.08f, 1.97f)
            lineToRelative(3.61f, 5.03f)
            lineTo(2.4f, 16f)
            curveToRelative(-1.19f, 0f, -1.84f, 1.39f, -1.07f, 2.3f)
            lineToRelative(4.78f, 4.81f)
            curveToRelative(0.56f, 0.57f, 1.33f, 0.89f, 2.13f, 0.89f)
            horizontalLineToRelative(8.1f)
            curveToRelative(0.97f, 0f, 1.89f, -0.47f, 2.45f, -1.26f)
            lineToRelative(3.89f, -5.49f)
            curveToRelative(0.65f, -0.95f, -0.03f, -2.24f, -1.18f, -2.24f)
            close()
            moveTo(16.34f, 21f)
            lineTo(8.24f, 21f)
            lineToRelative(-1.99f, -2f)
            horizontalLineToRelative(2.15f)
            curveToRelative(0.94f, 0f, 1.49f, -1.07f, 0.94f, -1.83f)
            lineToRelative(-2.5f, -3.49f)
            lineToRelative(2.17f, 0.75f)
            curveToRelative(0.97f, 0.34f, 1.99f, -0.39f, 1.99f, -1.42f)
            verticalLineToRelative(-2.98f)
            lineToRelative(1.03f, 1.94f)
            curveToRelative(0.62f, 1.17f, 2.22f, 1.36f, 3.09f, 0.37f)
            lineToRelative(2.99f, -3.36f)
            lineToRelative(-2.55f, 7.02f)
            curveToRelative(-0.35f, 0.97f, 0.37f, 2f, 1.4f, 2f)
            horizontalLineToRelative(1.5f)
            lineToRelative(-2.13f, 3f)
            close()
            moveTo(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2.18f)
            lineToRelative(2.06f, -3f)
            horizontalLineToRelative(0.12f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(1.5f, 21f)
            lineToRelative(2.88f, 3f)
            lineTo(1.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            close()
        }
    }.also { _Explosion = it }
