package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneProp: ImageVector? = null

val Icons.Sr.PlaneProp: ImageVector
    get() = _PlaneProp ?: UXIcon(name = "PlaneProp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.0f, 9.01f)
                lineToRelative(-5.21f, 0.0f)
                lineToRelative(-0.91f, -4.01f)
                horizontalLineToRelative(1.12f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.47f)
                lineToRelative(-0.35f, -1.24f)
                curveToRelative(-0.17f, -0.8f, -0.74f, -1.49f, -1.53f, -1.69f)
                curveToRelative(-1.4f, -0.35f, -2.65f, 0.7f, -2.65f, 2.04f)
                verticalLineToRelative(0.89f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineTo(4.53f)
                lineToRelative(-1.55f, -2.33f)
                curveToRelative(-0.28f, -0.42f, -0.65f, -0.67f, -1.43f, -0.67f)
                curveToRelative(-0.86f, 0f, -1.55f, 0.69f, -1.55f, 1.55f)
                verticalLineToRelative(8.9f)
                curveToRelative(0f, 0.86f, 0.69f, 1.55f, 1.55f, 1.55f)
                curveToRelative(0.82f, 0f, 1.15f, -0.25f, 1.43f, -0.67f)
                lineToRelative(1.67f, -2.33f)
                horizontalLineToRelative(5.35f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.73f)
                curveToRelative(0f, 0.99f, 0.61f, 1.95f, 1.56f, 2.2f)
                curveToRelative(1.19f, 0.31f, 2.36f, -0.46f, 2.6f, -1.59f)
                lineToRelative(0.36f, -1.34f)
                horizontalLineToRelative(1.47f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.12f)
                lineToRelative(0.92f, -4.01f)
                lineToRelative(5.2f, 0.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.34f, 3.0f, -2.99f)
                reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -2.99f)
                close()
            }
        }.also { _PlaneProp = it}
