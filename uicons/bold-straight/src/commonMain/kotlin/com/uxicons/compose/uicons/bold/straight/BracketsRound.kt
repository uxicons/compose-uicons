package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketsRound: ImageVector? = null

val Icons.Bs.BracketsRound: ImageVector
    get() = _BracketsRound ?: UXIcon(name = "BracketsRound") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.34f, 21.66f)
                lineToRelative(-1.92f, 2.31f)
                curveToRelative(-0.22f, -0.18f, -5.43f, -4.58f, -5.43f, -11.96f)
                reflectiveCurveTo(5.21f, 0.22f, 5.43f, 0.04f)
                lineToRelative(1.91f, 2.31f)
                reflectiveCurveTo(3f, 6.06f, 3f, 12f)
                reflectiveCurveToRelative(4.3f, 9.62f, 4.34f, 9.66f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 7.39f, -5.21f, 11.78f, -5.43f, 11.96f)
                lineToRelative(-1.92f, -2.31f)
                reflectiveCurveToRelative(4.34f, -3.71f, 4.34f, -9.66f)
                reflectiveCurveTo(16.7f, 2.38f, 16.66f, 2.34f)
                lineTo(18.57f, 0.04f)
                curveToRelative(0.22f, 0.18f, 5.43f, 4.58f, 5.43f, 11.96f)
                close()
            }
        }.also { _BracketsRound = it}
