package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToRight: ImageVector? = null

val Icons.Br.ArrowToRight: ImageVector
    get() = _ArrowToRight ?: UXIcon(name = "ArrowToRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 6.28f)
            verticalLineToRelative(3f)
            lineTo(16.93f, 5.21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.12f, 2.12f)
            lineTo(18f, 10.52f)
            horizontalLineTo(1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineTo(18f)
            lineTo(14.81f, 16.7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineTo(21f, 14.75f)
            verticalLineToRelative(3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(6.28f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            close()
        }
    }.also { _ArrowToRight = it }
