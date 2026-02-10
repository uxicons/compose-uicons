package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckPickup: ImageVector? = null

val Icons.Rr.TruckPickup: ImageVector
    get() = _TruckPickup ?: UXIcon(name = "TruckPickup") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.55f, 10.04f)
                lineToRelative(-4.11f, -5.9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.34f, 2f)
                lineTo(12f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5f)
                verticalLineToRelative(5f)
                lineTo(4f, 10f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                lineTo(9f, 18f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                lineTo(22f, 18f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                lineTo(24f, 14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.55f, 10.04f)
                close()
                moveTo(11f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(0.34f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.8f, 5.28f)
                lineTo(18.08f, 10f)
                lineTo(11f, 10f)
                close()
                moveTo(7f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(4f, 18f)
                lineTo(7f, 18f)
                close()
                moveTo(20f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(17f, 18f)
                horizontalLineToRelative(3f)
                close()
                moveTo(22f, 16f)
                lineTo(2f, 16f)
                lineTo(2f, 14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                lineTo(20f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                close()
            }
        }.also { _TruckPickup = it}
