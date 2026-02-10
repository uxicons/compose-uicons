package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseUnlock: ImageVector? = null

val Icons.Bs.HouseUnlock: ImageVector
    get() = _HouseUnlock ?: UXIcon(name = "HouseUnlock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 15f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.65f, 0f, 1.2f, 0.42f, 1.41f, 1f)
                horizontalLineToRelative(3.04f)
                curveToRelative(-0.25f, -2.24f, -2.14f, -4f, -4.45f, -4f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(20f, 21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(3f, 10.16f)
                verticalLineToRelative(10.82f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(0.01f)
                lineToRelative(2.0f, -0.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0f, 1.13f, 0.39f, 2.16f, 1.02f, 3.0f)
                lineToRelative(-4.02f, 0.0f)
                verticalLineToRelative(-0.01f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-13.82f)
                curveToRelative(0f, -1.08f, 0.49f, -2.09f, 1.34f, -2.76f)
                lineToRelative(8.5f, -6.65f)
                curveToRelative(1.27f, -0.99f, 3.04f, -0.99f, 4.31f, 0f)
                lineToRelative(4.55f, 3.56f)
                lineToRelative(3.43f, 2.68f)
                horizontalLineToRelative(-3.64f)
                curveToRelative(-0.38f, 0f, -0.74f, 0.04f, -1.1f, 0.1f)
                lineToRelative(-0.54f, -0.42f)
                lineToRelative(-4.55f, -3.56f)
                curveToRelative(-0.18f, -0.14f, -0.43f, -0.14f, -0.61f, 0f)
                lineToRelative(-8.5f, 6.65f)
                curveToRelative(-0.12f, 0.1f, -0.19f, 0.24f, -0.19f, 0.39f)
                close()
            }
        }.also { _HouseUnlock = it}
