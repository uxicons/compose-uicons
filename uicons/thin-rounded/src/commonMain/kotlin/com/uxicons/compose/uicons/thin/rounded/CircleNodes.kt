package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleNodes: ImageVector? = null

val Icons.Tr.CircleNodes: ImageVector
    get() = _CircleNodes ?: UXIcon(name = "CircleNodes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 0.24f, 0.03f, 0.47f, 0.07f, 0.7f)
                lineTo(7.63f, 7.34f)
                curveToRelative(-0.63f, -1.38f, -2.02f, -2.34f, -3.63f, -2.34f)
                curveTo(1.79f, 5f, 0f, 6.79f, 0f, 9f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                curveToRelative(0.98f, 0f, 1.88f, -0.37f, 2.57f, -0.96f)
                lineToRelative(6.17f, 5.66f)
                curveToRelative(-0.46f, 0.65f, -0.74f, 1.45f, -0.74f, 2.31f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -1.7f, -1.06f, -3.14f, -2.56f, -3.72f)
                lineToRelative(2.08f, -8.33f)
                curveToRelative(0.16f, 0.02f, 0.31f, 0.05f, 0.47f, 0.05f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveTo(22.21f, 0f, 20f, 0f)
                close()
                moveTo(4f, 12f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(19f, 20f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(16.47f, 16.05f)
                curveToRelative(-0.16f, -0.02f, -0.31f, -0.05f, -0.47f, -0.05f)
                curveToRelative(-0.98f, 0f, -1.88f, 0.37f, -2.57f, 0.96f)
                lineToRelative(-6.17f, -5.66f)
                curveToRelative(0.46f, -0.65f, 0.74f, -1.45f, 0.74f, -2.31f)
                curveToRelative(0f, -0.24f, -0.03f, -0.47f, -0.07f, -0.7f)
                lineToRelative(8.44f, -2.64f)
                curveToRelative(0.43f, 0.94f, 1.22f, 1.68f, 2.18f, 2.06f)
                lineToRelative(-2.08f, 8.33f)
                close()
                moveTo(20f, 7f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _CircleNodes = it}
