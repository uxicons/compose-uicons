package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TipButton: ImageVector? = null

val Icons.Ss.TipButton: ImageVector
    get() = _TipButton ?: UXIcon(name = "TipButton") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.4f, 10.25f)
                curveToRelative(0f, 0.36f, -0.29f, 0.65f, -0.65f, 0.65f)
                horizontalLineToRelative(-0.65f)
                verticalLineToRelative(-1.3f)
                horizontalLineToRelative(0.65f)
                curveToRelative(0.36f, 0f, 0.65f, 0.29f, 0.65f, 0.65f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(10f)
                lineTo(0f, 18f)
                lineTo(0f, 8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(7.5f, 8f)
                lineTo(3.5f, 8f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(5.4f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-5.4f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(-1.6f)
                close()
                moveTo(10.1f, 8f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-7f)
                close()
                moveTo(16f, 10.25f)
                curveToRelative(0f, -1.24f, -1.01f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(0.65f)
                curveToRelative(1.24f, 0f, 2.25f, -1.01f, 2.25f, -2.25f)
                close()
                moveTo(21f, 12.92f)
                curveToRelative(0f, -1.3f, -1.13f, -1.84f, -1.95f, -2.23f)
                curveToRelative(-0.62f, -0.3f, -1.02f, -0.51f, -1.02f, -0.77f)
                curveToRelative(0f, -0.44f, 0.53f, -0.46f, 0.58f, -0.46f)
                curveToRelative(0.23f, 0f, 0.72f, 0.28f, 1.02f, 0.53f)
                lineToRelative(1.03f, -1.22f)
                curveToRelative(-0.18f, -0.15f, -1.12f, -0.91f, -2.06f, -0.91f)
                curveToRelative(-1.25f, 0f, -2.19f, 0.88f, -2.19f, 2.06f)
                curveToRelative(0f, 1.28f, 1.12f, 1.82f, 1.93f, 2.21f)
                curveToRelative(0.73f, 0.35f, 1.04f, 0.54f, 1.04f, 0.79f)
                curveToRelative(0f, 0.52f, -0.66f, 0.53f, -0.74f, 0.53f)
                curveToRelative(-0.42f, 0f, -1.02f, -0.38f, -1.29f, -0.62f)
                lineToRelative(-1.06f, 1.2f)
                curveToRelative(0.12f, 0.1f, 1.19f, 1.02f, 2.35f, 1.02f)
                curveToRelative(1.13f, 0f, 2.34f, -0.75f, 2.34f, -2.13f)
                close()
            }
        }.also { _TipButton = it}
