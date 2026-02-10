package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Basketball: ImageVector? = null

val Icons.Rr.Basketball: ImageVector
    get() = _Basketball ?: UXIcon(name = "Basketball", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256.07f, -0.05f)
                curveTo(114.47f, -0.05f, -0.33f, 114.75f, -0.33f, 256.35f)
                reflectiveCurveTo(114.47f, 512.74f, 256.07f, 512.74f)
                reflectiveCurveToRelative(256.39f, -114.79f, 256.39f, -256.39f)
                reflectiveCurveTo(397.67f, -0.05f, 256.07f, -0.05f)
                close()
                moveTo(468.12f, 233.43f)
                lineToRelative(-0.11f, -0.09f)
                curveToRelative(-41.3f, -4.28f, -80.43f, -20.6f, -112.53f, -46.93f)
                lineToRelative(65.49f, -65.49f)
                curveTo(447.36f, 153f, 463.75f, 192.12f, 468.12f, 233.43f)
                close()
                moveTo(390.72f, 90.73f)
                lineToRelative(-65.41f, 65.6f)
                curveToRelative(-26.34f, -32.1f, -42.66f, -71.23f, -46.93f, -112.53f)
                curveTo(319.61f, 48.14f, 358.66f, 64.45f, 390.72f, 90.73f)
                close()
                moveTo(235.8f, 43.69f)
                curveToRelative(4.47f, 52.67f, 25.22f, 102.64f, 59.37f, 142.98f)
                lineTo(256f, 225.84f)
                lineTo(121.09f, 90.92f)
                curveTo(153.77f, 64.11f, 193.71f, 47.67f, 235.8f, 43.69f)
                close()
                moveTo(90.91f, 121.1f)
                lineToRelative(-0.1f, -0.1f)
                lineToRelative(0.11f, 0.09f)
                curveTo(90.92f, 121.09f, 90.92f, 121.1f, 90.91f, 121.1f)
                lineTo(225.84f, 256f)
                lineToRelative(-39.19f, 39.19f)
                curveToRelative(-40.32f, -34.17f, -90.28f, -54.93f, -142.93f, -59.39f)
                curveTo(47.68f, 193.72f, 64.12f, 153.78f, 90.91f, 121.1f)
                close()
                moveTo(43.88f, 278.57f)
                verticalLineToRelative(-0.09f)
                curveToRelative(41.3f, 4.27f, 80.43f, 20.59f, 112.53f, 46.93f)
                lineToRelative(-65.49f, 65.49f)
                curveTo(64.61f, 358.86f, 48.25f, 319.81f, 43.88f, 278.57f)
                close()
                moveTo(121.17f, 421.08f)
                lineToRelative(65.41f, -65.49f)
                curveToRelative(26.34f, 32.1f, 42.66f, 71.23f, 46.93f, 112.53f)
                curveTo(192.28f, 463.75f, 153.22f, 447.39f, 121.17f, 421.08f)
                close()
                moveTo(276.2f, 468.31f)
                curveToRelative(-4.46f, -52.67f, -25.22f, -102.63f, -59.39f, -142.96f)
                lineTo(256f, 286.17f)
                lineToRelative(134.91f, 134.91f)
                curveTo(358.23f, 447.89f, 318.29f, 464.34f, 276.2f, 468.31f)
                close()
                moveTo(421.04f, 390.91f)
                lineTo(286.17f, 256f)
                lineToRelative(39.17f, -39.17f)
                curveToRelative(40.33f, 34.15f, 90.28f, 54.9f, 142.93f, 59.37f)
                curveTo(464.29f, 318.29f, 447.84f, 358.23f, 421.04f, 390.91f)
                close()
            }
        }.also { _Basketball = it}
