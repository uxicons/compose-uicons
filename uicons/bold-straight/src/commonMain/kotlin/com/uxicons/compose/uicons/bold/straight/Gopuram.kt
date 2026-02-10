package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gopuram: ImageVector? = null

val Icons.Bs.Gopuram: ImageVector
    get() = _Gopuram ?: UXIcon(name = "Gopuram") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 16f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.5f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.5f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                lineTo(0f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(7f, 5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                close()
                moveTo(5f, 12f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                close()
                moveTo(14f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _Gopuram = it}
