package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseUnlock: ImageVector? = null

val Icons.Ss.HouseUnlock: ImageVector
    get() = _HouseUnlock ?: UXIcon(name = "HouseUnlock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 14f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                curveToRelative(0.74f, 0f, 1.38f, 0.41f, 1.72f, 1f)
                horizontalLineToRelative(2.14f)
                curveToRelative(-0.45f, -1.72f, -2.0f, -3f, -3.86f, -3f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(22.05f, 7f)
                horizontalLineToRelative(-4.04f)
                curveToRelative(-2.97f, 0f, -5.44f, 2.17f, -5.92f, 5f)
                horizontalLineToRelative(-2.08f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.13f, 0.39f, 2.16f, 1.03f, 3f)
                horizontalLineToRelative(-11.03f)
                verticalLineToRelative(-13.93f)
                curveToRelative(0f, -0.96f, 0.43f, -1.85f, 1.19f, -2.44f)
                lineToRelative(8.9f, -6.98f)
                curveToRelative(1.12f, -0.88f, 2.69f, -0.88f, 3.82f, 0f)
                close()
            }
        }.also { _HouseUnlock = it}
