package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RedoAlt: ImageVector? = null

val Icons.Br.RedoAlt: ImageVector
    get() = _RedoAlt ?: UXIcon(name = "RedoAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.3f, 15.01f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 0f)
            lineToRelative(4.73f, -4.72f)
            arcToRelative(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.14f)
            lineTo(18.42f, 1.41f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16.3f, 3.53f)
            lineTo(19.53f, 6.7f)
            lineTo(5.32f, 6.7f)
            arcTo(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12.02f)
            verticalLineTo(18.7f)
            arcToRelative(5.32f, 5.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.32f, 5.32f)
            horizontalLineTo(18.68f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineTo(5.32f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.7f)
            verticalLineTo(12.02f)
            arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.32f, 9.7f)
            lineToRelative(14.16f, 0f)
            lineTo(16.3f, 12.89f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.3f, 15.01f)
            close()
        }
    }.also { _RedoAlt = it }
