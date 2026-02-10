package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckArrowRight: ImageVector? = null

val Icons.Bs.TruckArrowRight: ImageVector
    get() = _TruckArrowRight ?: UXIcon(name = "TruckArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 1f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(10f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                lineTo(3f, 17f)
                verticalLineToRelative(-3f)
                lineTo(0f, 14f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3.06f)
                curveToRelative(-0.03f, 0.16f, -0.06f, 0.33f, -0.06f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.03f, -0.34f, -0.06f, -0.5f)
                horizontalLineToRelative(8.12f)
                curveToRelative(-0.03f, 0.16f, -0.06f, 0.33f, -0.06f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.03f, -0.34f, -0.06f, -0.5f)
                horizontalLineToRelative(3.06f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(18.5f, 8f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(7f, 12f)
                lineTo(0f, 12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                lineToRelative(3.71f, 3.79f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-3.71f, 3.79f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _TruckArrowRight = it}
