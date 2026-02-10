package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusTicket: ImageVector? = null

val Icons.Bs.BusTicket: ImageVector
    get() = _BusTicket ?: UXIcon(name = "BusTicket") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 10.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(21f, 7.76f)
                curveToRelative(-1.75f, 0.62f, -3f, 2.29f, -3f, 4.24f)
                reflectiveCurveToRelative(1.25f, 3.62f, 3f, 4.24f)
                verticalLineToRelative(1.26f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-17f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(14.71f, 9.29f)
                curveToRelative(-0.31f, -0.7f, -0.97f, -1.15f, -1.71f, -1.25f)
                verticalLineToRelative(-0.04f)
                horizontalLineToRelative(-5.83f)
                curveToRelative(-1.14f, 0f, -2.06f, 0.88f, -2.15f, 2f)
                horizontalLineToRelative(-0.02f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1.09f)
                curveToRelative(0.21f, 0.58f, 0.76f, 1f, 1.41f, 1f)
                reflectiveCurveToRelative(1.2f, -0.42f, 1.41f, -1f)
                horizontalLineToRelative(3.18f)
                curveToRelative(0.21f, 0.58f, 0.76f, 1f, 1.41f, 1f)
                reflectiveCurveToRelative(1.2f, -0.42f, 1.41f, -1f)
                horizontalLineToRelative(1.09f)
                verticalLineToRelative(-2.22f)
                curveToRelative(0f, -0.4f, -0.08f, -0.79f, -0.24f, -1.15f)
                close()
                moveTo(7f, 10f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _BusTicket = it}
