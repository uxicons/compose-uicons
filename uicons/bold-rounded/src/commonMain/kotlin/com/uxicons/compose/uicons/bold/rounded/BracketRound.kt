package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRound: ImageVector? = null

val Icons.Br.BracketRound: ImageVector
    get() = _BracketRound ?: UXIcon(name = "BracketRound") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 24f)
            curveToRelative(-0.3f, 0f, -0.59f, -0.09f, -0.86f, -0.27f)
            curveToRelative(-0.23f, -0.16f, -5.64f, -4.04f, -5.64f, -11.73f)
            reflectiveCurveTo(13.41f, 0.43f, 13.64f, 0.27f)
            curveToRelative(0.68f, -0.47f, 1.62f, -0.31f, 2.09f, 0.37f)
            curveToRelative(0.48f, 0.68f, 0.31f, 1.61f, -0.37f, 2.09f)
            curveToRelative(-0.17f, 0.12f, -4.36f, 3.18f, -4.36f, 9.27f)
            reflectiveCurveToRelative(4.19f, 9.15f, 4.37f, 9.28f)
            curveToRelative(0.67f, 0.48f, 0.83f, 1.41f, 0.36f, 2.09f)
            curveToRelative(-0.29f, 0.41f, -0.76f, 0.64f, -1.23f, 0.64f)
            close()
        }
    }.also { _BracketRound = it }
