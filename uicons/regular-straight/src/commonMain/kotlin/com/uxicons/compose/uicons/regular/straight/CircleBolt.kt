package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBolt: ImageVector? = null

val Icons.Rs.CircleBolt: ImageVector
    get() = _CircleBolt ?: UXIcon(name = "CircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                close()
                moveTo(15.77f, 13.43f)
                curveToRelative(0.29f, -0.48f, 0.31f, -1.09f, 0.04f, -1.59f)
                curveToRelative(-0.28f, -0.52f, -0.82f, -0.85f, -1.41f, -0.85f)
                horizontalLineToRelative(-4.13f)
                lineToRelative(2.89f, -5.54f)
                lineToRelative(-1.77f, -0.92f)
                lineToRelative(-3.3f, 6.38f)
                curveToRelative(-0.15f, 0.49f, -0.05f, 1.02f, 0.25f, 1.43f)
                reflectiveCurveToRelative(0.79f, 0.65f, 1.3f, 0.65f)
                horizontalLineToRelative(4.13f)
                lineToRelative(-2.81f, 5.46f)
                lineToRelative(1.78f, 0.92f)
                lineToRelative(3.06f, -5.94f)
                close()
            }
        }.also { _CircleBolt = it}
