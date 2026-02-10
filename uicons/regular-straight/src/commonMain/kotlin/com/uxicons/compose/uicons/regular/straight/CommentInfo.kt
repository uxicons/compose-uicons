package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentInfo: ImageVector? = null

val Icons.Rs.CommentInfo: ImageVector
    get() = _CommentInfo ?: UXIcon(name = "CommentInfo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 6.5f)
                close()
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 24f)
                lineTo(24f, 24f)
                close()
                moveTo(22f, 12f)
                lineTo(22f, 22f)
                lineTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 12f)
                close()
                moveTo(14f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                lineTo(10f, 10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _CommentInfo = it}
