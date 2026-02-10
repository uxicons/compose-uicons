package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hotjar: ImageVector? = null

val Icons.Brand.Hotjar: ImageVector
    get() = _Hotjar ?: UXIcon(name = "Hotjar") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.05f, 7.81f)
            curveTo(17.51f, 1.4f, 7.12f, 0f, 7.12f, 0f)
            reflectiveCurveToRelative(4.8f, 5.34f, -1.33f, 9.57f)
            curveToRelative(-3.88f, 2.67f, -5.41f, 6.13f, -3.75f, 9.91f)
            curveToRelative(1.27f, 2.9f, 3.96f, 4.08f, 6.86f, 4.52f)
            curveToRelative(-0.74f, -1.43f, -0.93f, -3.5f, -0.38f, -5.63f)
            curveToRelative(0.06f, -0.21f, 0.12f, -0.43f, 0.19f, -0.64f)
            curveToRelative(0.81f, 1.26f, 2.15f, 1.95f, 3.45f, 1.63f)
            curveToRelative(1.78f, -0.42f, 2.83f, -2.58f, 2.34f, -4.8f)
            curveToRelative(-0.11f, -0.48f, -0.29f, -0.94f, -0.54f, -1.37f)
            curveToRelative(0.07f, 0.02f, 0.14f, 0.02f, 0.21f, 0.05f)
            curveToRelative(2.23f, 0.64f, 3.3f, 3.96f, 2.4f, 7.43f)
            curveToRelative(-0.27f, 1.05f, -0.71f, 2.05f, -1.33f, 2.94f)
            curveToRelative(3.82f, -1.23f, 6.36f, -4.31f, 7.06f, -7.06f)
            curveTo(23.04f, 13.71f, 22.48f, 10.38f, 21.05f, 7.81f)
            close()
        }
    }.also { _Hotjar = it }
