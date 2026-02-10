package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneHeartMessage: ImageVector? = null

val Icons.Bs.PhoneHeartMessage: ImageVector
    get() = _PhoneHeartMessage ?: UXIcon(name = "PhoneHeartMessage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                lineTo(13f, 3f)
                verticalLineToRelative(2.38f)
                curveToRelative(0.06f, -0.07f, 0.11f, -0.14f, 0.17f, -0.21f)
                curveToRelative(0.76f, -0.76f, 1.76f, -1.18f, 2.83f, -1.18f)
                horizontalLineToRelative(0f)
                lineTo(16.0f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 21f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                lineTo(13f, 24f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-3f)
                lineTo(3f, 18f)
                lineTo(3f, 3f)
                close()
                moveTo(6.0f, 20f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2.02f)
                lineTo(6.0f, 22.02f)
                verticalLineToRelative(-2.02f)
                close()
                moveTo(22.0f, 6.0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2.0f, 2f)
                lineToRelative(0.0f, 7.91f)
                curveToRelative(0f, 0.86f, 0.95f, 1.38f, 1.67f, 0.92f)
                lineToRelative(2.83f, -1.83f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2.0f, -2f)
                close()
                moveTo(19f, 13.5f)
                reflectiveCurveToRelative(-3f, -2.12f, -3f, -3.85f)
                curveToRelative(0f, -0.91f, 0.67f, -1.65f, 1.5f, -1.65f)
                reflectiveCurveToRelative(1.5f, 0.74f, 1.5f, 1.65f)
                curveToRelative(0f, -0.91f, 0.67f, -1.65f, 1.5f, -1.65f)
                reflectiveCurveToRelative(1.5f, 0.74f, 1.5f, 1.65f)
                curveToRelative(0f, 1.73f, -3f, 3.85f, -3f, 3.85f)
                close()
            }
        }.also { _PhoneHeartMessage = it}
