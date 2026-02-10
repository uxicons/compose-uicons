package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRound: ImageVector? = null

val Icons.Ts.BracketRound: ImageVector
    get() = _BracketRound ?: UXIcon(name = "BracketRound") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.36f, 23.13f)
                lineToRelative(-0.61f, 0.79f)
                curveToRelative(-0.23f, -0.18f, -5.75f, -4.54f, -5.75f, -11.92f)
                reflectiveCurveTo(14.51f, 0.26f, 14.75f, 0.08f)
                lineToRelative(0.61f, 0.79f)
                curveToRelative(-0.05f, 0.04f, -5.36f, 4.26f, -5.36f, 11.13f)
                reflectiveCurveToRelative(5.3f, 11.09f, 5.36f, 11.13f)
                close()
            }
        }.also { _BracketRound = it}
