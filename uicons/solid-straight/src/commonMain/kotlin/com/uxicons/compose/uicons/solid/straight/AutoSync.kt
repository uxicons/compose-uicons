package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AutoSync: ImageVector? = null

val Icons.Ss.AutoSync: ImageVector
    get() = _AutoSync ?: UXIcon(name = "AutoSync") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 19f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(5f)
                lineTo(6f, 24f)
                verticalLineToRelative(-5f)
                close()
                moveTo(18f, 17f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3.73f)
                lineToRelative(-1.71f, -1f)
                horizontalLineToRelative(-2.56f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                close()
                moveTo(24f, 12.5f)
                curveToRelative(0f, 2.87f, -1.62f, 5.37f, -4f, 6.63f)
                verticalLineToRelative(-2.13f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-3f)
                lineToRelative(-1.64f, -1f)
                horizontalLineToRelative(-3.36f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(3.6f)
                curveToRelative(-2.28f, -0.51f, -4f, -2.45f, -4f, -5.1f)
                curveToRelative(0f, -1.79f, 0.85f, -3.42f, 2.27f, -4.45f)
                curveToRelative(-0.14f, -0.53f, -0.23f, -1.08f, -0.26f, -1.64f)
                curveTo(1.83f, 4.83f, 4.13f, 1.48f, 7.55f, 0.39f)
                curveToRelative(4.17f, -1.33f, 8.4f, 0.92f, 9.89f, 4.67f)
                curveToRelative(3.73f, 0.46f, 6.56f, 3.6f, 6.56f, 7.44f)
                close()
                moveTo(16f, 10.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                curveToRelative(-1.21f, 0f, -2.35f, 0.5f, -3.17f, 1.32f)
                lineToRelative(-1.32f, -1.32f)
                verticalLineToRelative(3.43f)
                curveToRelative(0f, 0.32f, 0.26f, 0.57f, 0.57f, 0.57f)
                horizontalLineToRelative(3.43f)
                lineToRelative(-1.26f, -1.26f)
                curveToRelative(0.46f, -0.46f, 1.09f, -0.74f, 1.76f, -0.74f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 0.17f, -0.02f, 0.34f, -0.05f, 0.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.02f, -0.17f, 0.05f, -0.33f, 0.05f, -0.5f)
                close()
            }
        }.also { _AutoSync = it}
