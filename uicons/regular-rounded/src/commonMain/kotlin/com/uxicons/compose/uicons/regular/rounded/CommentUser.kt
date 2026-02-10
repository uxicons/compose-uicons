package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentUser: ImageVector? = null

val Icons.Rr.CommentUser: ImageVector
    get() = _CommentUser ?: UXIcon(name = "CommentUser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                close()
                moveTo(8.97f, 15.25f)
                arcToRelative(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.06f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.94f, -0.5f)
                curveToRelative(-1.31f, -4.95f, -8.63f, -4.95f, -9.94f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.94f, 0.5f)
                close()
                moveTo(12.01f, 23.66f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.34f, -0.51f)
                lineTo(6.92f, 20f)
                lineTo(4f, 20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                lineTo(0f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                lineTo(20f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                lineTo(24f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                lineTo(17.15f, 20f)
                lineTo(13.3f, 23.18f)
                arcTo(1.94f, 1.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.01f, 23.66f)
                close()
                moveTo(4f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                lineTo(2f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                lineTo(7.29f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.64f, 0.23f)
                lineToRelative(4.05f, 3.41f)
                lineToRelative(4.17f, -3.42f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.79f, 18f)
                lineTo(20f, 18f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                lineTo(22f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                close()
            }
        }.also { _CommentUser = it}
