package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _First: ImageVector? = null

val Icons.Br.First: ImageVector
    get() = _First ?: UXIcon(name = "First") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12.5f, 12f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-2.0f)
            lineToRelative(-0.0f, -0.51f)
            curveToRelative(-0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.01f)
            curveToRelative(-0.83f, 0.0f, -1.5f, 0.68f, -1.5f, 1.5f)
            lineToRelative(0.0f, 0.49f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.51f)
            lineToRelative(0.01f, 2f)
            horizontalLineToRelative(-0.52f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.53f)
            lineToRelative(0.0f, 0.51f)
            curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.01f)
            curveToRelative(0.83f, -0.0f, 1.5f, -0.68f, 1.5f, -1.5f)
            lineToRelative(-0.0f, -0.49f)
            horizontalLineToRelative(1.97f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(0.5f)
            close()
            moveTo(9f, 14f)
            horizontalLineToRelative(-1.98f)
            lineToRelative(-0.01f, -2f)
            horizontalLineToRelative(1.99f)
            verticalLineToRelative(2f)
            close()
            moveTo(22f, 4.22f)
            verticalLineToRelative(16.27f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(19f, 6.11f)
            lineToRelative(-1.44f, 1.45f)
            curveToRelative(-0.58f, 0.59f, -1.53f, 0.59f, -2.12f, 0.01f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.53f, -0.01f, -2.12f)
            lineToRelative(2.77f, -2.79f)
            curveToRelative(0.64f, -0.64f, 1.59f, -0.83f, 2.43f, -0.49f)
            reflectiveCurveToRelative(1.37f, 1.15f, 1.37f, 2.05f)
            close()
        }
    }.also { _First = it }
