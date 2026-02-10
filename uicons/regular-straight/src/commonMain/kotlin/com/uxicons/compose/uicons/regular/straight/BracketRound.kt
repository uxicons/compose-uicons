package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRound: ImageVector? = null

val Icons.Rs.BracketRound: ImageVector
    get() = _BracketRound ?: UXIcon(name = "BracketRound") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.77f, 23.97f)
                curveToRelative(-0.24f, -0.18f, -5.77f, -4.56f, -5.77f, -11.97f)
                reflectiveCurveTo(13.54f, 0.21f, 13.77f, 0.03f)
                lineToRelative(1.23f, 1.58f)
                reflectiveCurveToRelative(-5f, 3.99f, -5f, 10.39f)
                reflectiveCurveToRelative(4.95f, 10.35f, 5f, 10.39f)
                lineToRelative(-1.23f, 1.58f)
                close()
            }
        }.also { _BracketRound = it}
