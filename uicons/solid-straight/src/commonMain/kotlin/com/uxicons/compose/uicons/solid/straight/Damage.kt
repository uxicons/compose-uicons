package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Damage: ImageVector? = null

val Icons.Ss.Damage: ImageVector
    get() = _Damage ?: UXIcon(name = "Damage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.08f, 17.28f)
                lineToRelative(1.29f, -1.53f)
                lineToRelative(6.63f, 5.7f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-12.76f)
                lineToRelative(3.1f, 6f)
                horizontalLineToRelative(7.66f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.3f)
                lineToRelative(1.68f, 3.01f)
                lineToRelative(-1.75f, 0.97f)
                lineToRelative(-2.21f, -3.99f)
                horizontalLineToRelative(-3.29f)
                lineTo(5.99f, 0f)
                horizontalLineToRelative(-2.99f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(18.77f)
                lineToRelative(6f, -2.99f)
                verticalLineToRelative(-4.78f)
                lineToRelative(2f, 0.01f)
                verticalLineToRelative(3.77f)
                lineToRelative(3.21f, -1.61f)
                lineToRelative(0.89f, 1.79f)
                lineTo(0f, 24f)
                horizontalLineToRelative(23.91f)
                lineToRelative(-7.83f, -6.72f)
                close()
            }
        }.also { _Damage = it}
