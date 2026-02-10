package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessBishop: ImageVector? = null

val Icons.Br.ChessBishop: ImageVector
    get() = _ChessBishop ?: UXIcon(name = "ChessBishop") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 21f)
            horizontalLineToRelative(-0.8f)
            arcTo(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 15f)
            curveToRelative(0f, -4.96f, -6.41f, -10.21f, -7.88f, -11.34f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.26f, -0.01f)
            curveTo(9.28f, 4.71f, 3f, 9.3f, 3f, 15f)
            arcToRelative(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.3f, 6f)
            horizontalLineTo(4.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(15f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
            moveTo(6f, 15f)
            curveToRelative(0f, -3.41f, 3.73f, -6.84f, 5.93f, -8.45f)
            arcTo(29.75f, 29.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.38f, 8.82f)
            lineToRelative(-3.04f, 3.73f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.33f, 1.9f)
            lineToRelative(2.69f, -3.3f)
            arcTo(7.25f, 7.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15f)
            arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15f)
            close()
        }
    }.also { _ChessBishop = it }
