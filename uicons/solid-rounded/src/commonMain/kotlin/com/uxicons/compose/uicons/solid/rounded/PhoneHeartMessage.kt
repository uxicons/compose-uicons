package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneHeartMessage: ImageVector? = null

val Icons.Sr.PhoneHeartMessage: ImageVector
    get() = _PhoneHeartMessage ?: UXIcon(name = "PhoneHeartMessage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 18f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(7f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-1.5f)
                lineTo(0f, 18f)
                close()
                moveTo(9f, 22f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(21.5f, 5.0f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, -0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineToRelative(0.0f, 7.41f)
                curveToRelative(0f, 0.86f, 0.95f, 1.38f, 1.67f, 0.92f)
                lineToRelative(2.83f, -1.83f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(19.61f, 12.02f)
                curveToRelative(-0.36f, 0.3f, -0.87f, 0.3f, -1.23f, 0f)
                curveToRelative(-0.88f, -0.72f, -2.38f, -2.15f, -2.38f, -3.37f)
                curveToRelative(0f, -0.91f, 0.67f, -1.65f, 1.5f, -1.65f)
                reflectiveCurveToRelative(1.5f, 0.74f, 1.5f, 1.65f)
                curveToRelative(0f, -0.91f, 0.67f, -1.65f, 1.5f, -1.65f)
                reflectiveCurveToRelative(1.5f, 0.74f, 1.5f, 1.65f)
                curveToRelative(0f, 1.23f, -1.51f, 2.65f, -2.38f, 3.37f)
                close()
                moveTo(12.21f, 16.0f)
                lineTo(0f, 16.0f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(6f)
                curveToRelative(2.08f, 0f, 3.87f, 1.28f, 4.62f, 3.09f)
                curveToRelative(-2.06f, 0.41f, -3.62f, 2.23f, -3.62f, 4.41f)
                lineToRelative(0.0f, 7.41f)
                curveToRelative(0f, 0.38f, 0.07f, 0.74f, 0.2f, 1.09f)
                close()
            }
        }.also { _PhoneHeartMessage = it}
