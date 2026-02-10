package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ContainerStorage: ImageVector? = null

val Icons.Ts.ContainerStorage: ImageVector
    get() = _ContainerStorage ?: UXIcon(name = "ContainerStorage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 4f)
                verticalLineToRelative(-1f)
                lineTo(0f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(16f)
                lineTo(0f, 20f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 4f)
                horizontalLineToRelative(1f)
                close()
                moveTo(22f, 20f)
                lineTo(2f, 20f)
                lineTo(2f, 4f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(16f)
                close()
                moveTo(14f, 18f)
                horizontalLineToRelative(-1f)
                lineTo(13f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(-1f)
                lineTo(16f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-1f)
                lineTo(19f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                close()
                moveTo(11f, 18f)
                horizontalLineToRelative(-1f)
                lineTo(10f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                close()
                moveTo(8f, 18f)
                horizontalLineToRelative(-1f)
                lineTo(7f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                close()
                moveTo(4f, 18f)
                lineTo(4f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _ContainerStorage = it}
