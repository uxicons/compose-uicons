package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmOff: ImageVector? = null

val Icons.Ss.AlarmOff: ImageVector
    get() = _AlarmOff ?: UXIcon(name = "AlarmOff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.77f, 7.02f)
                lineToRelative(15.2f, 15.2f)
                curveToRelative(-1.76f, 1.14f, -3.83f, 1.78f, -5.98f, 1.78f)
                curveToRelative(-2.47f, 0f, -4.74f, -0.83f, -6.58f, -2.2f)
                lineToRelative(-1.93f, 2.13f)
                lineToRelative(-1.48f, -1.35f)
                lineToRelative(1.93f, -2.12f)
                curveToRelative(-1.82f, -1.96f, -2.94f, -4.58f, -2.94f, -7.46f)
                curveToRelative(0f, -2.15f, 0.64f, -4.21f, 1.78f, -5.98f)
                close()
                moveTo(22.31f, 5.12f)
                lineTo(23.97f, 4.01f)
                curveToRelative(-1.2f, -1.59f, -2.71f, -2.94f, -4.44f, -3.96f)
                lineToRelative(-1.07f, 1.69f)
                curveToRelative(1.49f, 0.86f, 2.8f, 2.01f, 3.84f, 3.38f)
                close()
                moveTo(20.88f, 19.47f)
                lineTo(23.94f, 22.54f)
                lineTo(22.53f, 23.96f)
                lineTo(0.03f, 1.46f)
                lineTo(1.44f, 0.04f)
                lineTo(2.69f, 1.29f)
                curveToRelative(0.56f, -0.45f, 1.14f, -0.87f, 1.75f, -1.23f)
                lineToRelative(1.07f, 1.69f)
                curveToRelative(-0.49f, 0.28f, -0.96f, 0.61f, -1.41f, 0.96f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(1.6f, -1.17f, 3.5f, -1.89f, 5.47f, -2.06f)
                verticalLineToRelative(-2.05f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.05f)
                curveToRelative(5.6f, 0.51f, 10f, 5.22f, 10f, 10.95f)
                curveToRelative(0f, 2.33f, -0.75f, 4.6f, -2.11f, 6.47f)
                close()
                moveTo(16.99f, 12f)
                horizontalLineToRelative(-3.59f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(1.59f)
                close()
                moveTo(10.99f, 9.59f)
                lineTo(12.99f, 11.59f)
                verticalLineToRelative(-5.59f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _AlarmOff = it}
