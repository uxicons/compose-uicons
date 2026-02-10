package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardHat: ImageVector? = null

val Icons.Ts.HardHat: ImageVector
    get() = _HardHat ?: UXIcon(name = "HardHat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 17f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.67f)
                curveToRelative(0f, -4.8f, -3.29f, -9.04f, -8f, -10.34f)
                verticalLineToRelative(-0.99f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(0.99f)
                curveTo(4.29f, 3.29f, 1f, 7.53f, 1f, 12.33f)
                verticalLineToRelative(4.67f)
                lineTo(0f, 17f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.76f, 0.97f, 4.3f, 5f, 10.75f, 5f)
                reflectiveCurveToRelative(9.99f, -4.03f, 10.75f, -5f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-1f)
                close()
                moveTo(22f, 12.33f)
                verticalLineToRelative(4.67f)
                horizontalLineToRelative(-7f)
                lineTo(15f, 3.03f)
                curveToRelative(4.14f, 1.27f, 7f, 5.03f, 7f, 9.29f)
                close()
                moveTo(14f, 2f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(2f, 12.33f)
                curveToRelative(0f, -4.26f, 2.86f, -8.03f, 7f, -9.29f)
                verticalLineToRelative(13.97f)
                lineTo(2f, 17f)
                verticalLineToRelative(-4.67f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-4.96f, 0f, -8.12f, -2.64f, -9.41f, -4f)
                horizontalLineToRelative(18.83f)
                curveToRelative(-1.3f, 1.36f, -4.46f, 4f, -9.41f, 4f)
                close()
            }
        }.also { _HardHat = it}
