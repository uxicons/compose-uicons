package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tickets: ImageVector? = null

val Icons.Bs.Tickets: ImageVector
    get() = _Tickets ?: UXIcon(name = "Tickets") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 5f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 4.69f, -3.81f, 8.5f, -8.5f, 8.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7.5f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                lineTo(20f, 5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(7.5f, 19f)
                lineTo(3.5f, 19f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(10.5f, 0f)
                horizontalLineToRelative(4f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(9f, 13f)
                curveToRelative(1.96f, 0f, 3.62f, 1.25f, 4.24f, 3f)
                horizontalLineToRelative(1.26f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                lineTo(15f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.26f)
                curveToRelative(-0.62f, 1.75f, -2.29f, 3f, -4.24f, 3f)
                reflectiveCurveToRelative(-3.62f, -1.25f, -4.24f, -3f)
                horizontalLineToRelative(-1.26f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.26f)
                curveToRelative(0.62f, -1.75f, 2.29f, -3f, 4.24f, -3f)
                close()
            }
        }.also { _Tickets = it}
