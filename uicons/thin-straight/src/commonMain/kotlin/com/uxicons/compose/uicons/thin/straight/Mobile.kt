package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mobile: ImageVector? = null

val Icons.Ts.Mobile: ImageVector
    get() = _Mobile ?: UXIcon(name = "Mobile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.01f, 0f)
                verticalLineToRelative(21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(10.99f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(20f, 0f)
                lineTo(4.01f, 0f)
                close()
                moveTo(19f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(6.51f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(5.01f, 1f)
                horizontalLineToRelative(13.99f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(16.01f, 16f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                close()
                moveTo(10f, 20f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                close()
                moveTo(10.45f, 11f)
                horizontalLineToRelative(3.18f)
                lineToRelative(0.5f, 2f)
                horizontalLineToRelative(1.03f)
                lineToRelative(-1.71f, -6.9f)
                curveToRelative(-0.1f, -0.45f, -0.41f, -0.82f, -0.81f, -0.98f)
                curveToRelative(-0.39f, -0.16f, -0.82f, -0.15f, -1.19f, 0.04f)
                curveToRelative(-0.37f, 0.19f, -0.63f, 0.53f, -0.72f, 0.91f)
                lineToRelative(-1.83f, 6.93f)
                horizontalLineToRelative(1.03f)
                lineToRelative(0.53f, -2f)
                close()
                moveTo(11.69f, 6.3f)
                curveToRelative(0.03f, -0.11f, 0.1f, -0.21f, 0.21f, -0.26f)
                curveToRelative(0.11f, -0.06f, 0.23f, -0.06f, 0.35f, -0.01f)
                curveToRelative(0.11f, 0.05f, 0.19f, 0.15f, 0.23f, 0.3f)
                lineToRelative(0.91f, 3.67f)
                horizontalLineToRelative(-2.67f)
                lineToRelative(0.97f, -3.69f)
                close()
            }
        }.also { _Mobile = it}
