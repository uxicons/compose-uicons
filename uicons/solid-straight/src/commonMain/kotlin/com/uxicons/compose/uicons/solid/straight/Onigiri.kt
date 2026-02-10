package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Onigiri: ImageVector? = null

val Icons.Ss.Onigiri: ImageVector
    get() = _Onigiri ?: UXIcon(name = "Onigiri") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.95f, 16f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(23.15f, 15.2f)
                lineTo(16.15f, 3.43f)
                curveToRelative(-0.92f, -1.55f, -2.45f, -2.43f, -4.19f, -2.43f)
                curveToRelative(-1.76f, 0f, -3.29f, 0.89f, -4.21f, 2.43f)
                lineToRelative(-7f, 11.76f)
                curveToRelative(-0.95f, 1.59f, -0.99f, 3.52f, -0.12f, 5.16f)
                curveToRelative(0.88f, 1.66f, 2.5f, 2.65f, 4.33f, 2.65f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(0.99f)
                curveToRelative(1.78f, 0f, 3.7f, -1.25f, 4.55f, -2.97f)
                curveToRelative(0.77f, -1.56f, 0.66f, -3.14f, -0.35f, -4.83f)
                close()
            }
        }.also { _Onigiri = it}
