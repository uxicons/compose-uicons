package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPiece: ImageVector? = null

val Icons.Rr.ChessPiece: ImageVector
    get() = _ChessPiece ?: UXIcon(name = "ChessPiece") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.02f, 22.03f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.66f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.23f, -2.87f)
                curveToRelative(-1.92f, -1.86f, -2.71f, -3.99f, -2.77f, -7.48f)
                horizontalLineToRelative(0.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineToRelative(-0.56f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.56f, -2f)
                curveToRelative(0f, -1.38f, -1.16f, -3.72f, -1.89f, -4.87f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.21f, 0f)
                curveToRelative(-0.73f, 1.15f, -1.89f, 3.5f, -1.89f, 4.87f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.56f, 2f)
                horizontalLineToRelative(-0.55f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(0.99f)
                curveToRelative(-0.06f, 3.49f, -0.84f, 5.62f, -2.77f, 7.47f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.22f, 2.87f)
                verticalLineToRelative(1.66f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(11.61f, 2.23f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.83f, 0f)
                arcToRelative(10.75f, 10.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.58f, 3.8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
                arcToRelative(10.76f, 10.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.58f, -3.8f)
                close()
                moveTo(13.04f, 10.03f)
                curveToRelative(0.05f, 3.52f, 0.8f, 5.95f, 2.52f, 8f)
                horizontalLineToRelative(-7.07f)
                curveToRelative(1.72f, -2.05f, 2.47f, -4.49f, 2.52f, -8f)
                close()
                moveTo(7.03f, 20.37f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.04f, -0.34f)
                horizontalLineToRelative(9.93f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.04f, 0.34f)
                verticalLineToRelative(1.66f)
                horizontalLineToRelative(-10f)
                close()
            }
        }.also { _ChessPiece = it}
