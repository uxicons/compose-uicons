package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleNodes: ImageVector? = null

val Icons.Bs.CircleNodes: ImageVector
    get() = _CircleNodes ?: UXIcon(name = "CircleNodes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10f)
                curveToRelative(0.02f, 0f, 0.03f, -0.0f, 0.05f, -0.0f)
                lineToRelative(-1.18f, 4.73f)
                curveToRelative(-0.85f, -0.46f, -1.83f, -0.73f, -2.86f, -0.73f)
                curveToRelative(-0.02f, 0f, -0.03f, 0.0f, -0.05f, 0.0f)
                lineToRelative(1.18f, -4.73f)
                curveToRelative(0.85f, 0.47f, 1.83f, 0.73f, 2.86f, 0.73f)
                close()
                moveTo(9.29f, 11.82f)
                curveToRelative(-0.48f, 0.9f, -1.18f, 1.66f, -2.03f, 2.21f)
                lineToRelative(3.44f, 3.15f)
                curveToRelative(0.48f, -0.9f, 1.18f, -1.66f, 2.03f, -2.21f)
                lineToRelative(-3.44f, -3.15f)
                close()
                moveTo(14.91f, 7.16f)
                curveToRelative(-0.52f, -0.84f, -0.84f, -1.82f, -0.9f, -2.86f)
                lineToRelative(-4.92f, 1.54f)
                curveToRelative(0.52f, 0.84f, 0.84f, 1.82f, 0.9f, 2.86f)
                lineToRelative(4.92f, -1.54f)
                close()
                moveTo(20f, 0f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveTo(22.21f, 0f, 20f, 0f)
                close()
                moveTo(16f, 16f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(4f, 5f)
                curveTo(1.79f, 5f, 0f, 6.79f, 0f, 9f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
            }
        }.also { _CircleNodes = it}
