package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhone: ImageVector? = null

val Icons.Bs.CirclePhone: ImageVector
    get() = _CirclePhone ?: UXIcon(name = "CirclePhone") {
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
                moveTo(15.29f, 13.12f)
                lineToRelative(-1.77f, 1.77f)
                curveToRelative(-2.03f, -0.77f, -3.52f, -2.21f, -4.4f, -4.4f)
                lineToRelative(1.77f, -1.77f)
                lineToRelative(-2.71f, -2.71f)
                lineToRelative(-1.38f, 1.38f)
                curveToRelative(-0.54f, 0.54f, -0.8f, 1.25f, -0.8f, 1.96f)
                curveToRelative(0f, 3.91f, 5.03f, 8.67f, 8.67f, 8.67f)
                curveToRelative(0.71f, 0f, 1.42f, -0.26f, 1.96f, -0.8f)
                lineToRelative(1.38f, -1.38f)
                lineToRelative(-2.71f, -2.71f)
                close()
            }
        }.also { _CirclePhone = it}
