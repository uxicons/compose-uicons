package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Medium: ImageVector? = null

val Icons.Brand.Medium: ImageVector
    get() = _Medium ?: UXIcon(name = "Medium") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.54f, 12f)
            curveToRelative(0f, 3.76f, -3.03f, 6.82f, -6.77f, 6.82f)
            curveTo(3.03f, 18.82f, 0f, 15.76f, 0f, 12f)
            reflectiveCurveToRelative(3.03f, -6.82f, 6.77f, -6.82f)
            curveTo(10.51f, 5.18f, 13.54f, 8.24f, 13.54f, 12f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.96f, 12f)
            curveToRelative(0f, 3.54f, -1.51f, 6.42f, -3.38f, 6.42f)
            curveToRelative(-1.87f, 0f, -3.38f, -2.87f, -3.38f, -6.42f)
            curveToRelative(0f, -3.54f, 1.51f, -6.42f, 3.38f, -6.42f)
            curveTo(19.45f, 5.58f, 20.96f, 8.46f, 20.96f, 12f)
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 12f)
            curveToRelative(0f, 3.17f, -0.53f, 5.75f, -1.19f, 5.75f)
            curveToRelative(-0.66f, 0f, -1.19f, -2.57f, -1.19f, -5.75f)
            reflectiveCurveToRelative(0.53f, -5.75f, 1.19f, -5.75f)
            curveTo(23.47f, 6.25f, 24f, 8.83f, 24f, 12f)
        }
    }.also { _Medium = it }
