package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lead: ImageVector? = null

val Icons.Sr.Lead: ImageVector
    get() = _Lead ?: UXIcon(name = "Lead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(21f, 18f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.91f)
                curveToRelative(-0.42f, -2.51f, -2.4f, -4.49f, -4.91f, -4.91f)
                verticalLineToRelative(1.91f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.91f)
                curveToRelative(-2.51f, 0.42f, -4.49f, 2.4f, -4.91f, 4.91f)
                horizontalLineToRelative(1.91f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.91f)
                curveToRelative(0.42f, 2.51f, 2.4f, 4.49f, 4.91f, 4.91f)
                verticalLineToRelative(-1.91f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.91f)
                curveToRelative(2.51f, -0.42f, 4.49f, -2.4f, 4.91f, -4.91f)
                horizontalLineToRelative(-1.91f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, -1.25f, 0.29f, -2.43f, 0.81f, -3.48f)
                curveToRelative(-0.88f, -0.33f, -1.82f, -0.52f, -2.81f, -0.52f)
                curveTo(3.59f, 14f, 0f, 17.59f, 0f, 22f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11.72f)
                curveToRelative(-1.67f, -1.47f, -2.72f, -3.61f, -2.72f, -6f)
                close()
            }
        }.also { _Lead = it}
