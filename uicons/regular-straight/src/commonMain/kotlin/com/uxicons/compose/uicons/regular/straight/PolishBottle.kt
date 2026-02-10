package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PolishBottle: ImageVector? = null

val Icons.Rs.PolishBottle: ImageVector
    get() = _PolishBottle ?: UXIcon(name = "PolishBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.21f, 9.97f)
                curveToRelative(-0.57f, -0.61f, -1.37f, -0.97f, -2.21f, -0.97f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 9f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.71f, -0.03f, -3.17f, 1.55f, -2.99f, 3.26f)
                lineToRelative(1.08f, 11.74f)
                horizontalLineToRelative(13.82f)
                lineToRelative(1.08f, -11.75f)
                curveToRelative(0.07f, -0.83f, -0.22f, -1.67f, -0.78f, -2.28f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 2f)
                close()
                moveTo(17.09f, 22f)
                lineTo(6.91f, 22f)
                lineToRelative(-0.91f, -9.92f)
                curveToRelative(-0.06f, -0.57f, 0.43f, -1.1f, 1.0f, -1.08f)
                horizontalLineToRelative(10f)
                curveToRelative(0.56f, -0.02f, 1.06f, 0.52f, 1.0f, 1.07f)
                lineToRelative(-0.91f, 9.93f)
                close()
                moveTo(8f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6f)
                lineTo(8f, 13f)
                verticalLineToRelative(6f)
                close()
                moveTo(10f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _PolishBottle = it}
