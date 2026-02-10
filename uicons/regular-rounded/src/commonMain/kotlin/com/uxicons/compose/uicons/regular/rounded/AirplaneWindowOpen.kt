package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AirplaneWindowOpen: ImageVector? = null

val Icons.Rr.AirplaneWindowOpen: ImageVector
    get() = _AirplaneWindowOpen ?: UXIcon(name = "AirplaneWindowOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(7.04f, 0f, 3f, 4.04f, 3f, 9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                verticalLineToRelative(-6f)
                curveTo(21f, 4.04f, 16.96f, 0f, 12f, 0f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.79f, 0f, 5.19f, 1.64f, 6.32f, 4f)
                lineTo(5.68f, 6f)
                curveToRelative(1.13f, -2.36f, 3.53f, -4f, 6.32f, -4f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.34f, 0.03f, -0.67f, 0.08f, -1f)
                horizontalLineToRelative(13.84f)
                curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1f)
                verticalLineToRelative(5.07f)
                curveToRelative(-0.32f, -0.32f, -0.69f, -0.59f, -1.12f, -0.78f)
                curveToRelative(-0.5f, -2.16f, -2.6f, -3.57f, -4.8f, -3.23f)
                curveToRelative(-1.16f, 0.18f, -2.24f, 0.92f, -2.9f, 1.97f)
                curveToRelative(-0.53f, 0.85f, -0.75f, 1.74f, -0.65f, 2.65f)
                curveToRelative(-1.1f, 0.57f, -1.7f, 1.77f, -1.48f, 3.02f)
                curveToRelative(0.24f, 1.34f, 1.45f, 2.31f, 2.86f, 2.31f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.39f, 0f, 0.75f, -0.05f, 1.09f, -0.12f)
                curveToRelative(-1.27f, 1.3f, -3.05f, 2.12f, -5.01f, 2.12f)
                close()
                moveTo(11.53f, 14.61f)
                curveToRelative(-0.1f, -0.52f, 0.01f, -1.01f, 0.34f, -1.53f)
                curveToRelative(0.35f, -0.56f, 0.92f, -0.96f, 1.51f, -1.05f)
                curveToRelative(0.12f, -0.02f, 0.25f, -0.03f, 0.37f, -0.03f)
                curveToRelative(1.05f, 0f, 1.96f, 0.71f, 2.19f, 1.77f)
                curveToRelative(0.13f, 0.6f, 0.56f, 1.11f, 1.14f, 1.35f)
                curveToRelative(0.65f, 0.27f, 1.02f, 0.95f, 0.9f, 1.65f)
                curveToRelative(-0.13f, 0.76f, -0.92f, 1.23f, -2.06f, 1.23f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.44f, 0f, -0.83f, -0.28f, -0.9f, -0.66f)
                curveToRelative(-0.08f, -0.46f, 0.2f, -0.8f, 0.5f, -0.92f)
                curveToRelative(0.74f, -0.29f, 1.16f, -1.04f, 1.02f, -1.81f)
                close()
            }
        }.also { _AirplaneWindowOpen = it}
