package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UndoAlt: ImageVector? = null

val Icons.Rr.UndoAlt: ImageVector
    get() = _UndoAlt ?: UXIcon(name = "UndoAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.54f, 8.46f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 7f)
                horizontalLineToRelative(0f)
                lineTo(2.8f, 7f)
                lineTo(7.1f, 2.7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.68f, 1.29f)
                lineTo(0.73f, 6.24f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.54f)
                lineToRelative(4.95f, 4.95f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 7.1f, 13.31f)
                lineTo(2.79f, 9f)
                lineTo(19f, 9f)
                horizontalLineToRelative(0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(12f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.54f, 8.46f)
                close()
            }
        }.also { _UndoAlt = it}
