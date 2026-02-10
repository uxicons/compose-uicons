package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ContainerStorage: ImageVector? = null

val Icons.Rs.ContainerStorage: ImageVector
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
                moveTo(21f, 19f)
                lineTo(3f, 19f)
                lineTo(3f, 5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                close()
                moveTo(18f, 17f)
                horizontalLineToRelative(-2f)
                lineTo(16f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                close()
                moveTo(6f, 17f)
                lineTo(6f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _ContainerStorage = it}
