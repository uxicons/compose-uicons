package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Devices: ImageVector? = null

val Icons.Rs.Devices: ImageVector
    get() = _Devices ?: UXIcon(name = "Devices") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 16f)
                lineTo(12f, 16f)
                verticalLineToRelative(6f)
                lineTo(6f, 22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                lineTo(0f, 18f)
                lineTo(0f, 4f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                lineTo(19f, 1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(12f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(12f)
                lineTo(14f, 24f)
                lineTo(14f, 12f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(6f)
                lineTo(22f, 12f)
                close()
            }
        }.also { _Devices = it}
