package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Up: ImageVector? = null

val Icons.Rr.Up: ImageVector
    get() = _Up ?: UXIcon(name = "Up") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.99f, 24f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(-2.21f, 0f, -4.01f, -1.78f, -4.01f, -3.97f)
                verticalLineToRelative(-7.03f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(-1.23f, 0f, -2.28f, -0.71f, -2.75f, -1.85f)
                curveToRelative(-0.47f, -1.13f, -0.22f, -2.38f, 0.65f, -3.25f)
                lineTo(9.17f, 1.18f)
                curveToRelative(1.57f, -1.57f, 4.09f, -1.57f, 5.64f, -0.02f)
                curveToRelative(0f, 0f, 6.37f, 6.77f, 6.37f, 6.77f)
                curveToRelative(0.85f, 0.84f, 1.1f, 2.09f, 0.63f, 3.22f)
                curveToRelative(-0.47f, 1.13f, -1.52f, 1.84f, -2.74f, 1.85f)
                horizontalLineToRelative(-2.06f)
                verticalLineToRelative(7.03f)
                curveToRelative(0f, 2.19f, -1.8f, 3.97f, -4.01f, 3.97f)
                close()
                moveTo(12f, 2f)
                curveToRelative(-0.51f, 0f, -1.01f, 0.19f, -1.4f, 0.58f)
                lineToRelative(-6.33f, 6.72f)
                curveToRelative(-0.45f, 0.45f, -0.29f, 0.95f, -0.24f, 1.09f)
                curveToRelative(0.06f, 0.14f, 0.3f, 0.61f, 0.9f, 0.61f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8.03f)
                curveToRelative(0f, 1.09f, 0.9f, 1.97f, 2.01f, 1.97f)
                horizontalLineToRelative(1.98f)
                curveToRelative(1.11f, 0f, 2.01f, -0.89f, 2.01f, -1.97f)
                lineTo(14.98f, 12f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.06f)
                curveToRelative(0.6f, 0f, 0.84f, -0.47f, 0.9f, -0.61f)
                curveToRelative(0.06f, -0.14f, 0.22f, -0.64f, -0.21f, -1.07f)
                lineTo(13.39f, 2.57f)
                curveToRelative(-0.38f, -0.38f, -0.88f, -0.57f, -1.38f, -0.57f)
                close()
            }
        }.also { _Up = it}
