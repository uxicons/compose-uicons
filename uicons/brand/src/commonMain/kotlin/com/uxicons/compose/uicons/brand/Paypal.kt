package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Paypal: ImageVector? = null

val Icons.Brand.Paypal: ImageVector
    get() = _Paypal ?: UXIcon(name = "Paypal") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.01f, 11.41f)
            curveToRelative(-0.87f, 4.42f, -3.81f, 5.95f, -7.57f, 5.95f)
            horizontalLineToRelative(-0.57f)
            curveToRelative(-0.48f, 0f, -0.87f, 0.33f, -0.93f, 0.78f)
            lineToRelative(-0.06f, 0.24f)
            lineToRelative(-0.72f, 4.63f)
            lineToRelative(-0.03f, 0.21f)
            curveTo(12.04f, 23.67f, 11.65f, 24f, 11.2f, 24f)
            horizontalLineTo(7.23f)
            curveToRelative(-0.33f, -0.03f, -0.54f, -0.33f, -0.48f, -0.63f)
            lineToRelative(0.3f, -2.04f)
            horizontalLineTo(2.37f)
            curveToRelative(-0.36f, -0.03f, -0.6f, -0.36f, -0.54f, -0.72f)
            lineTo(4.95f, 0.9f)
            curveTo(5.04f, 0.39f, 5.49f, 0f, 6.0f, 0f)
            horizontalLineToRelative(7.45f)
            curveToRelative(2.58f, 0f, 4.6f, 0.54f, 5.68f, 1.8f)
            curveToRelative(1.02f, 1.17f, 1.32f, 2.43f, 1.02f, 4.29f)
            curveToRelative(-0.24f, -0.12f, -0.51f, -0.24f, -0.81f, -0.33f)
            curveToRelative(-0.39f, -0.12f, -0.78f, -0.21f, -1.17f, -0.27f)
            curveToRelative(-0.57f, -0.09f, -1.23f, -0.15f, -1.92f, -0.15f)
            horizontalLineToRelative(-5.83f)
            curveToRelative(-0.48f, 0f, -0.87f, 0.33f, -0.93f, 0.78f)
            lineToRelative(-1.26f, 7.87f)
            lineToRelative(-0.04f, 0.25f)
            curveToRelative(0.1f, -0.5f, 0.53f, -0.91f, 1.06f, -0.91f)
            horizontalLineToRelative(2.19f)
            curveToRelative(4.3f, 0f, 7.66f, -1.74f, 8.62f, -6.79f)
            curveToRelative(0.03f, -0.15f, 0.06f, -0.3f, 0.09f, -0.45f)
            curveToRelative(0.42f, 0.21f, 0.78f, 0.48f, 1.08f, 0.84f)
            curveTo(22.19f, 8.02f, 22.37f, 9.58f, 22.01f, 11.41f)
            close()
        }
    }.also { _Paypal = it }
