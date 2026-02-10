package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PriorityArrow: ImageVector? = null

val Icons.Sr.PriorityArrow: ImageVector
    get() = _PriorityArrow ?: UXIcon(name = "PriorityArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 9f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(22f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(22f, 17f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(16f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveTo(4.04f, 21f, 0f, 16.96f, 0f, 12f)
                reflectiveCurveTo(4.04f, 3f, 9f, 3f)
                horizontalLineToRelative(4.01f)
                lineToRelative(-1.27f, -1.3f)
                curveToRelative(-0.39f, -0.39f, -0.38f, -1.03f, 0.01f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.03f, -0.38f, 1.41f, 0.01f)
                lineToRelative(2.25f, 2.29f)
                curveToRelative(0.77f, 0.77f, 0.77f, 2.04f, -0.01f, 2.82f)
                lineToRelative(-2.24f, 2.29f)
                curveToRelative(-0.2f, 0.2f, -0.46f, 0.3f, -0.71f, 0.3f)
                curveToRelative(-0.25f, 0f, -0.51f, -0.1f, -0.7f, -0.29f)
                curveToRelative(-0.4f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                lineToRelative(1.27f, -1.3f)
                horizontalLineToRelative(-4.02f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _PriorityArrow = it}
