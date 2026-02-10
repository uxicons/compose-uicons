package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromLeft: ImageVector? = null

val Icons.Br.ArrowFromLeft: ImageVector
    get() = _ArrowFromLeft ?: UXIcon(name = "ArrowFromLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.14f, 9.94f)
            lineTo(18.41f, 5.21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 2.12f)
            lineToRelative(3.25f, 3.18f)
            horizontalLineTo(3f)
            verticalLineTo(6.28f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineTo(17.75f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            verticalLineTo(13.52f)
            horizontalLineTo(19.47f)
            lineTo(16.29f, 16.7f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(4.73f, -4.73f)
            arcTo(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.14f, 9.94f)
            close()
        }
    }.also { _ArrowFromLeft = it }
