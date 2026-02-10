package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SteamIron: ImageVector? = null

val Icons.Bs.SteamIron: ImageVector
    get() = _SteamIron ?: UXIcon(name = "SteamIron") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 2f)
                horizontalLineToRelative(-5.26f)
                curveToRelative(0.48f, 0.71f, 0.76f, 1.57f, 0.76f, 2.5f)
                curveToRelative(0f, 0.17f, -0.03f, 0.33f, -0.05f, 0.5f)
                horizontalLineToRelative(4.55f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                lineTo(10.5f, 11f)
                curveTo(2.21f, 11f, 0f, 17.6f, 0f, 21.5f)
                verticalLineToRelative(2.5f)
                lineTo(24f, 24f)
                lineTo(24f, 8.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3.02f, 21f)
                curveToRelative(0.12f, -1.91f, 1.04f, -7f, 7.48f, -7f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(7f)
                close()
                moveTo(0f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.19f, 0f, 0.56f, 0f, 0.56f, 0f)
                curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.44f, -2f)
                reflectiveCurveToRelative(2.21f, 0.86f, 2.44f, 2f)
                curveToRelative(0f, 0f, 0.37f, 0f, 0.56f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-1f)
                lineToRelative(-2f, 3f)
                lineToRelative(-2f, -3f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _SteamIron = it}
