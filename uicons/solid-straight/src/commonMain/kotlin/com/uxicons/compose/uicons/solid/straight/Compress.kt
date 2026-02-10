package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Compress: ImageVector? = null

val Icons.Ss.Compress: ImageVector
    get() = _Compress ?: UXIcon(name = "Compress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 6f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 5f)
                verticalLineTo(0f)
                horizontalLineTo(6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(5f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(0f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(5f)
                verticalLineTo(6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 16f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 16f)
                close()
            }
        }.also { _Compress = it}
