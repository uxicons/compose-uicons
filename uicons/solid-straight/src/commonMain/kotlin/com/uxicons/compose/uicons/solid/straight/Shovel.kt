package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shovel: ImageVector? = null

val Icons.Ss.Shovel: ImageVector
    get() = _Shovel ?: UXIcon(name = "Shovel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.21f, 18.21f)
                lineToRelative(4.18f, -4.18f)
                lineToRelative(3.46f, 3.46f)
                lineToRelative(-4.31f, 4.31f)
                curveToRelative(-1.42f, 1.42f, -3.31f, 2.2f, -5.32f, 2.2f)
                horizontalLineTo(0f)
                verticalLineToRelative(-5.22f)
                curveToRelative(0f, -2.01f, 0.78f, -3.9f, 2.2f, -5.32f)
                lineToRelative(4.31f, -4.31f)
                lineToRelative(3.46f, 3.46f)
                lineToRelative(-4.18f, 4.18f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(18.09f, 0.01f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.24f, 2.24f)
                lineToRelative(-8.95f, 8.95f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(8.95f, -8.95f)
                lineToRelative(2.24f, 2.24f)
                lineToRelative(1.41f, -1.41f)
                lineTo(18.09f, 0.01f)
                close()
            }
        }.also { _Shovel = it}
