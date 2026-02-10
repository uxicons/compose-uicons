package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TourVirtual: ImageVector? = null

val Icons.Bs.TourVirtual: ImageVector
    get() = _TourVirtual ?: UXIcon(name = "TourVirtual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.92f, -1.36f, 3.64f, -3.84f, 4.84f)
                lineToRelative(-2.16f, 1.05f)
                verticalLineToRelative(-14.34f)
                lineToRelative(0.84f, -0.41f)
                curveToRelative(1.33f, -0.65f, 2.16f, -1.47f, 2.16f, -2.15f)
                curveToRelative(0f, -1.43f, -3.51f, -3.5f, -9f, -3.5f)
                reflectiveCurveTo(3f, 5.07f, 3f, 6.5f)
                curveToRelative(0f, 0.68f, 0.83f, 1.5f, 2.16f, 2.15f)
                lineToRelative(0.84f, 0.41f)
                verticalLineToRelative(14.34f)
                lineToRelative(-2.16f, -1.05f)
                curveToRelative(-2.48f, -1.21f, -3.84f, -2.93f, -3.84f, -4.84f)
                lineTo(0f, 6.5f)
                curveTo(0f, 2.79f, 5.16f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 2.79f, 12f, 6.5f)
                close()
                moveTo(14.5f, 7.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(16f, 14.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(1f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(11f, 17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _TourVirtual = it}
