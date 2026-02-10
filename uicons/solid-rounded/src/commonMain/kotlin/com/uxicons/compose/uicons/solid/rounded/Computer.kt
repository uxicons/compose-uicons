package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Computer: ImageVector? = null

val Icons.Sr.Computer: ImageVector
    get() = _Computer ?: UXIcon(name = "Computer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 19f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineToRelative(6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.9f, -4f)
                horizontalLineTo(0.1f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 1f)
                horizontalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                verticalLineToRelative(7f)
                horizontalLineTo(24f)
                verticalLineTo(6f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 1f)
                close()
            }
        }.also { _Computer = it}
