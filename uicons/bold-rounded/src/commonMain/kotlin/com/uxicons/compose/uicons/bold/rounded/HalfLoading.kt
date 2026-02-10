package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HalfLoading: ImageVector? = null

val Icons.Br.HalfLoading: ImageVector
    get() = _HalfLoading ?: UXIcon(name = "HalfLoading") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13.5f, 1.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(12f, 19f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(22.5f, 10.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(15.43f, 5.9f)
            curveToRelative(0.71f, 0.4f, 1.63f, 0.16f, 2.04f, -0.57f)
            lineToRelative(0.98f, -1.74f)
            curveToRelative(0.41f, -0.72f, 0.15f, -1.64f, -0.57f, -2.04f)
            curveToRelative(-0.72f, -0.4f, -1.64f, -0.15f, -2.04f, 0.57f)
            lineToRelative(-0.98f, 1.74f)
            curveToRelative(-0.41f, 0.72f, -0.15f, 1.64f, 0.57f, 2.04f)
            close()
            moveTo(21.89f, 15.84f)
            lineTo(20.14f, 14.86f)
            curveToRelative(-0.72f, -0.4f, -1.64f, -0.15f, -2.04f, 0.57f)
            reflectiveCurveToRelative(-0.15f, 1.64f, 0.57f, 2.04f)
            lineToRelative(1.74f, 0.98f)
            curveToRelative(0.71f, 0.4f, 1.63f, 0.16f, 2.04f, -0.57f)
            curveToRelative(0.41f, -0.72f, 0.15f, -1.64f, -0.57f, -2.04f)
            close()
            moveTo(17.48f, 18.67f)
            curveToRelative(-0.41f, -0.72f, -1.32f, -0.98f, -2.04f, -0.57f)
            reflectiveCurveToRelative(-0.98f, 1.32f, -0.57f, 2.04f)
            lineToRelative(0.98f, 1.74f)
            curveToRelative(0.41f, 0.73f, 1.33f, 0.97f, 2.04f, 0.57f)
            curveToRelative(0.72f, -0.41f, 0.98f, -1.32f, 0.57f, -2.04f)
            close()
            moveTo(18.1f, 8.57f)
            curveToRelative(0.41f, 0.73f, 1.33f, 0.97f, 2.04f, 0.57f)
            lineToRelative(1.74f, -0.98f)
            curveToRelative(0.72f, -0.41f, 0.98f, -1.32f, 0.57f, -2.04f)
            curveToRelative(-0.41f, -0.72f, -1.32f, -0.98f, -2.04f, -0.57f)
            lineToRelative(-1.74f, 0.98f)
            curveToRelative(-0.72f, 0.41f, -0.98f, 1.32f, -0.57f, 2.04f)
            close()
        }
    }.also { _HalfLoading = it }
