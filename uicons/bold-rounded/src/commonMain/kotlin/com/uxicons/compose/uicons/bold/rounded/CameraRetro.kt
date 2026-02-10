package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraRetro: ImageVector? = null

val Icons.Br.CameraRetro: ImageVector
    get() = _CameraRetro ?: UXIcon(name = "CameraRetro") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            horizontalLineToRelative(-4.67f)
            curveToRelative(-0.94f, 0f, -1.81f, 0.36f, -2.48f, 1.02f)
            lineToRelative(-1.83f, 1.83f)
            curveToRelative(-0.1f, 0.1f, -0.22f, 0.15f, -0.35f, 0.15f)
            horizontalLineToRelative(-2.17f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.71f)
            curveTo(1.7f, 3.87f, 0f, 5.99f, 0f, 8.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(5.5f, 6f)
            horizontalLineToRelative(3.67f)
            curveToRelative(0.94f, 0f, 1.81f, -0.36f, 2.48f, -1.02f)
            lineToRelative(1.83f, -1.83f)
            curveToRelative(0.1f, -0.1f, 0.22f, -0.15f, 0.35f, -0.15f)
            horizontalLineToRelative(4.67f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(6.5f)
            horizontalLineToRelative(-3.71f)
            curveToRelative(-0.66f, -2.31f, -2.77f, -4f, -5.29f, -4f)
            reflectiveCurveToRelative(-4.63f, 1.7f, -5.29f, 4f)
            horizontalLineToRelative(-3.71f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(14.5f, 13.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(18.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-3.5f)
            horizontalLineToRelative(3.71f)
            curveToRelative(0.66f, 2.31f, 2.77f, 4f, 5.29f, 4f)
            reflectiveCurveToRelative(4.63f, -1.7f, 5.29f, -4f)
            horizontalLineToRelative(3.71f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _CameraRetro = it }
