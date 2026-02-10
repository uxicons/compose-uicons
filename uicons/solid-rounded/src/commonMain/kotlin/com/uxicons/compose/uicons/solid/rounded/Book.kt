package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Book: ImageVector? = null

val Icons.Sr.Book: ImageVector
    get() = _Book ?: UXIcon(name = "Book") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.39f, 16.06f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 16f)
                horizontalLineTo(6f)
                verticalLineTo(0.1f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                verticalLineTo(17.02f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.39f, 16.06f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                horizontalLineTo(17f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                close()
            }
        }.also { _Book = it}
