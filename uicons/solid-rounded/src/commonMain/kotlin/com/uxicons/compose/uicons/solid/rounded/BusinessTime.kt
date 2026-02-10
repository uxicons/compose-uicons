package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusinessTime: ImageVector? = null

val Icons.Sr.BusinessTime: ImageVector
    get() = _BusinessTime ?: UXIcon(name = "BusinessTime") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.96f, 17.34f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.33f, -3.0f, -2.88f, -5.34f, -5.96f, -5.34f)
                curveToRelative(-7.51f, 0.19f, -8.1f, 10.91f, -0.7f, 11.96f)
                curveToRelative(3.77f, 0.5f, 7.13f, -2.85f, 6.66f, -6.62f)
                close()
                moveTo(20f, 20f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-1.29f, -1.29f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                verticalLineToRelative(-2f)
                curveToRelative(0.01f, -1.31f, 2.0f, -1.31f, 2f, 0f)
                verticalLineToRelative(1.59f)
                lineToRelative(1f, 1f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(18f, 10f)
                curveToRelative(2.39f, 0f, 4.53f, 1.06f, 6f, 2.72f)
                verticalLineToRelative(-3.72f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-1.1f)
                curveToRelative(-0.47f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.41f, 0f, -4.43f, 1.72f, -4.9f, 4f)
                horizontalLineToRelative(-1.1f)
                curveTo(2.24f, 4f, 0f, 6.24f, 0f, 9f)
                verticalLineToRelative(3f)
                lineTo(12.72f, 12f)
                curveToRelative(1.41f, -1.24f, 3.25f, -2f, 5.28f, -2f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.3f, 0f, 2.4f, 0.84f, 2.82f, 2f)
                horizontalLineToRelative(-7.63f)
                curveToRelative(0.41f, -1.16f, 1.51f, -2f, 2.82f, -2f)
                close()
                moveTo(12.72f, 24f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-5f)
                lineTo(11.08f, 14f)
                curveToRelative(-1.94f, 3.11f, -1.13f, 7.72f, 1.64f, 10f)
                close()
            }
        }.also { _BusinessTime = it}
