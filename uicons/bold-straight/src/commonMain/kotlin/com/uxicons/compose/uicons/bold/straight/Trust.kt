package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trust: ImageVector? = null

val Icons.Bs.Trust: ImageVector
    get() = _Trust ?: UXIcon(name = "Trust") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-3.49f)
                curveToRelative(-1.1f, 0.04f, -2.04f, 0.8f, -2.32f, 1.87f)
                lineToRelative(-1.06f, 4.62f)
                lineToRelative(-1.56f, 1.56f)
                lineTo(-0.06f, 15.94f)
                lineToRelative(0.95f, -0.95f)
                lineToRelative(0.87f, -3.82f)
                curveToRelative(0.63f, -2.45f, 2.79f, -4.13f, 5.28f, -4.16f)
                curveToRelative(0.21f, -2.29f, 1.82f, -4.25f, 4.08f, -4.83f)
                lineToRelative(3.83f, -1.11f)
                lineToRelative(0.98f, -0.98f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-1.53f, 1.53f)
                lineToRelative(-4.53f, 1.31f)
                verticalLineToRelative(3.96f)
                horizontalLineToRelative(8.12f)
                lineToRelative(1.81f, -1.72f)
                lineToRelative(2.06f, 2.18f)
                lineToRelative(-2.64f, 2.54f)
                horizontalLineToRelative(-9.36f)
                close()
                moveTo(24f, 18.5f)
                curveToRelative(0f, 3.04f, -2.46f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -2.46f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.46f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.46f, 5.5f, 5.5f)
                close()
                moveTo(22.36f, 17.74f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(-3.11f, 3.2f)
                lineToRelative(-1.67f, -1.75f)
                lineToRelative(-1.39f, 1.44f)
                lineToRelative(1.63f, 1.72f)
                curveToRelative(0.77f, 0.77f, 2.08f, 0.76f, 2.82f, 0.02f)
                lineToRelative(0.0f, -0.0f)
                lineToRelative(3.11f, -3.2f)
                close()
                moveTo(8.87f, 19f)
                lineToRelative(-2.9f, 2.99f)
                lineToRelative(2.15f, 2.09f)
                lineToRelative(2.02f, -2.08f)
                horizontalLineToRelative(1.73f)
                curveToRelative(-0.48f, -0.91f, -0.77f, -1.92f, -0.84f, -3f)
                horizontalLineToRelative(-2.16f)
                close()
            }
        }.also { _Trust = it}
