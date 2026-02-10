package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenShield: ImageVector? = null

val Icons.Sr.ScreenShield: ImageVector
    get() = _ScreenShield ?: UXIcon(name = "ScreenShield") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.1f, 16f)
                horizontalLineToRelative(23.8f)
                curveToRelative(-0.47f, 2.28f, -2.48f, 4f, -4.9f, 4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.41f, 0f, -4.43f, -1.72f, -4.9f, -4f)
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
                moveTo(10.64f, 13.89f)
                curveToRelative(-4.58f, -2.33f, -5.59f, -5.35f, -5.64f, -7.48f)
                verticalLineToRelative(-2.9f)
                curveToRelative(0f, -0.53f, 0.09f, -1.03f, 0.25f, -1.51f)
                horizontalLineToRelative(-0.25f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(10.94f)
                curveToRelative(-0.1f, -0.04f, -0.2f, -0.06f, -0.3f, -0.11f)
                close()
                moveTo(19f, 2f)
                horizontalLineToRelative(-0.25f)
                curveToRelative(0.16f, 0.48f, 0.25f, 0.99f, 0.25f, 1.51f)
                verticalLineToRelative(2.83f)
                curveToRelative(-0.04f, 1.99f, -0.85f, 5.58f, -5.86f, 7.64f)
                curveToRelative(-0.01f, 0.0f, -0.02f, 0.01f, -0.03f, 0.01f)
                horizontalLineToRelative(10.89f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _ScreenShield = it}
