package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kerning: ImageVector? = null

val Icons.Br.Kerning: ImageVector
    get() = _Kerning ?: UXIcon(name = "Kerning") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.93f, 7.95f)
            lineToRelative(-3.07f, 9.66f)
            curveToRelative(-0.26f, 0.83f, -1.01f, 1.39f, -1.86f, 1.39f)
            reflectiveCurveToRelative(-1.59f, -0.56f, -1.86f, -1.39f)
            lineTo(0.07f, 7.95f)
            curveToRelative(-0.25f, -0.79f, 0.19f, -1.63f, 0.97f, -1.88f)
            curveToRelative(0.79f, -0.25f, 1.63f, 0.19f, 1.88f, 0.98f)
            lineToRelative(2.07f, 6.51f)
            lineToRelative(2.07f, -6.51f)
            curveToRelative(0.25f, -0.79f, 1.09f, -1.22f, 1.88f, -0.98f)
            curveToRelative(0.79f, 0.25f, 1.23f, 1.09f, 0.97f, 1.88f)
            close()
            moveTo(22.95f, 18.93f)
            curveToRelative(-0.15f, 0.05f, -0.3f, 0.07f, -0.46f, 0.07f)
            curveToRelative(-0.64f, 0f, -1.23f, -0.41f, -1.43f, -1.04f)
            lineToRelative(-0.62f, -1.96f)
            horizontalLineToRelative(-2.9f)
            lineToRelative(-0.62f, 1.96f)
            curveToRelative(-0.25f, 0.79f, -1.1f, 1.22f, -1.88f, 0.97f)
            curveToRelative(-0.79f, -0.25f, -1.23f, -1.09f, -0.97f, -1.89f)
            lineToRelative(3.07f, -9.65f)
            curveToRelative(0.26f, -0.83f, 1.01f, -1.38f, 1.86f, -1.38f)
            reflectiveCurveToRelative(1.59f, 0.56f, 1.86f, 1.38f)
            lineToRelative(3.07f, 9.65f)
            curveToRelative(0.25f, 0.79f, -0.18f, 1.63f, -0.97f, 1.89f)
            close()
            moveTo(20.43f, 13.5f)
            lineToRelative(-1.43f, -4.5f)
            lineToRelative(-1.43f, 4.5f)
            horizontalLineToRelative(2.86f)
            close()
            moveTo(15.96f, 0.07f)
            curveToRelative(-0.79f, -0.25f, -1.63f, 0.19f, -1.88f, 0.97f)
            lineTo(7.39f, 22.05f)
            curveToRelative(-0.25f, 0.79f, 0.18f, 1.63f, 0.97f, 1.89f)
            curveToRelative(0.15f, 0.05f, 0.3f, 0.07f, 0.46f, 0.07f)
            curveToRelative(0.64f, 0f, 1.23f, -0.41f, 1.43f, -1.04f)
            lineTo(16.93f, 1.96f)
            curveToRelative(0.25f, -0.79f, -0.18f, -1.63f, -0.97f, -1.89f)
            close()
        }
    }.also { _Kerning = it }
