package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardHat: ImageVector? = null

val Icons.Rs.HardHat: ImageVector
    get() = _HardHat ?: UXIcon(name = "HardHat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.45f)
                curveToRelative(0f, -4.46f, -2.83f, -8.43f, -7f, -10.02f)
                verticalLineToRelative(-1.53f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(1.53f)
                curveTo(3.83f, 4.12f, 1f, 8.09f, 1f, 12.55f)
                verticalLineToRelative(3.45f)
                lineTo(0f, 16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.48f)
                curveToRelative(0.99f, 1.34f, 4.28f, 5f, 10.52f, 5f)
                reflectiveCurveToRelative(9.53f, -3.66f, 10.52f, -5f)
                horizontalLineToRelative(1.48f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 12.55f)
                verticalLineToRelative(3.45f)
                horizontalLineToRelative(-5f)
                lineTo(16f, 4.71f)
                curveToRelative(3.01f, 1.46f, 5f, 4.48f, 5f, 7.84f)
                close()
                moveTo(14f, 3f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(3f, 12.55f)
                curveToRelative(0f, -3.37f, 1.99f, -6.39f, 5f, -7.84f)
                verticalLineToRelative(11.29f)
                lineTo(3f, 16f)
                verticalLineToRelative(-3.45f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-3.94f, 0f, -6.48f, -1.69f, -7.86f, -3f)
                horizontalLineToRelative(15.7f)
                curveToRelative(-1.39f, 1.31f, -3.93f, 3f, -7.84f, 3f)
                close()
            }
        }.also { _HardHat = it}
