package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Apple: ImageVector? = null

val Icons.Brand.Apple: ImageVector
    get() = _Apple ?: UXIcon(name = "Apple") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.55f, 12.76f)
            curveToRelative(0.02f, -1.87f, 1.0f, -3.6f, 2.6f, -4.58f)
            curveToRelative(-1.01f, -1.44f, -2.64f, -2.32f, -4.4f, -2.38f)
            curveToRelative(-1.85f, -0.19f, -3.65f, 1.11f, -4.59f, 1.11f)
            curveToRelative(-0.96f, 0f, -2.41f, -1.09f, -3.98f, -1.06f)
            curveTo(6.12f, 5.93f, 4.25f, 7.07f, 3.25f, 8.87f)
            curveToRelative(-2.13f, 3.69f, -0.54f, 9.11f, 1.5f, 12.1f)
            curveToRelative(1.02f, 1.46f, 2.21f, 3.09f, 3.78f, 3.04f)
            curveToRelative(1.53f, -0.06f, 2.1f, -0.97f, 3.94f, -0.97f)
            curveToRelative(1.83f, 0f, 2.36f, 0.97f, 3.96f, 0.94f)
            curveToRelative(1.64f, -0.03f, 2.67f, -1.47f, 3.66f, -2.94f)
            curveToRelative(0.73f, -1.04f, 1.3f, -2.19f, 1.67f, -3.41f)
            curveTo(19.82f, 16.79f, 18.55f, 14.88f, 18.55f, 12.76f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.54f, 3.85f)
            curveTo(16.43f, 2.77f, 16.87f, 1.39f, 16.76f, 0f)
            curveToRelative(-1.37f, 0.14f, -2.63f, 0.8f, -3.54f, 1.83f)
            curveToRelative(-0.9f, 1.02f, -1.35f, 2.35f, -1.26f, 3.71f)
            curveTo(13.35f, 5.55f, 14.67f, 4.93f, 15.54f, 3.85f)
            close()
        }
    }.also { _Apple = it }
