package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WorkflowAlt: ImageVector? = null

val Icons.Sr.WorkflowAlt: ImageVector
    get() = _WorkflowAlt ?: UXIcon(name = "WorkflowAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 15.12f)
                verticalLineToRelative(-6.36f)
                curveToRelative(0.39f, -0.14f, 0.76f, -0.36f, 1.08f, -0.68f)
                lineToRelative(1.56f, -1.56f)
                curveToRelative(1.15f, -1.15f, 1.15f, -3.01f, 0f, -4.15f)
                lineToRelative(-1.56f, -1.56f)
                curveToRelative(-1.15f, -1.14f, -3.01f, -1.15f, -4.15f, 0f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(-1.56f, 1.56f, -1.56f, 1.56f)
                curveToRelative(-0.31f, 0.31f, -0.53f, 0.68f, -0.68f, 1.08f)
                horizontalLineToRelative(-6.32f)
                curveTo(8.39f, 1.48f, 6.62f, 0f, 4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                curveToRelative(0f, 1.95f, 1.26f, 3.6f, 3f, 4.22f)
                verticalLineToRelative(7.28f)
                horizontalLineToRelative(-0.2f)
                curveToRelative(-1.54f, 0f, -2.8f, 1.26f, -2.8f, 2.8f)
                verticalLineToRelative(2.4f)
                curveToRelative(0f, 1.54f, 1.26f, 2.8f, 2.8f, 2.8f)
                horizontalLineToRelative(2.4f)
                curveToRelative(1.54f, 0f, 2.8f, -1.26f, 2.8f, -2.8f)
                verticalLineToRelative(-2.4f)
                curveToRelative(0f, -1.54f, -1.26f, -2.8f, -2.8f, -2.8f)
                horizontalLineToRelative(-0.2f)
                verticalLineToRelative(-7.05f)
                curveToRelative(1.93f, -0.22f, 3.49f, -1.64f, 3.9f, -3.5f)
                horizontalLineToRelative(6.29f)
                curveToRelative(0.14f, 0.39f, 0.36f, 0.76f, 0.68f, 1.08f)
                lineToRelative(1.56f, 1.56f)
                curveToRelative(0.31f, 0.31f, 0.68f, 0.53f, 1.08f, 0.67f)
                verticalLineToRelative(6.36f)
                curveToRelative(-2f, 0.46f, -3.5f, 2.24f, -3.5f, 4.38f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                curveToRelative(0f, -2.14f, -1.5f, -3.92f, -3.5f, -4.38f)
                close()
            }
        }.also { _WorkflowAlt = it}
