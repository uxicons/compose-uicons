package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusinessValue: ImageVector? = null

val Icons.Rs.BusinessValue: ImageVector
    get() = _BusinessValue ?: UXIcon(name = "BusinessValue") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(15.36f)
                lineToRelative(-1.71f, -2f)
                horizontalLineToRelative(-11.65f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(9.75f)
                lineToRelative(1.5f, -2f)
                horizontalLineToRelative(-11.25f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(8f, 2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(21f, 13.0f)
                lineTo(24f, 17.0f)
                reflectiveCurveToRelative(-6f, 7.0f, -6f, 7.0f)
                lineToRelative(2.06f, -6f)
                horizontalLineToRelative(-4.12f)
                lineToRelative(2.06f, 6f)
                lineToRelative(-6.0f, -7.0f)
                lineToRelative(3f, -4f)
                horizontalLineToRelative(2.13f)
                lineToRelative(-1.13f, 3f)
                horizontalLineToRelative(4f)
                lineToRelative(-1.13f, -3f)
                horizontalLineToRelative(2.13f)
                close()
            }
        }.also { _BusinessValue = it}
