package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UiUx: ImageVector? = null

val Icons.Rs.UiUx: ImageVector
    get() = _UiUx ?: UXIcon(name = "UiUx") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11f)
                verticalLineToRelative(2f)
                lineTo(0f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(24f)
                close()
                moveTo(16f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                close()
                moveTo(12f, 20f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                close()
                moveTo(8f, 9f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(12f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                close()
                moveTo(15.55f, 9f)
                lineToRelative(1.2f, -2.31f)
                lineToRelative(1.2f, 2.31f)
                horizontalLineToRelative(2.29f)
                lineToRelative(-2.35f, -4.5f)
                lineToRelative(2.35f, -4.5f)
                horizontalLineToRelative(-2.29f)
                lineToRelative(-1.2f, 2.31f)
                lineToRelative(-1.2f, -2.31f)
                horizontalLineToRelative(-2.29f)
                lineToRelative(2.35f, 4.5f)
                lineToRelative(-2.35f, 4.5f)
                horizontalLineToRelative(2.29f)
                close()
            }
        }.also { _UiUx = it}
