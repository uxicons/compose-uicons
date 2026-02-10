package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRound: ImageVector? = null

val Icons.Tr.BracketRound: ImageVector
    get() = _BracketRound ?: UXIcon(name = "BracketRound") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 24f)
                curveToRelative(-0.11f, 0f, -0.23f, -0.04f, -0.32f, -0.12f)
                curveToRelative(-0.21f, -0.18f, -5.18f, -4.42f, -5.18f, -11.88f)
                reflectiveCurveTo(12.97f, 0.29f, 13.18f, 0.12f)
                curveToRelative(0.21f, -0.18f, 0.53f, -0.15f, 0.7f, 0.06f)
                curveToRelative(0.18f, 0.21f, 0.15f, 0.53f, -0.06f, 0.7f)
                curveToRelative(-0.05f, 0.04f, -4.82f, 4.13f, -4.82f, 11.12f)
                reflectiveCurveToRelative(4.77f, 11.08f, 4.82f, 11.12f)
                curveToRelative(0.21f, 0.18f, 0.24f, 0.49f, 0.06f, 0.7f)
                curveToRelative(-0.1f, 0.12f, -0.24f, 0.18f, -0.38f, 0.18f)
                close()
            }
        }.also { _BracketRound = it}
