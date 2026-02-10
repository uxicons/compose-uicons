package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketRoundRight: ImageVector? = null

val Icons.Tc.BracketRoundRight: ImageVector
    get() = _BracketRoundRight ?: UXIcon(name = "BracketRoundRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.53f, 22.99f)
                curveToRelative(-0.19f, 0f, -0.37f, -0.11f, -0.45f, -0.29f)
                curveToRelative(-0.12f, -0.25f, -0.01f, -0.55f, 0.24f, -0.66f)
                curveToRelative(3.24f, -1.5f, 4.68f, -4.59f, 4.68f, -10.03f)
                reflectiveCurveToRelative(-1.45f, -8.55f, -4.71f, -10.04f)
                curveToRelative(-0.25f, -0.12f, -0.36f, -0.41f, -0.25f, -0.66f)
                reflectiveCurveToRelative(0.41f, -0.36f, 0.66f, -0.25f)
                curveToRelative(3.61f, 1.66f, 5.29f, 5.14f, 5.29f, 10.96f)
                reflectiveCurveToRelative(-1.67f, 9.28f, -5.26f, 10.94f)
                curveToRelative(-0.07f, 0.03f, -0.14f, 0.05f, -0.21f, 0.05f)
                close()
            }
        }.also { _BracketRoundRight = it}
