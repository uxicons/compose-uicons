package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRoundRight: ImageVector? = null

val Icons.Rs.BracketRoundRight: ImageVector
    get() = _BracketRoundRight ?: UXIcon(name = "BracketRoundRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.23f, 23.97f)
                lineToRelative(-1.23f, -1.58f)
                curveToRelative(0.05f, -0.04f, 5f, -3.99f, 5f, -10.39f)
                reflectiveCurveTo(9.05f, 1.65f, 9f, 1.61f)
                lineTo(10.23f, 0.03f)
                curveToRelative(0.24f, 0.18f, 5.77f, 4.56f, 5.77f, 11.97f)
                reflectiveCurveToRelative(-5.54f, 11.79f, -5.77f, 11.97f)
                close()
            }
        }.also { _BracketRoundRight = it}
