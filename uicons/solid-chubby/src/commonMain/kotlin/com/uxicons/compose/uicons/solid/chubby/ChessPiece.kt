package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPiece: ImageVector? = null

val Icons.Sc.ChessPiece: ImageVector
    get() = _ChessPiece ?: UXIcon(name = "ChessPiece") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.95f, 20.0f)
                curveToRelative(-0.22f, -1.13f, -0.61f, -2.09f, -0.63f, -2.13f)
                curveToRelative(-0.14f, -0.28f, -0.4f, -0.48f, -0.71f, -0.53f)
                curveToRelative(-3.53f, -0.67f, -5.68f, -0.67f, -9.21f, 0f)
                curveToRelative(-0.31f, 0.06f, -0.57f, 0.26f, -0.71f, 0.54f)
                curveToRelative(-0.02f, 0.05f, -0.41f, 1.0f, -0.63f, 2.13f)
                curveToRelative(-0.72f, 0.11f, -1.27f, 0.73f, -1.27f, 1.48f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(11.44f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.75f, -0.55f, -1.37f, -1.27f, -1.48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.87f, 9.28f)
                horizontalLineToRelative(6.27f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.76f, -0.57f, -1.39f, -1.31f, -1.49f)
                curveToRelative(0.34f, -1.16f, 0.04f, -2.53f, -0.91f, -3.77f)
                curveToRelative(-0.17f, -0.21f, -0.35f, -0.44f, -0.53f, -0.66f)
                curveToRelative(-0.94f, -1.13f, -2.83f, -1.13f, -3.77f, 0f)
                curveToRelative(-0.18f, 0.22f, -0.36f, 0.44f, -0.53f, 0.66f)
                curveToRelative(-0.95f, 1.23f, -1.25f, 2.6f, -0.91f, 3.76f)
                curveToRelative(-0.74f, 0.09f, -1.31f, 0.72f, -1.31f, 1.49f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.69f, 11.24f)
                horizontalLineToRelative(-7.37f)
                lineToRelative(-0.07f, 0.64f)
                curveToRelative(-0.14f, 1.21f, -0.37f, 2.29f, -0.68f, 3.38f)
                curveToRelative(1.71f, -0.3f, 3.09f, -0.43f, 4.44f, -0.43f)
                reflectiveCurveToRelative(2.73f, 0.14f, 4.44f, 0.44f)
                curveToRelative(-0.31f, -1.08f, -0.54f, -2.17f, -0.68f, -3.38f)
                lineToRelative(-0.07f, -0.64f)
                close()
            }
        }.also { _ChessPiece = it}
