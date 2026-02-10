package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lead: ImageVector? = null

val Icons.Ss.Lead: ImageVector
    get() = _Lead ?: UXIcon(name = "Lead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(21f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.91f)
                curveToRelative(-0.42f, -2.51f, -2.4f, -4.49f, -4.91f, -4.91f)
                verticalLineToRelative(2.91f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.91f)
                curveToRelative(-2.51f, 0.42f, -4.49f, 2.4f, -4.91f, 4.91f)
                horizontalLineToRelative(2.91f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.91f)
                curveToRelative(0.42f, 2.51f, 2.4f, 4.49f, 4.91f, 4.91f)
                verticalLineToRelative(-2.91f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.91f)
                curveToRelative(2.51f, -0.42f, 4.49f, -2.4f, 4.91f, -4.91f)
                horizontalLineToRelative(-2.91f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, -1.46f, 0.4f, -2.82f, 1.08f, -4f)
                horizontalLineToRelative(-6.08f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(12.72f)
                curveToRelative(-1.67f, -1.47f, -2.72f, -3.61f, -2.72f, -6f)
                close()
            }
        }.also { _Lead = it}
