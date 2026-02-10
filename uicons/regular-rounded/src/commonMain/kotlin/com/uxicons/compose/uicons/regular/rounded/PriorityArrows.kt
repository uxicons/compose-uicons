package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PriorityArrows: ImageVector? = null

val Icons.Rr.PriorityArrows: ImageVector
    get() = _PriorityArrows ?: UXIcon(name = "PriorityArrows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                close()
                moveTo(11.5f, 11.05f)
                curveToRelative(-0.27f, 0f, -0.53f, -0.11f, -0.73f, -0.32f)
                lineToRelative(-1.77f, -1.89f)
                verticalLineToRelative(8.16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-8.21f)
                lineToRelative(-1.91f, 1.91f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.56f, -2.56f)
                curveToRelative(0.47f, -0.47f, 1.27f, -0.73f, 1.77f, -0.73f)
                reflectiveCurveToRelative(1.3f, 0.27f, 1.77f, 0.73f)
                lineToRelative(2.46f, 2.64f)
                curveToRelative(0.38f, 0.4f, 0.35f, 1.04f, -0.05f, 1.41f)
                curveToRelative(-0.19f, 0.18f, -0.44f, 0.27f, -0.68f, 0.27f)
                close()
                moveTo(20.33f, 13.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-2.56f, 2.56f)
                curveToRelative(-0.47f, 0.47f, -1.27f, 0.73f, -1.77f, 0.73f)
                reflectiveCurveToRelative(-1.3f, -0.27f, -1.77f, -0.73f)
                lineToRelative(-2.56f, -2.56f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(1.91f, 1.91f)
                lineTo(15.0f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8.21f)
                lineToRelative(1.91f, -1.91f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                close()
            }
        }.also { _PriorityArrows = it}
