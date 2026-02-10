package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Slash: ImageVector? = null

val Icons.Sc.Slash: ImageVector
    get() = _Slash ?: UXIcon(name = "Slash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 23f)
                curveToRelative(-0.18f, 0f, -0.37f, -0.04f, -0.56f, -0.11f)
                curveToRelative(-0.21f, -0.08f, -5.11f, -2.09f, -11.43f, -8.41f)
                curveToRelative(-6.32f, -6.32f, -8.33f, -11.22f, -8.41f, -11.43f)
                curveToRelative(-0.31f, -0.77f, 0.07f, -1.64f, 0.83f, -1.95f)
                curveToRelative(0.77f, -0.31f, 1.64f, 0.07f, 1.95f, 0.83f)
                curveToRelative(0.03f, 0.06f, 1.92f, 4.6f, 7.75f, 10.43f)
                reflectiveCurveToRelative(10.38f, 7.73f, 10.43f, 7.75f)
                curveToRelative(0.77f, 0.31f, 1.14f, 1.19f, 0.83f, 1.95f)
                curveToRelative(-0.24f, 0.58f, -0.8f, 0.94f, -1.39f, 0.94f)
                close()
            }
        }.also { _Slash = it}
