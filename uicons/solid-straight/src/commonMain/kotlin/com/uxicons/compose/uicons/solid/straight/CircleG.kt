package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleG: ImageVector? = null

val Icons.Ss.CircleG: ImageVector
    get() = _CircleG ?: UXIcon(name = "CircleG") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(17f, 13.25f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                curveToRelative(1.78f, 0f, 3.44f, 0.96f, 4.33f, 2.5f)
                lineToRelative(-1.73f, 1.0f)
                curveToRelative(-0.54f, -0.93f, -1.53f, -1.5f, -2.6f, -1.5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                curveToRelative(1.4f, 0f, 2.57f, -0.96f, 2.9f, -2.25f)
                horizontalLineToRelative(-2.9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1.25f)
                close()
            }
        }.also { _CircleG = it}
