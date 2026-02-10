package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRoundRight: ImageVector? = null

val Icons.Ts.BracketRoundRight: ImageVector
    get() = _BracketRoundRight ?: UXIcon(name = "BracketRoundRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 12f)
                curveToRelative(0f, 7.38f, -5.51f, 11.74f, -5.75f, 11.92f)
                lineToRelative(-0.61f, -0.79f)
                curveToRelative(0.05f, -0.04f, 5.36f, -4.26f, 5.36f, -11.13f)
                reflectiveCurveTo(8.7f, 0.91f, 8.64f, 0.87f)
                lineToRelative(0.61f, -0.79f)
                curveToRelative(0.23f, 0.18f, 5.75f, 4.54f, 5.75f, 11.92f)
                close()
            }
        }.also { _BracketRoundRight = it}
