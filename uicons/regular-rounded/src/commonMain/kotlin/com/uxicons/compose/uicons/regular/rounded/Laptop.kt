package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Laptop: ImageVector? = null

val Icons.Rr.Laptop: ImageVector
    get() = _Laptop ?: UXIcon(name = "Laptop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15.18f)
                verticalLineTo(8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineTo(7f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 8f)
                verticalLineToRelative(7.18f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 21f)
                horizontalLineTo(21f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -5.82f)
                close()
                moveTo(7f, 5f)
                horizontalLineTo(17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineTo(15.85f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.53f, 0.71f)
                lineTo(14.07f, 16f)
                horizontalLineTo(9.93f)
                lineToRelative(-0.25f, -0.29f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.15f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 5f)
                close()
                moveTo(21f, 19f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineTo(8.15f)
                lineToRelative(0.25f, 0.29f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.93f, 18f)
                horizontalLineToRelative(4.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.53f, -0.71f)
                lineTo(15.85f, 17f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
        }.also { _Laptop = it}
