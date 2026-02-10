package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsbPendrive: ImageVector? = null

val Icons.Ss.UsbPendrive: ImageVector
    get() = _UsbPendrive ?: UXIcon(name = "UsbPendrive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 9f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 0f)
                lineTo(6f, 0f)
                lineTo(6f, 7f)
                lineTo(18f, 7f)
                close()
                moveTo(11f, 5f)
                lineTo(9f, 5f)
                lineTo(9f, 3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(15f, 5f)
                lineTo(13f, 5f)
                lineTo(13f, 3f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _UsbPendrive = it}
