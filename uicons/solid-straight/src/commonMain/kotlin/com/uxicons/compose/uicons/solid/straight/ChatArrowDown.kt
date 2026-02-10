package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChatArrowDown: ImageVector? = null

val Icons.Ss.ChatArrowDown: ImageVector
    get() = _ChatArrowDown ?: UXIcon(name = "ChatArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.21f, 13.78f)
                lineTo(15.5f, 8.07f)
                lineToRelative(-2f, 2f)
                lineToRelative(-5.8f, -5.8f)
                lineTo(6.28f, 5.68f)
                lineTo(13.5f, 12.9f)
                lineToRelative(2f, -2f)
                lineTo(19.79f, 15.2f)
                lineTo(17f, 17.99f)
                horizontalLineToRelative(5.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 20.98f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineTo(20.98f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(24f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20.98f)
                close()
            }
        }.also { _ChatArrowDown = it}
