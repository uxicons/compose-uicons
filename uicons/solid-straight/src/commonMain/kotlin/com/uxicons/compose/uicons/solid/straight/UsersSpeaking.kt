package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsersSpeaking: ImageVector? = null

val Icons.Ss.UsersSpeaking: ImageVector
    get() = _UsersSpeaking ?: UXIcon(name = "UsersSpeaking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 24f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(24f, 24f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(5.5f, 19f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(18.5f, 19f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(8.22f, 10.75f)
                curveToRelative(0.63f, 0.43f, 1.52f, 0.38f, 1.78f, -0.63f)
                curveToRelative(0f, -0.5f, 0.0f, -8.11f, 0.0f, -8.11f)
                curveToRelative(0f, -1.1f, -0.9f, -2.0f, -2f, -2.0f)
                lineToRelative(-6f, -0.0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(5.85f)
                curveToRelative(0.64f, 0.47f, 2.24f, 1.65f, 2.36f, 1.75f)
                close()
                moveTo(18.15f, 9f)
                horizontalLineToRelative(5.85f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineToRelative(-6f, 0.0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2.0f)
                curveToRelative(0f, 0f, 0.0f, 7.61f, 0.0f, 8.11f)
                curveToRelative(0.26f, 1.01f, 1.15f, 1.06f, 1.78f, 0.63f)
                curveToRelative(0.12f, -0.1f, 1.72f, -1.27f, 2.36f, -1.75f)
                close()
            }
        }.also { _UsersSpeaking = it}
