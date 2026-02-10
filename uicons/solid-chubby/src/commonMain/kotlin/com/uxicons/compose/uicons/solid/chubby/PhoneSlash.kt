package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneSlash: ImageVector? = null

val Icons.Sc.PhoneSlash: ImageVector
    get() = _PhoneSlash ?: UXIcon(name = "PhoneSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2.32f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineTo(10.93f, 11.48f)
                curveToRelative(-0.47f, -0.63f, -0.92f, -1.37f, -1.14f, -1.98f)
                lineToRelative(0.17f, -0.17f)
                curveToRelative(1.26f, -1.27f, 1.71f, -3.13f, 1.17f, -4.85f)
                curveToRelative(-0.47f, -1.5f, -1.63f, -2.68f, -3.11f, -3.15f)
                curveToRelative(-1.69f, -0.54f, -3.52f, -0.1f, -4.79f, 1.16f)
                curveToRelative(-0.37f, 0.33f, -2.77f, 2.58f, -2.12f, 6.07f)
                curveToRelative(0.61f, 3.11f, 2.67f, 6.32f, 4.4f, 8.33f)
                lineToRelative(-3.19f, 3.19f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineTo(21.5f, 3.74f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.77f, 15.94f)
                curveToRelative(-0.48f, -1.47f, -1.67f, -2.62f, -3.18f, -3.08f)
                curveToRelative(-1.73f, -0.53f, -3.6f, -0.08f, -4.88f, 1.16f)
                lineToRelative(-0.19f, 0.18f)
                curveToRelative(-0.33f, -0.07f, -0.67f, 0.03f, -0.91f, 0.27f)
                lineToRelative(-4.24f, 4.24f)
                curveToRelative(-0.21f, 0.21f, -0.32f, 0.52f, -0.29f, 0.82f)
                curveToRelative(0.03f, 0.3f, 0.2f, 0.57f, 0.46f, 0.73f)
                curveToRelative(2.03f, 1.29f, 4.13f, 2.19f, 5.94f, 2.54f)
                curveToRelative(0.41f, 0.07f, 0.81f, 0.11f, 1.19f, 0.11f)
                curveToRelative(2.83f, 0f, 4.63f, -1.87f, 4.92f, -2.2f)
                curveToRelative(1.28f, -1.25f, 1.73f, -3.07f, 1.18f, -4.76f)
                close()
            }
        }.also { _PhoneSlash = it}
