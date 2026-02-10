package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pinterest: ImageVector? = null

val Icons.Brand.Pinterest: ImageVector
    get() = _Pinterest ?: UXIcon(name = "Pinterest") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.01f, 0f)
            curveTo(5.39f, 0f, 0.02f, 5.37f, 0.02f, 11.99f)
            curveToRelative(0f, 5.08f, 3.16f, 9.42f, 7.62f, 11.17f)
            curveToRelative(-0.11f, -0.95f, -0.2f, -2.41f, 0.04f, -3.44f)
            curveToRelative(0.22f, -0.94f, 1.4f, -5.96f, 1.4f, -5.96f)
            reflectiveCurveToRelative(-0.35f, -0.72f, -0.35f, -1.78f)
            curveToRelative(0f, -1.67f, 0.97f, -2.91f, 2.17f, -2.91f)
            curveToRelative(1.03f, 0f, 1.52f, 0.77f, 1.52f, 1.69f)
            curveToRelative(0f, 1.03f, -0.65f, 2.57f, -1.0f, 4.0f)
            curveToRelative(-0.29f, 1.19f, 0.6f, 2.17f, 1.78f, 2.17f)
            curveToRelative(2.13f, 0f, 3.77f, -2.25f, 3.77f, -5.49f)
            curveToRelative(0f, -2.87f, -2.06f, -4.88f, -5.01f, -4.88f)
            curveToRelative(-3.41f, 0f, -5.42f, 2.56f, -5.42f, 5.2f)
            curveToRelative(0f, 1.03f, 0.4f, 2.13f, 0.89f, 2.73f)
            curveTo(7.52f, 14.62f, 7.53f, 14.72f, 7.5f, 14.84f)
            curveToRelative(-0.09f, 0.38f, -0.3f, 1.19f, -0.34f, 1.36f)
            curveToRelative(-0.05f, 0.22f, -0.18f, 0.27f, -0.41f, 0.16f)
            curveToRelative(-1.5f, -0.7f, -2.44f, -2.88f, -2.44f, -4.65f)
            curveToRelative(0f, -3.78f, 2.74f, -7.25f, 7.92f, -7.25f)
            curveToRelative(4.16f, 0f, 7.39f, 2.96f, 7.39f, 6.93f)
            curveToRelative(0f, 4.13f, -2.6f, 7.46f, -6.22f, 7.46f)
            curveToRelative(-1.21f, 0f, -2.36f, -0.63f, -2.74f, -1.38f)
            curveToRelative(0f, 0f, -0.6f, 2.29f, -0.75f, 2.85f)
            curveToRelative(-0.27f, 1.05f, -1.0f, 2.35f, -1.49f, 3.15f)
            curveTo(9.56f, 23.81f, 10.75f, 24f, 11.99f, 24f)
            curveToRelative(6.62f, 0f, 11.99f, -5.37f, 11.99f, -11.99f)
            curveTo(24f, 5.37f, 18.63f, 0f, 12.01f, 0f)
            close()
        }
    }.also { _Pinterest = it }
