package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Book: ImageVector? = null

val Icons.Rr.Book: ImageVector
    get() = _Book ?: UXIcon(name = "Book") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0f)
                lineTo(7f, 0f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                lineTo(2f, 20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                lineTo(17f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(22f, 5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 0f)
                close()
                moveTo(20f, 5f)
                lineTo(20f, 16f)
                lineTo(8f, 16f)
                lineTo(8f, 2f)
                horizontalLineToRelative(9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 5f)
                close()
                moveTo(6f, 2.17f)
                lineTo(6f, 16f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0.54f)
                lineTo(4f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2.17f)
                close()
                moveTo(17f, 22f)
                lineTo(6f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4f)
                lineTo(20f, 18f)
                verticalLineToRelative(1f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 22f)
                close()
            }
        }.also { _Book = it}
