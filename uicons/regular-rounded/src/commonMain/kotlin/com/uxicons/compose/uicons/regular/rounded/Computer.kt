package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Computer: ImageVector? = null

val Icons.Rr.Computer: ImageVector
    get() = _Computer ?: UXIcon(name = "Computer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 1f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                verticalLineToRelative(8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineToRelative(6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(6f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 1f)
                close()
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                close()
                moveTo(19f, 17f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.82f, -2f)
                horizontalLineTo(21.82f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 17f)
                close()
            }
        }.also { _Computer = it}
