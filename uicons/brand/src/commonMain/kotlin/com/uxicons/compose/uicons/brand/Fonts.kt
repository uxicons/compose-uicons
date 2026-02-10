package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fonts: ImageVector? = null

val Icons.Brand.Fonts: ImageVector
    get() = _Fonts ?: UXIcon(name = "Fonts") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.75f, 0.3f)
            horizontalLineTo(4.25f)
            curveTo(1.9f, 0.3f, 0f, 2.2f, 0f, 4.55f)
            verticalLineTo(19.45f)
            curveToRelative(0f, 2.35f, 1.9f, 4.25f, 4.25f, 4.25f)
            horizontalLineToRelative(15.5f)
            curveToRelative(2.35f, 0f, 4.25f, -1.9f, 4.25f, -4.25f)
            verticalLineTo(4.55f)
            curveTo(24f, 2.2f, 22.1f, 0.3f, 19.75f, 0.3f)
            close()
            moveTo(16.51f, 6.91f)
            curveToRelative(-0.24f, 0f, -0.36f, -0.18f, -0.44f, -0.44f)
            curveToRelative(-0.26f, -0.97f, -0.59f, -1.26f, -0.79f, -1.26f)
            curveToRelative(-0.2f, 0f, -0.5f, 0.36f, -0.83f, 1.12f)
            curveToRelative(-0.44f, 0.95f, -0.73f, 1.99f, -1.01f, 2.99f)
            lineToRelative(1.73f, -0.0f)
            curveToRelative(0.11f, 0.21f, 0.02f, 0.65f, -0.24f, 0.77f)
            horizontalLineToRelative(-1.71f)
            curveToRelative(-0.56f, 1.88f, -1.03f, 3.69f, -1.59f, 5.46f)
            curveToRelative(-0.32f, 1f, -0.67f, 1.95f, -1.11f, 2.56f)
            curveToRelative(-0.48f, 0.68f, -1.39f, 1.33f, -2.48f, 1.33f)
            curveToRelative(-0.77f, 0f, -1.53f, -0.36f, -1.53f, -1.17f)
            curveToRelative(0f, -0.5f, 0.52f, -0.97f, 0.92f, -0.97f)
            curveToRelative(0.18f, -0.01f, 0.34f, 0.09f, 0.42f, 0.24f)
            curveToRelative(0.38f, 0.68f, 0.74f, 1.07f, 0.91f, 1.07f)
            curveToRelative(0.17f, 0f, 0.3f, -0.23f, 0.58f, -1.21f)
            lineToRelative(1.99f, -7.32f)
            lineToRelative(-1.43f, -0.0f)
            curveTo(9.8f, 9.78f, 9.95f, 9.4f, 10.13f, 9.32f)
            horizontalLineToRelative(1.42f)
            curveToRelative(0.27f, -0.88f, 0.59f, -1.78f, 1.05f, -2.58f)
            curveToRelative(0.68f, -1.23f, 1.77f, -2.2f, 3.27f, -2.2f)
            curveToRelative(1.14f, 0f, 1.61f, 0.55f, 1.61f, 1.24f)
            curveTo(17.47f, 6.53f, 16.82f, 6.91f, 16.51f, 6.91f)
            close()
        }
    }.also { _Fonts = it }
