package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ContainerStorage: ImageVector? = null

val Icons.Bs.ContainerStorage: ImageVector
    get() = _ContainerStorage ?: UXIcon(name = "ContainerStorage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                verticalLineToRelative(-3f)
                lineTo(0f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                lineTo(0f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 6f)
                horizontalLineToRelative(1f)
                close()
                moveTo(20f, 18f)
                lineTo(4f, 18f)
                lineTo(4f, 6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                close()
                moveTo(18f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                close()
                moveTo(13.5f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                close()
                moveTo(6f, 16f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _ContainerStorage = it}
