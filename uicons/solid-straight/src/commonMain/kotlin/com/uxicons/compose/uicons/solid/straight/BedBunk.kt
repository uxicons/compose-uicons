package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedBunk: ImageVector? = null

val Icons.Ss.BedBunk: ImageVector
    get() = _BedBunk ?: UXIcon(name = "BedBunk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 15.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                lineTo(2f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                lineTo(9f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(9f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2f, 19f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                lineTo(2f, 9f)
                verticalLineToRelative(10f)
                close()
                moveTo(5.5f, 6f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }.also { _BedBunk = it}
