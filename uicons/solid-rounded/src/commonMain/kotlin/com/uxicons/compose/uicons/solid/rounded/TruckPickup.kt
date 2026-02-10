package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckPickup: ImageVector? = null

val Icons.Sr.TruckPickup: ImageVector
    get() = _TruckPickup ?: UXIcon(name = "TruckPickup") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18f)
                lineTo(2f, 18f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                lineTo(0f, 15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                lineTo(20f, 11f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                verticalLineToRelative(1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 18f)
                close()
                moveTo(3.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(16.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(19.82f, 9f)
                lineTo(16.44f, 4.14f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.34f, 2f)
                lineTo(11.5f, 2f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 4.5f)
                lineTo(9f, 9f)
                close()
            }
        }.also { _TruckPickup = it}
