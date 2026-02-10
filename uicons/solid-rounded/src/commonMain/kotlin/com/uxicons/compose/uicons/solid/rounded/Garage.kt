package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Garage: ImageVector? = null

val Icons.Sr.Garage: ImageVector
    get() = _Garage ?: UXIcon(name = "Garage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 11f)
                horizontalLineTo(8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineTo(24f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 11f)
                close()
                moveTo(13f, 22f)
                horizontalLineTo(11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 22f)
                close()
                moveTo(24f, 9.72f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4.9f)
                verticalLineTo(13f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                horizontalLineTo(8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                verticalLineTo(23.9f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 19f)
                verticalLineTo(9.72f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.2f, 5.58f)
                lineTo(9.2f, 0.85f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.59f, 0f)
                lineToRelative(7f, 4.72f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 9.72f)
                close()
            }
        }.also { _Garage = it}
