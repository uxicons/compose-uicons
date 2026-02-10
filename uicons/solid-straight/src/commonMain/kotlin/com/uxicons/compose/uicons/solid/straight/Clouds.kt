package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clouds: ImageVector? = null

val Icons.Ss.Clouds: ImageVector
    get() = _Clouds ?: UXIcon(name = "Clouds", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(404.41f, 511.84f)
                horizontalLineTo(212.95f)
                curveToRelative(-47.05f, -0.44f, -84.84f, -38.95f, -84.39f, -86f)
                curveToRelative(0.37f, -38.56f, 26.58f, -72.07f, 63.93f, -81.7f)
                curveToRelative(-13.08f, -143.21f, 188.7f, -181.34f, 228.67f, -43.72f)
                curveToRelative(58.02f, 9.22f, 97.57f, 63.73f, 88.35f, 121.75f)
                curveTo(501.29f, 473.84f, 456.73f, 511.86f, 404.41f, 511.84f)
                close()
                moveTo(85.31f, 426.75f)
                curveToRelative(-0.07f, -45.93f, 24.59f, -88.35f, 64.54f, -111f)
                curveToRelative(15.27f, -160.66f, 236.73f, -198.23f, 303.55f, -51.06f)
                curveToRelative(21.67f, 7.47f, 41.31f, 19.86f, 57.38f, 36.21f)
                lineToRelative(0f, 0f)
                curveToRelative(0.68f, -79.91f, -54.24f, -149.56f, -132.11f, -167.53f)
                curveTo(358.23f, 41.62f, 267.28f, -16.17f, 175.54f, 4.27f)
                reflectiveCurveTo(26f, 115.67f, 46.45f, 207.41f)
                curveToRelative(3.27f, 14.67f, 8.47f, 28.85f, 15.46f, 42.15f)
                curveTo(5.19f, 280.76f, -15.51f, 352.03f, 15.69f, 408.76f)
                curveToRelative(16.02f, 29.12f, 43.64f, 50.07f, 76f, 57.64f)
                curveTo(87.48f, 453.6f, 85.33f, 440.22f, 85.31f, 426.75f)
                close()
            }
        }.also { _Clouds = it}
