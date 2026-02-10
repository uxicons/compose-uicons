package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RockingHorse: ImageVector? = null

val Icons.Sr.RockingHorse: ImageVector
    get() = _RockingHorse ?: UXIcon(name = "RockingHorse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10f)
                verticalLineToRelative(-1.08f)
                curveToRelative(0f, -0.95f, -0.56f, -1.84f, -1.43f, -2.26f)
                curveToRelative(-1.45f, -0.7f, -2.82f, -1.35f, -3.33f, -3.4f)
                lineToRelative(-0.24f, -0.76f)
                verticalLineToRelative(-2.5f)
                curveToRelative(-1.65f, 0f, -2.99f, 1.34f, -3.0f, 2.99f)
                curveToRelative(-2.31f, 1.11f, -3.0f, 3.88f, -3.0f, 5.51f)
                curveToRelative(0f, 0.04f, 0.46f, 3.42f, -2f, 3.5f)
                curveToRelative(-0.45f, -0.05f, -1.83f, 0.17f, -2.65f, 0.36f)
                curveToRelative(-0.59f, -1.7f, -2.49f, -4.36f, -6.35f, -4.36f)
                verticalLineToRelative(2f)
                curveToRelative(3.0f, 0f, 4.11f, 2.12f, 4.42f, 2.93f)
                curveToRelative(-4.22f, 1.64f, -6.31f, 4.91f, -6.43f, 5.09f)
                lineToRelative(1.69f, 1.06f)
                curveToRelative(0.13f, -0.21f, 3.29f, -5.08f, 9.78f, -5.08f)
                curveToRelative(0.27f, 0f, 0.53f, 0.02f, 0.79f, 0.04f)
                lineToRelative(-3.94f, 3.23f)
                lineToRelative(3.53f, 2.34f)
                lineToRelative(-2.79f, 2.4f)
                horizontalLineToRelative(-4.05f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6.88f)
                lineToRelative(3.03f, -2.61f)
                lineToRelative(-3.47f, -2.3f)
                lineToRelative(3.21f, -2.62f)
                curveToRelative(4.6f, 1.27f, 7.45f, 4.67f, 7.49f, 4.72f)
                lineToRelative(1.55f, -1.27f)
                curveToRelative(-0.1f, -0.13f, -1.51f, -1.8f, -3.93f, -3.34f)
                verticalLineToRelative(-4.08f)
                lineToRelative(4f, -0.5f)
                close()
            }
        }.also { _RockingHorse = it}
