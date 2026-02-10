package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckFlatbed: ImageVector? = null

val Icons.Br.TruckFlatbed: ImageVector
    get() = _TruckFlatbed ?: UXIcon(name = "TruckFlatbed") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.32f, 13.22f)
            lineToRelative(-1.49f, -4.46f)
            curveToRelative(-0.75f, -2.25f, -2.85f, -3.76f, -5.22f, -3.76f)
            horizontalLineToRelative(-2.12f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(10.5f)
            lineTo(1.5f, 17f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -1.75f, -1.12f, -3.23f, -2.68f, -3.78f)
            close()
            moveTo(14f, 13f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(0.62f)
            curveToRelative(1.08f, 0f, 2.03f, 0.69f, 2.37f, 1.71f)
            lineToRelative(1.1f, 3.29f)
            horizontalLineToRelative(-4.08f)
            close()
        }
    }.also { _TruckFlatbed = it }
