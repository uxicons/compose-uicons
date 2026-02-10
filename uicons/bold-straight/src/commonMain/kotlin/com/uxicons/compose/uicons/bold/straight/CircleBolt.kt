package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBolt: ImageVector? = null

val Icons.Bs.CircleBolt: ImageVector
    get() = _CircleBolt ?: UXIcon(name = "CircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 3f)
                curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                reflectiveCurveTo(16.96f, 3f, 12f, 3f)
                close()
                moveTo(15.7f, 13.68f)
                curveToRelative(0.38f, -0.63f, 0.4f, -1.42f, 0.05f, -2.07f)
                curveToRelative(-0.37f, -0.68f, -1.08f, -1.11f, -1.85f, -1.11f)
                horizontalLineToRelative(-2.31f)
                lineToRelative(2.24f, -4.31f)
                lineToRelative(-2.66f, -1.39f)
                lineToRelative(-3.08f, 5.96f)
                curveToRelative(-0.19f, 0.64f, -0.07f, 1.34f, 0.33f, 1.87f)
                curveToRelative(0.4f, 0.54f, 1.03f, 0.85f, 1.7f, 0.85f)
                horizontalLineToRelative(2.3f)
                lineToRelative(-2.24f, 4.31f)
                lineToRelative(2.66f, 1.39f)
                lineToRelative(2.87f, -5.51f)
                close()
            }
        }.also { _CircleBolt = it}
