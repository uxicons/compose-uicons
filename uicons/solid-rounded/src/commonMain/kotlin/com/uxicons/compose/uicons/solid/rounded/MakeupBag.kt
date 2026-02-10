package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MakeupBag: ImageVector? = null

val Icons.Sr.MakeupBag: ImageVector
    get() = _MakeupBag ?: UXIcon(name = "MakeupBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.99f, 5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.71f)
                curveToRelative(0f, -0.58f, 0.32f, -1.1f, 0.84f, -1.36f)
                lineToRelative(1.64f, -0.82f)
                curveToRelative(0.33f, -0.16f, 0.71f, -0.15f, 1.02f, 0.05f)
                curveToRelative(0.31f, 0.19f, 0.5f, 0.53f, 0.5f, 0.89f)
                close()
                moveTo(23.7f, 16.72f)
                lineTo(22.4f, 13.24f)
                curveToRelative(-0.28f, -0.74f, -0.72f, -1.38f, -1.28f, -1.9f)
                curveToRelative(0.93f, -0.54f, 2.12f, -1.46f, 2.78f, -2.94f)
                curveToRelative(0.23f, -0.5f, 0f, -1.1f, -0.5f, -1.32f)
                curveToRelative(-0.5f, -0.23f, -1.1f, 0f, -1.32f, 0.5f)
                curveToRelative(-0.98f, 2.0f, -2.8f, 2.32f, -3.12f, 2.58f)
                curveToRelative(-0.44f, -0.12f, -0.9f, -0.18f, -1.36f, -0.17f)
                lineToRelative(0.23f, -3f)
                horizontalLineToRelative(-3.7f)
                lineToRelative(0.24f, 3f)
                horizontalLineToRelative(-3.38f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.68f)
                curveToRelative(-1.54f, 0.41f, -2.83f, 1.54f, -3.41f, 3.07f)
                lineToRelative(-1.3f, 3.5f)
                curveToRelative(-0.27f, 0.82f, -0.35f, 1.7f, -0.22f, 2.57f)
                curveToRelative(0.41f, 2.74f, 2.93f, 4.68f, 5.7f, 4.68f)
                horizontalLineToRelative(12.49f)
                curveToRelative(3.07f, 0f, 5.79f, -2.51f, 5.75f, -5.57f)
                curveToRelative(-0.01f, -0.57f, -0.1f, -1.14f, -0.29f, -1.71f)
                close()
                moveTo(13.99f, 5f)
                horizontalLineToRelative(4f)
                lineToRelative(0.94f, -3.04f)
                curveToRelative(0.1f, -0.46f, -0.07f, -0.95f, -0.44f, -1.23f)
                curveToRelative(-0.63f, -0.47f, -1.69f, -0.74f, -2.5f, -0.73f)
                curveToRelative(-0.81f, -0.01f, -1.87f, 0.27f, -2.5f, 0.74f)
                curveToRelative(-0.38f, 0.28f, -0.54f, 0.77f, -0.44f, 1.23f)
                lineToRelative(0.94f, 3.03f)
                close()
            }
        }.also { _MakeupBag = it}
