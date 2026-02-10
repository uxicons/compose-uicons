package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentHeart: ImageVector? = null

val Icons.Rr.CommentHeart: ImageVector
    get() = _CommentHeart ?: UXIcon(name = "CommentHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 7f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, 0.99f)
                arcTo(3.57f, 3.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 10.7f)
                curveToRelative(0f, 3.26f, 4.87f, 6.74f, 5.43f, 7.12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.14f, 0f)
                curveTo(13.13f, 17.44f, 18f, 13.96f, 18f, 10.7f)
                arcTo(3.61f, 3.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 7f)
                close()
                moveTo(12f, 15.76f)
                curveToRelative(-1.74f, -1.33f, -4f, -3.56f, -4f, -5.06f)
                curveToRelative(-0.08f, -2.01f, 2.91f, -2.4f, 3f, -0.25f)
                verticalLineTo(11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-0.55f)
                curveToRelative(0.09f, -2.15f, 3.08f, -1.76f, 3f, 0.25f)
                curveTo(16f, 12.2f, 13.74f, 14.43f, 12f, 15.76f)
                close()
                moveTo(12.84f, 0.03f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.03f, 12.85f)
                curveTo(0.47f, 19.21f, 6.08f, 24f, 13.08f, 24f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(12.34f)
                arcTo(12.21f, 12.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.84f, 0.03f)
                close()
                moveTo(22f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(13.08f)
                curveTo(7.05f, 22f, 2.4f, 18.1f, 2.02f, 12.72f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.7f, 2.02f)
                arcTo(10.2f, 10.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12.34f)
                close()
            }
        }.also { _CommentHeart = it}
