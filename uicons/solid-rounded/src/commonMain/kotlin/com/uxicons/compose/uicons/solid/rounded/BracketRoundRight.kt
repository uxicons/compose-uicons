package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRoundRight: ImageVector? = null

val Icons.Sr.BracketRoundRight: ImageVector
    get() = _BracketRoundRight ?: UXIcon(name = "BracketRoundRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 24f)
                curveToRelative(-0.29f, 0f, -0.58f, -0.13f, -0.78f, -0.38f)
                curveToRelative(-0.34f, -0.43f, -0.27f, -1.06f, 0.16f, -1.4f)
                curveToRelative(0.09f, -0.07f, 4.63f, -3.84f, 4.63f, -10.22f)
                reflectiveCurveTo(9.42f, 1.82f, 9.37f, 1.78f)
                curveToRelative(-0.43f, -0.35f, -0.5f, -0.98f, -0.15f, -1.41f)
                curveToRelative(0.34f, -0.43f, 0.97f, -0.5f, 1.4f, -0.15f)
                curveToRelative(0.22f, 0.18f, 5.38f, 4.39f, 5.38f, 11.78f)
                reflectiveCurveToRelative(-5.16f, 11.61f, -5.38f, 11.78f)
                curveToRelative(-0.18f, 0.15f, -0.41f, 0.22f, -0.62f, 0.22f)
                close()
            }
        }.also { _BracketRoundRight = it}
