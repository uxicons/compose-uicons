package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _G: ImageVector? = null

val Icons.Bs.G: ImageVector
    get() = _G ?: UXIcon(name = "G") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 24.0f)
                curveToRelative(-0.98f, 0f, -1.96f, -0.14f, -2.92f, -0.42f)
                curveToRelative(-4.17f, -1.24f, -7.08f, -5.25f, -7.08f, -9.77f)
                verticalLineToRelative(-3.47f)
                curveToRelative(0f, -2.81f, 1.17f, -5.55f, 3.2f, -7.52f)
                curveTo(7.16f, 0.91f, 9.7f, -0.1f, 12.36f, 0.01f)
                curveToRelative(3.71f, 0.12f, 7.05f, 2.27f, 8.7f, 5.6f)
                lineToRelative(-2.69f, 1.33f)
                curveToRelative(-1.16f, -2.34f, -3.51f, -3.85f, -6.11f, -3.94f)
                curveToRelative(-1.83f, -0.06f, -3.6f, 0.64f, -4.98f, 1.96f)
                curveToRelative(-1.45f, 1.4f, -2.28f, 3.36f, -2.28f, 5.36f)
                verticalLineToRelative(3.47f)
                curveToRelative(0f, 3.2f, 2.03f, 6.03f, 4.93f, 6.89f)
                curveToRelative(2.26f, 0.67f, 4.62f, 0.23f, 6.46f, -1.2f)
                curveToRelative(1.47f, -1.14f, 2.38f, -2.75f, 2.57f, -4.5f)
                horizontalLineToRelative(-5.97f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                curveToRelative(0.11f, 3.04f, -1.26f, 5.93f, -3.76f, 7.87f)
                curveToRelative(-1.8f, 1.39f, -4.0f, 2.12f, -6.24f, 2.12f)
                close()
            }
        }.also { _G = it}
