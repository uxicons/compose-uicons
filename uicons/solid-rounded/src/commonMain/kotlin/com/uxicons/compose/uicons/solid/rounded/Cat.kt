package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cat: ImageVector? = null

val Icons.Sr.Cat: ImageVector
    get() = _Cat ?: UXIcon(name = "Cat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.45f, 0.1f)
                curveToRelative(-0.34f, -0.17f, -0.75f, -0.13f, -1.05f, 0.1f)
                lineToRelative(-1.69f, 1.27f)
                curveToRelative(-0.68f, -0.3f, -1.42f, -0.47f, -2.21f, -0.47f)
                reflectiveCurveToRelative(-1.53f, 0.17f, -2.21f, 0.47f)
                lineToRelative(-1.69f, -1.27f)
                curveToRelative(-0.3f, -0.23f, -0.71f, -0.27f, -1.05f, -0.1f)
                curveToRelative(-0.34f, 0.17f, -0.55f, 0.52f, -0.55f, 0.9f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(24f, 1f)
                curveToRelative(0f, -0.38f, -0.21f, -0.72f, -0.55f, -0.9f)
                close()
                moveTo(24f, 23.0f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.92f, -2.09f, -5.35f, -4.85f, -5.89f)
                curveToRelative(-0.6f, -0.12f, -1.15f, 0.38f, -1.15f, 0.99f)
                verticalLineToRelative(0.0f)
                curveToRelative(0f, 0.48f, 0.35f, 0.88f, 0.83f, 0.98f)
                curveToRelative(1.81f, 0.38f, 3.17f, 1.99f, 3.17f, 3.91f)
                verticalLineToRelative(2f)
                lineTo(6.56f, 24f)
                curveToRelative(-3.22f, 0f, -6.56f, -2.06f, -6.56f, -5.5f)
                curveToRelative(0f, -2.13f, 0.94f, -3.66f, 1.78f, -5.0f)
                curveToRelative(0.66f, -1.06f, 1.22f, -1.97f, 1.22f, -3.0f)
                curveToRelative(0f, -1.14f, -0.28f, -2.19f, -2.11f, -2.44f)
                curveToRelative(-0.5f, -0.07f, -0.89f, -0.48f, -0.89f, -0.99f)
                curveToRelative(0f, -0.59f, 0.52f, -1.07f, 1.11f, -1.0f)
                curveToRelative(3.36f, 0.44f, 3.89f, 2.9f, 3.89f, 4.43f)
                curveToRelative(0f, 1.6f, -0.77f, 2.84f, -1.52f, 4.05f)
                curveToRelative(-0.76f, 1.23f, -1.48f, 2.38f, -1.48f, 3.95f)
                curveToRelative(0f, 1.79f, 1.47f, 2.85f, 3.0f, 3.28f)
                curveToRelative(0.01f, -1.3f, 0.36f, -7.99f, 6.72f, -11.08f)
                curveToRelative(0.16f, -0.07f, 0.31f, -0.13f, 0.46f, -0.19f)
                curveToRelative(1.33f, 2.09f, 3.67f, 3.49f, 6.33f, 3.49f)
                curveToRelative(1.26f, 0f, 2.45f, -0.32f, 3.5f, -0.87f)
                verticalLineToRelative(8.87f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Cat = it}
