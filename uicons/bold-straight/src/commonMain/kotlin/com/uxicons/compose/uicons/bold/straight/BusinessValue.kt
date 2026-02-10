package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusinessValue: ImageVector? = null

val Icons.Bs.BusinessValue: ImageVector
    get() = _BusinessValue ?: UXIcon(name = "BusinessValue") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(11.0f)
                lineToRelative(-2.25f, 3f)
                horizontalLineToRelative(-8.75f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(9.79f)
                lineToRelative(2.57f, 3f)
                horizontalLineToRelative(-15.36f)
                verticalLineToRelative(-18f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(18.87f, 13.0f)
                lineTo(20f, 16.0f)
                horizontalLineToRelative(-4f)
                lineToRelative(1.13f, -3f)
                horizontalLineToRelative(-2.13f)
                lineToRelative(-3f, 4f)
                lineToRelative(6.0f, 7.0f)
                lineToRelative(-2.06f, -6f)
                horizontalLineToRelative(4.12f)
                lineToRelative(-2.06f, 6f)
                lineToRelative(6f, -7f)
                reflectiveCurveToRelative(-3f, -4.0f, -3f, -4.0f)
                horizontalLineToRelative(-2.13f)
                close()
            }
        }.also { _BusinessValue = it}
