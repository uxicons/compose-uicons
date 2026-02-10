package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPiece: ImageVector? = null

val Icons.Ts.ChessPiece: ImageVector
    get() = _ChessPiece ?: UXIcon(name = "ChessPiece") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 23f)
                verticalLineToRelative(-3.74f)
                curveToRelative(-2.57f, -2.06f, -3.91f, -4.95f, -4.0f, -9.26f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.36f)
                curveToRelative(0.83f, -0.73f, 1.36f, -1.81f, 1.36f, -3f)
                curveToRelative(0f, -1.22f, -1.06f, -2.87f, -2.08f, -4.47f)
                lineToRelative(-0.48f, -0.75f)
                curveToRelative(-0.31f, -0.49f, -0.83f, -0.78f, -1.41f, -0.78f)
                reflectiveCurveToRelative(-1.1f, 0.29f, -1.41f, 0.78f)
                curveToRelative(-0.18f, 0.29f, -0.38f, 0.59f, -0.58f, 0.9f)
                curveToRelative(-1.0f, 1.54f, -2.04f, 3.14f, -2.04f, 4.32f)
                curveToRelative(0f, 1.19f, 0.53f, 2.27f, 1.36f, 3f)
                horizontalLineToRelative(-2.36f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.0f)
                curveToRelative(-0.08f, 4.31f, -1.42f, 7.2f, -4.0f, 9.26f)
                verticalLineToRelative(3.74f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(9f, 6f)
                curveToRelative(0f, -0.89f, 1.04f, -2.49f, 1.88f, -3.78f)
                curveToRelative(0.2f, -0.31f, 0.4f, -0.62f, 0.59f, -0.91f)
                curveToRelative(0.12f, -0.2f, 0.33f, -0.31f, 0.56f, -0.31f)
                reflectiveCurveToRelative(0.44f, 0.11f, 0.56f, 0.31f)
                lineToRelative(0.48f, 0.76f)
                curveToRelative(0.86f, 1.34f, 1.93f, 3.0f, 1.93f, 3.93f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                close()
                moveTo(10.0f, 10f)
                horizontalLineToRelative(4.01f)
                curveToRelative(0.05f, 2.87f, 0.54f, 6.29f, 3.2f, 9f)
                lineTo(6.8f, 19f)
                curveToRelative(2.66f, -2.71f, 3.15f, -6.13f, 3.2f, -9f)
                close()
                moveTo(18f, 23f)
                lineTo(6f, 23f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _ChessPiece = it}
