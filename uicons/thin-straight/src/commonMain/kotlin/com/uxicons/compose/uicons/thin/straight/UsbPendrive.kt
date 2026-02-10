package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsbPendrive: ImageVector? = null

val Icons.Ts.UsbPendrive: ImageVector
    get() = _UsbPendrive ?: UXIcon(name = "UsbPendrive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8.05f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                lineTo(5f, 8.05f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                close()
                moveTo(18f, 1f)
                verticalLineToRelative(7f)
                lineTo(6f, 8f)
                lineTo(6f, 1f)
                horizontalLineToRelative(12f)
                close()
                moveTo(20f, 15f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(10f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                close()
                moveTo(15f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _UsbPendrive = it}
