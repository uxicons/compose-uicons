package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cube: ImageVector? = null

val Icons.Bs.Cube: ImageVector
    get() = _Cube ?: UXIcon(name = "Cube") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.12f, 0f)
                lineTo(1.62f, 6f)
                lineTo(1.62f, 18f)
                lineToRelative(10.5f, 6f)
                lineToRelative(10.5f, -6f)
                lineTo(22.62f, 6f)
                close()
                moveTo(18.11f, 6.88f)
                lineTo(12.02f, 10.28f)
                lineTo(6.17f, 6.86f)
                lineToRelative(5.95f, -3.4f)
                close()
                moveTo(4.62f, 9.43f)
                lineTo(10.5f, 12.86f)
                verticalLineToRelative(6.76f)
                lineTo(4.62f, 16.26f)
                close()
                moveTo(13.5f, 19.76f)
                lineTo(13.5f, 12.88f)
                lineToRelative(6.12f, -3.42f)
                verticalLineToRelative(6.79f)
                close()
            }
        }.also { _Cube = it}
