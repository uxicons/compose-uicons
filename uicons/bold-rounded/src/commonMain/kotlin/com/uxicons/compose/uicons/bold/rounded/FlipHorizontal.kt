package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlipHorizontal: ImageVector? = null

val Icons.Br.FlipHorizontal: ImageVector
    get() = _FlipHorizontal ?: UXIcon(name = "FlipHorizontal") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.49f, 24f)
            horizontalLineTo(5.51f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.69f, 15.85f)
            lineTo(8.18f, 2.08f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.63f, 1.43f)
            lineTo(3.32f, 17.29f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.51f, 21f)
            horizontalLineTo(9.49f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.32f, 15.86f)
            lineTo(15.8f, 2.08f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.03f, -0.6f)
            arcToRelative(1.69f, 1.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.79f, 1.52f)
            verticalLineTo(22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 1.5f)
            horizontalLineToRelative(4.02f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.82f, -8.14f)
            close()
        }
    }.also { _FlipHorizontal = it }
