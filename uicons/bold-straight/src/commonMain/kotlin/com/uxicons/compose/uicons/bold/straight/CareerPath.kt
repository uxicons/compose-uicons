package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CareerPath: ImageVector? = null

val Icons.Bs.CareerPath: ImageVector
    get() = _CareerPath ?: UXIcon(name = "CareerPath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 10f)
                horizontalLineToRelative(-3f)
                lineTo(17f, 0f)
                horizontalLineToRelative(3f)
                lineToRelative(4f, 2.5f)
                lineToRelative(-4f, 2.5f)
                verticalLineToRelative(5f)
                close()
                moveTo(11f, 18f)
                verticalLineToRelative(6f)
                lineTo(0f, 24f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(7f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19.5f, 13f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }.also { _CareerPath = it}
