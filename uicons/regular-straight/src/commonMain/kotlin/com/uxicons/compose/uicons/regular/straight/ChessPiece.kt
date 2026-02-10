package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPiece: ImageVector? = null

val Icons.Rs.ChessPiece: ImageVector
    get() = _ChessPiece ?: UXIcon(name = "ChessPiece") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.02f, 22.03f)
                verticalLineToRelative(-3.48f)
                lineToRelative(-0.38f, -0.3f)
                curveToRelative(-2.55f, -2.04f, -3.55f, -4.31f, -3.61f, -8.22f)
                horizontalLineToRelative(1.99f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.56f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.56f, -2f)
                curveToRelative(0f, -1.27f, -1.09f, -3.12f, -2.31f, -5.07f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.38f, 0f)
                curveToRelative(-1.22f, 1.94f, -2.31f, 3.79f, -2.31f, 5.07f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.56f, 2f)
                horizontalLineToRelative(-1.56f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.99f)
                curveToRelative(-0.07f, 3.91f, -1.06f, 6.17f, -3.61f, 8.22f)
                lineToRelative(-0.38f, 0.3f)
                verticalLineToRelative(3.48f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10.03f, 6.03f)
                curveToRelative(0f, -0.81f, 1.4f, -3.05f, 2f, -4f)
                curveToRelative(0.6f, 0.96f, 2f, 3.2f, 2f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
                close()
                moveTo(13.03f, 10.03f)
                curveToRelative(0.04f, 3.04f, 0.56f, 5.65f, 2.54f, 8f)
                horizontalLineToRelative(-7.07f)
                curveToRelative(1.97f, -2.35f, 2.49f, -4.96f, 2.54f, -8f)
                close()
                moveTo(7.03f, 20.03f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                close()
            }
        }.also { _ChessPiece = it}
