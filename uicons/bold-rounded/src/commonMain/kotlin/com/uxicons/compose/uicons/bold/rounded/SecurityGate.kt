package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SecurityGate: ImageVector? = null

val Icons.Br.SecurityGate: ImageVector
    get() = _SecurityGate ?: UXIcon(name = "SecurityGate") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.0f, 5.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-17f)
            curveToRelative(0f, -0.17f, -0.02f, -0.34f, -0.05f, -0.5f)
            horizontalLineToRelative(-13.9f)
            curveToRelative(-0.03f, 0.16f, -0.05f, 0.33f, -0.05f, 0.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-17f)
            curveToRelative(-0.0f, -1.47f, 0.57f, -2.85f, 1.61f, -3.89f)
            curveToRelative(1.04f, -1.04f, 2.42f, -1.61f, 3.89f, -1.61f)
            horizontalLineToRelative(9.0f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(14.5f, 8.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            close()
            moveTo(16f, 15.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.39f, -0.82f, 2.58f, -2f, 3.15f)
            verticalLineToRelative(1.85f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.85f)
            curveToRelative(-1.18f, -0.56f, -2f, -1.76f, -2f, -3.15f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(1f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            close()
            moveTo(11f, 17.5f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
            close()
        }
    }.also { _SecurityGate = it }
