package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Podium: ImageVector? = null

val Icons.Bs.Podium: ImageVector
    get() = _Podium ?: UXIcon(name = "Podium") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10f)
                lineTo(5f, 10f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.46f, 0.61f, 1.18f, 1f, 2f, 1f)
                horizontalLineToRelative(4.25f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.25f)
                curveToRelative(-0.82f, 0f, -1.54f, 0.39f, -2f, 1f)
                horizontalLineToRelative(-0.75f)
                curveTo(4.47f, 1f, 2f, 3.47f, 2f, 6.5f)
                verticalLineToRelative(3.5f)
                lineTo(0f, 10f)
                verticalLineToRelative(3f)
                lineTo(2.25f, 13f)
                lineToRelative(2f, 11f)
                lineTo(20.31f, 24f)
                lineToRelative(1.5f, -11f)
                horizontalLineToRelative(2.19f)
                verticalLineToRelative(-3f)
                close()
                moveTo(17.69f, 21f)
                lineTo(6.75f, 21f)
                lineToRelative(-1.46f, -8f)
                horizontalLineToRelative(13.48f)
                lineToRelative(-1.09f, 8f)
                close()
            }
        }.also { _Podium = it}
