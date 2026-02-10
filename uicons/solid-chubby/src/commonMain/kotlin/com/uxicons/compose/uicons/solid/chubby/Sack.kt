package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sack: ImageVector? = null

val Icons.Sc.Sack: ImageVector
    get() = _Sack ?: UXIcon(name = "Sack") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.62f, 11.57f)
                curveToRelative(-1.62f, -2.81f, -3.93f, -4.33f, -6.54f, -4.85f)
                curveToRelative(0.82f, -0.55f, 1.81f, -1.51f, 2.79f, -3.22f)
                curveToRelative(0.26f, -0.46f, 0.12f, -1.04f, -0.31f, -1.33f)
                curveToRelative(-0.07f, -0.05f, -1.78f, -1.17f, -4.55f, -1.17f)
                reflectiveCurveToRelative(-4.48f, 1.12f, -4.55f, 1.17f)
                curveToRelative(-0.44f, 0.29f, -0.57f, 0.87f, -0.31f, 1.33f)
                curveToRelative(0.98f, 1.71f, 1.97f, 2.67f, 2.79f, 3.22f)
                curveToRelative(-2.61f, 0.52f, -4.92f, 2.04f, -6.54f, 4.85f)
                curveToRelative(-1.23f, 2.15f, -1.61f, 4.51f, -1.07f, 6.67f)
                curveToRelative(0.85f, 3.38f, 3.66f, 4.76f, 9.69f, 4.76f)
                reflectiveCurveToRelative(8.84f, -1.38f, 9.69f, -4.76f)
                curveToRelative(0.54f, -2.15f, 0.16f, -4.52f, -1.07f, -6.67f)
                close()
            }
        }.also { _Sack = it}
