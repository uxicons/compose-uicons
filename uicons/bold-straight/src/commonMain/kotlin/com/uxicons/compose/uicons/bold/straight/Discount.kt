package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Discount: ImageVector? = null

val Icons.Bs.Discount: ImageVector
    get() = _Discount ?: UXIcon(name = "Discount") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(8.14f, 17f)
                lineTo(13.97f, 8f)
                horizontalLineToRelative(-3.47f)
                lineToRelative(-5.83f, 9f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
                close()
                moveTo(22f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                lineToRelative(3.79f, 3.71f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                close()
                moveTo(9.76f, 21f)
                horizontalLineToRelative(-6.76f)
                verticalLineToRelative(-13.63f)
                lineToRelative(7f, -3.93f)
                lineToRelative(7f, 3.93f)
                verticalLineToRelative(1.65f)
                curveToRelative(0.17f, -0.01f, 0.33f, -0.03f, 0.5f, -0.03f)
                curveToRelative(0.87f, 0f, 1.71f, 0.13f, 2.5f, 0.38f)
                verticalLineToRelative(-3.76f)
                lineToRelative(-10f, -5.62f)
                lineToRelative(-10f, 5.62f)
                verticalLineToRelative(15.38f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(9.03f)
                curveToRelative(-0.96f, -0.81f, -1.74f, -1.84f, -2.27f, -3f)
                close()
            }
        }.also { _Discount = it}
