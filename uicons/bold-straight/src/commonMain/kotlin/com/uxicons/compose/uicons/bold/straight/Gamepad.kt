package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gamepad: ImageVector? = null

val Icons.Bs.Gamepad: ImageVector
    get() = _Gamepad ?: UXIcon(name = "Gamepad") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.3f, 3f)
                horizontalLineTo(3.7f)
                lineTo(3.3f, 3.4f)
                curveTo(1.2f, 5.8f, 0f, 8.8f, 0f, 12f)
                curveToRelative(0f, 4.9f, 2f, 10f, 5.3f, 10f)
                curveToRelative(2.2f, 0f, 3.6f, -2.4f, 4.2f, -4f)
                horizontalLineToRelative(4.9f)
                curveToRelative(0.7f, 1.6f, 2f, 4f, 4.2f, 4f)
                curveTo(22f, 22f, 24f, 16.9f, 24f, 12f)
                curveToRelative(0f, -3.2f, -1.2f, -6.2f, -3.3f, -8.6f)
                lineTo(20.3f, 3f)
                close()
                moveTo(18.7f, 19f)
                curveToRelative(-0.4f, -0.1f, -1.3f, -1.5f, -1.8f, -3f)
                lineToRelative(-0.3f, -1f)
                horizontalLineTo(7.4f)
                lineToRelative(-0.3f, 1f)
                curveToRelative(-0.4f, 1.4f, -1.3f, 2.8f, -1.7f, 3f)
                curveTo(4.7f, 18.9f, 3f, 16.4f, 3f, 12f)
                curveToRelative(0f, -2.2f, 0.7f, -4.3f, 2.1f, -6f)
                horizontalLineTo(19f)
                curveToRelative(1.3f, 1.7f, 2f, 3.8f, 2f, 6f)
                curveTo(21f, 16.4f, 19.3f, 18.9f, 18.7f, 19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 7f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(-2f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, 2f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, -2f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(-2f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
        }.also { _Gamepad = it}
