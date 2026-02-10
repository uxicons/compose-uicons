package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAlt: ImageVector? = null

val Icons.Sr.CommentAlt: ImageVector
    get() = _CommentAlt ?: UXIcon(name = "CommentAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                lineTo(4f, 0f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                lineTo(0f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                lineTo(6.9f, 20f)
                lineToRelative(4.45f, 3.76f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.29f, 0f)
                lineTo(17.1f, 20f)
                lineTo(20f, 20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(24f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 0f)
                close()
                moveTo(7f, 5f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(7f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 5f)
                close()
                moveTo(17f, 15f)
                lineTo(7f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                lineTo(17f, 13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
                moveTo(17f, 11f)
                lineTo(7f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 9f)
                lineTo(17f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
        }.also { _CommentAlt = it}
