package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _G: ImageVector? = null

val Icons.Tr.G: ImageVector
    get() = _G ?: UXIcon(name = "G") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.08f, 24f)
                curveToRelative(-2.74f, 0f, -5.25f, -1.04f, -7.15f, -2.93f)
                curveToRelative(-1.89f, -1.89f, -2.93f, -4.41f, -2.93f, -7.08f)
                verticalLineToRelative(-3.65f)
                curveTo(2f, 4.83f, 6.16f, 0.29f, 11.48f, 0.01f)
                curveToRelative(3.96f, -0.21f, 7.65f, 1.95f, 9.41f, 5.49f)
                curveToRelative(0.12f, 0.25f, 0.02f, 0.55f, -0.23f, 0.67f)
                curveToRelative(-0.25f, 0.12f, -0.55f, 0.02f, -0.67f, -0.23f)
                curveTo(18.41f, 2.76f, 15.1f, 0.82f, 11.53f, 1.01f)
                curveTo(6.75f, 1.26f, 3f, 5.36f, 3f, 10.34f)
                verticalLineToRelative(3.65f)
                curveToRelative(0.06f, 10.08f, 14.12f, 12.34f, 17.82f, 3.38f)
                curveToRelative(0.31f, -0.74f, 0.22f, -1.55f, -0.23f, -2.23f)
                curveToRelative(-0.47f, -0.71f, -1.26f, -1.13f, -2.11f, -1.13f)
                horizontalLineToRelative(-5.97f)
                curveToRelative(-0.65f, 0.01f, -0.65f, -1.01f, 0f, -1f)
                horizontalLineToRelative(5.97f)
                curveToRelative(1.18f, 0f, 2.28f, 0.59f, 2.94f, 1.58f)
                curveToRelative(0.64f, 0.96f, 0.76f, 2.12f, 0.33f, 3.17f)
                curveToRelative(-1.62f, 3.92f, -5.23f, 6.25f, -9.66f, 6.25f)
                close()
            }
        }.also { _G = it}
