package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUp: ImageVector? = null

val Icons.Br.ArrowUp: ImageVector
    get() = _ArrowUp ?: UXIcon(name = "ArrowUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.43f, 4.91f)
            lineTo(14.51f, 0.99f)
            arcToRelative(3.58f, 3.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.95f, 0f)
            lineTo(5.64f, 4.91f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.76f, 7.03f)
            lineToRelative(2.78f, -2.78f)
            lineToRelative(0.02f, 18.25f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
            horizontalLineToRelative(0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, -1.5f)
            lineTo(13.54f, 4.27f)
            lineToRelative(2.77f, 2.77f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.12f, -2.12f)
            close()
        }
    }.also { _ArrowUp = it }
