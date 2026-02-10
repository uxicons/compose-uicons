package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothAlt: ImageVector? = null

val Icons.Br.BluetoothAlt: ImageVector
    get() = _BluetoothAlt ?: UXIcon(name = "BluetoothAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.39f, 12f)
            lineToRelative(4.64f, -3.6f)
            curveToRelative(0.6f, -0.49f, 0.95f, -1.21f, 0.96f, -1.99f)
            curveToRelative(0.01f, -0.78f, -0.33f, -1.51f, -0.96f, -2.04f)
            lineTo(14.27f, 0.62f)
            curveToRelative(-0.78f, -0.66f, -1.84f, -0.8f, -2.77f, -0.37f)
            curveToRelative(-0.93f, 0.43f, -1.5f, 1.33f, -1.5f, 2.35f)
            verticalLineToRelative(6.0f)
            lineToRelative(-3.58f, -2.78f)
            curveToRelative(-0.65f, -0.51f, -1.6f, -0.39f, -2.1f, 0.27f)
            curveToRelative(-0.51f, 0.66f, -0.39f, 1.6f, 0.27f, 2.1f)
            lineToRelative(4.92f, 3.81f)
            lineToRelative(-4.92f, 3.81f)
            curveToRelative(-0.66f, 0.51f, -0.77f, 1.45f, -0.27f, 2.1f)
            curveToRelative(0.51f, 0.65f, 1.45f, 0.77f, 2.1f, 0.27f)
            lineToRelative(3.58f, -2.78f)
            verticalLineToRelative(6.0f)
            curveToRelative(0f, 1.02f, 0.57f, 1.92f, 1.5f, 2.35f)
            curveToRelative(0.36f, 0.17f, 0.74f, 0.25f, 1.11f, 0.25f)
            curveToRelative(0.59f, 0f, 1.16f, -0.2f, 1.61f, -0.58f)
            lineToRelative(4.86f, -3.82f)
            curveToRelative(0.59f, -0.5f, 0.93f, -1.23f, 0.92f, -2.01f)
            curveToRelative(-0.01f, -0.78f, -0.36f, -1.5f, -0.99f, -2.0f)
            lineToRelative(-4.62f, -3.58f)
            close()
            moveTo(13f, 3.43f)
            lineToRelative(3.75f, 2.94f)
            lineToRelative(-3.75f, 2.91f)
            lineTo(13f, 3.43f)
            close()
            moveTo(13f, 20.57f)
            verticalLineToRelative(-5.85f)
            lineToRelative(3.75f, 2.9f)
            lineToRelative(-3.75f, 2.94f)
            close()
        }
    }.also { _BluetoothAlt = it }
