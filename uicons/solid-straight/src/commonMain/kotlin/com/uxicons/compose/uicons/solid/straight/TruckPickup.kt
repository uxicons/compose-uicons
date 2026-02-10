package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckPickup: ImageVector? = null

val Icons.Ss.TruckPickup: ImageVector
    get() = _TruckPickup ?: UXIcon(name = "TruckPickup") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 18f)
                lineTo(0f, 18f)
                lineTo(0f, 11f)
                lineTo(21f, 11f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(6.94f, 20f)
                curveToRelative(0.59f, 3.95f, -5.47f, 3.95f, -4.88f, 0f)
                close()
                moveTo(17.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(19.82f, 9f)
                lineTo(15.84f, 3.29f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.38f, 2f)
                lineTo(9f, 2f)
                lineTo(9f, 9f)
                close()
            }
        }.also { _TruckPickup = it}
