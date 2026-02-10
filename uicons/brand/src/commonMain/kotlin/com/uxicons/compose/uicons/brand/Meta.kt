package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meta: ImageVector? = null

val Icons.Brand.Meta: ImageVector
    get() = _Meta ?: UXIcon(name = "Meta") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.23f, 4.03f)
            curveToRelative(-1.97f, 0f, -3.51f, 1.48f, -4.9f, 3.37f)
            curveToRelative(-1.91f, -2.44f, -3.51f, -3.37f, -5.43f, -3.37f)
            curveTo(2.99f, 4.03f, 0f, 9.11f, 0f, 14.49f)
            curveToRelative(0f, 3.37f, 1.63f, 5.49f, 4.36f, 5.49f)
            curveToRelative(1.96f, 0f, 3.38f, -0.93f, 5.88f, -5.31f)
            curveToRelative(0f, 0f, 1.05f, -1.85f, 1.77f, -3.12f)
            curveToRelative(0.25f, 0.41f, 0.52f, 0.84f, 0.8f, 1.32f)
            lineToRelative(1.18f, 1.98f)
            curveToRelative(2.29f, 3.84f, 3.57f, 5.14f, 5.88f, 5.14f)
            curveToRelative(2.66f, 0f, 4.14f, -2.15f, 4.14f, -5.59f)
            curveTo(24f, 8.76f, 20.94f, 4.03f, 17.23f, 4.03f)
            close()
            moveTo(8.33f, 13.47f)
            curveToRelative(-2.04f, 3.19f, -2.74f, 3.9f, -3.87f, 3.9f)
            curveToRelative(-1.17f, 0f, -1.86f, -1.02f, -1.86f, -2.85f)
            curveToRelative(0f, -3.9f, 1.95f, -7.9f, 4.27f, -7.9f)
            curveToRelative(1.26f, 0f, 2.31f, 0.73f, 3.92f, 3.03f)
            curveTo(9.25f, 12.0f, 8.33f, 13.47f, 8.33f, 13.47f)
            close()
            moveTo(19.92f, 17.38f)
            curveToRelative(-1.16f, 0f, -1.71f, -0.77f, -3.91f, -4.31f)
            lineToRelative(-1.41f, -2.35f)
            curveToRelative(-0.38f, -0.62f, -0.75f, -1.19f, -1.1f, -1.71f)
            curveToRelative(1.27f, -1.96f, 2.31f, -2.93f, 3.56f, -2.93f)
            curveToRelative(2.58f, 0f, 4.65f, 3.81f, 4.65f, 8.48f)
            curveTo(21.71f, 16.34f, 21.13f, 17.38f, 19.92f, 17.38f)
            close()
        }
    }.also { _Meta = it }
