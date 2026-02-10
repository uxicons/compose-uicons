package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseUnlock: ImageVector? = null

val Icons.Rs.HouseUnlock: ImageVector
    get() = _HouseUnlock ?: UXIcon(name = "HouseUnlock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.04f)
                verticalLineToRelative(0.97f)
                lineToRelative(-11.32f, -8.77f)
                curveToRelative(-0.4f, -0.31f, -0.95f, -0.31f, -1.35f, -0.0f)
                lineToRelative(-8.9f, 6.98f)
                curveToRelative(-0.26f, 0.21f, -0.42f, 0.53f, -0.42f, 0.86f)
                verticalLineToRelative(11.93f)
                horizontalLineToRelative(8.1f)
                curveToRelative(0.15f, 0.74f, 0.48f, 1.42f, 0.92f, 2f)
                horizontalLineToRelative(-11.03f)
                verticalLineToRelative(-13.93f)
                curveToRelative(0f, -0.96f, 0.43f, -1.85f, 1.19f, -2.44f)
                lineToRelative(8.9f, -6.98f)
                curveToRelative(1.12f, -0.88f, 2.69f, -0.88f, 3.82f, 0f)
                lineToRelative(8.9f, 6.94f)
                curveToRelative(0.75f, 0.59f, 1.19f, 1.48f, 1.19f, 2.44f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                curveToRelative(1.86f, 0f, 3.41f, 1.28f, 3.86f, 3f)
                horizontalLineToRelative(-2.14f)
                curveToRelative(-0.35f, -0.59f, -0.98f, -1f, -1.72f, -1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(14f, 16f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                close()
                moveTo(19f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _HouseUnlock = it}
