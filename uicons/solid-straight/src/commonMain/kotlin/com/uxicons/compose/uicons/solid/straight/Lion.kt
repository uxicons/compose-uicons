package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lion: ImageVector? = null

val Icons.Ss.Lion: ImageVector
    get() = _Lion ?: UXIcon(name = "Lion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.84f, 19.47f)
                lineToRelative(2.16f, 1.49f)
                verticalLineToRelative(3.04f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5.35f)
                curveToRelative(-0.1f, -0.33f, -0.2f, -0.63f, -0.3f, -0.92f)
                curveToRelative(-0.29f, -0.85f, -0.56f, -1.68f, -0.66f, -2.81f)
                curveToRelative(-0.57f, 1.05f, -1.04f, 2.65f, -1.04f, 5.08f)
                lineTo(0f, 20.0f)
                curveToRelative(0f, -6.52f, 3.1f, -8.38f, 4.15f, -8.82f)
                curveToRelative(0.63f, -0.64f, 1.48f, -1.04f, 2.44f, -1.14f)
                curveToRelative(0.22f, 1.42f, 0.97f, 3.37f, 3.22f, 5.06f)
                lineToRelative(3.2f, 2.4f)
                verticalLineToRelative(-0.6f)
                curveToRelative(0.83f, 0.93f, 1.78f, 1.82f, 2.84f, 2.58f)
                close()
                moveTo(23f, 6f)
                lineToRelative(-1.12f, -0.98f)
                curveToRelative(-0.29f, -0.01f, -0.57f, -0.01f, -0.83f, -0.01f)
                curveToRelative(-1.71f, 0f, -3.05f, 1.3f, -3.05f, 2.95f)
                curveToRelative(0f, 1.68f, 1.37f, 3.05f, 3.05f, 3.05f)
                horizontalLineToRelative(0.95f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                lineToRelative(-1f, -1f)
                close()
                moveTo(16f, 7.95f)
                curveToRelative(0f, -2.78f, 2.36f, -4.95f, 5.19f, -4.95f)
                curveToRelative(-1.04f, -1.79f, -2.97f, -3.0f, -5.19f, -3.0f)
                curveToRelative(-2.97f, 0f, -6.5f, 1.5f, -8f, 5f)
                horizontalLineToRelative(3f)
                curveToRelative(-1.58f, 0.85f, -2.5f, 2.5f, -2.5f, 4f)
                curveToRelative(0f, 1.23f, 0.5f, 3f, 2.5f, 4.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.3f, 1.04f, 2.5f, 5.35f, 6f, 7.85f)
                curveToRelative(0f, 0f, 1.84f, -2.42f, 3.15f, -4.94f)
                curveToRelative(-2.35f, -0.43f, -4.15f, -2.48f, -4.15f, -4.96f)
                close()
            }
        }.also { _Lion = it}
