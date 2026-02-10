package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseFlood: ImageVector? = null

val Icons.Bs.HouseFlood: ImageVector
    get() = _HouseFlood ?: UXIcon(name = "HouseFlood") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.59f, 20f)
                horizontalLineTo(19.41f)
                arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.82f, 0f)
                horizontalLineTo(13.41f)
                arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.82f, 0f)
                horizontalLineTo(7.41f)
                arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.82f, 0f)
                horizontalLineTo(1.41f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 21f)
                verticalLineToRelative(3f)
                arcToRelative(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -1.17f)
                arcToRelative(4.43f, 4.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                arcToRelative(4.43f, 4.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                arcToRelative(4.43f, 4.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                arcTo(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                verticalLineTo(21f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.59f, 20f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 17.99f)
                verticalLineTo(12.21f)
                lineToRelative(9f, -9f)
                lineToRelative(9f, 9f)
                verticalLineToRelative(5.78f)
                horizontalLineToRelative(3f)
                verticalLineTo(10.97f)
                lineTo(13.77f, 0.73f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, 0f)
                horizontalLineToRelative(0f)
                lineTo(0f, 10.97f)
                verticalLineToRelative(7.02f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.18f, 13.59f)
                horizontalLineToRelative(-0.36f)
                arcTo(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 17.41f)
                verticalLineToRelative(0.58f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-0.58f)
                arcTo(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.18f, 13.59f)
                close()
            }
        }.also { _HouseFlood = it}
