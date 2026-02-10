package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _XRay: ImageVector? = null

val Icons.Ss.XRay: ImageVector
    get() = _XRay ?: UXIcon(name = "XRay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(20f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(18f, 8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.4f)
                curveToRelative(1.1f, 0.02f, 2.0f, 0.64f, 2.4f, 1.63f)
                curveToRelative(0.42f, 1.03f, 0.19f, 2.2f, -0.59f, 2.98f)
                lineToRelative(-1.39f, 1.39f)
                horizontalLineToRelative(-7.63f)
                lineToRelative(-1.39f, -1.39f)
                curveToRelative(-0.78f, -0.78f, -1.01f, -1.94f, -0.59f, -2.98f)
                curveToRelative(0.4f, -0.99f, 1.3f, -1.62f, 2.35f, -1.63f)
                horizontalLineToRelative(2.45f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
                moveTo(8.6f, 16f)
                horizontalLineToRelative(6.82f)
                curveToRelative(0.32f, 0.01f, 0.47f, 0.24f, 0.53f, 0.38f)
                curveToRelative(0.09f, 0.23f, 0.1f, 0.56f, -0.15f, 0.81f)
                lineToRelative(-0.81f, 0.81f)
                horizontalLineToRelative(-5.97f)
                lineToRelative(-0.81f, -0.81f)
                curveToRelative(-0.25f, -0.25f, -0.24f, -0.58f, -0.15f, -0.81f)
                curveToRelative(0.06f, -0.14f, 0.2f, -0.38f, 0.54f, -0.38f)
                close()
            }
        }.also { _XRay = it}
