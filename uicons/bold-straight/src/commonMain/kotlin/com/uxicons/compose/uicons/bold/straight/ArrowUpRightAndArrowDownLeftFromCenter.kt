package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRightAndArrowDownLeftFromCenter: ImageVector? = null

val Icons.Bs.ArrowUpRightAndArrowDownLeftFromCenter: ImageVector
    get() = _ArrowUpRightAndArrowDownLeftFromCenter ?: UXIcon(name = "ArrowUpRightAndArrowDownLeftFromCenter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.06f, 15.06f)
                lineToRelative(-5.94f, 5.94f)
                horizontalLineToRelative(3.88f)
                verticalLineToRelative(3f)
                horizontalLineTo(2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(3.88f)
                lineToRelative(5.94f, -5.94f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-6.5f)
                verticalLineTo(3f)
                horizontalLineToRelative(3.88f)
                lineToRelative(-5.94f, 5.94f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(5.94f, -5.94f)
                verticalLineToRelative(3.88f)
                horizontalLineToRelative(3f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _ArrowUpRightAndArrowDownLeftFromCenter = it}
