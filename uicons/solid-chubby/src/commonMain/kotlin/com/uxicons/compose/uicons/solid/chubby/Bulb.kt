package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bulb: ImageVector? = null

val Icons.Sc.Bulb: ImageVector
    get() = _Bulb ?: UXIcon(name = "Bulb") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.13f, 19.26f)
                curveToRelative(0.16f, 1.94f, 0.85f, 3.74f, 3.88f, 3.74f)
                reflectiveCurveToRelative(3.72f, -1.8f, 3.88f, -3.74f)
                curveToRelative(-1.17f, 0.18f, -2.45f, 0.27f, -3.89f, 0.27f)
                curveToRelative(-1.43f, 0f, -2.71f, -0.09f, -3.86f, -0.26f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 1f)
                curveTo(6.55f, 1f, 3.29f, 4.28f, 3.29f, 9.76f)
                curveToRelative(0f, 4.77f, 2.85f, 6.69f, 4.55f, 7.41f)
                curveToRelative(0.02f, 0.01f, 0.94f, 0.27f, 3.19f, 0.34f)
                verticalLineToRelative(-5.54f)
                curveToRelative(-0.59f, -0.21f, -1.18f, -0.61f, -1.78f, -1.21f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.42f, 0.0f)
                curveToRelative(1.03f, 1.03f, 1.61f, 1.08f, 2.69f, 0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.42f, -0.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(-0.42f, 0.42f, -1.0f, 0.93f, -1.74f, 1.2f)
                verticalLineToRelative(5.54f)
                curveToRelative(2.42f, -0.12f, 3.14f, -0.34f, 3.15f, -0.34f)
                curveToRelative(1.69f, -0.72f, 4.54f, -2.64f, 4.54f, -7.4f)
                curveToRelative(0f, -5.57f, -3.17f, -8.76f, -8.7f, -8.76f)
                close()
            }
        }.also { _Bulb = it}
