package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBattery: ImageVector? = null

val Icons.Rr.CarBattery: ImageVector
    get() = _CarBattery ?: UXIcon(name = "CarBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(5f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                lineTo(9f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12f)
                close()
                moveTo(19f, 11f)
                lineTo(18f, 11f)
                lineTo(18f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(1f)
                lineTo(15f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(18f, 13f)
                horizontalLineToRelative(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 11f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                lineTo(5f, 22f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                lineTo(0f, 9f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 5.13f)
                lineTo(3f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 2f)
                lineTo(9f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                lineTo(11f, 5f)
                horizontalLineToRelative(2f)
                lineTo(13f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                lineTo(21f, 5.13f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 9f)
                close()
                moveTo(22f, 9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(19f, 4f)
                lineTo(15f, 4f)
                lineTo(15f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(10f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 6f)
                lineTo(9f, 4f)
                lineTo(5f, 4f)
                lineTo(5f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                verticalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(19f, 20f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                close()
            }
        }.also { _CarBattery = it}
