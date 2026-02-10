package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SurveillanceCamera: ImageVector? = null

val Icons.Sr.SurveillanceCamera: ImageVector
    get() = _SurveillanceCamera ?: UXIcon(name = "SurveillanceCamera") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 3f)
                horizontalLineToRelative(-0.38f)
                lineToRelative(0.78f, -1.55f)
                curveToRelative(0.15f, -0.31f, 0.14f, -0.68f, -0.04f, -0.97f)
                reflectiveCurveToRelative(-0.5f, -0.47f, -0.85f, -0.47f)
                lineTo(5.5f, -0.0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(4.56f)
                lineToRelative(-1.52f, 4.05f)
                curveToRelative(-0.44f, 1.17f, -1.56f, 1.95f, -2.81f, 1.95f)
                lineTo(2f, 16.0f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.73f)
                curveToRelative(2.08f, 0f, 3.95f, -1.29f, 4.68f, -3.24f)
                lineToRelative(1.78f, -4.76f)
                horizontalLineToRelative(5.81f)
                curveToRelative(1.3f, 0f, 2.4f, -0.84f, 2.82f, -2f)
                horizontalLineToRelative(1.18f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(23.82f, 18.89f)
                curveToRelative(0.24f, 0.38f, 0.24f, 0.84f, 0f, 1.22f)
                curveToRelative(-0.91f, 1.43f, -3.03f, 3.89f, -6.82f, 3.89f)
                reflectiveCurveToRelative(-5.91f, -2.46f, -6.82f, -3.89f)
                curveToRelative(-0.24f, -0.38f, -0.24f, -0.84f, 0f, -1.22f)
                curveToRelative(0.91f, -1.43f, 3.03f, -3.89f, 6.82f, -3.89f)
                reflectiveCurveToRelative(5.91f, 2.46f, 6.82f, 3.89f)
                close()
                moveTo(19f, 19.5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _SurveillanceCamera = it}
