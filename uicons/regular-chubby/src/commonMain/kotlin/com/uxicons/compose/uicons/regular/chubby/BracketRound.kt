package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRound: ImageVector? = null

val Icons.Rc.BracketRound: ImageVector
    get() = _BracketRound ?: UXIcon(name = "BracketRound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.88f, 22.48f)
                curveToRelative(-0.27f, 0.49f, -0.88f, 0.66f, -1.36f, 0.4f)
                curveToRelative(-3.08f, -1.69f, -4.52f, -5.15f, -4.52f, -10.87f)
                reflectiveCurveToRelative(1.45f, -9.2f, 4.55f, -10.89f)
                curveToRelative(0.49f, -0.26f, 1.09f, -0.08f, 1.36f, 0.4f)
                reflectiveCurveToRelative(0.08f, 1.09f, -0.4f, 1.36f)
                curveToRelative(-2.42f, 1.32f, -3.5f, 4.13f, -3.5f, 9.13f)
                reflectiveCurveToRelative(1.07f, 7.8f, 3.48f, 9.12f)
                curveToRelative(0.48f, 0.27f, 0.66f, 0.87f, 0.4f, 1.36f)
                close()
            }
        }.also { _BracketRound = it}
