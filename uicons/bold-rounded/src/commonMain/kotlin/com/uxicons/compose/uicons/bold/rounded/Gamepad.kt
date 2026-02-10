package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gamepad: ImageVector? = null

val Icons.Br.Gamepad: ImageVector
    get() = _Gamepad ?: UXIcon(name = "Gamepad") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.7f, 3f)
            horizontalLineTo(6.3f)
            curveTo(4.4f, 3f, 2.7f, 4f, 1.7f, 5.7f)
            curveTo(0.6f, 7.6f, 0f, 9.8f, 0f, 12f)
            curveToRelative(0f, 4.9f, 2f, 10f, 5.3f, 10f)
            curveToRelative(1.8f, 0f, 3.3f, -1.4f, 4f, -3.7f)
            curveTo(9.4f, 18.1f, 9.5f, 18f, 9.7f, 18f)
            horizontalLineToRelative(4.6f)
            curveToRelative(0.2f, 0f, 0.4f, 0.1f, 0.4f, 0.3f)
            curveToRelative(1f, 3.2f, 2.9f, 3.7f, 3.9f, 3.7f)
            curveTo(22f, 22f, 24f, 16.9f, 24f, 12f)
            curveToRelative(0f, -2.2f, -0.6f, -4.4f, -1.7f, -6.4f)
            curveTo(21.4f, 4f, 19.6f, 3f, 17.7f, 3f)
            close()
            moveTo(18.7f, 19f)
            curveToRelative(-0.3f, 0f, -0.7f, -0.5f, -1f, -1.6f)
            curveTo(17.2f, 16f, 15.9f, 15f, 14.4f, 15f)
            horizontalLineTo(9.7f)
            curveToRelative(-1.5f, 0f, -2.8f, 1f, -3.3f, 2.4f)
            curveToRelative(-0.3f, 1f, -0.8f, 1.6f, -1.1f, 1.6f)
            curveTo(4.7f, 18.9f, 3f, 16.4f, 3f, 12f)
            curveToRelative(0f, -1.7f, 0.5f, -3.4f, 1.3f, -4.9f)
            curveTo(4.7f, 6.4f, 5.5f, 6f, 6.3f, 6f)
            horizontalLineToRelative(11.4f)
            curveToRelative(0.8f, 0f, 1.6f, 0.4f, 2f, 1.1f)
            curveTo(20.6f, 8.6f, 21f, 10.3f, 21f, 12f)
            curveTo(21f, 16.4f, 19.3f, 18.9f, 18.7f, 19f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 9f)
            horizontalLineTo(10f)
            verticalLineTo(8.5f)
            curveTo(10f, 7.7f, 9.3f, 7f, 8.5f, 7f)
            reflectiveCurveTo(7f, 7.7f, 7f, 8.5f)
            verticalLineTo(9f)
            horizontalLineTo(6.5f)
            curveTo(5.7f, 9f, 5f, 9.7f, 5f, 10.5f)
            reflectiveCurveTo(5.7f, 12f, 6.5f, 12f)
            horizontalLineTo(7f)
            verticalLineToRelative(0.5f)
            curveTo(7f, 13.3f, 7.7f, 14f, 8.5f, 14f)
            reflectiveCurveToRelative(1.5f, -0.7f, 1.5f, -1.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.8f, 0f, 1.5f, -0.7f, 1.5f, -1.5f)
            reflectiveCurveTo(11.3f, 9f, 10.5f, 9f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 10f)
            moveToRelative(-2f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
        }
    }.also { _Gamepad = it }
