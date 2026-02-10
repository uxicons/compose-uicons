package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _G: ImageVector? = null

val Icons.Ts.G: ImageVector
    get() = _G ?: UXIcon(name = "G") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                verticalLineToRelative(-4f)
                curveTo(2f, 4.49f, 6.49f, 0f, 12f, 0f)
                curveToRelative(4.12f, 0f, 7.77f, 2.48f, 9.3f, 6.31f)
                lineToRelative(-0.93f, 0.37f)
                curveToRelative(-1.37f, -3.45f, -4.65f, -5.68f, -8.37f, -5.68f)
                curveTo(7.04f, 1f, 3f, 5.04f, 3f, 10f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                curveToRelative(3.94f, 0f, 7.7f, -2.54f, 8.92f, -6.03f)
                curveToRelative(0.16f, -0.45f, 0.09f, -0.94f, -0.19f, -1.33f)
                curveToRelative(-0.29f, -0.41f, -0.74f, -0.64f, -1.24f, -0.64f)
                horizontalLineToRelative(-6.49f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.49f)
                curveToRelative(0.81f, 0f, 1.58f, 0.4f, 2.05f, 1.06f)
                curveToRelative(0.47f, 0.66f, 0.59f, 1.48f, 0.32f, 2.24f)
                curveToRelative(-1.36f, 3.88f, -5.5f, 6.7f, -9.86f, 6.7f)
                close()
            }
        }.also { _G = it}
