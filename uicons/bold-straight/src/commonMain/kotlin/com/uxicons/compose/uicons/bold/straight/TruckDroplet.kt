package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckDroplet: ImageVector? = null

val Icons.Bs.TruckDroplet: ImageVector
    get() = _TruckDroplet ?: UXIcon(name = "TruckDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 1f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                verticalLineToRelative(15.5f)
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
                moveTo(14f, 17f)
                lineTo(3f, 17f)
                lineTo(3f, 4.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(10f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(18.5f, 8f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(10.56f, 9.02f)
                curveToRelative(0.55f, 0.55f, 0.85f, 1.28f, 0.85f, 2.06f)
                reflectiveCurveToRelative(-0.3f, 1.51f, -0.85f, 2.06f)
                curveToRelative(-1.1f, 1.1f, -3.03f, 1.1f, -4.13f, 0f)
                curveToRelative(-0.55f, -0.55f, -0.85f, -1.28f, -0.85f, -2.06f)
                reflectiveCurveToRelative(0.3f, -1.51f, 0.85f, -2.06f)
                lineToRelative(2.07f, -2.03f)
                lineToRelative(2.06f, 2.02f)
                close()
            }
        }.also { _TruckDroplet = it}
