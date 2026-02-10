package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentUser: ImageVector? = null

val Icons.Rs.CommentUser: ImageVector
    get() = _CommentUser ?: UXIcon(name = "CommentUser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, -3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                close()
                moveTo(17f, 14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                lineTo(10f, 11f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(2f)
                lineTo(9f, 16f)
                lineTo(9f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(12.01f, 23.66f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.34f, -0.51f)
                lineTo(6.92f, 20f)
                lineTo(0f, 20f)
                lineTo(0f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                lineTo(21f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                lineTo(24f, 20f)
                lineTo(17.15f, 20f)
                lineTo(13.3f, 23.18f)
                arcTo(1.94f, 1.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.01f, 23.66f)
                close()
                moveTo(2f, 18f)
                lineTo(7.65f, 18f)
                lineToRelative(4.33f, 3.65f)
                lineTo(16.43f, 18f)
                lineTo(22f, 18f)
                lineTo(22f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                lineTo(3f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3f)
                close()
            }
        }.also { _CommentUser = it}
