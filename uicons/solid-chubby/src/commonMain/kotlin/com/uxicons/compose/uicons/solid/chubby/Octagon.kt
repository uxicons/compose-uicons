package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Octagon: ImageVector? = null

val Icons.Sc.Octagon: ImageVector
    get() = _Octagon ?: UXIcon(name = "Octagon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.48f, 7.76f)
                curveToRelative(-0.02f, -0.06f, -0.04f, -0.12f, -0.08f, -0.18f)
                curveToRelative(-0.04f, -0.08f, -1.03f, -1.91f, -2.08f, -2.96f)
                curveToRelative(-1.99f, -1.99f, -3.83f, -2.99f, -3.98f, -3.07f)
                curveToRelative(-0.13f, -0.06f, -1.37f, -0.56f, -4.35f, -0.56f)
                reflectiveCurveToRelative(-4.21f, 0.5f, -4.42f, 0.6f)
                curveToRelative(-0.08f, 0.04f, -1.92f, 1.04f, -3.91f, 3.03f)
                curveToRelative(-1.04f, 1.04f, -2.04f, 2.88f, -2.08f, 2.96f)
                curveToRelative(-0.03f, 0.06f, -0.06f, 0.12f, -0.08f, 0.18f)
                curveToRelative(-0.02f, 0.07f, -0.52f, 1.74f, -0.52f, 4.24f)
                reflectiveCurveToRelative(0.5f, 4.17f, 0.52f, 4.24f)
                curveToRelative(0.02f, 0.06f, 0.04f, 0.12f, 0.08f, 0.18f)
                curveToRelative(0.04f, 0.08f, 1.03f, 1.91f, 2.08f, 2.96f)
                curveToRelative(1.99f, 1.99f, 3.83f, 2.99f, 3.98f, 3.07f)
                curveToRelative(0.13f, 0.06f, 1.37f, 0.56f, 4.35f, 0.56f)
                reflectiveCurveToRelative(4.21f, -0.5f, 4.42f, -0.6f)
                curveToRelative(0.08f, -0.04f, 1.92f, -1.04f, 3.91f, -3.03f)
                curveToRelative(1.04f, -1.04f, 2.04f, -2.88f, 2.08f, -2.96f)
                curveToRelative(0.03f, -0.06f, 0.06f, -0.12f, 0.08f, -0.18f)
                curveToRelative(0.02f, -0.07f, 0.52f, -1.74f, 0.52f, -4.24f)
                reflectiveCurveToRelative(-0.5f, -4.17f, -0.52f, -4.24f)
                close()
            }
        }.also { _Octagon = it}
