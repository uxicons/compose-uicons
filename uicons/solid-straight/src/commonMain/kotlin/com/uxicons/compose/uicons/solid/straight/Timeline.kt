package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Timeline: ImageVector? = null

val Icons.Ss.Timeline: ImageVector
    get() = _Timeline ?: UXIcon(name = "Timeline") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3.14f)
                curveToRelative(1.72f, -0.45f, 3f, -2.0f, 3f, -3.86f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                verticalLineToRelative(3.14f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-3.14f)
                curveToRelative(1.72f, -0.45f, 3f, -2.0f, 3f, -3.86f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.86f, 1.28f, 3.41f, 3f, 3.86f)
                verticalLineToRelative(3.14f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(3.14f)
                curveToRelative(-1.72f, 0.45f, -3f, 2.0f, -3f, 3.86f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.86f, -1.28f, -3.41f, -3f, -3.86f)
                verticalLineToRelative(-3.14f)
                close()
            }
        }.also { _Timeline = it}
