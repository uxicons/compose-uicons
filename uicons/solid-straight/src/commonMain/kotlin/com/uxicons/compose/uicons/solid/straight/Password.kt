package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Password: ImageVector? = null

val Icons.Ss.Password: ImageVector
    get() = _Password ?: UXIcon(name = "Password") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                lineTo(9f, 18f)
                close()
                moveTo(13.79f, 6.79f)
                lineTo(12f, 8.59f)
                lineTo(10.21f, 6.79f)
                lineTo(8.79f, 8.21f)
                lineTo(10.59f, 10f)
                lineTo(8.79f, 11.79f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12f, 11.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.41f, 10f)
                lineToRelative(1.79f, -1.79f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(6f)
                lineTo(23f, 16f)
                lineTo(17f, 16f)
                close()
                moveTo(23.21f, 8.21f)
                lineTo(21.79f, 6.79f)
                lineTo(20f, 8.59f)
                lineTo(18.21f, 6.79f)
                lineTo(16.79f, 8.21f)
                lineTo(18.59f, 10f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.41f, 1.41f)
                lineTo(20f, 11.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.41f, -1.41f)
                lineTo(21.41f, 10f)
                close()
                moveTo(1f, 18f)
                lineTo(7f, 18f)
                lineTo(7f, 16f)
                lineTo(1f, 16f)
                close()
                moveTo(5.79f, 6.79f)
                lineTo(4f, 8.59f)
                lineTo(2.21f, 6.79f)
                lineTo(0.79f, 8.21f)
                lineTo(2.59f, 10f)
                lineTo(0.79f, 11.79f)
                lineToRelative(1.41f, 1.41f)
                lineTo(4f, 11.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.41f, -1.41f)
                lineTo(5.41f, 10f)
                lineTo(7.21f, 8.21f)
                close()
            }
        }.also { _Password = it}
