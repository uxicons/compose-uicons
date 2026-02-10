package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseFlood: ImageVector? = null

val Icons.Rs.HouseFlood: ImageVector
    get() = _HouseFlood ?: UXIcon(name = "HouseFlood") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.01f, 22.63f)
                arcTo(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22.62f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.01f, 0.01f)
                lineTo(1.5f, 21.32f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 1.32f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 11.68f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(16.68f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                verticalLineTo(18f)
                horizontalLineToRelative(2f)
                verticalLineTo(16.68f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11.68f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 18f)
                verticalLineTo(11f)
                lineTo(12f, 2f)
                lineToRelative(10f, 9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineTo(10.11f)
                lineTo(13.34f, 0.52f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.68f, 0f)
                lineTo(0f, 10.11f)
                verticalLineTo(18f)
                close()
            }
        }.also { _HouseFlood = it}
