package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDown: ImageVector? = null

val Icons.Sr.ArrowDown: ImageVector
    get() = _ArrowDown ?: UXIcon(name = "ArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.43f, 16.93f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 0f)
                lineToRelative(-2.78f, 2.78f)
                lineTo(13.5f, 1.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 1.5f)
                lineToRelative(0.02f, 18.2f)
                lineTo(7.76f, 16.93f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 2.12f)
                lineToRelative(3.92f, 3.92f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, 0f)
                lineToRelative(3.92f, -3.92f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.43f, 16.93f)
                close()
            }
        }.also { _ArrowDown = it}
