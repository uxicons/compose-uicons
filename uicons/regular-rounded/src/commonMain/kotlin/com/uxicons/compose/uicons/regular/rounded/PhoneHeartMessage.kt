package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneHeartMessage: ImageVector? = null

val Icons.Rr.PhoneHeartMessage: ImageVector
    get() = _PhoneHeartMessage ?: UXIcon(name = "PhoneHeartMessage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 19f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveTo(2.24f, 24f, 0f, 21.76f, 0f, 19f)
                lineTo(0f, 5f)
                curveTo(0f, 2.24f, 2.24f, 0f, 5f, 0f)
                horizontalLineToRelative(6f)
                curveToRelative(1.43f, 0f, 2.8f, 0.62f, 3.75f, 1.69f)
                curveToRelative(0.37f, 0.41f, 0.33f, 1.05f, -0.09f, 1.41f)
                curveToRelative(-0.41f, 0.37f, -1.04f, 0.33f, -1.41f, -0.09f)
                curveToRelative(-0.57f, -0.65f, -1.39f, -1.02f, -2.25f, -1.02f)
                lineTo(5f, 2.0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(11f)
                lineTo(11f, 16.0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(2f, 18.0f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(7f, 19f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(24f, 7.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3f)
                lineToRelative(-2.83f, 1.83f)
                curveToRelative(-0.72f, 0.46f, -1.67f, -0.06f, -1.67f, -0.92f)
                lineToRelative(-0.0f, -7.41f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(22f, 8.65f)
                curveToRelative(0f, -0.91f, -0.67f, -1.65f, -1.5f, -1.65f)
                reflectiveCurveToRelative(-1.5f, 0.74f, -1.5f, 1.65f)
                curveToRelative(0f, -0.91f, -0.67f, -1.65f, -1.5f, -1.65f)
                reflectiveCurveToRelative(-1.5f, 0.74f, -1.5f, 1.65f)
                curveToRelative(0f, 1.23f, 1.51f, 2.65f, 2.38f, 3.37f)
                curveToRelative(0.36f, 0.3f, 0.87f, 0.3f, 1.23f, 0f)
                curveToRelative(0.88f, -0.72f, 2.38f, -2.15f, 2.38f, -3.37f)
                close()
            }
        }.also { _PhoneHeartMessage = it}
