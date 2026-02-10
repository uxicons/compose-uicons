package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _G: ImageVector? = null

val Icons.Ss.G: ImageVector
    get() = _G ?: UXIcon(name = "G") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-5.5f, 0f, -9.98f, -4.49f, -9.98f, -10f)
                verticalLineToRelative(-4f)
                curveTo(2.02f, 4.49f, 6.51f, 0f, 12.02f, 0f)
                curveToRelative(3.82f, 0f, 7.26f, 2.13f, 8.96f, 5.55f)
                lineToRelative(-1.79f, 0.89f)
                curveToRelative(-1.36f, -2.74f, -4.11f, -4.45f, -7.17f, -4.45f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 4.41f, 3.58f, 8f, 7.98f, 8f)
                curveToRelative(3.63f, 0f, 6.98f, -2.41f, 7.96f, -5.72f)
                curveToRelative(0.09f, -0.3f, 0.03f, -0.61f, -0.16f, -0.87f)
                curveToRelative(-0.19f, -0.26f, -0.49f, -0.41f, -0.81f, -0.41f)
                horizontalLineToRelative(-5.99f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.99f)
                curveToRelative(0.96f, 0f, 1.84f, 0.44f, 2.41f, 1.21f)
                curveToRelative(0.57f, 0.76f, 0.74f, 1.72f, 0.47f, 2.63f)
                curveToRelative(-1.23f, 4.15f, -5.38f, 7.16f, -9.88f, 7.16f)
                close()
            }
        }.also { _G = it}
