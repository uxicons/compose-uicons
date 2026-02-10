package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Binary: ImageVector? = null

val Icons.Rs.Binary: ImageVector
    get() = _Binary ?: UXIcon(name = "Binary") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveTo(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-3f)
                close()
                moveTo(10f, 7f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3f)
                close()
                moveTo(16f, 13f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(18f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3f)
                close()
                moveTo(15.42f, 5f)
                lineToRelative(-1.43f, -1.4f)
                lineToRelative(3.51f, -3.6f)
                horizontalLineToRelative(1.51f)
                lineTo(19.01f, 11f)
                horizontalLineToRelative(-2f)
                lineTo(17.01f, 3.37f)
                lineToRelative(-1.58f, 1.63f)
                close()
                moveTo(9f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7.63f)
                lineToRelative(-1.58f, 1.63f)
                lineToRelative(-1.43f, -1.4f)
                lineToRelative(3.51f, -3.6f)
                horizontalLineToRelative(1.51f)
                close()
            }
        }.also { _Binary = it}
