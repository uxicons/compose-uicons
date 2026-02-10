package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugHot: ImageVector? = null

val Icons.Rs.MugHot: ImageVector
    get() = _MugHot ?: UXIcon(name = "MugHot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(19f, 9f)
                lineTo(19f, 6f)
                lineTo(1f, 6f)
                lineTo(1f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(16f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(19f, 19f)
                horizontalLineToRelative(4f)
                close()
                moveTo(17f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(4f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                lineTo(3f, 8f)
                lineTo(17f, 8f)
                close()
                moveTo(21f, 17f)
                lineTo(19f, 17f)
                lineTo(19f, 11f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(11f, 4f)
                lineTo(9f, 4f)
                lineTo(9f, 0f)
                horizontalLineToRelative(2f)
                close()
                moveTo(15f, 4f)
                lineTo(13f, 4f)
                lineTo(13f, 0f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7f, 4f)
                lineTo(5f, 4f)
                lineTo(5f, 0f)
                lineTo(7f, 0f)
                close()
            }
        }.also { _MugHot = it}
