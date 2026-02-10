package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryEmpty: ImageVector? = null

val Icons.Ss.BatteryEmpty: ImageVector
    get() = _BatteryEmpty ?: UXIcon(name = "BatteryEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineTo(0f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                close()
            }
        }.also { _BatteryEmpty = it}
