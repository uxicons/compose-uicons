package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoonStars: ImageVector? = null

val Icons.Rs.MoonStars: ImageVector
    get() = _MoonStars ?: UXIcon(name = "MoonStars", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256.35f, 511.15f)
                curveTo(115.43f, 511.54f, 0.89f, 397.61f, 0.5f, 256.7f)
                reflectiveCurveTo(114.04f, 1.24f, 254.95f, 0.85f)
                curveToRelative(43.57f, -0.12f, 86.44f, 10.92f, 124.53f, 32.06f)
                lineToRelative(33.02f, 18.33f)
                lineToRelative(-32.83f, 18.71f)
                curveToRelative(-96.89f, 55.01f, -130.84f, 178.15f, -75.82f, 275.04f)
                curveToRelative(21.18f, 37.3f, 53.7f, 66.88f, 92.83f, 84.44f)
                lineToRelative(34.47f, 15.54f)
                lineToRelative(-31.19f, 21.26f)
                curveTo(357.74f, 495.41f, 307.66f, 511.07f, 256.35f, 511.15f)
                close()
                moveTo(256.35f, 43.37f)
                curveToRelative(-117.43f, 0f, -212.63f, 95.2f, -212.63f, 212.63f)
                reflectiveCurveToRelative(95.2f, 212.63f, 212.63f, 212.63f)
                curveToRelative(30.52f, 0f, 60.67f, -6.66f, 88.35f, -19.52f)
                curveToRelative(-112.51f, -74.29f, -143.49f, -225.71f, -69.21f, -338.22f)
                curveToRelative(13.89f, -21.03f, 30.95f, -39.79f, 50.58f, -55.6f)
                curveTo(303.68f, 47.35f, 280.1f, 43.33f, 256.35f, 43.37f)
                close()
                moveTo(411.57f, 207.1f)
                lineToRelative(24.81f, 49.61f)
                lineToRelative(24.83f, -49.61f)
                lineToRelative(49.61f, -24.81f)
                lineToRelative(-49.61f, -24.83f)
                lineToRelative(-24.81f, -49.61f)
                lineToRelative(-24.83f, 49.61f)
                lineToRelative(-49.58f, 24.81f)
                lineTo(411.57f, 207.1f)
                close()
                moveTo(490.24f, 362.31f)
                curveToRelative(-11.74f, 0f, -21.26f, 9.52f, -21.26f, 21.26f)
                reflectiveCurveToRelative(9.52f, 21.26f, 21.26f, 21.26f)
                reflectiveCurveToRelative(21.26f, -9.52f, 21.26f, -21.26f)
                reflectiveCurveTo(501.98f, 362.31f, 490.24f, 362.31f)
                close()
                moveTo(362.66f, 277.26f)
                curveToRelative(-11.74f, 0f, -21.26f, 9.52f, -21.26f, 21.26f)
                reflectiveCurveToRelative(9.52f, 21.26f, 21.26f, 21.26f)
                curveToRelative(11.74f, 0f, 21.26f, -9.52f, 21.26f, -21.26f)
                reflectiveCurveTo(374.4f, 277.26f, 362.66f, 277.26f)
                close()
            }
        }.also { _MoonStars = it}
