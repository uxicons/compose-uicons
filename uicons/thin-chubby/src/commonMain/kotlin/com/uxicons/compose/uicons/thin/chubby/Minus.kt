package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Minus: ImageVector? = null

val Icons.Tc.Minus: ImageVector
    get() = _Minus ?: UXIcon(name = "Minus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.37f, 13.03f)
                curveToRelative(-0.04f, -0.01f, -4.14f, -1.08f, -10.37f, -1.08f)
                curveToRelative(-6.27f, 0f, -10.33f, 1.07f, -10.37f, 1.08f)
                curveToRelative(-0.27f, 0.07f, -0.54f, -0.09f, -0.61f, -0.35f)
                reflectiveCurveToRelative(0.09f, -0.54f, 0.35f, -0.61f)
                curveToRelative(0.17f, -0.04f, 4.21f, -1.12f, 10.63f, -1.12f)
                curveToRelative(6.38f, 0f, 10.46f, 1.07f, 10.63f, 1.12f)
                curveToRelative(0.27f, 0.07f, 0.42f, 0.34f, 0.35f, 0.61f)
                curveToRelative(-0.06f, 0.22f, -0.32f, 0.44f, -0.61f, 0.35f)
                close()
            }
        }.also { _Minus = it}
