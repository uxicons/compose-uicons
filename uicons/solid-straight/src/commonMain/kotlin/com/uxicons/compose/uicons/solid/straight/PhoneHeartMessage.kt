package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneHeartMessage: ImageVector? = null

val Icons.Ss.PhoneHeartMessage: ImageVector
    get() = _PhoneHeartMessage ?: UXIcon(name = "PhoneHeartMessage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.0f, 5.0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2.0f, 2f)
                lineToRelative(0.0f, 7.91f)
                curveToRelative(0f, 0.86f, 0.95f, 1.38f, 1.67f, 0.92f)
                lineToRelative(2.83f, -1.83f)
                horizontalLineToRelative(5.5f)
                lineTo(24f, 7.0f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2.0f, -2f)
                close()
                moveTo(19f, 12.5f)
                reflectiveCurveToRelative(-3f, -2.12f, -3f, -3.85f)
                curveToRelative(0f, -0.91f, 0.67f, -1.65f, 1.5f, -1.65f)
                reflectiveCurveToRelative(1.5f, 0.74f, 1.5f, 1.65f)
                curveToRelative(0f, -0.91f, 0.67f, -1.65f, 1.5f, -1.65f)
                reflectiveCurveToRelative(1.5f, 0.74f, 1.5f, 1.65f)
                curveToRelative(0f, 1.73f, -3f, 3.85f, -3f, 3.85f)
                close()
                moveTo(0f, 18f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(13f, 24f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                lineTo(0f, 18f)
                close()
                moveTo(10f, 22f)
                lineTo(6f, 22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(12.21f, 16f)
                lineTo(0f, 16f)
                lineTo(0f, 0f)
                lineTo(16f, 0f)
                lineTo(16f, 3f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.07f, 0f, -2.07f, 0.42f, -2.83f, 1.18f)
                curveToRelative(-0.76f, 0.76f, -1.17f, 1.76f, -1.17f, 2.83f)
                lineToRelative(0.0f, 7.91f)
                curveToRelative(0f, 0.38f, 0.07f, 0.74f, 0.2f, 1.09f)
                close()
            }
        }.also { _PhoneHeartMessage = it}
