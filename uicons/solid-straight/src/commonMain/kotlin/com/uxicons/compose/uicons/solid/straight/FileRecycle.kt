package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileRecycle: ImageVector? = null

val Icons.Ss.FileRecycle: ImageVector
    get() = _FileRecycle ?: UXIcon(name = "FileRecycle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 7f)
                lineTo(0f, 3f)
                lineTo(2f, 3f)
                verticalLineToRelative(2.36f)
                curveTo(4.19f, 2.04f, 7.89f, 0f, 12f, 0f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                curveToRelative(-3.64f, 0f, -6.9f, 1.92f, -8.66f, 5f)
                horizontalLineToRelative(2.67f)
                verticalLineToRelative(2f)
                lineTo(2f, 9f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                close()
                moveTo(22f, 15f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.67f)
                curveToRelative(-1.76f, 3.08f, -5.03f, 5f, -8.67f, 5f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                lineTo(0f, 12f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                curveToRelative(4.11f, 0f, 7.81f, -2.04f, 10f, -5.36f)
                verticalLineToRelative(2.36f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(14.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                lineTo(8f, 17f)
                lineTo(8f, 8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5f)
                close()
                moveTo(13f, 13f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(14f, 9f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _FileRecycle = it}
