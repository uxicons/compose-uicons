package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartphoneAr: ImageVector? = null

val Icons.Bs.SmartphoneAr: ImageVector
    get() = _SmartphoneAr ?: UXIcon(name = "SmartphoneAr") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8.78f)
                lineToRelative(-3.98f, -2.17f)
                verticalLineToRelative(-6.61f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(6.61f)
                curveToRelative(-0.6f, 0.34f, -3.53f, 1.89f, -4.03f, 2.26f)
                verticalLineToRelative(1.78f)
                lineToRelative(4.03f, 2.19f)
                verticalLineToRelative(8.15f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-8.15f)
                lineToRelative(3.98f, -2.17f)
                close()
                moveTo(17.02f, 3f)
                verticalLineToRelative(8.07f)
                lineToRelative(-5f, 2.73f)
                lineToRelative(-5f, -2.73f)
                verticalLineToRelative(-8.07f)
                close()
                moveTo(14.02f, 22.01f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(17.02f, 18f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-3.52f)
                lineToRelative(5f, 2.73f)
                lineToRelative(5f, -2.73f)
                close()
                moveTo(11.41f, 11.43f)
                lineTo(9.03f, 10f)
                verticalLineToRelative(-3.4f)
                lineToRelative(2.38f, -1.43f)
                curveToRelative(0.38f, -0.23f, 0.85f, -0.23f, 1.23f, 0f)
                lineToRelative(2.38f, 1.43f)
                verticalLineToRelative(3.4f)
                lineToRelative(-2.38f, 1.43f)
                curveToRelative(-0.38f, 0.23f, -0.85f, 0.23f, -1.23f, 0f)
                close()
            }
        }.also { _SmartphoneAr = it}
