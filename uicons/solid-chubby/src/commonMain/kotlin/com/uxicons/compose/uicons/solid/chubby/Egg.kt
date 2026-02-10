package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Egg: ImageVector? = null

val Icons.Sc.Egg: ImageVector
    get() = _Egg ?: UXIcon(name = "Egg") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.31f, 4.81f)
                curveToRelative(-1.91f, -2.38f, -4.33f, -3.84f, -6.31f, -3.81f)
                curveToRelative(-4.13f, 0.06f, -9.54f, 6.36f, -9.63f, 13.01f)
                curveToRelative(0.13f, 5.46f, 3.92f, 8.99f, 9.64f, 8.99f)
                reflectiveCurveToRelative(9.48f, -3.53f, 9.61f, -8.99f)
                curveToRelative(0f, -0.01f, 0f, -0.03f, 0f, -0.04f)
                curveToRelative(-0.05f, -3.29f, -1.23f, -6.54f, -3.32f, -9.16f)
                close()
                moveTo(14.23f, 8.48f)
                curveToRelative(-0.84f, 0f, -1.52f, -0.68f, -1.52f, -1.52f)
                reflectiveCurveToRelative(0.68f, -1.52f, 1.52f, -1.52f)
                reflectiveCurveToRelative(1.52f, 0.68f, 1.52f, 1.52f)
                reflectiveCurveToRelative(-0.68f, 1.52f, -1.52f, 1.52f)
                close()
                moveTo(16.84f, 12.73f)
                curveToRelative(-0.84f, 0f, -1.52f, -0.68f, -1.52f, -1.52f)
                reflectiveCurveToRelative(0.68f, -1.52f, 1.52f, -1.52f)
                reflectiveCurveToRelative(1.52f, 0.68f, 1.52f, 1.52f)
                reflectiveCurveToRelative(-0.68f, 1.52f, -1.52f, 1.52f)
                close()
            }
        }.also { _Egg = it}
