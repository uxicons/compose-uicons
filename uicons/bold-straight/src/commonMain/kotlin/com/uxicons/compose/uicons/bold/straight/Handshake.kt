package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Handshake: ImageVector? = null

val Icons.Bs.Handshake: ImageVector
    get() = _Handshake ?: UXIcon(name = "Handshake") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.17f, 4.26f)
                lineToRelative(3.48f, 1.74f)
                horizontalLineToRelative(3.35f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2.65f)
                lineToRelative(-2.84f, -1.42f)
                curveToRelative(-2.0f, -1.0f, -4.61f, -0.6f, -6.15f, 0.86f)
                lineToRelative(-0.36f, 0.3f)
                lineToRelative(-0.34f, -0.31f)
                curveToRelative(-1.01f, -0.92f, -2.32f, -1.43f, -3.73f, -1.43f)
                curveToRelative(-0.85f, 0f, -1.7f, 0.2f, -2.45f, 0.58f)
                lineToRelative(-2.84f, 1.42f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(3.35f)
                lineToRelative(3.48f, -1.74f)
                curveToRelative(0.84f, -0.42f, 2.05f, -0.31f, 2.81f, 0.39f)
                lineToRelative(0.05f, 0.05f)
                lineToRelative(-3.79f, 3.21f)
                curveToRelative(-1.04f, 1.05f, -1.2f, 2.71f, -0.37f, 3.86f)
                curveToRelative(0.51f, 0.71f, 1.3f, 1.16f, 2.17f, 1.23f)
                curveToRelative(0.84f, 0.07f, 1.67f, -0.23f, 2.28f, -0.81f)
                lineToRelative(2.07f, -1.77f)
                lineToRelative(6.54f, 4.99f)
                lineToRelative(-6.59f, 4.84f)
                lineTo(3.49f, 14f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(2.51f)
                lineToRelative(9.49f, 6.98f)
                lineToRelative(9.49f, -6.98f)
                horizontalLineToRelative(2.51f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.31f)
                lineTo(12.04f, 6.63f)
                lineToRelative(2.32f, -1.96f)
                curveToRelative(0.74f, -0.7f, 1.9f, -0.87f, 2.81f, -0.41f)
                close()
            }
        }.also { _Handshake = it}
