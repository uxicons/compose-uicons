package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardHat: ImageVector? = null

val Icons.Ss.HardHat: ImageVector
    get() = _HardHat ?: UXIcon(name = "HardHat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 17f)
                lineTo(0f, 17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.48f)
                curveToRelative(1.52f, 1.5f, 4.52f, 4f, 10.52f, 4f)
                reflectiveCurveToRelative(9f, -2.5f, 10.52f, -4f)
                horizontalLineToRelative(1.48f)
                verticalLineToRelative(-2f)
                close()
                moveTo(9f, 15f)
                lineTo(9f, 1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(7f, 15f)
                lineTo(1f, 15f)
                verticalLineToRelative(-2.45f)
                curveToRelative(0f, -4.09f, 2.38f, -7.77f, 6f, -9.58f)
                verticalLineToRelative(12.03f)
                close()
                moveTo(23f, 12.55f)
                verticalLineToRelative(2.45f)
                horizontalLineToRelative(-6f)
                lineTo(17f, 2.97f)
                curveToRelative(3.62f, 1.81f, 6f, 5.49f, 6f, 9.58f)
                close()
            }
        }.also { _HardHat = it}
