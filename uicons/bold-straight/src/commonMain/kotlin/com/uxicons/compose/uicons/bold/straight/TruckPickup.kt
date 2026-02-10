package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckPickup: ImageVector? = null

val Icons.Bs.TruckPickup: ImageVector
    get() = _TruckPickup ?: UXIcon(name = "TruckPickup") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 10f)
                horizontalLineToRelative(-0.22f)
                lineTo(15.75f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.88f, 2f)
                horizontalLineTo(8f)
                verticalLineToRelative(8f)
                horizontalLineTo(0f)
                verticalLineToRelative(9f)
                horizontalLineTo(3.05f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.9f, 0f)
                horizontalLineToRelative(8.1f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.9f, 0f)
                horizontalLineTo(24f)
                close()
                moveTo(11f, 5f)
                horizontalLineToRelative(1.88f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.41f, 0.21f)
                lineTo(16.63f, 10f)
                horizontalLineTo(11f)
                close()
                moveTo(21f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(20.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
            }
        }.also { _TruckPickup = it}
