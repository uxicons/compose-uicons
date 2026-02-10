package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsersSpeaking: ImageVector? = null

val Icons.Bs.UsersSpeaking: ImageVector
    get() = _UsersSpeaking ?: UXIcon(name = "UsersSpeaking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(7f, 15f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                close()
                moveTo(22f, 20f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(23f, 15f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                close()
                moveTo(24f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-5.87f)
                lineToRelative(-2.45f, 1.69f)
                curveToRelative(-0.69f, 0.46f, -1.67f, -0.04f, -1.67f, -0.92f)
                lineToRelative(-0.0f, -7.77f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2.0f, -2.0f)
                lineToRelative(6f, -0.0f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(21f, 3f)
                horizontalLineToRelative(-4f)
                reflectiveCurveToRelative(0f, 3.0f, 0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(10f, 2.0f)
                lineTo(10.0f, 9.77f)
                curveToRelative(0.0f, 0.88f, -0.98f, 1.37f, -1.67f, 0.92f)
                lineToRelative(-2.45f, -1.69f)
                horizontalLineToRelative(-5.87f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                lineToRelative(6f, 0.0f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2.0f, 2.0f)
                close()
                moveTo(7f, 3.0f)
                horizontalLineToRelative(-4f)
                reflectiveCurveToRelative(0f, 3.0f, 0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }.also { _UsersSpeaking = it}
