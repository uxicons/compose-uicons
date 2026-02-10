package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Videvo: ImageVector? = null

val Icons.Brand.Videvo: ImageVector
    get() = _Videvo ?: UXIcon(name = "Videvo") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.06f, 0.23f)
            curveToRelative(1.09f, -0.53f, 2.52f, -0.12f, 3.04f, 1.02f)
            curveToRelative(2.32f, 4.99f, 4.59f, 10.03f, 6.9f, 15.02f)
            curveToRelative(2.31f, -4.93f, 4.54f, -9.9f, 6.81f, -14.84f)
            curveToRelative(0.3f, -0.68f, 0.78f, -1.22f, 1.54f, -1.37f)
            curveToRelative(1.21f, -0.27f, 2.35f, 0.37f, 2.74f, 1.53f)
            curveToRelative(0.34f, 1.06f, -0.28f, 1.96f, -0.68f, 2.89f)
            curveToRelative(-2.76f, 6f, -5.5f, 12.01f, -8.25f, 18.01f)
            curveToRelative(-0.26f, 0.54f, -0.52f, 1.04f, -1.09f, 1.3f)
            curveToRelative(-0.6f, 0.25f, -1.36f, 0.26f, -1.98f, 0.06f)
            curveToRelative(-0.73f, -0.28f, -0.97f, -0.91f, -1.29f, -1.56f)
            curveTo(7.19f, 16.65f, 4.58f, 11.01f, 2f, 5.36f)
            curveToRelative(-0.37f, -0.84f, -0.86f, -1.68f, -1.11f, -2.57f)
            curveTo(0.64f, 1.78f, 1.12f, 0.69f, 2.06f, 0.23f)
            close()
        }
    }.also { _Videvo = it }
