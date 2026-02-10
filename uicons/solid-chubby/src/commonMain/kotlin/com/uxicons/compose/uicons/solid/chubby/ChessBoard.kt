package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessBoard: ImageVector? = null

val Icons.Sc.ChessBoard: ImageVector
    get() = _ChessBoard ?: UXIcon(name = "ChessBoard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.84f, 3.22f)
                curveToRelative(-0.15f, -0.49f, -0.54f, -0.87f, -1.03f, -1.0f)
                curveToRelative(-0.17f, -0.05f, -4.13f, -1.14f, -8.81f, -1.14f)
                reflectiveCurveTo(3.36f, 2.17f, 3.19f, 2.21f)
                curveToRelative(-0.49f, 0.14f, -0.88f, 0.52f, -1.03f, 1.01f)
                curveToRelative(-0.05f, 0.15f, -1.16f, 3.86f, -1.16f, 8.78f)
                curveToRelative(0f, 4.96f, 1.11f, 8.63f, 1.16f, 8.79f)
                curveToRelative(0.15f, 0.49f, 0.54f, 0.87f, 1.03f, 1.0f)
                curveToRelative(0.17f, 0.05f, 4.13f, 1.14f, 8.81f, 1.14f)
                reflectiveCurveToRelative(8.64f, -1.09f, 8.81f, -1.14f)
                curveToRelative(0.49f, -0.14f, 0.88f, -0.52f, 1.03f, -1.01f)
                curveToRelative(0.05f, -0.15f, 1.16f, -3.86f, 1.16f, -8.78f)
                curveToRelative(0f, -4.96f, -1.11f, -8.63f, -1.16f, -8.79f)
                close()
                moveTo(19.93f, 14.01f)
                curveToRelative(-0.1f, 1.48f, -0.29f, 2.77f, -0.47f, 3.77f)
                horizontalLineToRelative(-1.98f)
                verticalLineToRelative(1.66f)
                curveToRelative(-1.0f, 0.17f, -2.23f, 0.34f, -3.58f, 0.43f)
                verticalLineToRelative(-2.09f)
                horizontalLineToRelative(-3.8f)
                verticalLineToRelative(2.09f)
                curveToRelative(-1.35f, -0.09f, -2.58f, -0.26f, -3.58f, -0.43f)
                verticalLineToRelative(-1.66f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-0.18f, -0.99f, -0.37f, -2.28f, -0.47f, -3.77f)
                horizontalLineToRelative(2.45f)
                verticalLineToRelative(-3.77f)
                horizontalLineToRelative(-2.47f)
                curveToRelative(0.09f, -1.46f, 0.26f, -2.75f, 0.44f, -3.77f)
                horizontalLineToRelative(2.02f)
                verticalLineToRelative(-1.9f)
                curveToRelative(1.0f, -0.17f, 2.23f, -0.34f, 3.58f, -0.43f)
                verticalLineToRelative(2.33f)
                horizontalLineToRelative(3.8f)
                verticalLineToRelative(-2.33f)
                curveToRelative(1.35f, 0.09f, 2.58f, 0.26f, 3.58f, 0.43f)
                verticalLineToRelative(1.9f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.18f, 1.01f, 0.36f, 2.3f, 0.44f, 3.77f)
                horizontalLineToRelative(-2.47f)
                verticalLineToRelative(3.77f)
                horizontalLineToRelative(2.45f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.52f, 6.47f)
                horizontalLineToRelative(3.58f)
                verticalLineToRelative(3.77f)
                horizontalLineToRelative(-3.58f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.9f, 6.47f)
                horizontalLineToRelative(3.58f)
                verticalLineToRelative(3.77f)
                horizontalLineToRelative(-3.58f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.1f, 10.24f)
                horizontalLineToRelative(3.8f)
                verticalLineToRelative(3.77f)
                horizontalLineToRelative(-3.8f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.52f, 14.01f)
                horizontalLineToRelative(3.58f)
                verticalLineToRelative(3.77f)
                horizontalLineToRelative(-3.58f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.9f, 14.01f)
                horizontalLineToRelative(3.58f)
                verticalLineToRelative(3.77f)
                horizontalLineToRelative(-3.58f)
                close()
            }
        }.also { _ChessBoard = it}
