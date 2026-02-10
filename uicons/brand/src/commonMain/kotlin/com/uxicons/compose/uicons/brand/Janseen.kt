package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Janseen: ImageVector? = null

val Icons.Brand.Janseen: ImageVector
    get() = _Janseen ?: UXIcon(name = "Janseen") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.96f, 11.63f)
            curveToRelative(0f, 5.54f, -2.41f, 9.62f, -5.54f, 12.37f)
            curveToRelative(5.27f, -1.11f, 9.3f, -6.93f, 9.3f, -13.21f)
            curveToRelative(0.01f, -0.51f, -0.0f, -1.03f, -0.03f, -1.48f)
            lineToRelative(4.07f, -1.39f)
            curveToRelative(0.52f, -0.18f, 0.84f, -0.46f, 0.85f, -0.95f)
            curveToRelative(0.0f, -0.33f, 0.0f, -0.51f, 0.0f, -0.51f)
            curveToRelative(-2.2f, -0.04f, -10.19f, -0.3f, -10.19f, -0.3f)
            curveTo(11.19f, 7.33f, 11.96f, 9.36f, 11.96f, 11.63f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.13f, 4.74f)
            curveToRelative(3.74f, 0.57f, 6.06f, 0.12f, 6.06f, 0.12f)
            reflectiveCurveToRelative(-0.53f, -1.97f, -2.08f, -1.97f)
            curveTo(11.66f, 2.88f, 9.94f, 2.63f, 9.94f, 2.63f)
            curveTo(4.72f, 1.84f, 3.37f, 0f, 3.37f, 0f)
            curveTo(3.68f, 2.03f, 6.79f, 4.23f, 10.13f, 4.74f)
        }
    }.also { _Janseen = it }
