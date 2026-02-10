package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketsRound: ImageVector? = null

val Icons.Ts.BracketsRound: ImageVector
    get() = _BracketsRound ?: UXIcon(name = "BracketsRound") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, 7.38f, -5.51f, 11.74f, -5.74f, 11.92f)
                lineToRelative(-0.61f, -0.79f)
                curveToRelative(0.05f, -0.04f, 5.36f, -4.26f, 5.36f, -11.13f)
                reflectiveCurveTo(17.7f, 0.91f, 17.64f, 0.87f)
                lineToRelative(0.61f, -0.79f)
                curveToRelative(0.23f, 0.18f, 5.74f, 4.54f, 5.74f, 11.92f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.36f, 23.13f)
                lineToRelative(-0.61f, 0.79f)
                curveToRelative(-0.23f, -0.18f, -5.74f, -4.54f, -5.74f, -11.92f)
                reflectiveCurveTo(5.51f, 0.26f, 5.74f, 0.08f)
                lineToRelative(0.61f, 0.79f)
                curveToRelative(-0.05f, 0.04f, -5.36f, 4.26f, -5.36f, 11.13f)
                reflectiveCurveToRelative(5.3f, 11.09f, 5.36f, 11.13f)
                close()
            }
        }.also { _BracketsRound = it}
