package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChatArrowGrow: ImageVector? = null

val Icons.Rr.ChatArrowGrow: ImageVector
    get() = _ChatArrowGrow ?: UXIcon(name = "ChatArrowGrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 3.98f)
                horizontalLineTo(19.41f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, 1.71f)
                lineToRelative(1.09f, 1.09f)
                horizontalLineToRelative(0f)
                lineToRelative(-3.59f, 3.58f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.42f, 0f)
                lineToRelative(-0.17f, -0.17f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineToRelative(-5.1f, 5.1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.7f, 16.7f)
                lineToRelative(5.1f, -5.1f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.42f, 0f)
                lineToRelative(0.17f, 0.17f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineToRelative(3.59f, -3.59f)
                horizontalLineToRelative(0f)
                lineToRelative(1.09f, 1.09f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 8.56f)
                verticalLineTo(5.48f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 3.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 21.98f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1f)
                verticalLineTo(18.98f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.also { _ChatArrowGrow = it}
