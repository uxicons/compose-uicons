package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PolishBottle: ImageVector? = null

val Icons.Bs.PolishBottle: ImageVector
    get() = _PolishBottle ?: UXIcon(name = "PolishBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.07f, 10.13f)
                curveToRelative(-0.66f, -0.72f, -1.6f, -1.13f, -2.58f, -1.13f)
                horizontalLineToRelative(-0.5f)
                lineTo(16f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 9f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-2.0f, -0.04f, -3.7f, 1.81f, -3.48f, 3.82f)
                lineToRelative(1.13f, 11.18f)
                horizontalLineToRelative(13.71f)
                lineToRelative(1.13f, -11.21f)
                curveToRelative(0.08f, -0.97f, -0.25f, -1.94f, -0.91f, -2.66f)
                close()
                moveTo(11f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 3f)
                close()
                moveTo(16.14f, 21f)
                lineTo(7.86f, 21f)
                lineToRelative(-0.85f, -8.46f)
                curveToRelative(0.02f, -0.36f, 0.14f, -0.49f, 0.5f, -0.54f)
                horizontalLineToRelative(9f)
                curveToRelative(0.35f, 0.05f, 0.47f, 0.18f, 0.5f, 0.52f)
                lineToRelative(-0.86f, 8.48f)
                close()
                moveTo(9f, 15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _PolishBottle = it}
