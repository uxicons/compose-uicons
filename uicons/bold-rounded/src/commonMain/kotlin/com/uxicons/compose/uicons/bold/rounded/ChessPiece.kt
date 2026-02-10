package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPiece: ImageVector? = null

val Icons.Br.ChessPiece: ImageVector
    get() = _ChessPiece ?: UXIcon(name = "ChessPiece") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.5f, 21f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-0.66f)
            arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.38f, -3.23f)
            arcToRelative(8.36f, 8.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.56f, -6.12f)
            horizontalLineToRelative(0.93f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-0.72f)
            arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -2.31f)
            arcToRelative(10.54f, 10.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.68f, -4.42f)
            arcToRelative(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.32f, -1.27f)
            arcToRelative(2.73f, 2.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.32f, 1.27f)
            arcToRelative(10.52f, 10.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.68f, 4.42f)
            arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, 2.31f)
            horizontalLineToRelative(-0.27f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(0.46f)
            arcToRelative(8.38f, 8.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.58f, 6.12f)
            arcToRelative(4.52f, 4.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.38f, 3.23f)
            verticalLineToRelative(0.66f)
            horizontalLineToRelative(-0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            horizontalLineToRelative(15f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            close()
            moveTo(12.06f, 11f)
            arcToRelative(11.59f, 11.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.22f, 8f)
            horizontalLineToRelative(-6.55f)
            arcToRelative(11.58f, 11.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.24f, -8f)
            close()
        }
    }.also { _ChessPiece = it }
