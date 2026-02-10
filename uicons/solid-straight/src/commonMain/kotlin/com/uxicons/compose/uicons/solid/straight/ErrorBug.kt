package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ErrorBug: ImageVector? = null

val Icons.Ss.ErrorBug: ImageVector
    get() = _ErrorBug ?: UXIcon(name = "ErrorBug") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(22f, 7f)
                horizontalLineToRelative(-3.52f)
                lineToRelative(1.01f, 4f)
                horizontalLineToRelative(4.52f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.01f)
                lineToRelative(0.16f, 0.62f)
                curveToRelative(0.09f, 0.42f, 0.1f, 0.83f, 0.11f, 1.21f)
                curveToRelative(0f, 0.76f, -0.11f, 1.48f, -0.29f, 2.17f)
                horizontalLineToRelative(2.05f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2.89f)
                curveToRelative(-1.42f, 2.41f, -4.04f, 4.0f, -7.11f, 4f)
                curveToRelative(-3.07f, -0.0f, -5.7f, -1.59f, -7.12f, -4f)
                horizontalLineToRelative(-2.88f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2.04f)
                curveToRelative(-0.18f, -0.69f, -0.29f, -1.41f, -0.29f, -2.16f)
                curveToRelative(0.01f, -0.37f, 0.02f, -0.78f, 0.11f, -1.22f)
                lineToRelative(0.16f, -0.62f)
                horizontalLineToRelative(-4.01f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.52f)
                lineToRelative(1.01f, -4f)
                horizontalLineToRelative(-3.53f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4.08f)
                curveToRelative(0.99f, -2.4f, 3.33f, -4.0f, 5.92f, -4f)
                curveToRelative(2.59f, 0.0f, 4.93f, 1.6f, 5.92f, 4f)
                horizontalLineToRelative(4.08f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(18f, 16f)
                lineTo(12f, 5.71f)
                lineTo(6f, 16f)
                close()
            }
        }.also { _ErrorBug = it}
