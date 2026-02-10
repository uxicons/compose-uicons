package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineGlassCrack: ImageVector? = null

val Icons.Ts.WineGlassCrack: ImageVector
    get() = _WineGlassCrack ?: UXIcon(name = "WineGlassCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 9f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                lineTo(5f, 9f)
                curveToRelative(0f, 3.69f, 2.87f, 6.72f, 6.5f, 6.98f)
                verticalLineToRelative(7.02f)
                lineTo(7f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-7.02f)
                curveToRelative(3.63f, -0.26f, 6.5f, -3.29f, 6.5f, -6.98f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                lineTo(6f, 1f)
                horizontalLineToRelative(5.26f)
                lineToRelative(-2f, 5f)
                horizontalLineToRelative(4f)
                lineToRelative(-1.73f, 4.31f)
                lineToRelative(0.93f, 0.37f)
                lineToRelative(2.27f, -5.69f)
                horizontalLineToRelative(-4f)
                lineToRelative(1.6f, -4f)
                horizontalLineToRelative(5.66f)
                lineTo(18.0f, 9f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _WineGlassCrack = it}
