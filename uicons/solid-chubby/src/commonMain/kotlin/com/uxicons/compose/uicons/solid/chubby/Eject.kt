package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eject: ImageVector? = null

val Icons.Sc.Eject: ImageVector
    get() = _Eject ?: UXIcon(name = "Eject") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.03f, 15.85f)
                curveToRelative(0.03f, -0.12f, 0.8f, -3.04f, 4.21f, -7.85f)
                curveToRelative(3.28f, -4.61f, 5.88f, -6.59f, 6.16f, -6.8f)
                curveToRelative(0.35f, -0.26f, 0.83f, -0.26f, 1.19f, 0f)
                curveToRelative(0.29f, 0.21f, 2.89f, 2.19f, 6.16f, 6.8f)
                curveToRelative(3.41f, 4.8f, 4.18f, 7.73f, 4.21f, 7.85f)
                curveToRelative(0.13f, 0.53f, -0.18f, 1.07f, -0.71f, 1.21f)
                curveToRelative(-0.14f, 0.04f, -3.54f, 0.94f, -10.26f, 0.94f)
                reflectiveCurveToRelative(-10.12f, -0.9f, -10.26f, -0.94f)
                curveToRelative(-0.53f, -0.14f, -0.84f, -0.68f, -0.71f, -1.21f)
                close()
                moveTo(22.93f, 20.1f)
                curveToRelative(-0.24f, -0.79f, -1.08f, -1.24f, -1.87f, -1.0f)
                curveToRelative(-0.03f, 0.01f, -3.09f, 0.9f, -9.06f, 0.9f)
                reflectiveCurveToRelative(-9.04f, -0.9f, -9.07f, -0.9f)
                curveToRelative(-0.79f, -0.24f, -1.63f, 0.21f, -1.87f, 1.0f)
                curveToRelative(-0.24f, 0.79f, 0.2f, 1.63f, 1.0f, 1.87f)
                curveToRelative(0.14f, 0.04f, 3.46f, 1.03f, 9.94f, 1.03f)
                reflectiveCurveToRelative(9.8f, -0.99f, 9.94f, -1.03f)
                curveToRelative(0.79f, -0.24f, 1.23f, -1.08f, 0.99f, -1.87f)
                close()
            }
        }.also { _Eject = it}
