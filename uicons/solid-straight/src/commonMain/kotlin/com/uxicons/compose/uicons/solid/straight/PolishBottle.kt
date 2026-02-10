package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PolishBottle: ImageVector? = null

val Icons.Ss.PolishBottle: ImageVector
    get() = _PolishBottle ?: UXIcon(name = "PolishBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 8f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 0f)
                horizontalLineToRelative(6f)
                lineTo(15f, 8f)
                close()
                moveTo(14f, 16f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19.21f, 10.97f)
                curveToRelative(-0.57f, -0.61f, -1.37f, -0.97f, -2.21f, -0.97f)
                lineTo(7f, 10f)
                curveToRelative(-1.72f, -0.03f, -3.17f, 1.55f, -2.99f, 3.27f)
                lineToRelative(1.08f, 10.73f)
                horizontalLineToRelative(13.81f)
                lineToRelative(1.08f, -10.75f)
                curveToRelative(0.07f, -0.83f, -0.22f, -1.67f, -0.78f, -2.28f)
                close()
                moveTo(16f, 20f)
                lineTo(8f, 20f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _PolishBottle = it}
