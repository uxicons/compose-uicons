package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TriangleWarning: ImageVector? = null

val Icons.Br.TriangleWarning: ImageVector
    get() = _TriangleWarning ?: UXIcon(name = "TriangleWarning") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 10.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(12f, 19f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(23.05f, 14.81f)
            lineTo(15.31f, 2.73f)
            curveToRelative(-0.75f, -1.08f, -1.99f, -1.73f, -3.31f, -1.73f)
            reflectiveCurveToRelative(-2.56f, 0.65f, -3.34f, 1.78f)
            lineTo(0.99f, 14.76f)
            curveToRelative(-1.09f, 1.56f, -1.29f, 3.45f, -0.52f, 4.92f)
            curveToRelative(0.77f, 1.48f, 2.34f, 2.32f, 4.32f, 2.32f)
            horizontalLineToRelative(1.72f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.72f)
            curveToRelative(-0.48f, 0f, -1.33f, -0.09f, -1.66f, -0.71f)
            curveToRelative(-0.25f, -0.48f, -0.13f, -1.17f, 0.35f, -1.87f)
            lineTo(11.15f, 4.44f)
            curveToRelative(0.28f, -0.4f, 0.69f, -0.44f, 0.85f, -0.44f)
            reflectiveCurveToRelative(0.57f, 0.04f, 0.82f, 0.39f)
            lineToRelative(7.74f, 12.08f)
            curveToRelative(0.45f, 0.64f, 0.57f, 1.34f, 0.32f, 1.82f)
            curveToRelative(-0.32f, 0.62f, -1.18f, 0.71f, -1.66f, 0.71f)
            horizontalLineToRelative(-1.72f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.72f)
            curveToRelative(1.97f, 0f, 3.55f, -0.85f, 4.32f, -2.32f)
            curveToRelative(0.77f, -1.47f, 0.57f, -3.36f, -0.48f, -4.87f)
            close()
        }
    }.also { _TriangleWarning = it }
