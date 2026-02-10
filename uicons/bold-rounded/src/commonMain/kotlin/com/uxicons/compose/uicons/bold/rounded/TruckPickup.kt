package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckPickup: ImageVector? = null

val Icons.Br.TruckPickup: ImageVector
    get() = _TruckPickup ?: UXIcon(name = "TruckPickup") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.17f, 10.32f)
            lineTo(17.01f, 4.35f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 2f)
            horizontalLineToRelative(-1f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 5.5f)
            verticalLineTo(10f)
            horizontalLineTo(4.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14.5f)
            verticalLineToRelative(2f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 19f)
            horizontalLineTo(3f)
            verticalLineToRelative(0.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
            verticalLineTo(19f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(0.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
            verticalLineTo(19f)
            horizontalLineToRelative(0.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16.5f)
            verticalLineToRelative(-2f)
            arcTo(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.17f, 10.32f)
            close()
            moveTo(11f, 5.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
            horizontalLineToRelative(1f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.05f, 1.07f)
            lineTo(17.29f, 10f)
            horizontalLineTo(11f)
            close()
            moveTo(21f, 16f)
            horizontalLineTo(3f)
            verticalLineTo(14.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 13f)
            horizontalLineToRelative(15f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 14.5f)
            close()
        }
    }.also { _TruckPickup = it }
