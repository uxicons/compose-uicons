package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleNodes: ImageVector? = null

val Icons.Ss.CircleNodes: ImageVector
    get() = _CircleNodes ?: UXIcon(name = "CircleNodes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 0.07f, 0.02f, 0.13f, 0.02f, 0.2f)
                lineTo(7.39f, 6.89f)
                curveToRelative(-0.71f, -1.13f, -1.96f, -1.89f, -3.39f, -1.89f)
                curveTo(1.79f, 5f, 0f, 6.79f, 0f, 9f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                curveToRelative(0.8f, 0f, 1.55f, -0.24f, 2.17f, -0.65f)
                lineToRelative(6.31f, 5.78f)
                curveToRelative(-0.3f, 0.56f, -0.48f, 1.19f, -0.48f, 1.87f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.51f, -0.85f, -2.82f, -2.1f, -3.5f)
                lineToRelative(2.13f, -8.51f)
                curveToRelative(2.19f, -0.02f, 3.97f, -1.8f, 3.97f, -4.0f)
                close()
                moveTo(16.61f, 6.11f)
                curveToRelative(0.36f, 0.58f, 0.88f, 1.06f, 1.48f, 1.39f)
                lineToRelative(-2.13f, 8.51f)
                curveToRelative(-0.79f, 0.01f, -1.52f, 0.24f, -2.14f, 0.65f)
                lineToRelative(-6.31f, -5.78f)
                curveToRelative(0.3f, -0.56f, 0.48f, -1.19f, 0.48f, -1.87f)
                curveToRelative(0f, -0.07f, -0.02f, -0.13f, -0.02f, -0.2f)
                lineToRelative(8.63f, -2.7f)
                close()
            }
        }.also { _CircleNodes = it}
