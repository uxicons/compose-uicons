package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToBottom: ImageVector? = null

val Icons.Rs.ArrowToBottom: ImageVector
    get() = _ArrowToBottom ?: UXIcon(name = "ArrowToBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.45f, 22f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.32f, -0.26f)
                lineToRelative(4.95f, -4.95f)
                lineTo(17.3f, 15.37f)
                lineToRelative(-4.3f, 4.3f)
                verticalLineTo(0f)
                horizontalLineTo(11f)
                verticalLineTo(19.68f)
                lineToRelative(-4.3f, -4.3f)
                lineTo(5.28f, 16.79f)
                lineToRelative(4.95f, 4.95f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.32f, 0.26f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                close()
            }
        }.also { _ArrowToBottom = it}
