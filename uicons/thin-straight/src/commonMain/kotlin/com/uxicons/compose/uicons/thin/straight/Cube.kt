package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cube: ImageVector? = null

val Icons.Ts.Cube: ImageVector
    get() = _Cube ?: UXIcon(name = "Cube") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                lineTo(1.5f, 6f)
                verticalLineToRelative(12f)
                lineToRelative(10.5f, 6f)
                lineToRelative(10.5f, -6f)
                lineTo(22.5f, 6f)
                lineTo(12f, 0f)
                close()
                moveTo(21.09f, 6.34f)
                lineToRelative(-9.11f, 5.08f)
                lineTo(3.1f, 6.24f)
                lineTo(12f, 1.15f)
                lineToRelative(9.09f, 5.19f)
                close()
                moveTo(2.5f, 7.04f)
                lineToRelative(9f, 5.26f)
                verticalLineToRelative(10.26f)
                lineToRelative(-9f, -5.14f)
                lineTo(2.5f, 7.04f)
                close()
                moveTo(12.5f, 22.56f)
                verticalLineToRelative(-10.28f)
                lineToRelative(9f, -5.02f)
                verticalLineToRelative(10.16f)
                lineToRelative(-9f, 5.14f)
                close()
            }
        }.also { _Cube = it}
