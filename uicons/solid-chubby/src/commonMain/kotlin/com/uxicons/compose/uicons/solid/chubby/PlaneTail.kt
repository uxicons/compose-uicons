package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneTail: ImageVector? = null

val Icons.Sc.PlaneTail: ImageVector
    get() = _PlaneTail ?: UXIcon(name = "PlaneTail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 9.5f)
                curveToRelative(-2.72f, 0f, -3f, 0f, -3f, 1.0f)
                verticalLineToRelative(9.99f)
                curveToRelative(0f, 1.0f, 0.28f, 1.0f, 3f, 1.0f)
                curveToRelative(10.84f, 0f, 19f, -3.64f, 19f, -6f)
                reflectiveCurveToRelative(-8.16f, -6f, -19f, -6f)
                close()
                moveTo(12f, 16.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.7f, 10.3f)
                curveToRelative(0.94f, -3.56f, 1.28f, -6.54f, 1.3f, -6.69f)
                curveToRelative(0.03f, -0.28f, -0.06f, -0.56f, -0.25f, -0.78f)
                curveToRelative(-0.19f, -0.21f, -0.46f, -0.33f, -0.74f, -0.33f)
                horizontalLineToRelative(-2.3f)
                curveToRelative(-1.37f, 0f, -2.67f, 0.68f, -3.47f, 1.81f)
                curveToRelative(-1.18f, 1.68f, -2.15f, 2.9f, -2.9f, 3.76f)
                curveToRelative(3.11f, 0.48f, 6.03f, 1.24f, 8.36f, 2.23f)
                close()
            }
        }.also { _PlaneTail = it}
