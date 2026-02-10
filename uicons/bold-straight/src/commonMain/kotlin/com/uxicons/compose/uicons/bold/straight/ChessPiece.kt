package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPiece: ImageVector? = null

val Icons.Bs.ChessPiece: ImageVector
    get() = _ChessPiece ?: UXIcon(name = "ChessPiece") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 21f)
                verticalLineToRelative(-2.72f)
                lineToRelative(-0.56f, -0.45f)
                curveToRelative(-2.37f, -1.9f, -2.44f, -3.86f, -2.44f, -7.31f)
                horizontalLineToRelative(2f)
                lineToRelative(0.01f, -3f)
                horizontalLineToRelative(-2.46f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.48f, -1.85f)
                curveToRelative(0f, -1.24f, -0.92f, -2.81f, -2.02f, -4.57f)
                arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.95f, 0f)
                curveToRelative(-1.11f, 1.77f, -2.03f, 3.33f, -2.03f, 4.57f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.47f, 1.84f)
                lineToRelative(-2.5f, -0.01f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 3.46f, -0.07f, 5.43f, -2.44f, 7.33f)
                lineToRelative(-0.56f, 0.45f)
                verticalLineToRelative(2.72f)
                horizontalLineToRelative(-1.97f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-3f)
                close()
                moveTo(13f, 10.52f)
                curveToRelative(0f, 2.76f, 0.06f, 5.24f, 1.54f, 7.49f)
                horizontalLineToRelative(-5.08f)
                curveToRelative(1.48f, -2.24f, 1.54f, -4.73f, 1.54f, -7.49f)
                close()
            }
        }.also { _ChessPiece = it}
