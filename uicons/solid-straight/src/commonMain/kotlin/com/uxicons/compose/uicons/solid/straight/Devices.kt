package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Devices: ImageVector? = null

val Icons.Ss.Devices: ImageVector
    get() = _Devices ?: UXIcon(name = "Devices") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                lineTo(3f, 1f)
                curveTo(1.34f, 1f, 0f, 2.34f, 0f, 4f)
                verticalLineToRelative(14f)
                lineTo(10f, 18f)
                verticalLineToRelative(2f)
                lineTo(6f, 20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                lineTo(12f, 12f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 24f)
                lineTo(14f, 24f)
                lineTo(14f, 12f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(12f)
                close()
            }
        }.also { _Devices = it}
