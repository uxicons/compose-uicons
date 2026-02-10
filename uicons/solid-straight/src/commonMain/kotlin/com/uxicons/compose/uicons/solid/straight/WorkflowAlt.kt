package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WorkflowAlt: ImageVector? = null

val Icons.Ss.WorkflowAlt: ImageVector
    get() = _WorkflowAlt ?: UXIcon(name = "WorkflowAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.59f, 15.12f)
                verticalLineToRelative(-5.21f)
                lineToRelative(4.41f, -4.41f)
                lineTo(18.59f, 0.09f)
                lineToRelative(-3.91f, 3.91f)
                horizontalLineToRelative(-5.64f)
                curveTo(8.78f, 1.76f, 6.9f, 0f, 4.59f, 0f)
                curveTo(2.1f, 0f, 0.09f, 2.02f, 0.09f, 4.5f)
                curveToRelative(0f, 1.95f, 1.26f, 3.6f, 3f, 4.22f)
                verticalLineToRelative(7.28f)
                horizontalLineTo(0.09f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7.05f)
                curveToRelative(1.73f, -0.2f, 3.16f, -1.36f, 3.72f, -2.95f)
                horizontalLineToRelative(4.86f)
                lineToRelative(3.91f, 3.91f)
                verticalLineToRelative(5.21f)
                curveToRelative(-2f, 0.46f, -3.5f, 2.24f, -3.5f, 4.38f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                curveToRelative(0f, -2.14f, -1.5f, -3.92f, -3.5f, -4.38f)
                close()
            }
        }.also { _WorkflowAlt = it}
