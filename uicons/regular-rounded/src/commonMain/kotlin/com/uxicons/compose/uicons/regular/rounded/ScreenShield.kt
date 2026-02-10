package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenShield: ImageVector? = null

val Icons.Rr.ScreenShield: ImageVector
    get() = _ScreenShield ?: UXIcon(name = "ScreenShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.25f, 2.16f)
                curveToRelative(-0.54f, -0.14f, -1.08f, 0.18f, -1.22f, 0.72f)
                reflectiveCurveToRelative(0.18f, 1.08f, 0.72f, 1.22f)
                curveToRelative(1.32f, 0.34f, 2.25f, 1.54f, 2.25f, 2.91f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0f, -1.37f, 0.93f, -2.56f, 2.25f, -2.91f)
                curveToRelative(0.54f, -0.14f, 0.86f, -0.68f, 0.72f, -1.22f)
                curveToRelative(-0.14f, -0.54f, -0.68f, -0.86f, -1.22f, -0.72f)
                curveToRelative(-2.21f, 0.57f, -3.75f, 2.56f, -3.75f, 4.84f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -2.28f, -1.54f, -4.27f, -3.75f, -4.84f)
                close()
                moveTo(19f, 18f)
                horizontalLineToRelative(-14f)
                curveToRelative(-1.3f, 0f, -2.4f, -0.84f, -2.82f, -2f)
                horizontalLineToRelative(19.63f)
                curveToRelative(-0.41f, 1.16f, -1.51f, 2f, -2.82f, 2f)
                close()
                moveTo(11.55f, 12.11f)
                curveToRelative(0.26f, 0.13f, 0.57f, 0.14f, 0.84f, 0.03f)
                curveToRelative(3.75f, -1.55f, 4.58f, -3.99f, 4.62f, -5.79f)
                verticalLineToRelative(-2.83f)
                curveToRelative(0f, -1.2f, -0.77f, -2.26f, -1.9f, -2.64f)
                lineToRelative(-2.22f, -0.74f)
                curveToRelative(-0.56f, -0.19f, -1.19f, -0.19f, -1.75f, 0f)
                lineToRelative(-2.22f, 0.74f)
                curveToRelative(-1.14f, 0.38f, -1.9f, 1.44f, -1.9f, 2.64f)
                verticalLineToRelative(2.85f)
                curveToRelative(0.05f, 2.29f, 1.58f, 4.22f, 4.55f, 5.74f)
                close()
                moveTo(9f, 3.52f)
                curveToRelative(0f, -0.34f, 0.21f, -0.63f, 0.53f, -0.74f)
                lineToRelative(2.22f, -0.74f)
                curveToRelative(0.16f, -0.05f, 0.33f, -0.05f, 0.49f, 0f)
                lineToRelative(2.22f, 0.74f)
                curveToRelative(0.32f, 0.1f, 0.53f, 0.4f, 0.53f, 0.74f)
                verticalLineToRelative(2.81f)
                curveToRelative(-0.03f, 1.63f, -1.0f, 2.87f, -2.96f, 3.78f)
                curveToRelative(-2.02f, -1.11f, -3.01f, -2.35f, -3.04f, -3.76f)
                verticalLineToRelative(-2.83f)
                close()
            }
        }.also { _ScreenShield = it}
