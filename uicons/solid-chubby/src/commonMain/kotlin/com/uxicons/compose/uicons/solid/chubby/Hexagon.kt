package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hexagon: ImageVector? = null

val Icons.Sc.Hexagon: ImageVector
    get() = _Hexagon ?: UXIcon(name = "Hexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23f)
                curveToRelative(-2.7f, 0f, -5.35f, -0.52f, -5.46f, -0.55f)
                curveToRelative(-0.22f, -0.04f, -0.41f, -0.16f, -0.56f, -0.32f)
                curveToRelative(-2.42f, -2.79f, -4.22f, -6.0f, -5.49f, -9.81f)
                curveToRelative(-0.07f, -0.2f, -0.07f, -0.43f, 0f, -0.63f)
                curveToRelative(1.27f, -3.82f, 3.06f, -7.03f, 5.48f, -9.81f)
                curveToRelative(0.14f, -0.17f, 0.34f, -0.28f, 0.56f, -0.32f)
                curveToRelative(0.11f, -0.02f, 2.76f, -0.55f, 5.46f, -0.55f)
                reflectiveCurveToRelative(5.35f, 0.52f, 5.46f, 0.55f)
                curveToRelative(0.22f, 0.04f, 0.41f, 0.16f, 0.56f, 0.32f)
                curveToRelative(2.42f, 2.79f, 4.22f, 6.0f, 5.49f, 9.81f)
                curveToRelative(0.07f, 0.2f, 0.07f, 0.43f, 0f, 0.63f)
                curveToRelative(-1.27f, 3.82f, -3.06f, 7.03f, -5.49f, 9.81f)
                curveToRelative(-0.14f, 0.17f, -0.34f, 0.28f, -0.56f, 0.32f)
                curveToRelative(-0.11f, 0.02f, -2.76f, 0.55f, -5.46f, 0.55f)
                close()
            }
        }.also { _Hexagon = it}
