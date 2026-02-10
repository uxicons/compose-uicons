package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lead: ImageVector? = null

val Icons.Bs.Lead: ImageVector
    get() = _Lead ?: UXIcon(name = "Lead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                reflectiveCurveTo(2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(8f, 3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                close()
                moveTo(21f, 19f)
                horizontalLineToRelative(2.91f)
                curveToRelative(-0.42f, 2.51f, -2.4f, 4.49f, -4.91f, 4.91f)
                verticalLineToRelative(-2.91f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.91f)
                curveToRelative(-2.51f, -0.42f, -4.49f, -2.4f, -4.91f, -4.91f)
                horizontalLineToRelative(2.91f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.91f)
                curveToRelative(0.42f, -2.51f, 2.4f, -4.49f, 4.91f, -4.91f)
                verticalLineToRelative(2.91f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.91f)
                curveToRelative(2.51f, 0.42f, 4.49f, 2.4f, 4.91f, 4.91f)
                horizontalLineToRelative(-2.91f)
                verticalLineToRelative(2f)
                close()
                moveTo(11f, 14f)
                curveToRelative(0.03f, 0f, 0.05f, 0.01f, 0.07f, 0.01f)
                curveToRelative(-0.52f, 0.9f, -0.87f, 1.91f, -1.0f, 2.99f)
                horizontalLineToRelative(-5.07f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _Lead = it}
