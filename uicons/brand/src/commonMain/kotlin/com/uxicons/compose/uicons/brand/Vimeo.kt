package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vimeo: ImageVector? = null

val Icons.Brand.Vimeo: ImageVector
    get() = _Vimeo ?: UXIcon(name = "Vimeo") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.99f, 6.41f)
            curveToRelative(-0.11f, 2.34f, -1.74f, 5.55f, -4.89f, 9.61f)
            curveToRelative(-3.26f, 4.25f, -6.02f, 6.37f, -8.28f, 6.37f)
            curveToRelative(-1.4f, 0f, -2.58f, -1.29f, -3.55f, -3.88f)
            curveToRelative(-0.65f, -2.37f, -1.29f, -4.74f, -1.94f, -7.12f)
            curveTo(4.61f, 8.81f, 3.84f, 7.52f, 3.01f, 7.52f)
            curveToRelative(-0.18f, 0f, -0.81f, 0.38f, -1.88f, 1.13f)
            lineTo(0f, 7.2f)
            curveToRelative(1.19f, -1.04f, 2.35f, -2.08f, 3.5f, -3.13f)
            curveToRelative(1.58f, -1.37f, 2.77f, -2.09f, 3.56f, -2.16f)
            curveToRelative(1.87f, -0.18f, 3.02f, 1.1f, 3.45f, 3.84f)
            curveToRelative(0.47f, 2.96f, 0.79f, 4.79f, 0.97f, 5.51f)
            curveToRelative(0.54f, 2.45f, 1.13f, 3.67f, 1.78f, 3.67f)
            curveToRelative(0.5f, 0f, 1.26f, -0.8f, 2.26f, -2.38f)
            curveToRelative(1.0f, -1.59f, 1.54f, -2.8f, 1.62f, -3.63f)
            curveToRelative(0.14f, -1.37f, -0.4f, -2.06f, -1.62f, -2.06f)
            curveToRelative(-0.57f, 0f, -1.17f, 0.13f, -1.78f, 0.39f)
            curveToRelative(1.18f, -3.87f, 3.43f, -5.75f, 6.76f, -5.64f)
            curveTo(22.97f, 1.68f, 24.13f, 3.28f, 23.99f, 6.41f)
            close()
        }
    }.also { _Vimeo = it }
