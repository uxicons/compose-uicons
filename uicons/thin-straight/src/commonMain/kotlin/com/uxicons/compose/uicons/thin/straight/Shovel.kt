package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shovel: ImageVector? = null

val Icons.Ts.Shovel: ImageVector
    get() = _Shovel ?: UXIcon(name = "Shovel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.26f, 6.64f)
                lineToRelative(0.71f, -0.71f)
                lineTo(18.07f, 0.03f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(2.6f, 2.6f)
                lineToRelative(-9.77f, 9.77f)
                lineToRelative(-3.74f, -3.74f)
                lineToRelative(-4.24f, 4.24f)
                curveToRelative(-1.43f, 1.43f, -2.21f, 3.32f, -2.21f, 5.34f)
                verticalLineToRelative(5.06f)
                horizontalLineToRelative(5.06f)
                curveToRelative(2.02f, 0f, 3.91f, -0.79f, 5.34f, -2.21f)
                lineToRelative(4.24f, -4.24f)
                lineToRelative(-3.74f, -3.74f)
                lineToRelative(9.77f, -9.77f)
                lineToRelative(2.6f, 2.6f)
                close()
                moveTo(13.22f, 17.55f)
                lineToRelative(-3.54f, 3.54f)
                curveToRelative(-1.24f, 1.24f, -2.88f, 1.92f, -4.63f, 1.92f)
                lineTo(1f, 23f)
                verticalLineToRelative(-4.06f)
                curveToRelative(0f, -1.75f, 0.68f, -3.4f, 1.92f, -4.63f)
                lineToRelative(3.54f, -3.54f)
                lineToRelative(3.03f, 3.03f)
                lineToRelative(-3.84f, 3.84f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.84f, -3.84f)
                lineToRelative(3.03f, 3.03f)
                close()
            }
        }.also { _Shovel = it}
