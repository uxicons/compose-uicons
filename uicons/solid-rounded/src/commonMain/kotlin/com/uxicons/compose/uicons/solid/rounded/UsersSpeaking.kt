package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsersSpeaking: ImageVector? = null

val Icons.Sr.UsersSpeaking: ImageVector
    get() = _UsersSpeaking ?: UXIcon(name = "UsersSpeaking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 12f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(22f, 15.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-2.65f)
                lineToRelative(-2.13f, 1.71f)
                curveToRelative(-0.89f, 0.7f, -2.25f, 0.03f, -2.23f, -1.09f)
                verticalLineToRelative(-6.62f)
                curveToRelative(-0.0f, -1.65f, 1.34f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3.0f, 1.34f, 3.0f, 3.0f)
                close()
                moveTo(0f, 6f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3.0f, -3f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.65f, 0.0f, 3f, 1.35f, 3f, 3.0f)
                verticalLineToRelative(6.62f)
                curveToRelative(0.03f, 1.08f, -1.3f, 1.78f, -2.17f, 1.13f)
                lineToRelative(-2.18f, -1.75f)
                horizontalLineToRelative(-2.65f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
                moveTo(23.78f, 22.37f)
                curveToRelative(0.53f, 0.62f, 0.04f, 1.66f, -0.78f, 1.63f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.81f, 0.03f, -1.31f, -1.01f, -0.78f, -1.63f)
                curveToRelative(1.2f, -1.49f, 3.17f, -2.37f, 5.28f, -2.37f)
                reflectiveCurveToRelative(4.08f, 0.89f, 5.28f, 2.37f)
                close()
                moveTo(10.78f, 22.37f)
                curveToRelative(0.53f, 0.62f, 0.04f, 1.66f, -0.78f, 1.63f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.81f, 0.03f, -1.31f, -1.01f, -0.78f, -1.63f)
                curveToRelative(1.2f, -1.49f, 3.17f, -2.37f, 5.28f, -2.37f)
                reflectiveCurveToRelative(4.08f, 0.89f, 5.28f, 2.37f)
                close()
            }
        }.also { _UsersSpeaking = it}
