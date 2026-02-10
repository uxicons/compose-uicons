package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PalletAlt: ImageVector? = null

val Icons.Ss.PalletAlt: ImageVector
    get() = _PalletAlt ?: UXIcon(name = "PalletAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 17f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                lineTo(2f, 19f)
                verticalLineToRelative(3f)
                lineTo(0f, 22f)
                verticalLineToRelative(-5f)
                close()
                moveTo(12f, 15f)
                lineTo(0f, 15f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(9f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _PalletAlt = it}
