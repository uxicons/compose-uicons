package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Compress: ImageVector? = null

val Icons.Rr.Compress: ImageVector
    get() = _Compress ?: UXIcon(name = "Compress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 1f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 6f)
                horizontalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 8f)
                horizontalLineTo(3f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 3f)
                verticalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 16f)
                horizontalLineTo(21f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineTo(3f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 16f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(21f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 16f)
                close()
            }
        }.also { _Compress = it}
