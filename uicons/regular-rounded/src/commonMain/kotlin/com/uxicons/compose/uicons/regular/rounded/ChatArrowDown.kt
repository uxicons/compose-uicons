package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChatArrowDown: ImageVector? = null

val Icons.Rr.ChatArrowDown: ImageVector
    get() = _ChatArrowDown ?: UXIcon(name = "ChatArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.29f, 12.7f)
                lineToRelative(-1.09f, 1.09f)
                horizontalLineToRelative(0f)
                lineTo(17.62f, 10.2f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineToRelative(-0.17f, 0.17f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineTo(6.72f, 5.29f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.31f, 6.71f)
                lineToRelative(5.07f, 5.07f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineToRelative(0.17f, -0.17f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 0f)
                lineTo(19.79f, 15.2f)
                horizontalLineToRelative(0f)
                lineToRelative(-1.09f, 1.09f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 1.71f)
                horizontalLineTo(22.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -1.5f)
                verticalLineTo(13.4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.29f, 12.7f)
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
        }.also { _ChatArrowDown = it}
