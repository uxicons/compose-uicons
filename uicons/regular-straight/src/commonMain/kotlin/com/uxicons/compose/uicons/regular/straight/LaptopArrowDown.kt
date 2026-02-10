package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopArrowDown: ImageVector? = null

val Icons.Rs.LaptopArrowDown: ImageVector
    get() = _LaptopArrowDown ?: UXIcon(name = "LaptopArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 15f)
                lineTo(22f, 3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-4.91f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-4.91f)
                lineTo(4f, 5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                lineTo(2f, 3f)
                verticalLineToRelative(12f)
                lineTo(0f, 15f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(22f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3f, 19f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.09f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(5.83f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(6.09f)
                verticalLineToRelative(1f)
                close()
                moveTo(11f, 9.09f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9.09f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.29f, 3.29f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.41f, -0.58f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.29f, 2.29f)
                close()
            }
        }.also { _LaptopArrowDown = it}
