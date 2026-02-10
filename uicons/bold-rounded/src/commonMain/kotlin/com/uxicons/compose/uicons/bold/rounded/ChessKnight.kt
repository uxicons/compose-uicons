package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnight: ImageVector? = null

val Icons.Br.ChessKnight: ImageVector
    get() = _ChessKnight ?: UXIcon(name = "ChessKnight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 21.09f)
            lineTo(22f, 10.02f)
            curveToRelative(0.04f, -3.15f, -1.91f, -9.28f, -9.54f, -10f)
            arcToRelative(3.27f, 3.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.31f, 2.06f)
            arcTo(7.65f, 7.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.39f, 6.51f)
            arcTo(3.63f, 3.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9.93f)
            arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.07f, 13f)
            horizontalLineToRelative(4.6f)
            arcToRelative(14.16f, 14.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.63f, 8f)
            lineTo(2.5f, 21f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(19f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, -2.91f)
            close()
            moveTo(12.99f, 11.69f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 10f)
            lineTo(5f, 10f)
            arcToRelative(0.73f, 0.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.4f, -0.67f)
            arcToRelative(10.68f, 10.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.54f, -6.14f)
            arcTo(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.18f, 3f)
            curveTo(18.82f, 3.63f, 19f, 9.34f, 19f, 10f)
            lineTo(19f, 21f)
            lineTo(8.09f, 21f)
            arcTo(15.28f, 15.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.99f, 11.69f)
            close()
        }
    }.also { _ChessKnight = it }
