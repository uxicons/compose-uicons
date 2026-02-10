package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Devices: ImageVector? = null

val Icons.Bs.Devices: ImageVector
    get() = _Devices ?: UXIcon(name = "Devices") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 15f)
                lineTo(12f, 15f)
                verticalLineToRelative(8f)
                lineTo(6f, 23f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                lineTo(0f, 18f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.57f, 1.57f, 1f, 3.5f, 1f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(3f, 15f)
                close()
                moveTo(24f, 12.5f)
                verticalLineToRelative(11.5f)
                lineTo(14f, 24f)
                lineTo(14f, 12.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 12.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(4f)
                lineTo(21f, 12.5f)
                close()
            }
        }.also { _Devices = it}
