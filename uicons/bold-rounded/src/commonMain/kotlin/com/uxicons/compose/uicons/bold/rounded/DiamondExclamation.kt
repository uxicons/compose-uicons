package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondExclamation: ImageVector? = null

val Icons.Br.DiamondExclamation: ImageVector
    get() = _DiamondExclamation ?: UXIcon(name = "DiamondExclamation") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.46f, 8.11f)
            lineTo(15.89f, 1.53f)
            curveToRelative(-2.14f, -2.15f, -5.63f, -2.15f, -7.78f, 0f)
            lineTo(1.54f, 8.11f)
            curveToRelative(-2.14f, 2.15f, -2.14f, 5.63f, 0f, 7.78f)
            horizontalLineToRelative(0f)
            lineToRelative(6.57f, 6.57f)
            curveToRelative(1.07f, 1.07f, 2.48f, 1.61f, 3.89f, 1.61f)
            reflectiveCurveToRelative(2.82f, -0.54f, 3.89f, -1.61f)
            lineToRelative(6.57f, -6.57f)
            curveToRelative(2.14f, -2.15f, 2.14f, -5.63f, 0f, -7.78f)
            close()
            moveTo(20.34f, 13.76f)
            lineToRelative(-6.57f, 6.57f)
            curveToRelative(-0.97f, 0.98f, -2.56f, 0.97f, -3.54f, 0f)
            lineToRelative(-6.57f, -6.57f)
            horizontalLineToRelative(0f)
            curveToRelative(-0.97f, -0.97f, -0.97f, -2.56f, 0f, -3.54f)
            lineToRelative(6.57f, -6.57f)
            curveToRelative(0.97f, -0.97f, 2.56f, -0.97f, 3.54f, 0f)
            lineToRelative(6.57f, 6.57f)
            curveToRelative(0.97f, 0.97f, 0.97f, 2.56f, 0f, 3.54f)
            close()
            moveTo(13.5f, 16.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(13.5f, 7.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _DiamondExclamation = it }
