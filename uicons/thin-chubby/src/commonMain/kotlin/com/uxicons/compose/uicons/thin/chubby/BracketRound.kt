package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRound: ImageVector? = null

val Icons.Tc.BracketRound: ImageVector
    get() = _BracketRound ?: UXIcon(name = "BracketRound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.47f, 23f)
                curveToRelative(-0.07f, 0f, -0.14f, -0.01f, -0.21f, -0.05f)
                curveToRelative(-3.59f, -1.66f, -5.26f, -5.14f, -5.26f, -10.95f)
                reflectiveCurveToRelative(1.68f, -9.3f, 5.29f, -10.96f)
                curveToRelative(0.25f, -0.11f, 0.55f, -0.01f, 0.66f, 0.25f)
                curveToRelative(0.12f, 0.25f, 0.01f, 0.55f, -0.25f, 0.66f)
                curveToRelative(-3.26f, 1.5f, -4.71f, 4.6f, -4.71f, 10.05f)
                reflectiveCurveToRelative(1.44f, 8.54f, 4.68f, 10.04f)
                curveToRelative(0.25f, 0.12f, 0.36f, 0.41f, 0.24f, 0.66f)
                curveToRelative(-0.08f, 0.18f, -0.27f, 0.29f, -0.45f, 0.29f)
                close()
            }
        }.also { _BracketRound = it}
