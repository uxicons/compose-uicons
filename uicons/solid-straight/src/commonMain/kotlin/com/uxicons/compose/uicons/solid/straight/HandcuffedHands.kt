package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandcuffedHands: ImageVector? = null

val Icons.Ss.HandcuffedHands: ImageVector
    get() = _HandcuffedHands ?: UXIcon(name = "HandcuffedHands") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 24f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(18f)
                close()
                moveTo(15.95f, 14.22f)
                lineTo(18.43f, 11.69f)
                curveToRelative(0.6f, -0.73f, 0.75f, -1.77f, 0.27f, -2.59f)
                curveToRelative(-0.74f, -1.25f, -2.39f, -1.46f, -3.41f, -0.53f)
                lineToRelative(-1.81f, 1.65f)
                lineToRelative(0.87f, 0.79f)
                curveToRelative(0.92f, 0.83f, 1.47f, 1.99f, 1.59f, 3.21f)
                close()
                moveTo(21.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(4.1f)
                reflectiveCurveToRelative(0.76f, 0.62f, 0.91f, 0.78f)
                curveToRelative(1.4f, 1.54f, 1.46f, 3.92f, 0.12f, 5.52f)
                lineToRelative(-4.03f, 4.09f)
                verticalLineToRelative(3.02f)
                horizontalLineToRelative(4.75f)
                lineToRelative(2.2f, -2.41f)
                curveToRelative(0.67f, -0.74f, 1.05f, -1.7f, 1.05f, -2.7f)
                verticalLineToRelative(-12.39f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(14f, 20f)
                verticalLineToRelative(-5.29f)
                curveToRelative(0f, -0.85f, -0.36f, -1.65f, -0.98f, -2.22f)
                lineToRelative(-4.32f, -3.92f)
                curveToRelative(-1.02f, -0.92f, -2.67f, -0.72f, -3.41f, 0.53f)
                curveToRelative(-0.48f, 0.81f, -0.33f, 1.86f, 0.27f, 2.59f)
                lineToRelative(3.24f, 3.27f)
                lineToRelative(-1.4f, 1.4f)
                lineToRelative(-3.44f, -3.47f)
                curveToRelative(-1.33f, -1.6f, -1.27f, -3.98f, 0.12f, -5.52f)
                curveToRelative(0.15f, -0.16f, 0.91f, -0.78f, 0.91f, -0.78f)
                verticalLineToRelative(-3.95f)
                curveToRelative(0.0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f)
                curveToRelative(-1.5f, -0.15f, -2.76f, 1.02f, -2.76f, 2.49f)
                verticalLineToRelative(12.39f)
                curveToRelative(0f, 1.0f, 0.37f, 1.96f, 1.05f, 2.7f)
                lineToRelative(2.2f, 2.41f)
                close()
            }
        }.also { _HandcuffedHands = it}
