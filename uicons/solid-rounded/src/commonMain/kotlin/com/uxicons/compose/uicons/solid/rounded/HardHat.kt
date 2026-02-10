package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardHat: ImageVector? = null

val Icons.Sr.HardHat: ImageVector
    get() = _HardHat ?: UXIcon(name = "HardHat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.04f, 17f)
                lineTo(1.04f, 17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(0.04f, 18f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.48f)
                curveToRelative(1.52f, 1.5f, 4.52f, 4f, 10.52f, 4f)
                reflectiveCurveToRelative(9f, -2.5f, 10.52f, -4f)
                horizontalLineToRelative(0.48f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(9.04f, 15f)
                lineTo(9.04f, 4f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(0f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(7.04f, 15f)
                lineTo(1.04f, 15f)
                verticalLineToRelative(-2.45f)
                curveToRelative(0f, -4.09f, 2.38f, -7.77f, 6f, -9.58f)
                verticalLineToRelative(12.03f)
                close()
                moveTo(23.04f, 12.55f)
                verticalLineToRelative(2.45f)
                horizontalLineToRelative(-6f)
                lineTo(17.04f, 2.97f)
                curveToRelative(3.62f, 1.81f, 6f, 5.49f, 6f, 9.58f)
                close()
            }
        }.also { _HardHat = it}
