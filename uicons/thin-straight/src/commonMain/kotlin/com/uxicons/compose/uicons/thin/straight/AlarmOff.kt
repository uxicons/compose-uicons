package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlarmOff: ImageVector? = null

val Icons.Ts.AlarmOff: ImageVector
    get() = _AlarmOff ?: UXIcon(name = "AlarmOff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.8f, 1.33f)
                lineToRelative(0.5f, -0.86f)
                curveToRelative(1.65f, 0.96f, 3.07f, 2.22f, 4.23f, 3.73f)
                lineToRelative(-0.8f, 0.61f)
                curveToRelative(-1.08f, -1.41f, -2.4f, -2.58f, -3.94f, -3.48f)
                close()
                moveTo(24f, 23.29f)
                lineTo(23.29f, 24f)
                lineTo(0f, 0.71f)
                lineTo(0.71f, 0f)
                lineTo(2.64f, 1.94f)
                curveToRelative(0.64f, -0.54f, 1.32f, -1.04f, 2.05f, -1.46f)
                lineToRelative(0.51f, 0.86f)
                curveToRelative(-0.65f, 0.38f, -1.26f, 0.83f, -1.84f, 1.31f)
                lineToRelative(1.77f, 1.77f)
                curveToRelative(1.81f, -1.46f, 4.05f, -2.29f, 6.37f, -2.4f)
                verticalLineToRelative(-2.02f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.02f)
                curveToRelative(5.83f, 0.26f, 10.5f, 5.08f, 10.5f, 10.97f)
                curveToRelative(0f, 2.5f, -0.86f, 4.93f, -2.42f, 6.87f)
                close()
                moveTo(5.84f, 5.13f)
                lineTo(11.5f, 10.79f)
                verticalLineToRelative(-5.79f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6.79f)
                lineToRelative(0.71f, 0.71f)
                horizontalLineToRelative(4.79f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.79f)
                lineToRelative(5.66f, 5.66f)
                curveToRelative(1.37f, -1.75f, 2.13f, -3.92f, 2.13f, -6.16f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                curveToRelative(-2.24f, 0f, -4.41f, 0.76f, -6.16f, 2.13f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                curveToRelative(0f, -2.06f, 0.64f, -4.03f, 1.78f, -5.68f)
                lineToRelative(-0.72f, -0.72f)
                curveToRelative(-1.33f, 1.85f, -2.07f, 4.08f, -2.07f, 6.4f)
                curveToRelative(0f, 3.05f, 1.25f, 5.82f, 3.27f, 7.81f)
                lineToRelative(-2.14f, 2.35f)
                lineToRelative(0.74f, 0.67f)
                lineToRelative(2.14f, -2.35f)
                curveToRelative(1.9f, 1.57f, 4.34f, 2.51f, 6.99f, 2.51f)
                curveToRelative(2.32f, 0f, 4.55f, -0.74f, 6.4f, -2.07f)
                lineToRelative(-0.72f, -0.72f)
                curveToRelative(-1.65f, 1.15f, -3.62f, 1.79f, -5.68f, 1.79f)
                close()
            }
        }.also { _AlarmOff = it}
