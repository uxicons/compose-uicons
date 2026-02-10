package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsbPendrive: ImageVector? = null

val Icons.Br.UsbPendrive: ImageVector
    get() = _UsbPendrive ?: UXIcon(name = "UsbPendrive") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19f, 8.76f)
            verticalLineTo(4.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 0f)
            horizontalLineToRelative(-5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 4.5f)
            verticalLineTo(8.76f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12.5f)
            verticalLineTo(15f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 0f)
            verticalLineTo(12.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 8.76f)
            close()
            moveTo(8f, 4.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 3f)
            horizontalLineToRelative(5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 4.5f)
            verticalLineTo(8f)
            horizontalLineTo(14f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
            horizontalLineTo(8f)
            close()
            moveTo(18f, 15f)
            arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15f)
            verticalLineTo(12.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 11f)
            horizontalLineToRelative(9f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12.5f)
            close()
        }
    }.also { _UsbPendrive = it }
