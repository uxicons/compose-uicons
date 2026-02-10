package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckFlatbed: ImageVector? = null

val Icons.Bs.TruckFlatbed: ImageVector
    get() = _TruckFlatbed ?: UXIcon(name = "TruckFlatbed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 11f)
                horizontalLineToRelative(-0.78f)
                lineToRelative(-1.84f, -5.61f)
                curveToRelative(-0.48f, -1.43f, -1.81f, -2.39f, -3.32f, -2.39f)
                horizontalLineToRelative(-5.06f)
                verticalLineToRelative(12f)
                lineTo(0f, 15f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.05f)
                curveToRelative(-0.03f, 0.16f, -0.05f, 0.33f, -0.05f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.5f)
                horizontalLineToRelative(9.1f)
                curveToRelative(-0.03f, 0.16f, -0.05f, 0.33f, -0.05f, 0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.5f)
                horizontalLineToRelative(3.05f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(16.06f, 6f)
                curveToRelative(0.22f, 0f, 0.41f, 0.14f, 0.47f, 0.34f)
                lineToRelative(1.55f, 4.66f)
                horizontalLineToRelative(-4.08f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2.06f)
                close()
            }
        }.also { _TruckFlatbed = it}
