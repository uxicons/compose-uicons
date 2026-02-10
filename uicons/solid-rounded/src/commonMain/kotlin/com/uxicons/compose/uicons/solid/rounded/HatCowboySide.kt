package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatCowboySide: ImageVector? = null

val Icons.Sr.HatCowboySide: ImageVector
    get() = _HatCowboySide ?: UXIcon(name = "HatCowboySide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.97f, 10.4f)
                lineToRelative(3.94f, -3.94f)
                lineToRelative(1.87f, 1.17f)
                lineToRelative(-2.14f, 2.13f)
                curveToRelative(-0.72f, 0.72f, -2.1f, 0.78f, -3.67f, 0.64f)
                close()
                moveTo(1.17f, 11.71f)
                curveToRelative(0.11f, -0.13f, 0.21f, -0.26f, 0.32f, -0.38f)
                curveToRelative(2.15f, -2.29f, 5.77f, -1.75f, 8.97f, -1.26f)
                lineToRelative(4.7f, -4.7f)
                lineToRelative(-5.18f, -3.61f)
                curveTo(7.84f, 0.41f, 5.02f, 0.9f, 3.44f, 2.88f)
                lineTo(0.84f, 6.19f)
                curveToRelative(-1.14f, 1.42f, -1.17f, 3.44f, -0.08f, 4.9f)
                lineToRelative(0.41f, 0.62f)
                close()
                moveTo(22.65f, 3.27f)
                lineToRelative(-0.12f, -0.12f)
                curveToRelative(-2.4f, -2.39f, -6.08f, -2.74f, -8.75f, -1.01f)
                lineToRelative(6.76f, 4.24f)
                curveToRelative(0.73f, 0.46f, 0.84f, 1.47f, 0.24f, 2.08f)
                lineToRelative(-2.71f, 2.73f)
                curveToRelative(-1.8f, 1.8f, -4.88f, 1.33f, -7.85f, 0.88f)
                curveToRelative(-2.85f, -0.43f, -5.81f, -0.88f, -7.25f, 0.65f)
                curveToRelative(-2.58f, 2.74f, -2.48f, 7.15f, 0.21f, 9.84f)
                lineToRelative(-0.02f, 0.02f)
                lineToRelative(0.21f, 0.21f)
                curveToRelative(0.82f, 0.82f, 1.89f, 1.23f, 2.97f, 1.23f)
                reflectiveCurveToRelative(2.15f, -0.41f, 2.97f, -1.23f)
                lineToRelative(13.47f, -13.45f)
                curveToRelative(0.92f, -0.92f, 1.36f, -2.19f, 1.2f, -3.52f)
                curveToRelative(-0.12f, -0.97f, -0.63f, -1.85f, -1.32f, -2.54f)
                close()
            }
        }.also { _HatCowboySide = it}
