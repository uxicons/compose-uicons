package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UndoAlt: ImageVector? = null

val Icons.Ss.UndoAlt: ImageVector
    get() = _UndoAlt ?: UXIcon(name = "UndoAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.9f, 7.0f)
                horizontalLineTo(2.79f)
                lineTo(7.1f, 2.7f)
                lineTo(5.68f, 1.29f)
                lineTo(0.73f, 6.24f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.54f)
                lineToRelative(4.95f, 4.95f)
                lineTo(7.1f, 13.31f)
                lineToRelative(-4.3f, -4.3f)
                horizontalLineTo(20.9f)
                arcToRelative(1.03f, 1.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.1f, 0.95f)
                verticalLineToRelative(11.1f)
                arcToRelative(1.03f, 1.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.1f, 0.95f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(20.9f)
                arcTo(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 21.06f)
                verticalLineTo(9.96f)
                arcTo(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.9f, 7.0f)
                close()
            }
        }.also { _UndoAlt = it}
