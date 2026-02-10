package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentHeart: ImageVector? = null

val Icons.Rs.CommentHeart: ImageVector
    get() = _CommentHeart ?: UXIcon(name = "CommentHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 24f)
                horizontalLineTo(24f)
                verticalLineTo(12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(22f, 22f)
                horizontalLineTo(12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 12f)
                close()
                moveTo(14.5f, 7f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, 0.99f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 7f)
                arcTo(3.61f, 3.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 10.7f)
                curveToRelative(0f, 3.26f, 4.87f, 6.74f, 5.43f, 7.12f)
                lineToRelative(0.57f, 0.4f)
                lineToRelative(0.57f, -0.4f)
                curveTo(13.13f, 17.44f, 18f, 13.96f, 18f, 10.7f)
                arcTo(3.61f, 3.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 7f)
                close()
                moveTo(12f, 15.76f)
                curveToRelative(-1.74f, -1.33f, -4f, -3.56f, -4f, -5.06f)
                arcTo(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 9f)
                arcTo(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 10.45f)
                verticalLineTo(11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.55f)
                arcTo(1.4f, 1.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 9f)
                arcTo(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 10.7f)
                curveTo(16f, 12.2f, 13.74f, 14.43f, 12f, 15.76f)
                close()
            }
        }.also { _CommentHeart = it}
