package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tally1: ImageVector? = null

val Icons.Tc.Tally1: ImageVector
    get() = _Tally1 ?: UXIcon(name = "Tally1") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.99f, 22.38f)
                curveToRelative(0.06f, 0.27f, -0.1f, 0.54f, -0.37f, 0.6f)
                curveToRelative(-0.26f, 0.06f, -0.54f, -0.1f, -0.6f, -0.37f)
                curveToRelative(-0.04f, -0.17f, -1.01f, -4.33f, -1.01f, -10.62f)
                reflectiveCurveToRelative(0.97f, -10.44f, 1.01f, -10.62f)
                curveToRelative(0.06f, -0.27f, 0.33f, -0.43f, 0.6f, -0.37f)
                curveToRelative(0.27f, 0.06f, 0.43f, 0.33f, 0.37f, 0.6f)
                curveToRelative(-0.01f, 0.04f, -0.99f, 4.22f, -0.99f, 10.38f)
                reflectiveCurveToRelative(0.98f, 10.34f, 0.99f, 10.38f)
                close()
            }
        }.also { _Tally1 = it}
