package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckMedical: ImageVector? = null

val Icons.Ss.TruckMedical: ImageVector
    get() = _TruckMedical ?: UXIcon(name = "TruckMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                lineTo(3f, 1f)
                curveTo(1.34f, 1f, 0f, 2.34f, 0f, 4f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(15f)
                lineTo(15f, 4f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(12f, 11f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2f)
                close()
                moveTo(21.94f, 20f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.06f, -0.5f)
                horizontalLineToRelative(4.88f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-5f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(7.94f, 20f)
                curveToRelative(0.03f, 0.16f, 0.06f, 0.33f, 0.06f, 0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.06f, -0.5f)
                horizontalLineToRelative(4.88f)
                close()
            }
        }.also { _TruckMedical = it}
