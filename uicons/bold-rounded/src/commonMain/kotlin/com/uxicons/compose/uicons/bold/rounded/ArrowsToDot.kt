package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToDot: ImageVector? = null

val Icons.Br.ArrowsToDot: ImageVector
    get() = _ArrowsToDot ?: UXIcon(name = "ArrowsToDot") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 10f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            close()
            moveTo(12.69f, 15.29f)
            curveToRelative(-0.38f, -0.38f, -1.0f, -0.38f, -1.39f, 0f)
            lineToRelative(-3.17f, 3.17f)
            curveToRelative(-0.57f, 0.57f, -0.17f, 1.54f, 0.64f, 1.54f)
            horizontalLineToRelative(1.72f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(1.72f)
            curveToRelative(0.81f, 0f, 1.21f, -0.97f, 0.64f, -1.54f)
            lineToRelative(-3.17f, -3.17f)
            close()
            moveTo(11.31f, 8.71f)
            curveToRelative(0.38f, 0.38f, 1.0f, 0.38f, 1.39f, 0f)
            lineToRelative(3.17f, -3.17f)
            curveToRelative(0.57f, -0.57f, 0.17f, -1.54f, -0.64f, -1.54f)
            horizontalLineToRelative(-1.72f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(-1.72f)
            curveToRelative(-0.81f, 0f, -1.21f, 0.97f, -0.64f, 1.54f)
            lineToRelative(3.17f, 3.17f)
            close()
            moveTo(22.5f, 10.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-1.72f)
            curveToRelative(0f, -0.81f, -0.97f, -1.21f, -1.54f, -0.64f)
            lineToRelative(-3.17f, 3.17f)
            curveToRelative(-0.38f, 0.38f, -0.38f, 1.0f, 0f, 1.39f)
            lineToRelative(3.17f, 3.17f)
            curveToRelative(0.57f, 0.57f, 1.54f, 0.17f, 1.54f, -0.64f)
            verticalLineToRelative(-1.72f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(8.71f, 11.31f)
            lineTo(5.55f, 8.14f)
            curveToRelative(-0.57f, -0.57f, -1.54f, -0.17f, -1.54f, 0.64f)
            verticalLineToRelative(1.72f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(1.72f)
            curveToRelative(0f, 0.81f, 0.97f, 1.21f, 1.54f, 0.64f)
            lineToRelative(3.17f, -3.17f)
            curveToRelative(0.38f, -0.38f, 0.38f, -1.0f, 0f, -1.39f)
            close()
        }
    }.also { _ArrowsToDot = it }
