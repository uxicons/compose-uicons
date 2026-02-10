package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRightAndArrowDownLeftFromCenter: ImageVector? = null

val Icons.Ss.ArrowUpRightAndArrowDownLeftFromCenter: ImageVector
    get() = _ArrowUpRightAndArrowDownLeftFromCenter ?: UXIcon(name = "ArrowUpRightAndArrowDownLeftFromCenter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.21f, 15.21f)
                lineToRelative(-6.79f, 6.79f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-6f)
                horizontalLineTo(2f)
                verticalLineToRelative(4.59f)
                lineToRelative(6.79f, -6.79f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(22f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineTo(2f)
                horizontalLineToRelative(4.59f)
                lineToRelative(-6.79f, 6.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(6.79f, -6.79f)
                verticalLineToRelative(4.59f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _ArrowUpRightAndArrowDownLeftFromCenter = it}
