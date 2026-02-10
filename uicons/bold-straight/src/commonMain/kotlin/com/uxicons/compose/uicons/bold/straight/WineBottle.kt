package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineBottle: ImageVector? = null

val Icons.Bs.WineBottle: ImageVector
    get() = _WineBottle ?: UXIcon(name = "WineBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.94f, 9.13f)
                lineToRelative(-2.94f, -2.35f)
                lineTo(16f, 0f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(6.78f)
                lineToRelative(-2.94f, 2.35f)
                curveToRelative(-1.31f, 1.05f, -2.06f, 2.62f, -2.06f, 4.29f)
                verticalLineToRelative(10.58f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-10.58f)
                curveToRelative(0f, -1.68f, -0.75f, -3.25f, -2.06f, -4.29f)
                close()
                moveTo(18f, 21f)
                lineTo(6f, 21f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                lineTo(6.04f, 13f)
                curveToRelative(0.1f, -0.6f, 0.42f, -1.14f, 0.9f, -1.53f)
                lineToRelative(4.06f, -3.25f)
                verticalLineToRelative(-3.22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.22f)
                lineToRelative(4.06f, 3.25f)
                curveToRelative(0.6f, 0.48f, 0.94f, 1.19f, 0.94f, 1.95f)
                verticalLineToRelative(7.58f)
                close()
            }
        }.also { _WineBottle = it}
