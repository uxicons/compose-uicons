package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampDesk: ImageVector? = null

val Icons.Ts.LampDesk: ImageVector
    get() = _LampDesk ?: UXIcon(name = "LampDesk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.67f, 5.42f)
                lineTo(16.81f, 0.85f)
                curveToRelative(-1.73f, -1.16f, -4.06f, -0.92f, -5.53f, 0.55f)
                curveToRelative(-1.32f, 1.32f, -1.64f, 3.32f, -0.86f, 4.97f)
                lineToRelative(-4.42f, 4.42f)
                verticalLineToRelative(12.21f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-11.79f)
                lineToRelative(3.95f, -3.95f)
                lineToRelative(4.35f, 6.53f)
                lineToRelative(2.19f, -2.19f)
                curveToRelative(0.46f, 0.27f, 0.98f, 0.4f, 1.5f, 0.4f)
                curveToRelative(0.77f, 0f, 1.54f, -0.29f, 2.12f, -0.88f)
                curveToRelative(0.98f, -0.98f, 1.14f, -2.48f, 0.47f, -3.62f)
                lineToRelative(2.07f, -2.07f)
                close()
                moveTo(11.57f, 6.37f)
                curveToRelative(-0.89f, -1.34f, -0.71f, -3.13f, 0.42f, -4.27f)
                curveToRelative(0.65f, -0.65f, 1.52f, -0.99f, 2.39f, -0.99f)
                curveToRelative(0.65f, 0f, 1.3f, 0.19f, 1.87f, 0.56f)
                lineToRelative(5.84f, 3.9f)
                lineToRelative(-6.64f, 6.64f)
                lineToRelative(-3.9f, -5.84f)
                close()
                moveTo(20.41f, 10.41f)
                curveToRelative(-0.59f, 0.59f, -1.45f, 0.73f, -2.17f, 0.44f)
                lineToRelative(2.61f, -2.61f)
                curveToRelative(0.29f, 0.72f, 0.15f, 1.59f, -0.44f, 2.17f)
                close()
            }
        }.also { _LampDesk = it}
