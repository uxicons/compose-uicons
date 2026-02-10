package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAlt: ImageVector? = null

val Icons.Br.CommentAlt: ImageVector
    get() = _CommentAlt ?: UXIcon(name = "CommentAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 0f)
            horizontalLineTo(5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
            verticalLineToRelative(9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 20f)
            horizontalLineTo(6.94f)
            lineToRelative(4.1f, 3.43f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.92f, 0f)
            lineTo(17.06f, 20f)
            horizontalLineTo(18.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 14.5f)
            verticalLineToRelative(-9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 0f)
            close()
            moveTo(21f, 14.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 17f)
            horizontalLineTo(16.52f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.96f, 0.35f)
            lineTo(12f, 20.32f)
            lineTo(8.45f, 17.35f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.48f, 17f)
            horizontalLineTo(5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 14.5f)
            verticalLineToRelative(-9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 3f)
            horizontalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 9f)
            horizontalLineToRelative(3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 11f)
            horizontalLineToRelative(-9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
        }
    }.also { _CommentAlt = it }
