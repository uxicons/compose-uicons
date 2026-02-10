package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonDivide: ImageVector? = null

val Icons.Br.HexagonDivide: ImageVector
    get() = _HexagonDivide ?: UXIcon(name = "HexagonDivide") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.07f, 9.4f)
            lineToRelative(-2.95f, -5.5f)
            curveToRelative(-0.96f, -1.79f, -2.82f, -2.9f, -4.85f, -2.9f)
            horizontalLineToRelative(-6.53f)
            curveToRelative(-2.02f, 0f, -3.88f, 1.11f, -4.84f, 2.89f)
            lineTo(0.93f, 9.39f)
            curveToRelative(-0.88f, 1.64f, -0.88f, 3.59f, 0.0f, 5.22f)
            lineToRelative(2.96f, 5.5f)
            curveToRelative(0.96f, 1.78f, 2.82f, 2.89f, 4.84f, 2.89f)
            horizontalLineToRelative(6.53f)
            curveToRelative(2.03f, 0f, 3.89f, -1.11f, 4.85f, -2.9f)
            curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
            lineToRelative(2.95f, -5.5f)
            curveToRelative(0.87f, -1.63f, 0.87f, -3.57f, 0f, -5.2f)
            close()
            moveTo(20.43f, 13.18f)
            lineToRelative(-2.95f, 5.5f)
            curveToRelative(-0.44f, 0.81f, -1.28f, 1.32f, -2.2f, 1.32f)
            horizontalLineToRelative(-6.53f)
            curveToRelative(-0.92f, 0f, -1.76f, -0.5f, -2.2f, -1.31f)
            lineToRelative(-2.96f, -5.5f)
            curveToRelative(-0.4f, -0.74f, -0.4f, -1.63f, 0f, -2.37f)
            lineToRelative(2.97f, -5.5f)
            curveToRelative(0.44f, -0.81f, 1.28f, -1.31f, 2.2f, -1.31f)
            horizontalLineToRelative(6.53f)
            curveToRelative(0.92f, 0f, 1.77f, 0.51f, 2.2f, 1.32f)
            lineToRelative(2.95f, 5.5f)
            curveToRelative(0.4f, 0.74f, 0.4f, 1.62f, 0f, 2.36f)
            close()
            moveTo(17.0f, 12f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(10.5f, 7.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(13.5f, 16.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _HexagonDivide = it }
