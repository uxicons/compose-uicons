package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPenHead: ImageVector? = null

val Icons.Rs.UserPenHead: ImageVector
    get() = _UserPenHead ?: UXIcon(name = "UserPenHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 14.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(13f, 14.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(22f, 11.36f)
                verticalLineToRelative(-3.36f)
                horizontalLineToRelative(-3.03f)
                lineToRelative(-0.85f, 2f)
                horizontalLineToRelative(1.88f)
                lineToRelative(0.01f, 2.84f)
                lineToRelative(0.76f, 0.19f)
                curveToRelative(0.2f, 0.05f, 1.23f, 0.36f, 1.23f, 1.47f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                curveToRelative(-0.18f, 0.0f, -0.9f, -0.15f, -1.09f, -0.17f)
                lineToRelative(-0.28f, 0.8f)
                curveToRelative(-0.92f, 2.6f, -4.0f, 5.38f, -7.13f, 5.38f)
                reflectiveCurveToRelative(-6.21f, -2.78f, -7.13f, -5.38f)
                lineToRelative(-0.28f, -0.8f)
                curveToRelative(-0.19f, 0.03f, -0.9f, 0.17f, -1.09f, 0.17f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -1.11f, 1.02f, -1.42f, 1.22f, -1.47f)
                lineToRelative(0.78f, -0.17f)
                verticalLineToRelative(-2.86f)
                horizontalLineToRelative(1.88f)
                lineToRelative(-0.85f, -2f)
                lineTo(2f, 8.0f)
                verticalLineToRelative(3.36f)
                curveToRelative(-0.93f, 0.46f, -2f, 1.44f, -2f, 3.14f)
                curveToRelative(0f, 1.85f, 1.45f, 3.37f, 3.27f, 3.49f)
                curveToRelative(1.41f, 3.06f, 4.87f, 6.01f, 8.73f, 6.01f)
                reflectiveCurveToRelative(7.33f, -2.94f, 8.73f, -6.01f)
                curveToRelative(1.82f, -0.12f, 3.27f, -1.64f, 3.27f, -3.49f)
                curveToRelative(0f, -1.7f, -1.07f, -2.68f, -2f, -3.14f)
                close()
                moveTo(10.66f, 11f)
                lineToRelative(-1.38f, -3.22f)
                lineToRelative(1.72f, -2.77f)
                verticalLineToRelative(2.99f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.99f)
                lineToRelative(1.72f, 2.77f)
                lineToRelative(-1.38f, 3.22f)
                horizontalLineToRelative(2.17f)
                lineToRelative(1.45f, -3.39f)
                lineTo(12f, -0.4f)
                lineTo(7.04f, 7.61f)
                lineToRelative(1.45f, 3.39f)
                horizontalLineToRelative(2.17f)
                close()
            }
        }.also { _UserPenHead = it}
