package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VectorPolygon: ImageVector? = null

val Icons.Br.VectorPolygon: ImageVector
    get() = _VectorPolygon ?: UXIcon(name = "VectorPolygon") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.3f, 6f)
            horizontalLineToRelative(1.71f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            lineTo(6f, 2f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-2f)
            curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            verticalLineToRelative(12f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            horizontalLineToRelative(12f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-1.71f)
            lineToRelative(-4.29f, -4.87f)
            verticalLineToRelative(-2.27f)
            lineToRelative(4.29f, -4.87f)
            close()
            moveTo(5.73f, 19f)
            curveToRelative(-0.18f, -0.3f, -0.43f, -0.56f, -0.73f, -0.73f)
            lineTo(5f, 5.73f)
            curveToRelative(0.3f, -0.18f, 0.56f, -0.43f, 0.73f, -0.73f)
            horizontalLineToRelative(11.44f)
            lineToRelative(-3.53f, 4f)
            horizontalLineToRelative(-1.65f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(1.65f)
            lineToRelative(3.53f, 4f)
            lineTo(5.73f, 19f)
            close()
            moveTo(16.0f, 13.13f)
            reflectiveCurveToRelative(0f, -0.0f, 0f, 0f)
            horizontalLineToRelative(0f)
            close()
            moveTo(16.0f, 10.87f)
            horizontalLineToRelative(0f)
            reflectiveCurveToRelative(0f, 0.0f, 0f, 0f)
            close()
        }
    }.also { _VectorPolygon = it }
