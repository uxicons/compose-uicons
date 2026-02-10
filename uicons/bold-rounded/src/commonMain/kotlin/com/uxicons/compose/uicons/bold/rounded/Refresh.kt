package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Refresh: ImageVector? = null

val Icons.Br.Refresh: ImageVector
    get() = _Refresh ?: UXIcon(name = "Refresh", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(66.07f, 228.73f)
            curveTo(81.58f, 123.38f, 179.55f, 50.54f, 284.9f, 66.04f)
            curveToRelative(35.94f, 5.29f, 69.66f, 20.63f, 97.27f, 44.24f)
            lineToRelative(-24.85f, 24.85f)
            curveToRelative(-8.33f, 8.33f, -8.33f, 21.84f, 0f, 30.17f)
            curveToRelative(4f, 4f, 9.42f, 6.24f, 15.08f, 6.25f)
            horizontalLineToRelative(97.83f)
            curveToRelative(11.78f, 0f, 21.33f, -9.55f, 21.33f, -21.33f)
            verticalLineTo(52.39f)
            curveToRelative(-0f, -11.78f, -9.56f, -21.33f, -21.34f, -21.33f)
            curveToRelative(-5.66f, 0f, -11.08f, 2.25f, -15.08f, 6.25f)
            lineTo(427.42f, 65.04f)
            curveTo(321.66f, -29.24f, 159.5f, -19.92f, 65.22f, 85.83f)
            curveToRelative(-33.4f, 37.47f, -55.07f, 83.91f, -62.34f, 133.57f)
            curveToRelative(-2.86f, 17.61f, 9.09f, 34.2f, 26.69f, 37.07f)
            curveToRelative(1.59f, 0.26f, 3.19f, 0.4f, 4.8f, 0.42f)
            curveTo(50.48f, 256.72f, 64f, 244.71f, 66.07f, 228.73f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(479.43f, 256.89f)
            curveToRelative(-16.11f, 0.17f, -29.63f, 12.19f, -31.7f, 28.16f)
            curveTo(432.23f, 390.4f, 334.25f, 463.24f, 228.9f, 447.74f)
            curveToRelative(-35.94f, -5.29f, -69.66f, -20.63f, -97.27f, -44.24f)
            lineToRelative(24.85f, -24.85f)
            curveToRelative(8.33f, -8.33f, 8.33f, -21.84f, -0f, -30.17f)
            curveToRelative(-4f, -4f, -9.42f, -6.24f, -15.08f, -6.25f)
            horizontalLineTo(43.57f)
            curveToRelative(-11.78f, 0f, -21.33f, 9.55f, -21.33f, 21.33f)
            verticalLineToRelative(97.83f)
            curveToRelative(0f, 11.78f, 9.56f, 21.33f, 21.34f, 21.33f)
            curveToRelative(5.66f, -0f, 11.08f, -2.25f, 15.08f, -6.25f)
            lineToRelative(27.73f, -27.73f)
            curveToRelative(105.74f, 94.29f, 267.88f, 85f, 362.17f, -20.73f)
            curveToRelative(33.42f, -37.47f, 55.1f, -83.93f, 62.36f, -133.62f)
            curveToRelative(2.88f, -17.6f, -9.06f, -34.21f, -26.67f, -37.08f)
            curveTo(482.65f, 257.05f, 481.04f, 256.91f, 479.43f, 256.89f)
            close()
        }
    }.also { _Refresh = it }
