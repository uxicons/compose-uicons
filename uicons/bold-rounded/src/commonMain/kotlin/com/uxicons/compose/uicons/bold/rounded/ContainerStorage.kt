package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ContainerStorage: ImageVector? = null

val Icons.Br.ContainerStorage: ImageVector
    get() = _ContainerStorage ?: UXIcon(name = "ContainerStorage") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23f, 18.09f)
            lineTo(23f, 5.91f)
            curveToRelative(0.58f, -0.21f, 1f, -0.76f, 1f, -1.41f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(1.5f, 3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.65f, 0.42f, 1.21f, 1f, 1.41f)
            verticalLineToRelative(12.17f)
            curveToRelative(-0.58f, 0.21f, -1f, 0.76f, -1f, 1.41f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -0.65f, -0.42f, -1.21f, -1f, -1.41f)
            close()
            moveTo(20f, 18f)
            lineTo(4f, 18f)
            lineTo(4f, 6f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(12f)
            close()
            moveTo(15f, 14.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(10.5f, 14.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(6f, 14.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
        }
    }.also { _ContainerStorage = it }
