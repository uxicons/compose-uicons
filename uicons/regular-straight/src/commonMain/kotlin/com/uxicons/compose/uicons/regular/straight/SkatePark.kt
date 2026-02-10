package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkatePark: ImageVector? = null

val Icons.Rs.SkatePark: ImageVector
    get() = _SkatePark ?: UXIcon(name = "SkatePark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.33f, 22f)
                horizontalLineToRelative(1.67f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(13.01f)
                curveToRelative(-9.8f, -4.91f, -10.01f, -17.17f, -10.01f, -17.33f)
                verticalLineToRelative(-2.67f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4.67f)
                curveToRelative(0.01f, 0.7f, 0.34f, 17.33f, 17.33f, 17.33f)
                close()
                moveTo(21.13f, 15f)
                curveToRelative(-0.3f, 0f, -0.58f, -0.12f, -0.79f, -0.33f)
                lineToRelative(-7.01f, -7.01f)
                curveToRelative(-0.21f, -0.21f, -0.33f, -0.49f, -0.33f, -0.79f)
                verticalLineToRelative(-2.87f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.87f)
                curveToRelative(0f, 0.83f, 0.33f, 1.62f, 0.92f, 2.21f)
                lineToRelative(7.01f, 7.01f)
                curveToRelative(0.59f, 0.59f, 1.37f, 0.92f, 2.21f, 0.92f)
                horizontalLineToRelative(2.87f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.87f)
                close()
                moveTo(11.56f, 11.56f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0f, -2.12f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0f)
                reflectiveCurveToRelative(-0.59f, 1.54f, 0f, 2.12f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                close()
                moveTo(18.56f, 18.56f)
                curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0f, -2.12f)
                curveToRelative(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0f)
                reflectiveCurveToRelative(-0.59f, 1.54f, 0f, 2.12f)
                curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
                close()
            }
        }.also { _SkatePark = it}
