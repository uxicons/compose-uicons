package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowSmallDown: ImageVector? = null

val Icons.Br.ArrowSmallDown: ImageVector
    get() = _ArrowSmallDown ?: UXIcon(name = "ArrowSmallDown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.06f, 12.35f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 0f)
            lineTo(13.5f, 14.79f)
            verticalLineTo(6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(8.79f)
            lineTo(8.06f, 12.35f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 2.12f)
            lineToRelative(3.59f, 3.59f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, 0f)
            lineToRelative(3.59f, -3.59f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.06f, 12.35f)
            close()
        }
    }.also { _ArrowSmallDown = it }
