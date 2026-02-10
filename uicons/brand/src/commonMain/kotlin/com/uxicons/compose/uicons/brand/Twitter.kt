package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Twitter: ImageVector? = null

val Icons.Brand.Twitter: ImageVector
    get() = _Twitter ?: UXIcon(name = "Twitter") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.54f, 7.1f)
            curveToRelative(0.01f, 0.21f, 0.01f, 0.42f, 0.01f, 0.64f)
            curveToRelative(0f, 6.51f, -4.95f, 14.01f, -14.01f, 14.01f)
            verticalLineToRelative(-0.0f)
            curveTo(4.87f, 21.75f, 2.25f, 20.98f, 0f, 19.54f)
            curveToRelative(0.39f, 0.05f, 0.78f, 0.07f, 1.17f, 0.07f)
            curveToRelative(2.22f, 0.0f, 4.37f, -0.74f, 6.12f, -2.11f)
            curveToRelative(-2.11f, -0.04f, -3.96f, -1.41f, -4.6f, -3.42f)
            curveToRelative(0.74f, 0.14f, 1.5f, 0.11f, 2.22f, -0.08f)
            curveToRelative(-2.3f, -0.46f, -3.95f, -2.48f, -3.95f, -4.83f)
            curveToRelative(0f, -0.02f, 0f, -0.04f, 0f, -0.06f)
            curveToRelative(0.69f, 0.38f, 1.45f, 0.59f, 2.23f, 0.62f)
            curveTo(1.03f, 8.28f, 0.36f, 5.4f, 1.67f, 3.15f)
            curveToRelative(2.5f, 3.08f, 6.19f, 4.95f, 10.15f, 5.14f)
            curveToRelative(-0.4f, -1.71f, 0.15f, -3.5f, 1.42f, -4.71f)
            curveToRelative(1.98f, -1.86f, 5.1f, -1.77f, 6.97f, 0.21f)
            curveToRelative(1.1f, -0.22f, 2.16f, -0.62f, 3.13f, -1.2f)
            curveToRelative(-0.37f, 1.14f, -1.14f, 2.11f, -2.17f, 2.72f)
            curveTo(22.15f, 5.21f, 23.1f, 4.95f, 24f, 4.55f)
            curveTo(23.34f, 5.54f, 22.51f, 6.41f, 21.54f, 7.1f)
            close()
        }
    }.also { _Twitter = it }
