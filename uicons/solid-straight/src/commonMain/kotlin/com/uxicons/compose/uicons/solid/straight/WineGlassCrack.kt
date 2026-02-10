package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineGlassCrack: ImageVector? = null

val Icons.Ss.WineGlassCrack: ImageVector
    get() = _WineGlassCrack ?: UXIcon(name = "WineGlassCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 9f)
                verticalLineTo(0f)
                horizontalLineToRelative(-5.92f)
                lineToRelative(-1.6f, 4f)
                horizontalLineToRelative(4f)
                lineToRelative(-2.55f, 6.37f)
                lineToRelative(-1.86f, -0.74f)
                lineToRelative(1.45f, -3.63f)
                horizontalLineToRelative(-4f)
                lineTo(10.92f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                curveToRelative(0f, 3.52f, 2.61f, 6.43f, 6f, 6.92f)
                verticalLineToRelative(6.08f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6.08f)
                curveToRelative(3.39f, -0.49f, 6f, -3.4f, 6f, -6.92f)
                close()
            }
        }.also { _WineGlassCrack = it}
