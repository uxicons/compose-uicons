package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentHeart: ImageVector? = null

val Icons.Sr.CommentHeart: ImageVector
    get() = _CommentHeart ?: UXIcon(name = "CommentHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 10.7f)
                curveToRelative(0f, 1.5f, -2.26f, 3.73f, -4f, 5.06f)
                curveToRelative(-1.74f, -1.33f, -4f, -3.56f, -4f, -5.06f)
                curveToRelative(-0.08f, -2.01f, 2.91f, -2.4f, 3f, -0.25f)
                lineTo(11f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-0.55f)
                curveTo(13.09f, 8.3f, 16.08f, 8.69f, 16f, 10.7f)
                close()
                moveTo(24f, 12.34f)
                lineTo(24f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                lineTo(13.08f, 24f)
                curveTo(6.08f, 24f, 0.47f, 19.21f, 0.03f, 12.86f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.84f, 0.03f)
                arcTo(12.21f, 12.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12.34f)
                close()
                moveTo(18f, 10.7f)
                arcToRelative(3.57f, 3.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, -2.71f)
                arcTo(3.57f, 3.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 10.7f)
                curveToRelative(0f, 3.26f, 4.87f, 6.74f, 5.43f, 7.12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.14f, 0f)
                curveTo(13.13f, 17.44f, 18f, 13.96f, 18f, 10.7f)
                close()
            }
        }.also { _CommentHeart = it}
