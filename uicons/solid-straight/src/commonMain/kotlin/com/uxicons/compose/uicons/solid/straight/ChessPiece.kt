package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPiece: ImageVector? = null

val Icons.Ss.ChessPiece: ImageVector
    get() = _ChessPiece ?: UXIcon(name = "ChessPiece") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.03f, 5f)
                curveToRelative(0f, -1.08f, 1.27f, -3.12f, 2.15f, -4.53f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.69f, 0f)
                curveToRelative(0.89f, 1.42f, 2.15f, 3.46f, 2.15f, 4.53f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                close()
                moveTo(19.03f, 22.03f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15.04f, 10.03f)
                horizontalLineToRelative(1.99f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.99f)
                curveToRelative(-0.06f, 3.77f, -1.0f, 6.01f, -3.36f, 8f)
                horizontalLineToRelative(12.75f)
                curveToRelative(-2.36f, -1.99f, -3.3f, -4.23f, -3.36f, -8f)
                close()
            }
        }.also { _ChessPiece = it}
