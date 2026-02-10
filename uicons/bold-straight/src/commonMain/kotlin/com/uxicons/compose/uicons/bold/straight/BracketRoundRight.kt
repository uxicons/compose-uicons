package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRoundRight: ImageVector? = null

val Icons.Bs.BracketRoundRight: ImageVector
    get() = _BracketRoundRight ?: UXIcon(name = "BracketRoundRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 12f)
                curveToRelative(0f, 7.39f, -5.21f, 11.78f, -5.43f, 11.96f)
                lineToRelative(-1.92f, -2.31f)
                reflectiveCurveToRelative(4.34f, -3.71f, 4.34f, -9.66f)
                reflectiveCurveTo(8.7f, 2.38f, 8.66f, 2.34f)
                lineTo(10.57f, 0.04f)
                curveToRelative(0.22f, 0.18f, 5.43f, 4.58f, 5.43f, 11.96f)
                close()
            }
        }.also { _BracketRoundRight = it}
