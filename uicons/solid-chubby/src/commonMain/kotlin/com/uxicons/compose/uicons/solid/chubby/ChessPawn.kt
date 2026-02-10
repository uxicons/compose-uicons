package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawn: ImageVector? = null

val Icons.Sc.ChessPawn: ImageVector
    get() = _ChessPawn ?: UXIcon(name = "ChessPawn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.44f, 20f)
                horizontalLineTo(2.56f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(21.44f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.34f, 12.32f)
                horizontalLineToRelative(9.32f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.76f, -0.57f, -1.39f, -1.3f, -1.49f)
                curveToRelative(0.51f, -1.0f, 0.58f, -2.14f, 0.58f, -2.99f)
                curveToRelative(-0.01f, -3.58f, -1.8f, -5.33f, -5.45f, -5.34f)
                curveToRelative(-1.9f, -0.02f, -3.23f, 0.43f, -4.14f, 1.34f)
                curveToRelative(-1.17f, 1.17f, -1.29f, 2.83f, -1.29f, 3.98f)
                curveToRelative(0.01f, 1.21f, 0.21f, 2.21f, 0.63f, 3.01f)
                curveToRelative(-0.76f, 0.08f, -1.35f, 0.71f, -1.35f, 1.49f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.16f, 15.81f)
                curveToRelative(-0.2f, -0.52f, -0.36f, -1.03f, -0.48f, -1.51f)
                horizontalLineTo(7.32f)
                curveToRelative(-0.12f, 0.49f, -0.28f, 0.99f, -0.48f, 1.51f)
                curveToRelative(-0.31f, 0.81f, -0.68f, 1.56f, -1.09f, 2.21f)
                horizontalLineToRelative(12.5f)
                curveToRelative(-0.41f, -0.65f, -0.78f, -1.4f, -1.09f, -2.21f)
                close()
            }
        }.also { _ChessPawn = it}
