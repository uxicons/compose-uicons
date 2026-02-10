package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DogLeashed: ImageVector? = null

val Icons.Sr.DogLeashed: ImageVector
    get() = _DogLeashed ?: UXIcon(name = "DogLeashed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.0f, 8.0f)
                lineToRelative(4.0f, -0.0f)
                verticalLineToRelative(10.0f)
                lineToRelative(-4f, 0.0f)
                verticalLineToRelative(3.51f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                lineToRelative(-0.0f, -8.5f)
                curveToRelative(0f, -0.92f, 0.25f, -1.78f, 0.69f, -2.53f)
                curveToRelative(-1.09f, -0.64f, -2.69f, -2.0f, -2.69f, -4.48f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 1.81f, 1.48f, 2.67f, 2.08f, 2.95f)
                curveToRelative(0.82f, -0.6f, 1.83f, -0.95f, 2.92f, -0.95f)
                close()
                moveTo(22f, 5f)
                horizontalLineToRelative(-0.38f)
                curveToRelative(-0.31f, 0f, -0.59f, -0.17f, -0.72f, -0.45f)
                curveToRelative(-0.48f, -0.96f, -1.44f, -1.55f, -2.51f, -1.55f)
                horizontalLineToRelative(-1.38f)
                lineTo(17f, 0.77f)
                curveToRelative(0f, -0.53f, -0.52f, -0.9f, -1.01f, -0.73f)
                curveToRelative(-1.16f, 0.42f, -1.99f, 1.52f, -1.99f, 2.82f)
                verticalLineToRelative(1.63f)
                lineToRelative(-1.11f, 3.05f)
                lineTo(2.58f, 0.19f)
                curveToRelative(-0.45f, -0.32f, -1.07f, -0.22f, -1.4f, 0.23f)
                curveToRelative(-0.32f, 0.45f, -0.22f, 1.07f, 0.23f, 1.4f)
                lineToRelative(8.66f, 6.19f)
                horizontalLineToRelative(3.19f)
                lineToRelative(6.9f, 2.92f)
                lineToRelative(0.01f, -0.03f)
                curveToRelative(2.12f, -0.09f, 3.82f, -1.85f, 3.82f, -4.0f)
                curveToRelative(0f, -0.92f, -0.7f, -1.9f, -2f, -1.9f)
                close()
                moveTo(13f, 21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3.27f)
                curveToRelative(0f, -0.4f, 0.04f, -0.8f, 0.12f, -1.19f)
                lineToRelative(1.41f, -4.21f)
                lineToRelative(-6.53f, -2.75f)
                verticalLineToRelative(11.41f)
                close()
            }
        }.also { _DogLeashed = it}
