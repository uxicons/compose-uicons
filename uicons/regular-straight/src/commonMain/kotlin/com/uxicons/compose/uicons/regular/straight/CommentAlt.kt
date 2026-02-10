package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAlt: ImageVector? = null

val Icons.Rs.CommentAlt: ImageVector
    get() = _CommentAlt ?: UXIcon(name = "CommentAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 20f)
                lineTo(6.9f, 20f)
                lineToRelative(3.81f, 3.22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.58f, 0f)
                lineTo(17.1f, 20f)
                lineTo(24f, 20f)
                lineTo(24f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(22f, 18f)
                lineTo(16.37f, 18f)
                lineTo(12f, 21.69f)
                lineTo(7.63f, 18f)
                lineTo(2f, 18f)
                lineTo(2f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                lineTo(21f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 9f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 13f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-12f)
                close()
            }
        }.also { _CommentAlt = it}
