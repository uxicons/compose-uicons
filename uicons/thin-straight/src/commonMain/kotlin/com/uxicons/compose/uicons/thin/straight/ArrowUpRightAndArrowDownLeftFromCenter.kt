package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpRightAndArrowDownLeftFromCenter: ImageVector? = null

val Icons.Ts.ArrowUpRightAndArrowDownLeftFromCenter: ImageVector
    get() = _ArrowUpRightAndArrowDownLeftFromCenter ?: UXIcon(name = "ArrowUpRightAndArrowDownLeftFromCenter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.85f, 14.85f)
                lineTo(1.71f, 23f)
                horizontalLineToRelative(6.29f)
                verticalLineToRelative(1f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineTo(1f)
                verticalLineToRelative(6.29f)
                lineTo(9.15f, 14.15f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(22.5f, 0f)
                horizontalLineToRelative(-6.5f)
                verticalLineTo(1f)
                horizontalLineToRelative(6.29f)
                lineTo(14.15f, 9.15f)
                lineToRelative(0.71f, 0.71f)
                lineTo(23f, 1.71f)
                verticalLineToRelative(6.29f)
                horizontalLineToRelative(1f)
                verticalLineTo(1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ArrowUpRightAndArrowDownLeftFromCenter = it}
