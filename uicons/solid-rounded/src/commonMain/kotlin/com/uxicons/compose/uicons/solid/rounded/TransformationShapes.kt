package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationShapes: ImageVector? = null

val Icons.Sr.TransformationShapes: ImageVector
    get() = _TransformationShapes ?: UXIcon(name = "TransformationShapes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 0f)
                curveTo(2.92f, 0f, 0f, 2.92f, 0f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveTo(10.08f, 0f, 6.5f, 0f)
                close()
                moveTo(20f, 12f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(8.43f, 18.61f)
                curveToRelative(0.76f, 0.76f, 0.76f, 2.02f, -0.01f, 2.8f)
                lineToRelative(-2.2f, 2.29f)
                curveToRelative(-0.2f, 0.2f, -0.46f, 0.31f, -0.72f, 0.31f)
                curveToRelative(-0.25f, 0f, -0.5f, -0.09f, -0.69f, -0.28f)
                curveToRelative(-0.4f, -0.38f, -0.41f, -1.02f, -0.03f, -1.41f)
                lineToRelative(1.26f, -1.31f)
                horizontalLineToRelative(-2.04f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2.03f)
                lineToRelative(-1.25f, -1.31f)
                curveToRelative(-0.38f, -0.4f, -0.37f, -1.03f, 0.03f, -1.41f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
                lineToRelative(2.21f, 2.3f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-2.03f)
                lineToRelative(1.25f, 1.31f)
                curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.03f, 1.41f)
                curveToRelative(-0.19f, 0.19f, -0.44f, 0.28f, -0.69f, 0.28f)
                curveToRelative(-0.26f, 0f, -0.52f, -0.1f, -0.72f, -0.31f)
                lineToRelative(-2.21f, -2.3f)
                curveToRelative(-0.76f, -0.76f, -0.76f, -2.02f, 0.01f, -2.8f)
                lineToRelative(2.2f, -2.29f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.41f, 1.41f, -0.03f)
                curveToRelative(0.4f, 0.38f, 0.41f, 1.02f, 0.03f, 1.41f)
                lineToRelative(-1.26f, 1.31f)
                horizontalLineToRelative(2.04f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
            }
        }.also { _TransformationShapes = it}
