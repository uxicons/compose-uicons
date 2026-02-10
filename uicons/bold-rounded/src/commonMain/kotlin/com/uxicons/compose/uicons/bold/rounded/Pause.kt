package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pause: ImageVector? = null

val Icons.Br.Pause: ImageVector
    get() = _Pause ?: UXIcon(name = "Pause") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 0f)
            arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4f)
            verticalLineTo(20f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
            verticalLineTo(4f)
            arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 0f)
            close()
            moveTo(8f, 20f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
            verticalLineTo(4f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 4f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 0f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
            lineTo(13f, 20f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
            lineTo(21f, 4f)
            arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 0f)
            close()
            moveTo(18f, 20f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
            lineTo(16f, 4f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
            close()
        }
    }.also { _Pause = it }
