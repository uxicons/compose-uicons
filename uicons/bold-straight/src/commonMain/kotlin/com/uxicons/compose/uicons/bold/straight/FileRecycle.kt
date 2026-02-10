package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileRecycle: ImageVector? = null

val Icons.Bs.FileRecycle: ImageVector
    get() = _FileRecycle ?: UXIcon(name = "FileRecycle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 17.09f)
                verticalLineToRelative(4.91f)
                lineToRelative(-2.03f, -2.03f)
                curveToRelative(-2.26f, 2.54f, -5.52f, 4.03f, -8.97f, 4.03f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                lineTo(3f, 12f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                curveToRelative(2.64f, 0f, 5.13f, -1.17f, 6.84f, -3.16f)
                lineToRelative(-1.84f, -1.84f)
                horizontalLineToRelative(4.91f)
                curveToRelative(0.6f, 0f, 1.09f, 0.49f, 1.09f, 1.09f)
                close()
                moveTo(2.09f, 8f)
                lineTo(7f, 8f)
                lineToRelative(-1.84f, -1.84f)
                curveToRelative(1.7f, -1.99f, 4.2f, -3.16f, 6.84f, -3.16f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                horizontalLineToRelative(3f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                curveTo(8.56f, 0f, 5.3f, 1.49f, 3.03f, 4.03f)
                lineTo(1f, 2f)
                lineTo(1f, 6.91f)
                curveToRelative(0f, 0.6f, 0.49f, 1.09f, 1.09f, 1.09f)
                close()
                moveTo(14f, 7f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(8f)
                lineTo(8f, 17f)
                lineTo(8f, 9f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
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
