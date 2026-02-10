package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketsRound: ImageVector? = null

val Icons.Tr.BracketsRound: ImageVector
    get() = _BracketsRound ?: UXIcon(name = "BracketsRound") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 12f)
                curveToRelative(0f, 6.98f, 4.77f, 11.08f, 4.82f, 11.12f)
                curveToRelative(0.21f, 0.18f, 0.24f, 0.49f, 0.06f, 0.7f)
                curveToRelative(-0.1f, 0.12f, -0.24f, 0.18f, -0.38f, 0.18f)
                curveToRelative(-0.11f, 0f, -0.23f, -0.04f, -0.32f, -0.12f)
                curveToRelative(-0.21f, -0.18f, -5.18f, -4.42f, -5.18f, -11.88f)
                reflectiveCurveTo(4.97f, 0.29f, 5.18f, 0.12f)
                curveToRelative(0.21f, -0.18f, 0.53f, -0.15f, 0.7f, 0.06f)
                curveToRelative(0.18f, 0.21f, 0.15f, 0.53f, -0.06f, 0.7f)
                curveToRelative(-0.05f, 0.04f, -4.82f, 4.13f, -4.82f, 11.12f)
                close()
                moveTo(18.82f, 0.12f)
                curveToRelative(-0.21f, -0.18f, -0.53f, -0.15f, -0.7f, 0.06f)
                curveToRelative(-0.18f, 0.21f, -0.15f, 0.53f, 0.06f, 0.7f)
                curveToRelative(0.05f, 0.04f, 4.82f, 4.13f, 4.82f, 11.12f)
                reflectiveCurveToRelative(-4.77f, 11.08f, -4.82f, 11.12f)
                curveToRelative(-0.21f, 0.18f, -0.24f, 0.49f, -0.06f, 0.7f)
                curveToRelative(0.1f, 0.12f, 0.24f, 0.18f, 0.38f, 0.18f)
                curveToRelative(0.11f, 0f, 0.23f, -0.04f, 0.32f, -0.12f)
                curveToRelative(0.21f, -0.18f, 5.18f, -4.42f, 5.18f, -11.88f)
                reflectiveCurveTo(19.03f, 0.29f, 18.82f, 0.12f)
                close()
            }
        }.also { _BracketsRound = it}
