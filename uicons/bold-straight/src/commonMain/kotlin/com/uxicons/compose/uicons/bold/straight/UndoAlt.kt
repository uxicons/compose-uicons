package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UndoAlt: ImageVector? = null

val Icons.Bs.UndoAlt: ImageVector
    get() = _UndoAlt ?: UXIcon(name = "UndoAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 6f)
                horizontalLineTo(4.51f)
                lineToRelative(3.45f, -3.45f)
                lineTo(5.84f, 0.43f)
                lineTo(0.89f, 5.38f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                lineToRelative(4.95f, 4.95f)
                lineTo(7.96f, 12.45f)
                lineTo(4.51f, 9f)
                horizontalLineTo(20.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
                horizontalLineTo(2f)
                verticalLineToRelative(3f)
                horizontalLineTo(20.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 20.5f)
                verticalLineTo(9.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 6f)
                close()
            }
        }.also { _UndoAlt = it}
