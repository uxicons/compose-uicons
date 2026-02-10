package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretLeft: ImageVector? = null

val Icons.Br.CaretLeft: ImageVector
    get() = _CaretLeft ?: UXIcon(name = "CaretLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.29f, 18.59f)
            lineTo(7.71f, 13f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.41f)
            lineTo(13.29f, 6f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 6.71f)
            verticalLineTo(17.88f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.29f, 18.59f)
            close()
        }
    }.also { _CaretLeft = it }
