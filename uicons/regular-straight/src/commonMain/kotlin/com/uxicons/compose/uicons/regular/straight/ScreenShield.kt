package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenShield: ImageVector? = null

val Icons.Rs.ScreenShield: ImageVector
    get() = _ScreenShield ?: UXIcon(name = "ScreenShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(2f, 16f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-20f)
                close()
                moveTo(11.38f, 12.41f)
                lineTo(11.96f, 12.7f)
                curveToRelative(1.57f, -0.67f, 4.85f, -1.87f, 5.04f, -5.96f)
                verticalLineToRelative(-3.48f)
                curveToRelative(0f, -0.81f, -0.52f, -1.53f, -1.29f, -1.79f)
                lineToRelative(-3.71f, -1.23f)
                lineToRelative(-3.71f, 1.23f)
                curveToRelative(-0.77f, 0.26f, -1.29f, 0.98f, -1.29f, 1.79f)
                verticalLineToRelative(3.48f)
                curveToRelative(0f, 3.24f, 3.35f, 5.16f, 4.38f, 5.67f)
                close()
                moveTo(9f, 3.34f)
                lineTo(12f, 2.34f)
                lineTo(15f, 3.34f)
                verticalLineToRelative(3.39f)
                curveToRelative(0f, 2.19f, -2.03f, 3.35f, -2.96f, 3.77f)
                curveToRelative(-0.84f, -0.46f, -3.04f, -1.84f, -3.04f, -3.77f)
                close()
            }
        }.also { _ScreenShield = it}
