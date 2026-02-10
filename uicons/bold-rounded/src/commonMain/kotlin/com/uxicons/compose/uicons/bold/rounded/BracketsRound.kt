package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketsRound: ImageVector? = null

val Icons.Br.BracketsRound: ImageVector
    get() = _BracketsRound ?: UXIcon(name = "BracketsRound") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.27f, 0.69f)
            curveToRelative(0.44f, 0.7f, 0.24f, 1.63f, -0.46f, 2.07f)
            curveToRelative(-0.19f, 0.12f, -4.81f, 3.18f, -4.81f, 9.23f)
            reflectiveCurveToRelative(4.19f, 9.15f, 4.37f, 9.28f)
            curveToRelative(0.67f, 0.48f, 0.83f, 1.41f, 0.36f, 2.09f)
            curveToRelative(-0.29f, 0.41f, -0.76f, 0.64f, -1.23f, 0.64f)
            curveToRelative(-0.3f, 0f, -0.59f, -0.09f, -0.86f, -0.27f)
            curveToRelative(-0.23f, -0.16f, -5.64f, -4.04f, -5.64f, -11.73f)
            reflectiveCurveTo(5.94f, 0.4f, 6.19f, 0.23f)
            curveToRelative(0.7f, -0.44f, 1.63f, -0.24f, 2.07f, 0.46f)
            close()
            moveTo(18.93f, 0.31f)
            curveToRelative(-0.65f, -0.51f, -1.59f, -0.39f, -2.1f, 0.26f)
            reflectiveCurveToRelative(-0.4f, 1.59f, 0.25f, 2.1f)
            curveToRelative(0.16f, 0.13f, 3.93f, 3.19f, 3.93f, 9.32f)
            reflectiveCurveToRelative(-4.18f, 9.14f, -4.37f, 9.27f)
            curveToRelative(-0.67f, 0.48f, -0.84f, 1.41f, -0.36f, 2.09f)
            curveToRelative(0.29f, 0.42f, 0.76f, 0.64f, 1.23f, 0.64f)
            curveToRelative(0.3f, 0f, 0.6f, -0.09f, 0.86f, -0.27f)
            curveToRelative(0.23f, -0.16f, 5.64f, -4.04f, 5.64f, -11.73f)
            reflectiveCurveTo(19.13f, 0.48f, 18.92f, 0.32f)
            close()
        }
    }.also { _BracketsRound = it }
