package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HundredPoints: ImageVector? = null

val Icons.Bs.HundredPoints: ImageVector
    get() = _HundredPoints ?: UXIcon(name = "HundredPoints") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 6.56f)
                lineTo(0.12f, 4.72f)
                lineToRelative(2.66f, -2.72f)
                horizontalLineToRelative(2.22f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7.44f)
                close()
                moveTo(15f, 8f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
                moveTo(18f, 8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveTo(6f, 9f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
                moveTo(9f, 9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveTo(23.49f, 12.98f)
                lineTo(-0.01f, 17.07f)
                lineToRelative(0.51f, 2.96f)
                lineToRelative(23.5f, -4.09f)
                lineToRelative(-0.51f, -2.96f)
                close()
                moveTo(8.99f, 21.0f)
                lineToRelative(0.51f, 2.96f)
                lineToRelative(14.5f, -2.5f)
                lineToRelative(-0.51f, -2.96f)
                lineToRelative(-14.5f, 2.5f)
                close()
            }
        }.also { _HundredPoints = it}
