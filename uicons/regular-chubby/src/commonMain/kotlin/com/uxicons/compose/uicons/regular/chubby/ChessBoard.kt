package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessBoard: ImageVector? = null

val Icons.Rc.ChessBoard: ImageVector
    get() = _ChessBoard ?: UXIcon(name = "ChessBoard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.81f, 2.86f)
                curveToRelative(-0.1f, -0.33f, -0.36f, -0.58f, -0.69f, -0.67f)
                curveToRelative(-0.17f, -0.05f, -4.27f, -1.19f, -9.12f, -1.19f)
                reflectiveCurveTo(3.05f, 2.14f, 2.88f, 2.19f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.35f, -0.69f, 0.67f)
                curveToRelative(-0.05f, 0.16f, -1.19f, 4.01f, -1.19f, 9.14f)
                curveToRelative(0f, 5.17f, 1.15f, 8.98f, 1.19f, 9.14f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.58f, 0.69f, 0.67f)
                curveToRelative(0.17f, 0.05f, 4.27f, 1.19f, 9.12f, 1.19f)
                reflectiveCurveToRelative(8.95f, -1.14f, 9.12f, -1.19f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.35f, 0.69f, -0.67f)
                curveToRelative(0.05f, -0.16f, 1.19f, -4.01f, 1.19f, -9.14f)
                curveToRelative(0f, -5.17f, -1.15f, -8.98f, -1.19f, -9.14f)
                close()
                moveTo(20.93f, 14.13f)
                curveToRelative(-0.1f, 1.56f, -0.3f, 2.93f, -0.49f, 4.0f)
                horizontalLineToRelative(-2.67f)
                verticalLineToRelative(2.35f)
                curveToRelative(-1.06f, 0.18f, -2.36f, 0.36f, -3.77f, 0.45f)
                verticalLineToRelative(-2.8f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2.8f)
                curveToRelative(-1.41f, -0.09f, -2.71f, -0.27f, -3.77f, -0.45f)
                verticalLineToRelative(-2.35f)
                lineTo(3.56f, 18.13f)
                curveToRelative(-0.19f, -1.07f, -0.39f, -2.44f, -0.49f, -4.0f)
                horizontalLineToRelative(3.16f)
                verticalLineToRelative(-4f)
                lineTo(3.05f, 10.13f)
                curveToRelative(0.09f, -1.54f, 0.27f, -2.91f, 0.46f, -4.0f)
                horizontalLineToRelative(2.72f)
                lineTo(6.23f, 3.52f)
                curveToRelative(1.06f, -0.18f, 2.36f, -0.36f, 3.77f, -0.45f)
                verticalLineToRelative(3.06f)
                horizontalLineToRelative(4f)
                lineTo(14f, 3.07f)
                curveToRelative(1.41f, 0.09f, 2.71f, 0.27f, 3.77f, 0.45f)
                verticalLineToRelative(2.62f)
                horizontalLineToRelative(2.72f)
                curveToRelative(0.19f, 1.09f, 0.37f, 2.45f, 0.46f, 4.0f)
                horizontalLineToRelative(-3.18f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3.16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.23f, 6.13f)
                horizontalLineToRelative(3.77f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3.77f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 6.13f)
                horizontalLineToRelative(3.77f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3.77f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 10.13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.23f, 14.13f)
                horizontalLineToRelative(3.77f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3.77f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 14.13f)
                horizontalLineToRelative(3.77f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3.77f)
                close()
            }
        }.also { _ChessBoard = it}
