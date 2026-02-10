package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Slash: ImageVector? = null

val Icons.Rc.Slash: ImageVector
    get() = _Slash ?: UXIcon(name = "Slash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 23f)
                curveToRelative(-0.12f, 0f, -0.25f, -0.02f, -0.37f, -0.07f)
                curveToRelative(-0.21f, -0.09f, -5.27f, -2.15f, -11.84f, -8.72f)
                curveToRelative(-6.57f, -6.57f, -8.64f, -11.62f, -8.72f, -11.84f)
                curveToRelative(-0.2f, -0.51f, 0.04f, -1.09f, 0.56f, -1.3f)
                curveToRelative(0.51f, -0.21f, 1.09f, 0.04f, 1.3f, 0.55f)
                curveToRelative(0.02f, 0.05f, 2.03f, 4.92f, 8.28f, 11.17f)
                reflectiveCurveToRelative(11.12f, 8.26f, 11.17f, 8.28f)
                curveToRelative(0.51f, 0.21f, 0.76f, 0.79f, 0.55f, 1.3f)
                curveToRelative(-0.16f, 0.39f, -0.53f, 0.63f, -0.93f, 0.63f)
                close()
            }
        }.also { _Slash = it}
