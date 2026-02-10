package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Damage: ImageVector? = null

val Icons.Rs.Damage: ImageVector
    get() = _Damage ?: UXIcon(name = "Damage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 19.77f)
                lineToRelative(-5.35f, -4.53f)
                lineToRelative(-1.29f, 1.53f)
                lineToRelative(6.19f, 5.24f)
                lineTo(2f, 22f)
                lineToRelative(10.1f, -5.18f)
                lineToRelative(-0.89f, -1.79f)
                lineToRelative(-3.22f, 1.61f)
                lineToRelative(0.01f, -3.64f)
                lineToRelative(-2f, -0.01f)
                lineToRelative(-0.01f, 4.64f)
                lineToRelative(-3.99f, 2.12f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4.02f)
                lineToRelative(3.1f, 6f)
                horizontalLineToRelative(3.29f)
                lineToRelative(2.21f, 3.99f)
                lineToRelative(1.75f, -0.97f)
                lineToRelative(-1.68f, -3.01f)
                horizontalLineToRelative(3.3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7.66f)
                lineToRelative(-2.07f, -4f)
                horizontalLineToRelative(11.73f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(16.77f)
                close()
            }
        }.also { _Damage = it}
