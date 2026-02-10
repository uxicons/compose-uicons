package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugHot: ImageVector? = null

val Icons.Sr.MugHot: ImageVector
    get() = _MugHot ?: UXIcon(name = "MugHot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 10f)
                lineTo(19f, 10f)
                lineTo(19f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(4f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 9f)
                lineTo(1f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineToRelative(8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.9f, -4f)
                arcTo(3.6f, 3.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 16.5f)
                verticalLineToRelative(-3f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 10f)
                close()
                moveTo(21f, 16.5f)
                arcTo(1.62f, 1.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 18f)
                lineTo(19f, 12f)
                arcToRelative(1.62f, 1.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 1.5f)
                close()
                moveTo(9f, 3f)
                lineTo(9f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                lineTo(11f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 3f)
                close()
                moveTo(13f, 3f)
                lineTo(13f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                lineTo(15f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 3f)
                close()
                moveTo(5f, 3f)
                lineTo(5f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 1f)
                lineTo(7f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                close()
            }
        }.also { _MugHot = it}
