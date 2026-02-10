package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Integral: ImageVector? = null

val Icons.Sc.Integral: ImageVector
    get() = _Integral ?: UXIcon(name = "Integral") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.24f, 23f)
                curveToRelative(-3.12f, 0f, -4.03f, -1.79f, -4.24f, -3.29f)
                curveToRelative(-0.11f, -0.82f, 0.46f, -1.58f, 1.28f, -1.69f)
                reflectiveCurveToRelative(1.58f, 0.46f, 1.69f, 1.28f)
                curveToRelative(0.07f, 0.47f, 0.1f, 0.71f, 1.26f, 0.71f)
                curveToRelative(1.04f, 0f, 1.26f, -0.22f, 1.26f, -1.26f)
                lineToRelative(-0.01f, -13.48f)
                curveToRelative(0.02f, -2.71f, 1.57f, -4.26f, 4.26f, -4.26f)
                curveToRelative(3.12f, 0f, 4.03f, 1.79f, 4.24f, 3.29f)
                curveToRelative(0.11f, 0.82f, -0.46f, 1.58f, -1.28f, 1.69f)
                curveToRelative(-0.83f, 0.11f, -1.58f, -0.46f, -1.69f, -1.28f)
                curveToRelative(-0.07f, -0.47f, -0.1f, -0.71f, -1.26f, -0.71f)
                curveToRelative(-1.04f, 0f, -1.25f, 0.21f, -1.26f, 1.27f)
                lineToRelative(0.01f, 13.47f)
                curveToRelative(0f, 2.71f, -1.55f, 4.26f, -4.26f, 4.26f)
                close()
            }
        }.also { _Integral = it}
