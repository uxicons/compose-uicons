package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chatbot: ImageVector? = null

val Icons.Rs.Chatbot: ImageVector
    get() = _Chatbot ?: UXIcon(name = "Chatbot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 14f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                lineTo(2f, 24f)
                verticalLineToRelative(-4f)
                lineTo(0f, 20f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                reflectiveCurveToRelative(-5f, 0f, -5f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(10f, 17.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-6.85f)
                lineToRelative(-2.44f, 1.7f)
                curveToRelative(-0.3f, 0.2f, -0.64f, 0.3f, -0.98f, 0.3f)
                curveToRelative(-0.28f, 0f, -0.56f, -0.07f, -0.81f, -0.2f)
                curveToRelative(-0.56f, -0.3f, -0.92f, -0.89f, -0.92f, -1.53f)
                lineTo(12f, 2.5f)
                curveTo(12f, 1.12f, 13.12f, -0.0f, 14.5f, -0.0f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(22f, 2.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(7.26f)
                lineToRelative(2.52f, -1.75f)
                horizontalLineToRelative(5.48f)
                lineTo(22f, 2.5f)
                close()
                moveTo(5f, 17.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _Chatbot = it}
