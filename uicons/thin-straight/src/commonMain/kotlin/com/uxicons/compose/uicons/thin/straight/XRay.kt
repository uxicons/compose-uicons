package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _XRay: ImageVector? = null

val Icons.Ts.XRay: ImageVector
    get() = _XRay ?: UXIcon(name = "XRay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 1f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(22f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 1f)
                horizontalLineToRelative(2f)
                close()
                moveTo(21f, 23f)
                lineTo(3f, 23f)
                lineTo(3f, 1f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(22f)
                close()
                moveTo(6f, 7f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(-0.84f, 0.01f, -1.57f, 0.52f, -1.89f, 1.32f)
                curveToRelative(-0.34f, 0.85f, -0.15f, 1.8f, 0.48f, 2.44f)
                lineToRelative(1.25f, 1.25f)
                horizontalLineToRelative(7.21f)
                lineToRelative(1.25f, -1.25f)
                curveToRelative(0.63f, -0.63f, 0.82f, -1.59f, 0.48f, -2.44f)
                curveToRelative(-0.32f, -0.8f, -1.05f, -1.31f, -1.93f, -1.32f)
                horizontalLineToRelative(-2.9f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1f)
                close()
                moveTo(15.43f, 16f)
                curveToRelative(0.44f, 0.01f, 0.81f, 0.27f, 0.98f, 0.69f)
                curveToRelative(0.15f, 0.36f, 0.16f, 0.93f, -0.26f, 1.35f)
                lineToRelative(-0.95f, 0.95f)
                horizontalLineToRelative(-6.38f)
                lineToRelative(-0.95f, -0.95f)
                curveToRelative(-0.42f, -0.42f, -0.41f, -0.99f, -0.26f, -1.35f)
                curveToRelative(0.17f, -0.43f, 0.54f, -0.69f, 1.0f, -0.69f)
                horizontalLineToRelative(6.82f)
                close()
            }
        }.also { _XRay = it}
