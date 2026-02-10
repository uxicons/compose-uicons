package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHeart: ImageVector? = null

val Icons.Tc.CircleHeart: ImageVector
    get() = _CircleHeart ?: UXIcon(name = "CircleHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 1f)
                horizontalLineToRelative(-0.01f)
                curveTo(4.93f, 1.04f, 1.13f, 4.84f, 1.0f, 12.01f)
                curveToRelative(0.13f, 7.25f, 3.83f, 10.95f, 11.0f, 10.99f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(23.0f, 11.99f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.95f, -10.99f, -10.99f)
                close()
                moveTo(22.0f, 22f)
                lineTo(12.0f, 22f)
                curveToRelative(-6.61f, -0.04f, -9.88f, -3.31f, -10f, -9.99f)
                curveToRelative(0.12f, -6.6f, 3.48f, -9.97f, 10.0f, -10.01f)
                curveToRelative(4.48f, 0.03f, 9.86f, 1.79f, 10.0f, 10f)
                verticalLineToRelative(10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.25f, 8.36f)
                curveToRelative(-0.61f, -0.56f, -1.41f, -0.87f, -2.19f, -0.83f)
                curveToRelative(-0.71f, 0.03f, -1.37f, 0.33f, -1.85f, 0.86f)
                lineToRelative(-0.21f, 0.23f)
                lineToRelative(-0.21f, -0.23f)
                curveToRelative(-0.48f, -0.52f, -1.14f, -0.83f, -1.85f, -0.85f)
                curveToRelative(-0.78f, -0.03f, -1.58f, 0.27f, -2.19f, 0.83f)
                curveToRelative(-0.57f, 0.53f, -1.17f, 1.52f, -1.15f, 2.75f)
                curveToRelative(0.02f, 1.39f, 0.79f, 2.75f, 2.29f, 4.04f)
                curveToRelative(1.0f, 0.87f, 2.05f, 1.31f, 3.12f, 1.31f)
                curveToRelative(1.06f, -0.0f, 2.11f, -0.44f, 3.11f, -1.31f)
                curveToRelative(1.5f, -1.3f, 2.27f, -2.66f, 2.29f, -4.04f)
                curveToRelative(0.02f, -1.23f, -0.58f, -2.23f, -1.15f, -2.75f)
                close()
                moveTo(14.46f, 14.41f)
                curveToRelative(-1.63f, 1.42f, -3.28f, 1.42f, -4.92f, 0f)
                curveToRelative(-1.27f, -1.1f, -1.93f, -2.22f, -1.94f, -3.31f)
                curveToRelative(-0.01f, -0.9f, 0.42f, -1.67f, 0.83f, -2.01f)
                curveToRelative(1.29f, -1.06f, 2.32f, -0.37f, 2.62f, -0.04f)
                lineToRelative(0.58f, 0.64f)
                curveToRelative(0.19f, 0.21f, 0.55f, 0.21f, 0.74f, 0f)
                lineToRelative(0.58f, -0.63f)
                curveToRelative(0.3f, -0.33f, 1.39f, -1.02f, 2.62f, 0.04f)
                horizontalLineToRelative(0f)
                curveToRelative(0.39f, 0.36f, 0.84f, 1.1f, 0.83f, 2.01f)
                curveToRelative(-0.02f, 1.09f, -0.67f, 2.2f, -1.94f, 3.31f)
                close()
            }
        }.also { _CircleHeart = it}
