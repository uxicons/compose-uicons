package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRoundRight: ImageVector? = null

val Icons.Tr.BracketRoundRight: ImageVector
    get() = _BracketRoundRight ?: UXIcon(name = "BracketRoundRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 24f)
                curveToRelative(-0.14f, 0f, -0.29f, -0.06f, -0.38f, -0.18f)
                curveToRelative(-0.18f, -0.21f, -0.15f, -0.53f, 0.06f, -0.7f)
                curveToRelative(0.05f, -0.04f, 4.82f, -4.13f, 4.82f, -11.12f)
                reflectiveCurveTo(10.23f, 0.92f, 10.18f, 0.88f)
                curveToRelative(-0.21f, -0.18f, -0.24f, -0.49f, -0.06f, -0.7f)
                curveToRelative(0.18f, -0.21f, 0.49f, -0.24f, 0.7f, -0.06f)
                curveToRelative(0.21f, 0.18f, 5.18f, 4.42f, 5.18f, 11.88f)
                reflectiveCurveToRelative(-4.97f, 11.71f, -5.18f, 11.88f)
                curveToRelative(-0.09f, 0.08f, -0.21f, 0.12f, -0.32f, 0.12f)
                close()
            }
        }.also { _BracketRoundRight = it}
