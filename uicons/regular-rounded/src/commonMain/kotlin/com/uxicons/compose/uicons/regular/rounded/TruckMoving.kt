package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckMoving: ImageVector? = null

val Icons.Rr.TruckMoving: ImageVector
    get() = _TruckMoving ?: UXIcon(name = "TruckMoving") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.64f, 10.76f)
                lineTo(22.63f, 7.74f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.84f, 5f)
                lineTo(16.9f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1f)
                lineTo(5f, 1f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                lineTo(0f, 19.5f)
                arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 2.45f)
                arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19.5f)
                lineTo(12f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                lineTo(22f, 18.46f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 15f)
                lineTo(24f, 12.97f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.64f, 10.76f)
                close()
                moveTo(20.73f, 8.37f)
                lineTo(21.61f, 11f)
                lineTo(17f, 11f)
                lineTo(17f, 7f)
                horizontalLineToRelative(1.84f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.73f, 8.37f)
                close()
                moveTo(2f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineToRelative(7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                lineTo(15f, 17f)
                lineTo(2f, 17f)
                close()
                moveTo(3.5f, 21f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19.5f)
                lineTo(2f, 19f)
                lineTo(5f, 19f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 21f)
                close()
                moveTo(10f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(7f, 19f)
                horizontalLineToRelative(3f)
                close()
                moveTo(20f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                lineTo(17f, 19f)
                horizontalLineToRelative(3f)
                close()
                moveTo(20f, 17f)
                lineTo(17f, 17f)
                lineTo(17f, 13f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 17f)
                close()
            }
        }.also { _TruckMoving = it}
