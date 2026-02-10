package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueen: ImageVector? = null

val Icons.Sc.ChessQueen: ImageVector
    get() = _ChessQueen ?: UXIcon(name = "ChessQueen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.56f, 7.73f)
                curveToRelative(0.97f, -0.4f, 2.1f, -0.59f, 3.44f, -0.59f)
                curveToRelative(1.35f, 0.02f, 2.48f, 0.21f, 3.44f, 0.59f)
                curveToRelative(0.96f, -0.4f, 2.09f, -0.59f, 3.4f, -0.59f)
                horizontalLineToRelative(0.14f)
                curveToRelative(0.01f, 0f, 0.03f, 0f, 0.04f, 0f)
                curveToRelative(-0.96f, -1.46f, -2.48f, -2.37f, -4.58f, -2.75f)
                curveToRelative(0.05f, -0.29f, 0.05f, -0.54f, 0.05f, -0.67f)
                curveToRelative(-0.01f, -2.14f, -1.55f, -2.46f, -2.47f, -2.47f)
                curveToRelative(-0.83f, 0.02f, -1.41f, 0.21f, -1.84f, 0.64f)
                curveToRelative(-0.63f, 0.63f, -0.63f, 1.53f, -0.63f, 1.82f)
                curveToRelative(0f, 0.24f, 0.02f, 0.45f, 0.06f, 0.65f)
                curveToRelative(-2.16f, 0.36f, -3.7f, 1.29f, -4.66f, 2.79f)
                curveToRelative(0.07f, -0.0f, 0.15f, -0.0f, 0.22f, -0.0f)
                curveToRelative(1.31f, 0.0f, 2.44f, 0.2f, 3.4f, 0.59f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.54f, 20.25f)
                horizontalLineTo(4.46f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(15.07f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.65f, 18.3f)
                curveToRelative(0.81f, -2.41f, 1.24f, -4.83f, 1.11f, -7.96f)
                curveToRelative(-0.02f, -0.43f, -0.3f, -0.8f, -0.71f, -0.92f)
                curveToRelative(-0.64f, -0.19f, -1.37f, -0.29f, -2.2f, -0.27f)
                curveToRelative(-1.43f, 0.01f, -2.55f, 0.28f, -3.4f, 0.84f)
                curveToRelative(-0.85f, -0.57f, -2.01f, -0.82f, -3.43f, -0.84f)
                curveToRelative(-1.45f, 0.0f, -2.59f, 0.27f, -3.44f, 0.84f)
                curveToRelative(-0.85f, -0.56f, -1.97f, -0.84f, -3.4f, -0.84f)
                curveToRelative(-0.87f, 0.0f, -1.57f, 0.09f, -2.2f, 0.27f)
                curveToRelative(-0.41f, 0.12f, -0.7f, 0.54f, -0.72f, 0.97f)
                curveToRelative(-0.13f, 3.09f, 0.3f, 5.51f, 1.11f, 7.91f)
                horizontalLineTo(20.65f)
                close()
            }
        }.also { _ChessQueen = it}
