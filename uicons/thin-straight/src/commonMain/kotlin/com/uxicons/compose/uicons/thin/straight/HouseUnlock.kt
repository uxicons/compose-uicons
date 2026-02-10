package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseUnlock: ImageVector? = null

val Icons.Ts.HouseUnlock: ImageVector
    get() = _HouseUnlock ?: UXIcon(name = "HouseUnlock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 13.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(1.21f, 0f, 2.22f, 0.86f, 2.45f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(-0.24f, -1.69f, -1.69f, -3f, -3.45f, -3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(6f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(23f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(9f)
                close()
                moveTo(19f, 20.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                close()
                moveTo(24f, 9.99f)
                verticalLineToRelative(3.51f)
                curveToRelative(0f, -1.18f, -0.37f, -2.26f, -1f, -3.16f)
                verticalLineToRelative(-0.36f)
                curveToRelative(0f, -0.53f, -0.24f, -1.01f, -0.65f, -1.33f)
                reflectiveCurveToRelative(-9.31f, -7.29f, -9.31f, -7.29f)
                curveToRelative(-0.61f, -0.48f, -1.47f, -0.48f, -2.08f, 0f)
                lineToRelative(-9.31f, 7.29f)
                curveToRelative(-0.41f, 0.32f, -0.65f, 0.81f, -0.65f, 1.33f)
                verticalLineToRelative(13.01f)
                horizontalLineToRelative(10.14f)
                curveToRelative(0.09f, 0.36f, 0.23f, 0.69f, 0.41f, 1f)
                horizontalLineToRelative(-11.55f)
                verticalLineToRelative(-14.01f)
                curveToRelative(0f, -0.83f, 0.38f, -1.61f, 1.03f, -2.12f)
                lineToRelative(9.31f, -7.29f)
                curveToRelative(0.98f, -0.77f, 2.34f, -0.77f, 3.32f, 0f)
                lineToRelative(9.31f, 7.29f)
                curveToRelative(0.66f, 0.51f, 1.03f, 1.29f, 1.03f, 2.12f)
                close()
            }
        }.also { _HouseUnlock = it}
