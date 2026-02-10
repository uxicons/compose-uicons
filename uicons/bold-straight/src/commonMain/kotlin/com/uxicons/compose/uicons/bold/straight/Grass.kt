package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Grass: ImageVector? = null

val Icons.Bs.Grass: ImageVector
    get() = _Grass ?: UXIcon(name = "Grass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.03f)
                curveToRelative(-2.04f, 0.71f, -3.59f, 1.86f, -4.77f, 3.2f)
                curveToRelative(-0.96f, 3.74f, -1.18f, 6.92f, -1.22f, 9.77f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(-0.05f, -6.14f, 1.94f, -15.28f, 6.79f, -20.9f)
                curveToRelative(-6.65f, 1.19f, -10.37f, 5.24f, -12.42f, 9.65f)
                curveToRelative(-1.28f, -3.32f, -3.49f, -6.42f, -7.32f, -7.76f)
                curveToRelative(3.79f, 5.98f, 4.79f, 13.04f, 4.97f, 18.19f)
                curveToRelative(-0.01f, 0.28f, -0.01f, 0.56f, -0.02f, 0.81f)
                horizontalLineToRelative(-2.47f)
                curveToRelative(0f, -1.86f, -0.24f, -4.88f, -0.92f, -8.14f)
                curveToRelative(-1.4f, -0.99f, -3.28f, -2.08f, -4.56f, -2.53f)
                curveToRelative(2.24f, 3.58f, 2.87f, 6.51f, 2.98f, 10.67f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                lineTo(24f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.01f)
                curveToRelative(-0.05f, -4.49f, -0.13f, -8.96f, 3.01f, -12.97f)
                close()
                moveTo(15.18f, 7.41f)
                curveToRelative(-1.76f, 5.09f, -2.12f, 9.74f, -2.17f, 13.59f)
                horizontalLineToRelative(-1.99f)
                curveToRelative(0.03f, -2.84f, 0.31f, -8.71f, 4.15f, -13.59f)
                close()
            }
        }.also { _Grass = it}
