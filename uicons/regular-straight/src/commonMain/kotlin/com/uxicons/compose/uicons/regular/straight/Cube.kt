package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cube: ImageVector? = null

val Icons.Rs.Cube: ImageVector
    get() = _Cube ?: UXIcon(name = "Cube") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.12f, 0f)
                lineTo(1.62f, 6f)
                lineTo(1.62f, 18f)
                lineToRelative(10.5f, 6f)
                lineToRelative(10.5f, -6f)
                lineTo(22.62f, 6f)
                close()
                moveTo(19.64f, 6.6f)
                lineTo(12.01f, 10.85f)
                lineTo(4.67f, 6.56f)
                lineTo(12.12f, 2.3f)
                close()
                moveTo(3.62f, 8.26f)
                lineTo(11f, 12.57f)
                verticalLineToRelative(8.48f)
                lineTo(3.62f, 16.84f)
                close()
                moveTo(13f, 21.19f)
                lineTo(13f, 12.59f)
                lineToRelative(7.62f, -4.25f)
                verticalLineToRelative(8.5f)
                close()
            }
        }.also { _Cube = it}
