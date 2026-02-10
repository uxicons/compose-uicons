package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Watch: ImageVector? = null

val Icons.Rs.Watch: ImageVector
    get() = _Watch ?: UXIcon(name = "Watch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 11.59f)
                lineToRelative(2.71f, 2.71f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.29f, -3.29f)
                verticalLineToRelative(-5.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.59f)
                close()
                moveTo(18f, 20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.84f)
                curveToRelative(-1.23f, 0.54f, -2.58f, 0.84f, -4f, 0.84f)
                reflectiveCurveToRelative(-2.77f, -0.3f, -4f, -0.84f)
                verticalLineToRelative(2.84f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.0f)
                curveToRelative(-2.43f, -1.83f, -4f, -4.73f, -4f, -8.0f)
                reflectiveCurveToRelative(1.57f, -6.17f, 4f, -8.0f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.84f)
                curveToRelative(1.23f, -0.54f, 2.58f, -0.84f, 4f, -0.84f)
                reflectiveCurveToRelative(2.77f, 0.3f, 4f, 0.84f)
                lineTo(16f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.0f)
                curveToRelative(2.43f, 1.83f, 4f, 4.73f, 4f, 8.0f)
                reflectiveCurveToRelative(-1.57f, 6.17f, -4f, 8.0f)
                close()
                moveTo(12f, 20f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                reflectiveCurveToRelative(-3.59f, -8f, -8f, -8f)
                reflectiveCurveTo(4f, 7.59f, 4f, 12f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                close()
            }
        }.also { _Watch = it}
