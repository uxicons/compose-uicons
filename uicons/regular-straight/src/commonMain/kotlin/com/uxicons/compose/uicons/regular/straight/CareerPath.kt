package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CareerPath: ImageVector? = null

val Icons.Rs.CareerPath: ImageVector
    get() = _CareerPath ?: UXIcon(name = "CareerPath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 10f)
                horizontalLineToRelative(-2f)
                lineTo(18f, 0f)
                horizontalLineToRelative(2f)
                lineToRelative(4f, 2.5f)
                lineToRelative(-4f, 2.5f)
                verticalLineToRelative(5f)
                close()
                moveTo(12f, 16.5f)
                verticalLineToRelative(7.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(10f, 20f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10f, 16.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(2.5f, 16f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
            }
        }.also { _CareerPath = it}
