package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shovel: ImageVector? = null

val Icons.Bs.Shovel: ImageVector
    get() = _Shovel ?: UXIcon(name = "Shovel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.89f, 8.01f)
                lineToRelative(2.12f, -2.12f)
                lineTo(18.11f, -0.01f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.89f, 1.89f)
                lineToRelative(-8.13f, 8.13f)
                lineToRelative(-3.18f, -3.18f)
                lineToRelative(-4.37f, 4.37f)
                curveToRelative(-1.42f, 1.42f, -2.2f, 3.3f, -2.2f, 5.3f)
                verticalLineToRelative(5.38f)
                horizontalLineToRelative(5.38f)
                curveToRelative(2.0f, 0f, 3.89f, -0.78f, 5.3f, -2.2f)
                lineToRelative(4.37f, -4.37f)
                lineToRelative(-3.18f, -3.18f)
                lineToRelative(8.13f, -8.13f)
                lineToRelative(1.89f, 1.89f)
                close()
                moveTo(8.56f, 19.68f)
                curveToRelative(-0.85f, 0.85f, -1.98f, 1.32f, -3.18f, 1.32f)
                horizontalLineToRelative(-2.38f)
                verticalLineToRelative(-2.38f)
                curveToRelative(0f, -1.2f, 0.47f, -2.33f, 1.32f, -3.18f)
                lineToRelative(2.25f, -2.25f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(-2.25f, 2.25f)
                close()
            }
        }.also { _Shovel = it}
