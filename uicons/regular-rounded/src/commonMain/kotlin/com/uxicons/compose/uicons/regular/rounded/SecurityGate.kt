package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SecurityGate: ImageVector? = null

val Icons.Rr.SecurityGate: ImageVector
    get() = _SecurityGate ?: UXIcon(name = "SecurityGate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 0f)
                horizontalLineToRelative(-10f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-17f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(17f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-18f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(7f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.3f, 0f, 2.4f, 0.84f, 2.82f, 2f)
                horizontalLineToRelative(-15.63f)
                curveToRelative(0.41f, -1.16f, 1.51f, -2f, 2.82f, -2f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(12.5f, 12f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.95f, 0.39f, 1.82f, 1.01f, 2.45f)
                curveToRelative(0f, 0.02f, -0.01f, 0.03f, -0.01f, 0.05f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.05f)
                curveToRelative(0.17f, 0.02f, 0.33f, 0.05f, 0.5f, 0.05f)
                horizontalLineToRelative(1f)
                curveToRelative(0.17f, 0f, 0.34f, -0.03f, 0.5f, -0.05f)
                verticalLineToRelative(2.05f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.02f, -0.01f, -0.03f, -0.01f, -0.05f)
                curveToRelative(0.62f, -0.63f, 1.01f, -1.5f, 1.01f, -2.45f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(11.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _SecurityGate = it}
