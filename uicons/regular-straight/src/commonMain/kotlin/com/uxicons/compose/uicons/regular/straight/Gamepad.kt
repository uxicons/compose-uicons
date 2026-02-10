package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gamepad: ImageVector? = null

val Icons.Rs.Gamepad: ImageVector
    get() = _Gamepad ?: UXIcon(name = "Gamepad") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.4f, 3f)
                horizontalLineTo(3.6f)
                lineTo(3.3f, 3.3f)
                curveTo(1.2f, 5.7f, 0f, 8.8f, 0f, 12f)
                curveToRelative(0f, 5.5f, 2.2f, 10f, 5f, 10f)
                curveToRelative(2.2f, 0f, 3.3f, -3.2f, 3.8f, -5f)
                horizontalLineToRelative(6.4f)
                curveToRelative(0.5f, 1.8f, 1.6f, 5f, 3.8f, 5f)
                curveToRelative(2.8f, 0f, 5f, -4.5f, 5f, -10f)
                curveToRelative(0f, -3.2f, -1.2f, -6.3f, -3.3f, -8.7f)
                lineTo(20.4f, 3f)
                close()
                moveTo(19f, 20f)
                curveToRelative(-0.6f, 0f, -1.6f, -2.1f, -2f, -4.2f)
                lineTo(16.8f, 15f)
                horizontalLineTo(7.2f)
                lineTo(7f, 15.8f)
                curveTo(6.6f, 17.9f, 5.6f, 20f, 5f, 20f)
                curveToRelative(-1f, 0f, -3f, -3.1f, -3f, -8f)
                curveToRelative(0f, -2.5f, 0.9f, -5f, 2.5f, -7f)
                horizontalLineToRelative(15.1f)
                curveToRelative(1.6f, 2f, 2.4f, 4.5f, 2.4f, 7f)
                curveTo(22f, 16.9f, 20f, 20f, 19f, 20f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 7f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(-2f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 8.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 11.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
        }.also { _Gamepad = it}
