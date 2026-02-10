package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckMedical: ImageVector? = null

val Icons.Rs.TruckMedical: ImageVector
    get() = _TruckMedical ?: UXIcon(name = "TruckMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 9f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2f)
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
                close()
                moveTo(24f, 19f)
                horizontalLineToRelative(-2.04f)
                curveToRelative(0.02f, 0.17f, 0.04f, 0.33f, 0.04f, 0.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.04f, -0.5f)
                horizontalLineToRelative(-6.08f)
                curveToRelative(0.02f, 0.17f, 0.04f, 0.33f, 0.04f, 0.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.04f, -0.5f)
                lineTo(0f, 19f)
                lineTo(0f, 4f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                horizontalLineToRelative(11f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(9f)
                close()
                moveTo(17f, 7f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(15f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(13f)
                lineTo(15f, 4f)
                close()
                moveTo(22f, 17f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _TruckMedical = it}
