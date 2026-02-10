package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hand: ImageVector? = null

val Icons.Br.Hand: ImageVector
    get() = _Hand ?: UXIcon(name = "Hand", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(486.71f, 143.04f)
            curveToRelative(-11.61f, -53.97f, -59.22f, -92.57f, -114.42f, -92.78f)
            horizontalLineToRelative(-255.34f)
            curveTo(52.39f, 50.34f, 0.07f, 102.67f, 0f, 167.24f)
            verticalLineToRelative(106.32f)
            curveToRelative(0.07f, 64.56f, 52.39f, 116.88f, 116.95f, 116.95f)
            horizontalLineToRelative(44.25f)
            lineToRelative(32.17f, 63.01f)
            curveToRelative(14.81f, 28.86f, 44.71f, 46.83f, 77.15f, 46.36f)
            curveToRelative(46.4f, 0.06f, 84.06f, -37.5f, 84.13f, -83.9f)
            curveToRelative(0.01f, -4.77f, -0.39f, -9.53f, -1.2f, -14.23f)
            lineToRelative(-1.91f, -11.23f)
            horizontalLineToRelative(43.34f)
            curveToRelative(64.59f, 0f, 116.95f, -52.36f, 116.95f, -116.95f)
            curveToRelative(0f, -8.13f, -0.85f, -16.24f, -2.53f, -24.2f)
            lineTo(486.71f, 143.04f)
            close()
            moveTo(63.79f, 273.56f)
            verticalLineTo(167.24f)
            curveToRelative(0f, -29.36f, 23.8f, -53.16f, 53.16f, -53.16f)
            horizontalLineToRelative(31.9f)
            verticalLineToRelative(212.64f)
            horizontalLineToRelative(-31.9f)
            curveTo(87.59f, 326.72f, 63.79f, 302.92f, 63.79f, 273.56f)
            close()
            moveTo(436.06f, 307.05f)
            curveToRelative(-10.08f, 12.47f, -25.26f, 19.7f, -41.29f, 19.67f)
            horizontalLineTo(275.86f)
            lineToRelative(14.61f, 85.74f)
            curveToRelative(1.05f, 5.88f, -0.6f, 11.91f, -4.49f, 16.44f)
            curveToRelative(-4.14f, 4.8f, -10.24f, 7.45f, -16.57f, 7.19f)
            curveToRelative(-8.05f, 0.09f, -15.46f, -4.39f, -19.14f, -11.55f)
            lineToRelative(-37.64f, -73.51f)
            verticalLineTo(114.07f)
            horizontalLineToRelative(159.65f)
            curveToRelative(25.09f, 0.07f, 46.74f, 17.63f, 51.99f, 42.17f)
            lineToRelative(22.5f, 106.32f)
            curveTo(450.13f, 278.25f, 446.19f, 294.61f, 436.06f, 307.05f)
            close()
        }
    }.also { _Hand = it }
