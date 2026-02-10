package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clip: ImageVector? = null

val Icons.Sr.Clip: ImageVector
    get() = _Clip ?: UXIcon(name = "Clip", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(496.11f, 203.91f)
                curveToRelative(-8.33f, -8.33f, -21.83f, -8.33f, -30.17f, 0f)
                lineTo(233.58f, 437.27f)
                curveToRelative(-41.66f, 41.66f, -109.2f, 41.67f, -150.86f, 0.01f)
                reflectiveCurveToRelative(-41.67f, -109.2f, -0.01f, -150.86f)
                lineTo(307.76f, 60.46f)
                curveToRelative(25.19f, -24.79f, 65.71f, -24.47f, 90.51f, 0.73f)
                curveToRelative(24.51f, 24.9f, 24.51f, 64.86f, 0.01f, 89.77f)
                lineTo(173.23f, 376.92f)
                curveToRelative(-8.43f, 8.08f, -21.73f, 8.08f, -30.17f, 0f)
                curveToRelative(-8.33f, -8.33f, -8.33f, -21.83f, 0f, -30.17f)
                lineToRelative(200.36f, -201.28f)
                curveToRelative(8.19f, -8.48f, 7.95f, -21.98f, -0.52f, -30.17f)
                curveToRelative(-8.27f, -7.99f, -21.37f, -7.99f, -29.64f, 0f)
                lineToRelative(-200.36f, 201.28f)
                curveToRelative(-25f, 24.99f, -25f, 65.51f, -0.01f, 90.51f)
                curveToRelative(0f, 0f, 0f, 0f, 0.01f, 0.01f)
                curveToRelative(25.33f, 24.17f, 65.19f, 24.17f, 90.52f, 0f)
                lineToRelative(225.02f, -225.98f)
                curveToRelative(41.12f, -42.18f, 40.26f, -109.71f, -1.92f, -150.84f)
                curveTo(385.09f, -10.1f, 319.01f, -10.1f, 277.59f, 30.3f)
                lineTo(52.54f, 256.26f)
                curveToRelative(-58.32f, 58.32f, -58.32f, 152.88f, 0f, 211.2f)
                reflectiveCurveToRelative(152.88f, 58.32f, 211.2f, 0f)
                lineToRelative(232.36f, -233.3f)
                curveToRelative(8.35f, -8.31f, 8.39f, -21.82f, 0.08f, -30.17f)
                curveTo(496.16f, 203.96f, 496.14f, 203.93f, 496.11f, 203.91f)
                close()
            }
        }.also { _Clip = it}
