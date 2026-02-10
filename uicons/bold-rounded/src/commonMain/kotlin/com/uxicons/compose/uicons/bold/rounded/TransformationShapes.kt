package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationShapes: ImageVector? = null

val Icons.Br.TransformationShapes: ImageVector
    get() = _TransformationShapes ?: UXIcon(name = "TransformationShapes") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(6.5f, 0f)
            curveTo(2.92f, 0f, 0f, 2.92f, 0f, 6.5f)
            reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
            reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
            reflectiveCurveTo(10.08f, 0f, 6.5f, 0f)
            close()
            moveTo(6.5f, 10f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
            close()
            moveTo(24f, 7.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(1.53f)
            curveToRelative(0f, 0.86f, -1.04f, 1.29f, -1.65f, 0.69f)
            lineToRelative(-3.06f, -3.06f)
            curveToRelative(-0.38f, -0.38f, -0.38f, -0.99f, 0f, -1.37f)
            lineToRelative(3.06f, -3.06f)
            curveToRelative(0.61f, -0.61f, 1.65f, -0.18f, 1.65f, 0.69f)
            verticalLineToRelative(1.6f)
            horizontalLineToRelative(0.5f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            close()
            moveTo(20.5f, 12f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(5f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(21f, 20.5f)
            curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            verticalLineToRelative(5f)
            close()
            moveTo(9.72f, 18.78f)
            curveToRelative(0.38f, 0.38f, 0.38f, 0.99f, 0f, 1.37f)
            lineToRelative(-3.06f, 3.06f)
            curveToRelative(-0.61f, 0.61f, -1.65f, 0.18f, -1.65f, -0.69f)
            verticalLineToRelative(-1.53f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(-1.6f)
            curveToRelative(0f, -0.86f, 1.04f, -1.29f, 1.65f, -0.69f)
            lineToRelative(3.06f, 3.06f)
            close()
        }
    }.also { _TransformationShapes = it }
