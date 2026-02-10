package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EggFried: ImageVector? = null

val Icons.Sc.EggFried: ImageVector
    get() = _EggFried ?: UXIcon(name = "EggFried") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 6.9f)
                curveToRelative(-1.95f, 0f, -2.94f, 0.46f, -2.94f, 2.94f)
                curveToRelative(0f, 2.17f, 0.77f, 2.94f, 2.94f, 2.94f)
                curveToRelative(1.91f, 0f, 2.94f, -0.47f, 2.94f, -2.94f)
                curveToRelative(0f, -2.49f, -0.99f, -2.94f, -2.94f, -2.94f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.31f, 5.42f)
                curveToRelative(-1.39f, -2.75f, -4.18f, -4.08f, -8.5f, -4.08f)
                horizontalLineToRelative(-0.09f)
                curveTo(2.14f, 1.37f, 1.02f, 6.58f, 1f, 11.12f)
                curveToRelative(-0.02f, 3.88f, 0.81f, 9.06f, 8.04f, 9.67f)
                curveToRelative(1.13f, 1.26f, 2.89f, 1.88f, 5.34f, 1.88f)
                horizontalLineToRelative(0.06f)
                curveToRelative(5.8f, -0.02f, 6.8f, -3.48f, 6.93f, -6.29f)
                curveToRelative(1.43f, -1.39f, 1.61f, -3.43f, 1.62f, -4.89f)
                curveToRelative(0.01f, -1.25f, 0.02f, -4.95f, -3.69f, -6.07f)
                close()
                moveTo(12.1f, 19.36f)
                curveToRelative(-0.84f, 0f, -1.51f, -0.68f, -1.51f, -1.51f)
                reflectiveCurveToRelative(0.68f, -1.51f, 1.51f, -1.51f)
                reflectiveCurveToRelative(1.51f, 0.68f, 1.51f, 1.51f)
                reflectiveCurveToRelative(-0.68f, 1.51f, -1.51f, 1.51f)
                close()
                moveTo(9.5f, 14.78f)
                curveToRelative(-3.28f, 0f, -4.94f, -1.66f, -4.94f, -4.94f)
                curveToRelative(0f, -3.33f, 1.62f, -4.94f, 4.94f, -4.94f)
                reflectiveCurveToRelative(4.94f, 1.62f, 4.94f, 4.94f)
                reflectiveCurveToRelative(-1.62f, 4.94f, -4.94f, 4.94f)
                close()
                moveTo(16.67f, 17.78f)
                curveToRelative(-0.83f, 0f, -1.51f, -0.68f, -1.51f, -1.51f)
                reflectiveCurveToRelative(0.68f, -1.51f, 1.51f, -1.51f)
                reflectiveCurveToRelative(1.51f, 0.68f, 1.51f, 1.51f)
                reflectiveCurveToRelative(-0.68f, 1.51f, -1.51f, 1.51f)
                close()
                moveTo(18.18f, 12.42f)
                curveToRelative(-0.84f, 0f, -1.51f, -0.68f, -1.51f, -1.51f)
                reflectiveCurveToRelative(0.68f, -1.51f, 1.51f, -1.51f)
                reflectiveCurveToRelative(1.51f, 0.68f, 1.51f, 1.51f)
                reflectiveCurveToRelative(-0.68f, 1.51f, -1.51f, 1.51f)
                close()
            }
        }.also { _EggFried = it}
