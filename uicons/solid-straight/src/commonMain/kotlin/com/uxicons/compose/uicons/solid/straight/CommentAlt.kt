package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentAlt: ImageVector? = null

val Icons.Ss.CommentAlt: ImageVector
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
                moveTo(6f, 5f)
                horizontalLineToRelative(6f)
                lineTo(12f, 7f)
                lineTo(6f, 7f)
                close()
                moveTo(18f, 15f)
                lineTo(6f, 15f)
                lineTo(6f, 13f)
                lineTo(18f, 13f)
                close()
                moveTo(18f, 11f)
                lineTo(6f, 11f)
                lineTo(6f, 9f)
                lineTo(18f, 9f)
                close()
            }
        }.also { _CommentAlt = it}
