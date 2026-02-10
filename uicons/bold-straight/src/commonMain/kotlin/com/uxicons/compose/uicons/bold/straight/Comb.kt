package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comb: ImageVector? = null

val Icons.Bs.Comb: ImageVector
    get() = _Comb ?: UXIcon(name = "Comb") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.82f, 3.13f)
                lineToRelative(-1.71f, 1.71f)
                lineToRelative(4.7f, 4.7f)
                lineToRelative(-2.13f, 2.13f)
                lineToRelative(-4.7f, -4.7f)
                lineToRelative(-1.89f, 1.89f)
                lineToRelative(4.7f, 4.7f)
                lineToRelative(-2.13f, 2.13f)
                lineToRelative(-4.7f, -4.7f)
                lineToRelative(-1.9f, 1.9f)
                lineToRelative(4.7f, 4.7f)
                lineToRelative(-2.13f, 2.13f)
                lineToRelative(-4.7f, -4.7f)
                lineToRelative(-1.77f, 1.78f)
                curveToRelative(-0.21f, 0.28f, -0.21f, 0.43f, 0f, 0.71f)
                lineToRelative(4.34f, 4.35f)
                lineToRelative(-2.13f, 2.13f)
                lineToRelative(-4.34f, -4.35f)
                curveToRelative(-0.66f, -0.66f, -1.03f, -1.55f, -1.03f, -2.49f)
                reflectiveCurveToRelative(0.37f, -1.82f, 1.03f, -2.49f)
                lineToRelative(13.66f, -13.68f)
                curveToRelative(1.33f, -1.33f, 3.64f, -1.33f, 4.97f, 0f)
                lineToRelative(4.34f, 4.35f)
                lineToRelative(-2.13f, 2.13f)
                lineToRelative(-4.34f, -4.35f)
                curveToRelative(-0.28f, -0.21f, -0.43f, -0.21f, -0.71f, 0f)
                close()
            }
        }.also { _Comb = it}
