package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PalletAlt: ImageVector? = null

val Icons.Ts.PalletAlt: ImageVector
    get() = _PalletAlt ?: UXIcon(name = "PalletAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 17f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                lineTo(1f, 18f)
                verticalLineToRelative(3f)
                lineTo(0f, 21f)
                verticalLineToRelative(-4f)
                close()
                moveTo(12f, 15f)
                lineTo(0f, 15f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(11f, 5.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 4f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(10f)
                lineTo(11f, 5.5f)
                close()
                moveTo(24f, 7.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 7.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }.also { _PalletAlt = it}
