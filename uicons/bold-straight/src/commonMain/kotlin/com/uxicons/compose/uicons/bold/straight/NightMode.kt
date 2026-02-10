package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NightMode: ImageVector? = null

val Icons.Bs.NightMode: ImageVector
    get() = _NightMode ?: UXIcon(name = "NightMode") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 9.03f)
                verticalLineToRelative(-6.03f)
                horizontalLineToRelative(-6.03f)
                lineToRelative(-2.97f, -2.97f)
                lineToRelative(-2.97f, 2.97f)
                horizontalLineToRelative(-6.03f)
                verticalLineToRelative(6.03f)
                lineToRelative(-2.97f, 2.97f)
                lineToRelative(2.97f, 2.97f)
                verticalLineToRelative(6.03f)
                horizontalLineToRelative(6.03f)
                lineToRelative(2.97f, 2.97f)
                lineToRelative(2.97f, -2.97f)
                horizontalLineToRelative(6.03f)
                verticalLineToRelative(-6.03f)
                lineToRelative(2.97f, -2.97f)
                close()
                moveTo(18f, 13.72f)
                verticalLineToRelative(4.28f)
                horizontalLineToRelative(-4.28f)
                lineToRelative(-1.73f, 1.73f)
                lineToRelative(-1.73f, -1.73f)
                horizontalLineToRelative(-4.28f)
                verticalLineToRelative(-4.28f)
                lineToRelative(-1.73f, -1.73f)
                lineToRelative(1.73f, -1.73f)
                verticalLineToRelative(-4.28f)
                horizontalLineToRelative(4.28f)
                lineToRelative(1.73f, -1.73f)
                lineToRelative(1.73f, 1.73f)
                horizontalLineToRelative(4.28f)
                verticalLineToRelative(4.28f)
                lineToRelative(1.73f, 1.73f)
                close()
                moveTo(12f, 12f)
                curveToRelative(0f, 2.14f, 1.56f, 3.91f, 3.61f, 4.25f)
                curveToRelative(-0.76f, 0.47f, -1.65f, 0.75f, -2.61f, 0.75f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                curveToRelative(0.96f, 0f, 1.85f, 0.28f, 2.61f, 0.75f)
                curveToRelative(-2.05f, 0.34f, -3.61f, 2.1f, -3.61f, 4.25f)
                close()
            }
        }.also { _NightMode = it}
