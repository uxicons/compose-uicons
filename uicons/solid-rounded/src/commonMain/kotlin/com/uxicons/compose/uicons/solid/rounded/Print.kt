package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Print: ImageVector? = null

val Icons.Sr.Print: ImageVector
    get() = _Print ?: UXIcon(name = "Print") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                horizontalLineTo(9f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 15f)
                lineTo(16f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 18f)
                lineTo(19f, 21f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 24f)
                lineTo(8f, 24f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 21f)
                lineTo(5f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                lineTo(5f, 7f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(4f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4.58f)
                lineTo(3f, 18f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                horizontalLineToRelative(8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                verticalLineToRelative(2.58f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16f)
                lineTo(24f, 12f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 7f)
                close()
                moveTo(18f, 11f)
                lineTo(16f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
        }.also { _Print = it}
