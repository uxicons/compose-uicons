package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryEmpty: ImageVector? = null

val Icons.Ts.BatteryEmpty: ImageVector
    get() = _BatteryEmpty ?: UXIcon(name = "BatteryEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 20f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(19.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(1f, 19f)
                horizontalLineTo(19.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(1f)
                verticalLineToRelative(14f)
                close()
            }
        }.also { _BatteryEmpty = it}
