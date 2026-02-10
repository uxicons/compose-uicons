package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleV: ImageVector? = null

val Icons.Bs.CircleV: ImageVector
    get() = _CircleV ?: UXIcon(name = "CircleV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, -0.5f)
                curveTo(5.38f, -0.5f, 0f, 4.88f, 0f, 11.5f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, -0.5f, 12f, -0.5f)
                close()
                moveTo(12f, 20.5f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 2.5f, 12f, 2.5f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(14.8f, 6.5f)
                horizontalLineToRelative(3.19f)
                lineToRelative(-3f, 9.5f)
                curveToRelative(-0.67f, 1.53f, -1.64f, 2f, -3f, 2f)
                curveToRelative(-1.36f, 0f, -2.33f, -0.47f, -3f, -2f)
                lineToRelative(-3f, -9.5f)
                horizontalLineToRelative(3.19f)
                lineToRelative(2.36f, 8.22f)
                curveToRelative(0.09f, 0.17f, 0.27f, 0.28f, 0.45f, 0.28f)
                curveToRelative(0.17f, -0.0f, 0.36f, -0.1f, 0.45f, -0.28f)
                lineToRelative(2.36f, -8.22f)
                close()
            }
        }.also { _CircleV = it}
