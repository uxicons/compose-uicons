package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineBottle: ImageVector? = null

val Icons.Sc.WineBottle: ImageVector
    get() = _WineBottle ?: UXIcon(name = "WineBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.05f, 4f)
                curveToRelative(0.04f, -0.56f, 0.09f, -1.13f, 0.16f, -1.69f)
                curveToRelative(0.09f, -0.74f, 0.73f, -1.31f, 1.49f, -1.31f)
                horizontalLineToRelative(2.6f)
                curveToRelative(0.76f, 0f, 1.4f, 0.56f, 1.49f, 1.31f)
                curveToRelative(0.07f, 0.56f, 0.12f, 1.13f, 0.16f, 1.69f)
                close()
                moveTo(19.08f, 11.01f)
                curveToRelative(-0.24f, -0.51f, -1.15f, -1.97f, -4.08f, -3.19f)
                verticalLineToRelative(-1.82f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1.82f)
                curveToRelative(-2.93f, 1.22f, -3.84f, 2.68f, -4.08f, 3.19f)
                curveToRelative(-0.17f, 0.27f, -0.49f, 0.88f, -0.71f, 1.99f)
                horizontalLineToRelative(10.79f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-10.98f)
                curveToRelative(-0.01f, 0.17f, -0.01f, 0.32f, -0.01f, 0.5f)
                curveToRelative(0f, 3.12f, 0.81f, 5.75f, 0.84f, 5.86f)
                curveToRelative(0.07f, 0.22f, 0.21f, 0.41f, 0.4f, 0.53f)
                curveToRelative(0.28f, 0.18f, 1.9f, 1.1f, 6.75f, 1.1f)
                reflectiveCurveToRelative(6.48f, -0.92f, 6.75f, -1.1f)
                curveToRelative(0.19f, -0.13f, 0.33f, -0.32f, 0.4f, -0.53f)
                curveToRelative(0.04f, -0.11f, 0.84f, -2.75f, 0.84f, -5.86f)
                curveToRelative(0f, -2.78f, -0.64f, -4.06f, -0.92f, -4.49f)
                close()
            }
        }.also { _WineBottle = it}
