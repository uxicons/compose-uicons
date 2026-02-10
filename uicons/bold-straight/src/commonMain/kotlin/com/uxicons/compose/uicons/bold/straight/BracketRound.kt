package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRound: ImageVector? = null

val Icons.Bs.BracketRound: ImageVector
    get() = _BracketRound ?: UXIcon(name = "BracketRound") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.34f, 21.66f)
                lineToRelative(-1.92f, 2.31f)
                curveToRelative(-0.22f, -0.18f, -5.43f, -4.58f, -5.43f, -11.96f)
                reflectiveCurveTo(13.21f, 0.22f, 13.43f, 0.04f)
                lineToRelative(1.91f, 2.31f)
                reflectiveCurveToRelative(-4.34f, 3.71f, -4.34f, 9.65f)
                reflectiveCurveToRelative(4.3f, 9.62f, 4.34f, 9.66f)
                close()
            }
        }.also { _BracketRound = it}
