package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MenSwimsuit: ImageVector? = null

val Icons.Ss.MenSwimsuit: ImageVector
    get() = _MenSwimsuit ?: UXIcon(name = "MenSwimsuit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.8f, 11.01f)
                lineToRelative(-7.77f, 8.97f)
                lineToRelative(0.0f, -0.31f)
                curveToRelative(0f, -5.28f, 2.97f, -8.57f, 7.77f, -8.66f)
                close()
                moveTo(0.2f, 11.01f)
                lineTo(8f, 20.01f)
                verticalLineToRelative(-0.34f)
                curveToRelative(0f, -5.28f, -2.99f, -8.57f, -7.8f, -8.66f)
                close()
                moveTo(18f, 3f)
                verticalLineToRelative(7.81f)
                curveToRelative(1.6f, -1.16f, 3.64f, -1.81f, 6f, -1.81f)
                verticalLineToRelative(-6f)
                close()
                moveTo(6f, 3f)
                horizontalLineToRelative(-6f)
                reflectiveCurveToRelative(0f, 6f, 0f, 6f)
                curveToRelative(2.35f, 0f, 4.38f, 0.67f, 6f, 1.85f)
                close()
                moveTo(14.04f, 19.66f)
                curveToRelative(0f, -2.73f, 0.7f, -5.05f, 1.96f, -6.82f)
                verticalLineToRelative(-9.84f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(9.88f)
                curveToRelative(1.28f, 1.78f, 2f, 4.1f, 2f, 6.79f)
                verticalLineToRelative(1.16f)
                curveToRelative(0.53f, 0.1f, 1.2f, 0.17f, 2f, 0.17f)
                curveToRelative(0.81f, 0f, 1.49f, -0.07f, 2.02f, -0.17f)
                lineToRelative(0.01f, -1.17f)
                close()
            }
        }.also { _MenSwimsuit = it}
