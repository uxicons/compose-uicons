package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tally1: ImageVector? = null

val Icons.Sc.Tally1: ImageVector
    get() = _Tally1 ?: UXIcon(name = "Tally1") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.86f, 21.19f)
                curveToRelative(0.17f, 0.81f, -0.35f, 1.6f, -1.16f, 1.77f)
                curveToRelative(-0.79f, 0.17f, -1.61f, -0.34f, -1.77f, -1.16f)
                curveToRelative(-0.28f, -1.32f, -0.92f, -4.92f, -0.92f, -9.81f)
                reflectiveCurveToRelative(0.64f, -8.48f, 0.92f, -9.81f)
                curveToRelative(0.17f, -0.81f, 0.97f, -1.33f, 1.77f, -1.16f)
                curveToRelative(0.81f, 0.17f, 1.33f, 0.96f, 1.16f, 1.77f)
                curveToRelative(-0.26f, 1.23f, -0.86f, 4.59f, -0.86f, 9.19f)
                reflectiveCurveToRelative(0.6f, 7.96f, 0.86f, 9.19f)
                close()
            }
        }.also { _Tally1 = it}
