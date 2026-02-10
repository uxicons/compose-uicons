package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckPlow: ImageVector? = null

val Icons.Ss.TruckPlow: ImageVector
    get() = _TruckPlow ?: UXIcon(name = "TruckPlow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.02f, 21.61f)
                lineTo(22.61f, 23.02f)
                lineTo(20f, 20.41f)
                lineTo(20f, 16f)
                lineTo(18f, 16f)
                verticalLineToRelative(2f)
                lineTo(0f, 18f)
                lineTo(0f, 14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                lineTo(15f, 11f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                horizontalLineToRelative(2f)
                lineTo(20f, 9.59f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(1.41f, 1.41f)
                lineTo(22f, 10.41f)
                verticalLineToRelative(9.17f)
                close()
                moveTo(2.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(11.06f, 20f)
                curveToRelative(-0.59f, 3.95f, 5.47f, 3.95f, 4.88f, 0f)
                close()
                moveTo(10.84f, 3.29f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.38f, 2f)
                lineTo(4f, 2f)
                lineTo(4f, 9f)
                lineTo(14.82f, 9f)
                close()
            }
        }.also { _TruckPlow = it}
