package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRound: ImageVector? = null

val Icons.Sc.BracketRound: ImageVector
    get() = _BracketRound ?: UXIcon(name = "BracketRound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.47f, 22.99f)
                curveToRelative(-0.23f, 0f, -0.47f, -0.06f, -0.69f, -0.17f)
                curveToRelative(-4.28f, -2.25f, -4.78f, -7.25f, -4.78f, -10.82f)
                reflectiveCurveToRelative(0.5f, -8.6f, 4.81f, -10.84f)
                curveToRelative(0.73f, -0.38f, 1.64f, -0.1f, 2.02f, 0.64f)
                curveToRelative(0.38f, 0.73f, 0.1f, 1.64f, -0.64f, 2.02f)
                curveToRelative(-1.49f, 0.77f, -3.19f, 2.4f, -3.19f, 8.18f)
                reflectiveCurveToRelative(1.7f, 7.39f, 3.17f, 8.17f)
                curveToRelative(0.73f, 0.39f, 1.02f, 1.29f, 0.63f, 2.02f)
                curveToRelative(-0.27f, 0.51f, -0.79f, 0.8f, -1.33f, 0.8f)
                close()
            }
        }.also { _BracketRound = it}
