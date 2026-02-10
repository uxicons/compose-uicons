package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Etsy: ImageVector? = null

val Icons.Brand.Etsy: ImageVector
    get() = _Etsy ?: UXIcon(name = "Etsy") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.59f, 2.45f)
            curveToRelative(0f, -0.33f, 0.03f, -0.52f, 0.59f, -0.52f)
            horizontalLineToRelative(7.47f)
            curveToRelative(1.3f, 0f, 2.02f, 1.11f, 2.54f, 3.2f)
            lineToRelative(0.42f, 1.66f)
            horizontalLineToRelative(1.27f)
            curveTo(21.11f, 2.05f, 21.31f, 0f, 21.31f, 0f)
            reflectiveCurveToRelative(-3.2f, 0.36f, -5.09f, 0.36f)
            horizontalLineTo(6.67f)
            lineToRelative(-5.12f, -0.16f)
            verticalLineToRelative(1.37f)
            lineToRelative(1.73f, 0.33f)
            curveToRelative(1.21f, 0.23f, 1.5f, 0.49f, 1.6f, 1.6f)
            curveToRelative(0f, 0f, 0.1f, 3.26f, 0.1f, 8.64f)
            reflectiveCurveToRelative(-0.1f, 8.61f, -0.1f, 8.61f)
            curveToRelative(0f, 0.98f, -0.39f, 1.34f, -1.6f, 1.56f)
            lineTo(1.55f, 22.63f)
            verticalLineTo(24f)
            lineToRelative(5.12f, -0.16f)
            horizontalLineToRelative(8.54f)
            curveToRelative(1.92f, 0f, 6.39f, 0.16f, 6.39f, 0.16f)
            curveToRelative(0.1f, -1.17f, 0.75f, -6.49f, 0.85f, -7.08f)
            horizontalLineToRelative(-1.21f)
            lineToRelative(-1.27f, 2.9f)
            curveToRelative(-1.01f, 2.28f, -2.48f, 2.45f, -4.11f, 2.45f)
            horizontalLineToRelative(-4.86f)
            curveToRelative(-1.63f, 0f, -2.41f, -0.65f, -2.41f, -2.05f)
            verticalLineToRelative(-7.43f)
            curveToRelative(0f, 0f, 3.62f, 0f, 4.79f, 0.1f)
            curveToRelative(0.91f, 0.07f, 1.47f, 0.33f, 1.76f, 1.6f)
            lineToRelative(0.39f, 1.7f)
            horizontalLineToRelative(1.4f)
            lineToRelative(-0.1f, -4.27f)
            lineToRelative(0.2f, -4.3f)
            horizontalLineToRelative(-1.4f)
            lineToRelative(-0.46f, 1.89f)
            curveToRelative(-0.29f, 1.24f, -0.49f, 1.47f, -1.76f, 1.6f)
            curveToRelative(-1.66f, 0.16f, -4.83f, 0.13f, -4.83f, 0.13f)
            verticalLineTo(2.45f)
            close()
        }
    }.also { _Etsy = it }
