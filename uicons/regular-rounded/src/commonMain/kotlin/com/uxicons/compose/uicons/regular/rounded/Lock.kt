package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lock: ImageVector? = null

val Icons.Rr.Lock: ImageVector
    get() = _Lock ?: UXIcon(name = "Lock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8.42f)
                verticalLineTo(7f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 7f)
                verticalLineTo(8.42f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 13f)
                verticalLineToRelative(6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(17f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(13f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 8.42f)
                close()
                moveTo(7f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                close()
                moveTo(20f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineTo(17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                close()
            }
        }.also { _Lock = it}
