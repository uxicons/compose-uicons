package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmartHome: ImageVector? = null

val Icons.Sr.SmartHome: ImageVector
    get() = _SmartHome ?: UXIcon(name = "SmartHome") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.08f, 6.56f)
                lineTo(15.08f, 1.08f)
                curveToRelative(-1.81f, -1.42f, -4.35f, -1.42f, -6.17f, 0f)
                lineTo(1.92f, 6.56f)
                curveToRelative(-1.22f, 0.95f, -1.92f, 2.39f, -1.92f, 3.94f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -1.55f, -0.7f, -2.98f, -1.92f, -3.94f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.54f, 14.88f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(1.95f, -1.95f, 5.12f, -1.95f, 7.07f, 0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(18.36f, 12.05f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-2.73f, -2.73f, -7.17f, -2.73f, -9.9f, 0f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(3.51f, -3.51f, 9.22f, -3.51f, 12.73f, 0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _SmartHome = it}
