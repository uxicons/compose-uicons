package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAlt: ImageVector? = null

val Icons.Bs.CommentAlt: ImageVector
    get() = _CommentAlt ?: UXIcon(name = "CommentAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.55f, 0f)
                horizontalLineTo(2.45f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.45f)
                verticalLineTo(20f)
                horizontalLineTo(6.94f)
                lineToRelative(4.05f, 3.39f)
                arcTo(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 23.74f)
                arcToRelative(1.63f, 1.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.03f, -0.37f)
                lineTo(17.06f, 20f)
                horizontalLineTo(24f)
                verticalLineTo(2.45f)
                arcTo(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.55f, 0f)
                close()
                moveTo(21f, 17f)
                horizontalLineTo(15.97f)
                lineTo(12f, 20.32f)
                lineTo(8.03f, 17f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 11f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-12f)
                close()
            }
        }.also { _CommentAlt = it}
