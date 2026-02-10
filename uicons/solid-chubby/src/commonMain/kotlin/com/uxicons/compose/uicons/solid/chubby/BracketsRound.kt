package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BracketsRound: ImageVector? = null

val Icons.Sc.BracketsRound: ImageVector
    get() = _BracketsRound ?: UXIcon(name = "BracketsRound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 12.01f)
                curveToRelative(0f, 5.76f, 1.7f, 7.39f, 3.17f, 8.17f)
                curveToRelative(0.73f, 0.39f, 1.02f, 1.29f, 0.63f, 2.02f)
                curveToRelative(-0.39f, 0.74f, -1.31f, 1.01f, -2.02f, 0.63f)
                curveToRelative(-4.29f, -2.25f, -4.78f, -7.25f, -4.78f, -10.82f)
                reflectiveCurveToRelative(0.5f, -8.6f, 4.81f, -10.84f)
                curveToRelative(0.73f, -0.38f, 1.64f, -0.1f, 2.02f, 0.64f)
                curveToRelative(0.38f, 0.73f, 0.1f, 1.64f, -0.64f, 2.02f)
                curveToRelative(-1.49f, 0.77f, -3.19f, 2.4f, -3.19f, 8.18f)
                close()
                moveTo(18.19f, 1.17f)
                curveToRelative(-0.73f, -0.38f, -1.64f, -0.1f, -2.02f, 0.64f)
                reflectiveCurveToRelative(-0.1f, 1.64f, 0.64f, 2.02f)
                curveToRelative(1.49f, 0.77f, 3.19f, 2.4f, 3.19f, 8.18f)
                reflectiveCurveToRelative(-1.7f, 7.39f, -3.17f, 8.17f)
                curveToRelative(-0.73f, 0.39f, -1.02f, 1.29f, -0.63f, 2.02f)
                curveToRelative(0.39f, 0.74f, 1.31f, 1.01f, 2.02f, 0.63f)
                curveToRelative(4.28f, -2.25f, 4.78f, -7.25f, 4.78f, -10.82f)
                reflectiveCurveToRelative(-0.5f, -8.6f, -4.81f, -10.84f)
                close()
            }
        }.also { _BracketsRound = it}
