package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Videoconference: ImageVector? = null

val Icons.Ss.Videoconference: ImageVector
    get() = _Videoconference ?: UXIcon(name = "Videoconference") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8.14f)
                lineToRelative(0.85f, 1f)
                horizontalLineToRelative(6.02f)
                lineToRelative(0.85f, -1f)
                horizontalLineToRelative(8.14f)
                close()
                moveTo(21.95f, 0f)
                horizontalLineToRelative(-5.9f)
                curveToRelative(-1.13f, 0f, -2.05f, 0.92f, -2.05f, 2.05f)
                verticalLineToRelative(4.95f)
                horizontalLineToRelative(2.59f)
                lineToRelative(1.35f, 1.11f)
                curveToRelative(0.29f, 0.26f, 0.66f, 0.39f, 1.02f, 0.39f)
                curveToRelative(0.35f, 0f, 0.7f, -0.12f, 0.98f, -0.36f)
                lineToRelative(1.38f, -1.14f)
                horizontalLineToRelative(2.69f)
                lineTo(24.0f, 2.05f)
                curveToRelative(0f, -1.13f, -0.92f, -2.05f, -2.05f, -2.05f)
                close()
                moveTo(22f, 10f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-7.07f)
                lineToRelative(-0.85f, 1f)
                horizontalLineToRelative(-4.16f)
                lineToRelative(-0.85f, -1f)
                lineTo(2f, 18f)
                lineTo(2f, 6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(6f, 10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(17f, 14.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }.also { _Videoconference = it}
