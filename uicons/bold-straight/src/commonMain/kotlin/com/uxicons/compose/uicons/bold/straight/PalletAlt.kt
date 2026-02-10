package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PalletAlt: ImageVector? = null

val Icons.Bs.PalletAlt: ImageVector
    get() = _PalletAlt ?: UXIcon(name = "PalletAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 16f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                lineTo(3f, 19f)
                verticalLineToRelative(3f)
                lineTo(0f, 22f)
                verticalLineToRelative(-6f)
                close()
                moveTo(12f, 14f)
                lineTo(0f, 14f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(9f, 5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(24f, 7.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 7.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }.also { _PalletAlt = it}
