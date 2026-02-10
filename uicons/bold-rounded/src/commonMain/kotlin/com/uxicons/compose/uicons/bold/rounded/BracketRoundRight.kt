package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRoundRight: ImageVector? = null

val Icons.Br.BracketRoundRight: ImageVector
    get() = _BracketRoundRight ?: UXIcon(name = "BracketRoundRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 24f)
            curveToRelative(-0.47f, 0f, -0.94f, -0.22f, -1.23f, -0.64f)
            curveToRelative(-0.47f, -0.68f, -0.31f, -1.61f, 0.36f, -2.09f)
            curveToRelative(0.19f, -0.13f, 4.37f, -3.19f, 4.37f, -9.27f)
            reflectiveCurveTo(8.81f, 2.85f, 8.63f, 2.72f)
            curveToRelative(-0.67f, -0.48f, -0.83f, -1.41f, -0.36f, -2.09f)
            curveToRelative(0.48f, -0.67f, 1.41f, -0.84f, 2.08f, -0.37f)
            curveToRelative(0.23f, 0.16f, 5.64f, 4.04f, 5.64f, 11.73f)
            reflectiveCurveToRelative(-5.41f, 11.57f, -5.64f, 11.73f)
            curveToRelative(-0.26f, 0.18f, -0.56f, 0.27f, -0.86f, 0.27f)
            close()
        }
    }.also { _BracketRoundRight = it }
