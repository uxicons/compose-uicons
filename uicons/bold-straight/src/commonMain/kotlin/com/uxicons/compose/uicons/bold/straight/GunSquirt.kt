package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GunSquirt: ImageVector? = null

val Icons.Bs.GunSquirt: ImageVector
    get() = _GunSquirt ?: UXIcon(name = "GunSquirt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                horizontalLineToRelative(-2.21f)
                curveToRelative(-0.66f, -2.31f, -2.78f, -4f, -5.29f, -4f)
                lineTo(6f, 2f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                lineTo(0f, 2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2.16f)
                lineTo(0.11f, 20.33f)
                curveToRelative(-0.52f, 1.84f, 0.87f, 3.67f, 2.78f, 3.67f)
                curveToRelative(1.29f, 0f, 2.43f, -0.86f, 2.78f, -2.11f)
                lineToRelative(0.53f, -1.89f)
                horizontalLineToRelative(3.8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.96f)
                lineToRelative(1.12f, -4f)
                horizontalLineToRelative(8.34f)
                curveToRelative(2.51f, 0f, 4.64f, -1.69f, 5.29f, -4f)
                horizontalLineToRelative(2.21f)
                verticalLineToRelative(-3f)
                close()
                moveTo(16.5f, 10f)
                lineTo(3f, 10f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _GunSquirt = it}
