package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBattery: ImageVector? = null

val Icons.Sr.CarBattery: ImageVector
    get() = _CarBattery ?: UXIcon(name = "CarBattery") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 5.13f)
                lineTo(21f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                lineTo(15f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                lineTo(13f, 5f)
                lineTo(11f, 5f)
                lineTo(11f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 2f)
                lineTo(5f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4f)
                lineTo(3f, 5.13f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9f)
                verticalLineToRelative(8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(19f, 22f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 9f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 5.13f)
                close()
                moveTo(9f, 13f)
                lineTo(5f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                lineTo(9f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 13f)
                close()
                moveTo(19f, 13f)
                lineTo(18f, 13f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(16f, 13f)
                lineTo(15f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(1f)
                lineTo(16f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 13f)
                close()
            }
        }.also { _CarBattery = it}
