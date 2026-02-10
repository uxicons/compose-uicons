package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HourglassStart: ImageVector? = null

val Icons.Ts.HourglassStart: ImageVector
    get() = _HourglassStart ?: UXIcon(name = "HourglassStart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.79f, 12f)
                curveToRelative(3.5f, -2.93f, 5.25f, -6.12f, 5.21f, -9.51f)
                curveToRelative(-0.01f, -1.36f, -1.14f, -2.47f, -2.5f, -2.47f)
                lineToRelative(-13.0f, 0.0f)
                curveTo(4.14f, 0.03f, 3.02f, 1.13f, 3f, 2.49f)
                curveToRelative(-0.04f, 3.4f, 1.71f, 6.59f, 5.21f, 9.51f)
                curveToRelative(-3.46f, 2.88f, -5.21f, 6.04f, -5.21f, 9.41f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2.59f)
                curveToRelative(0f, -3.35f, -1.75f, -6.51f, -5.21f, -9.41f)
                close()
                moveTo(20f, 23f)
                lineTo(4f, 23f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -3.2f, 1.79f, -6.23f, 5.31f, -9.02f)
                lineToRelative(0.5f, -0.39f)
                lineToRelative(-0.5f, -0.39f)
                curveToRelative(-3.56f, -2.82f, -5.35f, -5.88f, -5.31f, -9.1f)
                curveToRelative(0.01f, -0.82f, 0.68f, -1.48f, 1.5f, -1.48f)
                lineToRelative(13.0f, -0.0f)
                curveToRelative(0.82f, 0f, 1.49f, 0.67f, 1.5f, 1.48f)
                curveToRelative(0.04f, 3.21f, -1.75f, 6.27f, -5.31f, 9.1f)
                lineToRelative(-0.49f, 0.39f)
                lineToRelative(0.49f, 0.39f)
                curveToRelative(3.52f, 2.8f, 5.31f, 5.83f, 5.31f, 9.02f)
                verticalLineToRelative(1.59f)
                close()
                moveTo(17.43f, 3.6f)
                lineToRelative(0.09f, -0.58f)
                lineTo(6.64f, 3.02f)
                lineToRelative(0.09f, 0.58f)
                curveToRelative(0.53f, 3.31f, 3.41f, 5.64f, 5.08f, 6.74f)
                lineToRelative(0.27f, 0.18f)
                lineToRelative(0.27f, -0.18f)
                curveToRelative(1.67f, -1.09f, 4.54f, -3.41f, 5.06f, -6.74f)
                close()
                moveTo(12.09f, 9.32f)
                curveToRelative(-1.45f, -0.99f, -3.6f, -2.83f, -4.25f, -5.3f)
                horizontalLineToRelative(8.47f)
                curveToRelative(-0.65f, 2.48f, -2.79f, 4.31f, -4.22f, 5.3f)
                close()
            }
        }.also { _HourglassStart = it}
