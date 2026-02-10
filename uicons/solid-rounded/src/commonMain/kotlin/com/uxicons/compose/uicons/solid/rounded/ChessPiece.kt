package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPiece: ImageVector? = null

val Icons.Sr.ChessPiece: ImageVector
    get() = _ChessPiece ?: UXIcon(name = "ChessPiece") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 5.03f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(11.2f, 11.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.74f, -4.33f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.52f, 0f)
                arcToRelative(11.2f, 11.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.74f, 4.33f)
                close()
                moveTo(5.8f, 18f)
                horizontalLineToRelative(12.4f)
                arcToRelative(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.42f, -0.5f)
                curveToRelative(-1.92f, -1.86f, -2.71f, -4.01f, -2.77f, -7.5f)
                horizontalLineToRelative(0.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(0.99f)
                curveToRelative(-0.06f, 3.49f, -0.84f, 5.64f, -2.77f, 7.5f)
                arcToRelative(4.07f, 4.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.42f, 0.5f)
                close()
                moveTo(20f, 22f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.63f)
                curveToRelative(0f, -0.12f, -0.03f, -0.25f, -0.04f, -0.37f)
                horizontalLineToRelative(-13.92f)
                curveToRelative(-0.01f, 0.12f, -0.04f, 0.25f, -0.04f, 0.37f)
                verticalLineToRelative(1.63f)
                horizontalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
            }
        }.also { _ChessPiece = it}
