package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartHalf: ImageVector? = null

val Icons.Tc.HeartHalf: ImageVector
    get() = _HeartHalf ?: UXIcon(name = "HeartHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 21f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(-0.5f, -0.01f)
                curveToRelative(-1.37f, 0f, -2.72f, -0.36f, -3.9f, -1.03f)
                curveToRelative(-1.25f, -0.71f, -2.28f, -1.44f, -3.15f, -2.23f)
                curveToRelative(-2.65f, -2.39f, -3.9f, -4.68f, -3.94f, -7.22f)
                curveToRelative(0.13f, -4.34f, 2.88f, -7.49f, 6.53f, -7.51f)
                curveToRelative(1.36f, 0.06f, 2.5f, 0.6f, 3.4f, 1.6f)
                lineToRelative(1.94f, 2.06f)
                curveToRelative(0.09f, 0.09f, 0.14f, 0.21f, 0.14f, 0.34f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.01f, 0.27f, -0.23f, 0.51f, -0.5f, 0.5f)
                close()
                moveTo(7.51f, 3.99f)
                curveToRelative(-3.12f, 0.02f, -5.39f, 2.7f, -5.51f, 6.52f)
                curveToRelative(0.03f, 2.22f, 1.18f, 4.28f, 3.61f, 6.47f)
                curveToRelative(0.82f, 0.74f, 1.8f, 1.43f, 2.98f, 2.1f)
                curveToRelative(1.03f, 0.59f, 2.21f, 0.9f, 3.41f, 0.9f)
                verticalLineToRelative(-12.79f)
                lineToRelative(-1.81f, -1.92f)
                curveToRelative(-0.74f, -0.82f, -1.61f, -1.24f, -2.68f, -1.28f)
                close()
            }
        }.also { _HeartHalf = it}
