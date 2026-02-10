package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Germany: ImageVector? = null

val Icons.Ss.Germany: ImageVector
    get() = _Germany ?: UXIcon(name = "Germany") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.41f, 24f)
                horizontalLineToRelative(-0.83f)
                lineToRelative(-2.28f, -1f)
                horizontalLineToRelative(-3.29f)
                lineToRelative(-0.72f, -2.54f)
                lineToRelative(0.69f, -1.99f)
                lineToRelative(-1.51f, -0.36f)
                lineToRelative(-1.98f, -3.5f)
                lineToRelative(0.81f, -1.18f)
                lineToRelative(-0.32f, -0.8f)
                lineToRelative(0.41f, -4.03f)
                lineToRelative(1.42f, -0.33f)
                lineToRelative(0.85f, -5.29f)
                horizontalLineToRelative(2.43f)
                lineToRelative(0.63f, -0.64f)
                lineToRelative(0.32f, -2.36f)
                horizontalLineToRelative(1.17f)
                lineToRelative(1.6f, 1f)
                horizontalLineToRelative(2.2f)
                verticalLineToRelative(0.97f)
                lineToRelative(2.71f, -0.71f)
                lineToRelative(3.29f, 2.78f)
                verticalLineToRelative(2.13f)
                lineToRelative(1.53f, 2.04f)
                lineToRelative(-0.83f, 1.88f)
                lineToRelative(0.79f, 1.92f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-1.5f, 2f)
                horizontalLineToRelative(-1.86f)
                lineToRelative(0.93f, 1.7f)
                lineToRelative(2.86f, 2.21f)
                lineToRelative(-1.93f, 2.44f)
                verticalLineToRelative(2.65f)
                horizontalLineToRelative(-2.37f)
                lineToRelative(-1.76f, 0.46f)
                lineToRelative(-0.86f, -0.14f)
                curveToRelative(-0.12f, 0.17f, -0.6f, 0.68f, -0.6f, 0.68f)
                close()
            }
        }.also { _Germany = it}
