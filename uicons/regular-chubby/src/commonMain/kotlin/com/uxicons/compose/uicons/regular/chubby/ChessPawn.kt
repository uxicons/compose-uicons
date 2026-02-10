package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawn: ImageVector? = null

val Icons.Rc.ChessPawn: ImageVector
    get() = _ChessPawn ?: UXIcon(name = "ChessPawn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 21f)
                horizontalLineToRelative(-0.65f)
                curveToRelative(-1.37f, -0.6f, -2.76f, -2.38f, -3.66f, -4.73f)
                curveToRelative(-0.57f, -1.5f, -0.82f, -2.86f, -0.78f, -4.02f)
                horizontalLineToRelative(0.27f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.51f, -0.39f, -0.92f, -0.88f, -0.98f)
                curveToRelative(0.82f, -1.16f, 0.92f, -2.61f, 0.92f, -3.65f)
                curveToRelative(-0.01f, -3.77f, -1.89f, -5.61f, -5.74f, -5.62f)
                curveToRelative(-2f, -0.03f, -3.4f, 0.45f, -4.36f, 1.41f)
                curveToRelative(-1.22f, 1.22f, -1.36f, 2.97f, -1.35f, 4.18f)
                curveToRelative(0.01f, 1.55f, 0.35f, 2.76f, 0.99f, 3.67f)
                curveToRelative(-0.53f, 0.02f, -0.96f, 0.45f, -0.96f, 0.99f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.27f)
                curveToRelative(0.04f, 1.16f, -0.21f, 2.53f, -0.78f, 4.02f)
                curveToRelative(-0.89f, 2.35f, -2.28f, 4.13f, -3.66f, 4.73f)
                horizontalLineToRelative(-0.65f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(21.5f, 23f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(9.04f, 3.82f)
                curveToRelative(0.55f, -0.55f, 1.52f, -0.82f, 2.9f, -0.82f)
                horizontalLineToRelative(0.04f)
                curveToRelative(3.12f, 0.01f, 3.74f, 1.34f, 3.75f, 3.63f)
                curveToRelative(0.01f, 1.35f, -0.24f, 2.23f, -0.77f, 2.76f)
                curveToRelative(-0.55f, 0.55f, -1.52f, 0.82f, -2.9f, 0.82f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(-3.12f, -0.01f, -3.74f, -1.34f, -3.75f, -3.63f)
                curveToRelative(-0.01f, -1.35f, 0.24f, -2.23f, 0.77f, -2.76f)
                close()
                moveTo(8.67f, 16.98f)
                curveToRelative(0.66f, -1.74f, 0.95f, -3.32f, 0.91f, -4.73f)
                horizontalLineToRelative(4.84f)
                curveToRelative(-0.04f, 1.42f, 0.25f, 3.0f, 0.91f, 4.73f)
                curveToRelative(0.61f, 1.6f, 1.42f, 2.96f, 2.35f, 4.02f)
                lineTo(6.32f, 21.0f)
                curveToRelative(0.93f, -1.05f, 1.74f, -2.42f, 2.35f, -4.02f)
                close()
            }
        }.also { _ChessPawn = it}
