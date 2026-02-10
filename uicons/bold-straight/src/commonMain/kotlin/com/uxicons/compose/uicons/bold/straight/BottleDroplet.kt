package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BottleDroplet: ImageVector? = null

val Icons.Bs.BottleDroplet: ImageVector
    get() = _BottleDroplet ?: UXIcon(name = "BottleDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.82f, 7.84f)
                lineToRelative(-2.81f, -1.69f)
                verticalLineToRelative(-3.15f)
                horizontalLineToRelative(1f)
                lineTo(17f, 0f)
                lineTo(7f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.15f)
                lineToRelative(-2.81f, 1.69f)
                curveToRelative(-1.35f, 0.81f, -2.19f, 2.29f, -2.19f, 3.86f)
                verticalLineToRelative(12.3f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-12.3f)
                curveToRelative(0f, -1.57f, -0.84f, -3.05f, -2.19f, -3.86f)
                close()
                moveTo(18f, 21f)
                lineTo(6f, 21f)
                verticalLineToRelative(-9.3f)
                curveToRelative(0f, -0.52f, 0.28f, -1.02f, 0.73f, -1.29f)
                lineToRelative(4.27f, -2.56f)
                lineTo(11f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.85f)
                lineToRelative(4.27f, 2.56f)
                curveToRelative(0.45f, 0.27f, 0.73f, 0.76f, 0.73f, 1.29f)
                verticalLineToRelative(9.3f)
                close()
                moveTo(15f, 16f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                curveToRelative(0f, -2f, 3f, -4.8f, 3f, -4.8f)
                curveToRelative(0f, 0f, 3f, 2.8f, 3f, 4.8f)
                close()
            }
        }.also { _BottleDroplet = it}
