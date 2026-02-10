package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedBunk: ImageVector? = null

val Icons.Rs.BedBunk: ImageVector
    get() = _BedBunk ?: UXIcon(name = "BedBunk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.44f, 0f, -2.65f, 1.02f, -2.94f, 2.39f)
                curveToRelative(-0.47f, -0.24f, -1.0f, -0.39f, -1.56f, -0.39f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 0.54f, 0.13f, 1.04f, 0.35f, 1.5f)
                horizontalLineToRelative(-2.35f)
                lineTo(2f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(7.5f, 4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(7.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(22f, 19f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(5f)
                close()
                moveTo(22f, 12f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.44f, 0f, -2.65f, 1.02f, -2.94f, 2.39f)
                curveToRelative(-0.47f, -0.24f, -1.0f, -0.39f, -1.56f, -0.39f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 0.54f, 0.13f, 1.04f, 0.35f, 1.5f)
                horizontalLineToRelative(-2.35f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(3f)
                close()
                moveTo(22f, 7f)
                horizontalLineToRelative(-11f)
                lineTo(11f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _BedBunk = it}
