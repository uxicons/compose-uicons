package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Horse: ImageVector? = null

val Icons.Rs.Horse: ImageVector
    get() = _Horse ?: UXIcon(name = "Horse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.59f, 6.66f)
                curveToRelative(-1.79f, -0.86f, -2.91f, -2.17f, -3.35f, -3.91f)
                lineToRelative(-0.24f, -0.76f)
                lineTo(19f, 0f)
                curveToRelative(-1.43f, 0f, -2.62f, 0.99f, -2.92f, 2.33f)
                curveToRelative(-3.17f, 1.04f, -4.08f, 4.3f, -4.08f, 6.17f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-4.01f)
                curveToRelative(-1.26f, 0f, -2.38f, 0.59f, -3.12f, 1.5f)
                curveToRelative(-2.52f, 0.91f, -4.88f, 2.82f, -4.88f, 8.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -2.79f, 0.67f, -4.75f, 2.0f, -5.83f)
                curveToRelative(0.04f, 1.6f, 0.65f, 3.33f, 1.14f, 4.74f)
                curveToRelative(0.15f, 0.42f, 0.28f, 0.81f, 0.4f, 1.17f)
                lineToRelative(-0.68f, 4.92f)
                horizontalLineToRelative(6.03f)
                lineToRelative(0.5f, -4f)
                horizontalLineToRelative(1.62f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5.39f)
                lineToRelative(0.39f, -1.81f)
                curveToRelative(0.42f, -1.46f, 0.61f, -2.42f, 0.61f, -3.9f)
                verticalLineToRelative(-2.02f)
                lineToRelative(4f, -0.5f)
                verticalLineToRelative(-1.47f)
                curveToRelative(0f, -0.96f, -0.56f, -1.84f, -1.41f, -2.25f)
                close()
                moveTo(18f, 9.12f)
                verticalLineToRelative(3.78f)
                curveToRelative(0f, 1.25f, -0.17f, 2.04f, -0.56f, 3.41f)
                lineToRelative(-0.42f, 1.98f)
                lineToRelative(-0.02f, 3.71f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-5.38f)
                lineToRelative(-0.5f, 4f)
                horizontalLineToRelative(-1.97f)
                lineToRelative(0.42f, -3.08f)
                reflectiveCurveToRelative(-0.36f, -1.15f, -0.55f, -1.68f)
                curveToRelative(-0.48f, -1.38f, -1.03f, -2.95f, -1.03f, -4.25f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2f, -2.0f)
                horizontalLineToRelative(6.01f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.43f, 0.13f, -4.01f, 3.55f, -4.46f)
                curveToRelative(0.7f, 1.92f, 2.13f, 3.44f, 4.18f, 4.42f)
                curveToRelative(0.08f, 0.04f, 0.14f, 0.09f, 0.19f, 0.16f)
                lineToRelative(-3.91f, 0.49f)
                close()
            }
        }.also { _Horse = it}
