package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothAlt: ImageVector? = null

val Icons.Tr.BluetoothAlt: ImageVector
    get() = _BluetoothAlt ?: UXIcon(name = "BluetoothAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.32f, 16.54f)
                lineToRelative(-7.36f, -4.54f)
                lineToRelative(7.42f, -4.56f)
                curveToRelative(0.83f, -0.66f, 0.84f, -1.97f, -0.01f, -2.65f)
                lineTo(12.79f, 0.4f)
                curveToRelative(-1.04f, -0.94f, -2.84f, -0.11f, -2.79f, 1.29f)
                lineTo(10f, 10.8f)
                lineToRelative(-5.24f, -3.23f)
                curveToRelative(-0.55f, -0.35f, -1.08f, 0.52f, -0.52f, 0.85f)
                lineToRelative(5.76f, 3.55f)
                verticalLineToRelative(0.06f)
                lineToRelative(-5.76f, 3.54f)
                curveToRelative(-0.56f, 0.33f, -0.02f, 1.2f, 0.52f, 0.85f)
                lineToRelative(5.24f, -3.22f)
                verticalLineToRelative(9.1f)
                curveToRelative(-0.06f, 1.37f, 1.72f, 2.23f, 2.75f, 1.33f)
                lineToRelative(6.65f, -4.44f)
                curveToRelative(0.82f, -0.68f, 0.8f, -1.99f, -0.08f, -2.65f)
                close()
                moveTo(11f, 1.7f)
                curveToRelative(-0.01f, -0.6f, 0.72f, -0.93f, 1.19f, -0.5f)
                lineToRelative(6.56f, 4.39f)
                curveToRelative(0.32f, 0.23f, 0.31f, 0.81f, 0.04f, 1.04f)
                lineToRelative(-7.79f, 4.79f)
                horizontalLineToRelative(-0.0f)
                lineTo(11f, 1.7f)
                close()
                moveTo(18.8f, 18.4f)
                lineToRelative(-6.65f, 4.44f)
                curveToRelative(-0.43f, 0.39f, -1.17f, 0.04f, -1.15f, -0.53f)
                lineTo(11.0f, 12.59f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(7.74f, 4.77f, 7.74f, 4.77f)
                curveToRelative(0.33f, 0.23f, 0.33f, 0.81f, 0.06f, 1.04f)
                close()
            }
        }.also { _BluetoothAlt = it}
