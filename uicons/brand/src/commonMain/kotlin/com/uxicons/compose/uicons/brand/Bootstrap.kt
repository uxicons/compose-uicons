package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bootstrap: ImageVector? = null

val Icons.Brand.Bootstrap: ImageVector
    get() = _Bootstrap ?: UXIcon(name = "Bootstrap") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.97f, 11.08f)
            horizontalLineToRelative(-4f)
            verticalLineTo(7.21f)
            horizontalLineToRelative(4f)
            curveToRelative(0.67f, 0f, 1.18f, 0.14f, 1.53f, 0.43f)
            curveToRelative(0.35f, 0.29f, 0.53f, 0.79f, 0.53f, 1.49f)
            curveToRelative(0f, 0.63f, -0.2f, 1.11f, -0.59f, 1.44f)
            curveTo(14.05f, 10.91f, 13.56f, 11.08f, 12.97f, 11.08f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.66f, 15.0f)
            curveToRelative(0f, 0.71f, -0.21f, 1.25f, -0.62f, 1.64f)
            curveToRelative(-0.41f, 0.39f, -0.99f, 0.58f, -1.73f, 0.58f)
            horizontalLineTo(8.97f)
            verticalLineToRelative(-4.38f)
            horizontalLineToRelative(4.33f)
            curveToRelative(0.74f, 0f, 1.32f, 0.18f, 1.73f, 0.56f)
            curveTo(15.46f, 13.77f, 15.66f, 14.3f, 15.66f, 15.0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 0f)
            horizontalLineTo(4f)
            curveTo(1.8f, 0f, 0f, 1.8f, 0f, 4f)
            verticalLineToRelative(16f)
            curveToRelative(0f, 2.2f, 1.8f, 4f, 4f, 4f)
            horizontalLineToRelative(16f)
            curveToRelative(2.2f, 0f, 4f, -1.8f, 4f, -4f)
            verticalLineTo(4f)
            curveTo(24f, 1.8f, 22.2f, 0f, 20f, 0f)
            close()
            moveTo(17.82f, 16.85f)
            curveToRelative(-0.2f, 0.48f, -0.5f, 0.89f, -0.92f, 1.24f)
            curveToRelative(-0.42f, 0.34f, -0.95f, 0.62f, -1.61f, 0.82f)
            curveToRelative(-0.66f, 0.2f, -1.43f, 0.31f, -2.33f, 0.31f)
            horizontalLineTo(6.52f)
            verticalLineToRelative(-14f)
            horizontalLineToRelative(6.8f)
            curveToRelative(1.25f, 0f, 2.26f, 0.29f, 3.02f, 0.86f)
            curveToRelative(0.76f, 0.58f, 1.14f, 1.44f, 1.14f, 2.61f)
            curveToRelative(0f, 0.71f, -0.17f, 1.31f, -0.52f, 1.81f)
            curveToRelative(-0.34f, 0.5f, -0.84f, 0.89f, -1.48f, 1.17f)
            verticalLineToRelative(0.04f)
            curveToRelative(0.86f, 0.18f, 1.52f, 0.59f, 1.96f, 1.22f)
            curveToRelative(0.44f, 0.64f, 0.67f, 1.43f, 0.67f, 2.38f)
            curveTo(18.11f, 15.86f, 18.01f, 16.38f, 17.82f, 16.85f)
            close()
        }
    }.also { _Bootstrap = it }
