package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dolphin: ImageVector? = null

val Icons.Sr.Dolphin: ImageVector
    get() = _Dolphin ?: UXIcon(name = "Dolphin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-5.9f)
                curveToRelative(-0.14f, 0f, -0.3f, 0.01f, -0.45f, 0.01f)
                curveToRelative(-0.12f, 0.87f, -0.4f, 2f, -0.95f, 3.44f)
                curveToRelative(-0.24f, 0.62f, -1.28f, 0.78f, -1.42f, 0.13f)
                curveToRelative(-0.3f, -1.4f, -0.69f, -2.28f, -1.06f, -2.85f)
                curveToRelative(-1.08f, 0.46f, -2.11f, 1.19f, -2.9f, 2.33f)
                curveToRelative(-0.9f, 1.3f, -1.55f, 3.15f, -1.75f, 4.86f)
                curveToRelative(1.66f, 0.67f, 2.97f, 2.1f, 3.4f, 3.82f)
                curveToRelative(0.17f, 0.68f, -0.4f, 1.35f, -1.09f, 1.25f)
                curveToRelative(-3.15f, -0.48f, -4.38f, -2.74f, -4.38f, -2.74f)
                curveToRelative(0f, 0f, -1.19f, 2.26f, -4.38f, 2.74f)
                curveToRelative(-0.69f, 0.1f, -1.26f, -0.57f, -1.09f, -1.25f)
                curveToRelative(0.4f, -1.6f, 1.56f, -2.94f, 3.05f, -3.66f)
                curveToRelative(-0.47f, -1.37f, -1.08f, -3.64f, -1.08f, -6.08f)
                curveToRelative(0f, -3.05f, 0.63f, -5.47f, 1.65f, -7.36f)
                curveToRelative(-0.72f, -1.27f, -1.78f, -2.68f, -3.38f, -3.95f)
                curveTo(-0.45f, 1.13f, 0.39f, -0.08f, 1.31f, 0.0f)
                curveToRelative(2.64f, 0.24f, 4.67f, 0.91f, 6.17f, 1.61f)
                curveToRelative(1.88f, -1.12f, 4.01f, -1.61f, 6.01f, -1.61f)
                curveToRelative(5.11f, 0f, 7.99f, 3.38f, 8.44f, 7f)
                curveToRelative(1.1f, 0f, 2.06f, 0.9f, 2.06f, 2f)
                close()
            }
        }.also { _Dolphin = it}
