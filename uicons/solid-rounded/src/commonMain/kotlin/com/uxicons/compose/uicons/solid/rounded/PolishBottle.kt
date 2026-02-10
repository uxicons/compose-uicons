package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PolishBottle: ImageVector? = null

val Icons.Sr.PolishBottle: ImageVector
    get() = _PolishBottle ?: UXIcon(name = "PolishBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 8f)
                horizontalLineToRelative(-6f)
                lineTo(9f, 3.12f)
                curveToRelative(0f, -1.45f, 0.98f, -2.78f, 2.4f, -3.06f)
                curveToRelative(1.92f, -0.37f, 3.6f, 1.09f, 3.6f, 2.94f)
                verticalLineToRelative(5f)
                close()
                moveTo(18.75f, 11.67f)
                curveToRelative(-0.95f, -1.06f, -2.31f, -1.67f, -3.73f, -1.67f)
                horizontalLineToRelative(-6.02f)
                curveToRelative(-2.92f, -0.06f, -5.37f, 2.7f, -4.96f, 5.6f)
                lineToRelative(0.68f, 4.86f)
                curveToRelative(0.23f, 2.02f, 1.94f, 3.54f, 3.97f, 3.54f)
                horizontalLineToRelative(6.65f)
                curveToRelative(2.03f, 0f, 3.74f, -1.52f, 3.97f, -3.52f)
                lineToRelative(0.68f, -4.91f)
                curveToRelative(0.16f, -1.42f, -0.29f, -2.84f, -1.23f, -3.9f)
                close()
                moveTo(16f, 18f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 16f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _PolishBottle = it}
