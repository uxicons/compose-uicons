package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketsRound: ImageVector? = null

val Icons.Rs.BracketsRound: ImageVector
    get() = _BracketsRound ?: UXIcon(name = "BracketsRound") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 22.39f)
                lineToRelative(-1.23f, 1.58f)
                curveToRelative(-0.24f, -0.18f, -5.77f, -4.56f, -5.77f, -11.97f)
                reflectiveCurveTo(5.54f, 0.21f, 5.77f, 0.03f)
                lineToRelative(1.23f, 1.58f)
                reflectiveCurveTo(2f, 5.6f, 2f, 12f)
                reflectiveCurveToRelative(4.95f, 10.35f, 5f, 10.39f)
                close()
                moveTo(18.23f, 0.03f)
                lineToRelative(-1.23f, 1.58f)
                reflectiveCurveToRelative(5f, 3.99f, 5f, 10.39f)
                reflectiveCurveToRelative(-4.95f, 10.35f, -5f, 10.39f)
                lineToRelative(1.23f, 1.58f)
                curveToRelative(0.24f, -0.18f, 5.77f, -4.56f, 5.77f, -11.97f)
                reflectiveCurveTo(18.46f, 0.21f, 18.23f, 0.03f)
                close()
            }
        }.also { _BracketsRound = it}
