package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRoundRight: ImageVector? = null

val Icons.Sc.BracketRoundRight: ImageVector
    get() = _BracketRoundRight ?: UXIcon(name = "BracketRoundRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.53f, 22.99f)
                curveToRelative(-0.54f, 0f, -1.06f, -0.29f, -1.33f, -0.8f)
                curveToRelative(-0.39f, -0.73f, -0.1f, -1.64f, 0.63f, -2.02f)
                curveToRelative(1.48f, -0.77f, 3.17f, -2.4f, 3.17f, -8.17f)
                reflectiveCurveToRelative(-1.71f, -7.4f, -3.19f, -8.18f)
                curveToRelative(-0.73f, -0.38f, -1.02f, -1.29f, -0.64f, -2.02f)
                curveToRelative(0.38f, -0.74f, 1.29f, -1.02f, 2.02f, -0.64f)
                curveToRelative(4.31f, 2.24f, 4.81f, 7.26f, 4.81f, 10.84f)
                reflectiveCurveToRelative(-0.5f, 8.58f, -4.78f, 10.82f)
                curveToRelative(-0.22f, 0.12f, -0.46f, 0.17f, -0.69f, 0.17f)
                close()
            }
        }.also { _BracketRoundRight = it}
