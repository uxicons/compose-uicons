package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenShield: ImageVector? = null

val Icons.Ts.ScreenShield: ImageVector
    get() = _ScreenShield ?: UXIcon(name = "ScreenShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.31f)
                curveToRelative(0.12f, 0.32f, 0.21f, 0.65f, 0.26f, 1f)
                horizontalLineToRelative(2.05f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2.05f)
                curveToRelative(0.05f, -0.35f, 0.14f, -0.68f, 0.26f, -1f)
                horizontalLineToRelative(-2.31f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(1f, 16f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-22f)
                close()
                moveTo(11.55f, 13.57f)
                lineTo(11.98f, 13.78f)
                curveToRelative(1.58f, -0.67f, 5.38f, -2.21f, 5.52f, -6.64f)
                verticalLineToRelative(-3.54f)
                curveToRelative(0f, -1.08f, -0.69f, -2.03f, -1.71f, -2.37f)
                lineToRelative(-3.79f, -1.26f)
                lineToRelative(-3.79f, 1.26f)
                curveToRelative(-1.02f, 0.34f, -1.71f, 1.29f, -1.71f, 2.37f)
                verticalLineToRelative(3.54f)
                curveToRelative(0f, 3.62f, 3.87f, 5.83f, 5.05f, 6.42f)
                close()
                moveTo(7.5f, 3.6f)
                curveToRelative(0f, -0.65f, 0.41f, -1.22f, 1.03f, -1.42f)
                lineToRelative(3.47f, -1.15f)
                lineToRelative(3.47f, 1.15f)
                curveToRelative(0.61f, 0.2f, 1.03f, 0.78f, 1.03f, 1.42f)
                verticalLineToRelative(3.54f)
                curveToRelative(0f, 3.47f, -3.41f, 5.11f, -4.45f, 5.53f)
                lineToRelative(-0.02f, 0.01f)
                curveToRelative(-1.07f, -0.54f, -4.52f, -2.48f, -4.52f, -5.54f)
                verticalLineToRelative(-3.54f)
                close()
            }
        }.also { _ScreenShield = it}
