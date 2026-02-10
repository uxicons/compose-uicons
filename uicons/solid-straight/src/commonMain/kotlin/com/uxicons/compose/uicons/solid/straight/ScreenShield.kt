package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenShield: ImageVector? = null

val Icons.Ss.ScreenShield: ImageVector
    get() = _ScreenShield ?: UXIcon(name = "ScreenShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(4f)
                close()
                moveTo(12.56f, 12.45f)
                curveToRelative(1.04f, -0.42f, 4.44f, -2.07f, 4.44f, -5.72f)
                verticalLineToRelative(-3.48f)
                curveToRelative(0f, -0.81f, -0.52f, -1.53f, -1.29f, -1.79f)
                lineToRelative(-3.71f, -1.23f)
                lineToRelative(-3.71f, 1.23f)
                curveToRelative(-0.77f, 0.26f, -1.29f, 0.98f, -1.29f, 1.79f)
                verticalLineToRelative(3.48f)
                curveToRelative(0.19f, 3.67f, 3.45f, 5.17f, 4.96f, 5.96f)
                close()
                moveTo(5f, 6.73f)
                verticalLineToRelative(-3.48f)
                curveToRelative(0f, -0.44f, 0.08f, -0.86f, 0.21f, -1.25f)
                horizontalLineToRelative(-2.21f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(10.11f)
                curveToRelative(-1.57f, -0.86f, -5.11f, -3.24f, -5.11f, -7.27f)
                close()
                moveTo(21f, 2f)
                horizontalLineToRelative(-2.21f)
                curveToRelative(0.14f, 0.4f, 0.21f, 0.82f, 0.21f, 1.25f)
                verticalLineToRelative(3.48f)
                curveToRelative(0f, 4.25f, -3.26f, 6.41f, -5.01f, 7.27f)
                horizontalLineToRelative(10.01f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _ScreenShield = it}
