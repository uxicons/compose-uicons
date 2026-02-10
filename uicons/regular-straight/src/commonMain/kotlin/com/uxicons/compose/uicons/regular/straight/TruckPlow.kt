package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckPlow: ImageVector? = null

val Icons.Rs.TruckPlow: ImageVector
    get() = _TruckPlow ?: UXIcon(name = "TruckPlow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18.59f)
                lineTo(22f, 9.41f)
                lineToRelative(1.96f, -1.96f)
                lineTo(22.54f, 6.04f)
                lineTo(20f, 8.59f)
                lineTo(20f, 13f)
                lineTo(18f, 13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.44f, -2.95f)
                lineTo(10.84f, 3.29f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.38f, 2f)
                lineTo(4f, 2f)
                verticalLineToRelative(8f)
                lineTo(3f, 10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(5f)
                lineTo(1f, 18f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                lineTo(8f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                lineTo(17f, 18f)
                horizontalLineToRelative(1f)
                lineTo(18f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.41f)
                lineToRelative(2.6f, 2.61f)
                lineToRelative(1.42f, -1.42f)
                close()
                moveTo(6f, 4f)
                lineTo(8.38f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.82f, 0.43f)
                lineTo(13.08f, 10f)
                lineTo(6f, 10f)
                close()
                moveTo(2f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(15f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(3f)
                lineTo(2f, 16f)
                close()
                moveTo(6f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(3f, 18f)
                lineTo(6f, 18f)
                close()
                moveTo(15f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(12f, 18f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _TruckPlow = it}
