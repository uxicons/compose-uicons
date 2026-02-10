package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConvertShapes: ImageVector? = null

val Icons.Sr.ConvertShapes: ImageVector
    get() = _ConvertShapes ?: UXIcon(name = "ConvertShapes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.37f, 2f)
                horizontalLineToRelative(-2.37f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.65f)
                curveToRelative(-2.8f, 1.62f, -4.71f, 4.52f, -5.0f, 7.75f)
                curveToRelative(-0.05f, 0.52f, -0.48f, 0.91f, -0.99f, 0.91f)
                curveToRelative(-0.55f, -0.05f, -1.05f, -0.54f, -1.0f, -1.09f)
                curveTo(0.33f, 7.28f, 2.36f, 4.0f, 5.37f, 2f)
                close()
                moveTo(7f, 14f)
                lineTo(3f, 14f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(24.0f, 13.09f)
                curveToRelative(0.05f, -0.55f, -0.36f, -1.04f, -0.91f, -1.09f)
                curveToRelative(-0.54f, -0.05f, -1.04f, 0.36f, -1.09f, 0.91f)
                curveToRelative(-0.29f, 3.23f, -2.21f, 6.13f, -5.0f, 7.74f)
                verticalLineToRelative(-2.65f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.37f)
                curveToRelative(3.01f, -2.0f, 5.04f, -5.28f, 5.36f, -8.91f)
                close()
                moveTo(24f, 5.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                close()
            }
        }.also { _ConvertShapes = it}
