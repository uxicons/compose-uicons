package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneHeartMessage: ImageVector? = null

val Icons.Rs.PhoneHeartMessage: ImageVector
    get() = _PhoneHeartMessage ?: UXIcon(name = "PhoneHeartMessage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 0f)
                lineTo(16f, 0f)
                lineTo(16f, 3f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.72f, 0f, -1.4f, 0.2f, -2.0f, 0.56f)
                verticalLineToRelative(-1.55f)
                lineTo(2f, 2f)
                verticalLineToRelative(14f)
                lineTo(12f, 16f)
                verticalLineToRelative(2f)
                lineTo(2f, 18f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(13f, 22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(-2.83f, 1.83f)
                curveToRelative(-0.72f, 0.46f, -1.67f, -0.06f, -1.67f, -0.92f)
                lineToRelative(-0.0f, -7.91f)
                curveToRelative(0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2.0f, 0.9f, 2.0f, 2.0f)
                close()
                moveTo(22f, 8.65f)
                curveToRelative(0f, -0.91f, -0.67f, -1.65f, -1.5f, -1.65f)
                reflectiveCurveToRelative(-1.5f, 0.74f, -1.5f, 1.65f)
                curveToRelative(0f, -0.91f, -0.67f, -1.65f, -1.5f, -1.65f)
                reflectiveCurveToRelative(-1.5f, 0.74f, -1.5f, 1.65f)
                curveToRelative(0f, 1.73f, 3f, 3.85f, 3f, 3.85f)
                curveToRelative(0f, 0f, 3f, -2.12f, 3f, -3.85f)
                close()
                moveTo(10f, 21f)
                verticalLineToRelative(-2f)
                lineTo(6f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _PhoneHeartMessage = it}
