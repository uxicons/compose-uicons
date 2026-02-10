package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UndoAlt: ImageVector? = null

val Icons.Br.UndoAlt: ImageVector
    get() = _UndoAlt ?: UXIcon(name = "UndoAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.7f, 15.01f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 0f)
            lineTo(0.86f, 10.28f)
            arcToRelative(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.14f)
            lineTo(5.58f, 1.41f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.7f, 3.53f)
            lineTo(4.47f, 6.7f)
            lineToRelative(14.21f, 0f)
            arcTo(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12.02f)
            verticalLineTo(18.7f)
            arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.32f, 5.32f)
            horizontalLineTo(5.32f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -3f)
            horizontalLineTo(18.68f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18.7f)
            verticalLineTo(12.02f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.68f, 9.7f)
            lineTo(4.52f, 9.7f)
            lineTo(7.7f, 12.89f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.7f, 15.01f)
            close()
        }
    }.also { _UndoAlt = it }
