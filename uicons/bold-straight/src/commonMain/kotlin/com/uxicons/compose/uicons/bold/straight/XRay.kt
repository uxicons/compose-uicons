package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _XRay: ImageVector? = null

val Icons.Bs.XRay: ImageVector
    get() = _XRay ?: UXIcon(name = "XRay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3f)
                lineTo(24f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(18f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 3f)
                horizontalLineToRelative(1f)
                close()
                moveTo(20f, 21f)
                lineTo(4f, 21f)
                lineTo(4f, 3f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(18f)
                close()
                moveTo(10.5f, 8f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2f)
                curveToRelative(1.41f, 0f, 2.54f, 0f, 2.54f, 0f)
                curveToRelative(1.81f, 0.03f, 2.61f, 2.34f, 1.33f, 3.63f)
                lineToRelative(-1.37f, 1.37f)
                horizontalLineToRelative(-8f)
                lineToRelative(-1.37f, -1.37f)
                curveToRelative(-1.28f, -1.28f, -0.48f, -3.6f, 1.33f, -3.63f)
                curveToRelative(0.01f, 0f, 1.13f, 0f, 2.54f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _XRay = it}
