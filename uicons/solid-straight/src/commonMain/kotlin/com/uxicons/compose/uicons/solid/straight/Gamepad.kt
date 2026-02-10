package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gamepad: ImageVector? = null

val Icons.Ss.Gamepad: ImageVector
    get() = _Gamepad ?: UXIcon(name = "Gamepad") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.7f, 3.3f)
                lineTo(20.4f, 3f)
                horizontalLineTo(3.6f)
                lineTo(3.3f, 3.3f)
                curveTo(1.2f, 5.7f, 0f, 8.8f, 0f, 12f)
                curveToRelative(0f, 5.5f, 2.2f, 10f, 5f, 10f)
                curveToRelative(2.2f, 0f, 3.3f, -3.2f, 3.8f, -5f)
                horizontalLineToRelative(6.4f)
                curveToRelative(0.5f, 1.8f, 1.6f, 5f, 3.8f, 5f)
                curveToRelative(2.8f, 0f, 5f, -4.5f, 5f, -10f)
                curveTo(24f, 8.8f, 22.8f, 5.7f, 20.7f, 3.3f)
                close()
                moveTo(9f, 11f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(11f)
                close()
                moveTo(15.5f, 13f)
                curveToRelative(-0.8f, 0f, -1.5f, -0.7f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.7f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.7f, 1.5f, 1.5f)
                reflectiveCurveTo(16.3f, 13f, 15.5f, 13f)
                close()
                moveTo(18.5f, 10f)
                curveTo(17.7f, 10f, 17f, 9.3f, 17f, 8.5f)
                reflectiveCurveTo(17.7f, 7f, 18.5f, 7f)
                reflectiveCurveTo(20f, 7.7f, 20f, 8.5f)
                reflectiveCurveTo(19.3f, 10f, 18.5f, 10f)
                close()
            }
        }.also { _Gamepad = it}
