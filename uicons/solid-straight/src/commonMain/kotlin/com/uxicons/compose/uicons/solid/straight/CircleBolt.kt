package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBolt: ImageVector? = null

val Icons.Ss.CircleBolt: ImageVector
    get() = _CircleBolt ?: UXIcon(name = "CircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(15.77f, 13.43f)
                lineToRelative(-3.06f, 5.94f)
                lineToRelative(-1.78f, -0.92f)
                lineToRelative(2.81f, -5.46f)
                horizontalLineToRelative(-4.13f)
                curveToRelative(-0.51f, 0f, -0.99f, -0.24f, -1.3f, -0.65f)
                reflectiveCurveToRelative(-0.4f, -0.94f, -0.25f, -1.43f)
                lineToRelative(0.07f, -0.17f)
                lineToRelative(3.23f, -6.21f)
                lineToRelative(1.77f, 0.92f)
                lineToRelative(-2.89f, 5.54f)
                horizontalLineToRelative(4.13f)
                curveToRelative(0.59f, 0f, 1.13f, 0.32f, 1.41f, 0.85f)
                curveToRelative(0.27f, 0.5f, 0.25f, 1.1f, -0.04f, 1.59f)
                close()
            }
        }.also { _CircleBolt = it}
