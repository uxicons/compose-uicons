package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Devices: ImageVector? = null

val Icons.Sr.Devices: ImageVector
    get() = _Devices ?: UXIcon(name = "Devices") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(5f, 1f)
                curveTo(2.24f, 1f, 0f, 3.24f, 0f, 6f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(12f, 13f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                horizontalLineToRelative(3f)
                close()
                moveTo(20f, 9f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
            }
        }.also { _Devices = it}
