package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ContainerStorage: ImageVector? = null

val Icons.Ss.ContainerStorage: ImageVector
    get() = _ContainerStorage ?: UXIcon(name = "ContainerStorage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                verticalLineToRelative(-2f)
                lineTo(0f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(14f)
                lineTo(0f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 5f)
                horizontalLineToRelative(1f)
                close()
                moveTo(8f, 17f)
                horizontalLineToRelative(-2f)
                lineTo(6f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                close()
                moveTo(18f, 17f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                close()
            }
        }.also { _ContainerStorage = it}
