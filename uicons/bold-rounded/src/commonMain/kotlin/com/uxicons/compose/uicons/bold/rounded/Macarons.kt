package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Macarons: ImageVector? = null

val Icons.Br.Macarons: ImageVector
    get() = _Macarons ?: UXIcon(name = "Macarons") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20f, 16.09f)
            curveToRelative(0.03f, -1.67f, -0.78f, -3.17f, -2.03f, -4.09f)
            curveToRelative(1.25f, -0.93f, 2.06f, -2.42f, 2.03f, -4.09f)
            curveToRelative(0.58f, -0.21f, 1f, -0.76f, 1f, -1.41f)
            reflectiveCurveToRelative(-0.42f, -1.2f, -1f, -1.41f)
            curveToRelative(0.05f, -2.79f, -2.21f, -5.09f, -5f, -5.09f)
            horizontalLineToRelative(-6f)
            curveToRelative(-2.79f, -0.0f, -5.05f, 2.3f, -5f, 5.09f)
            curveToRelative(-0.58f, 0.21f, -1f, 0.76f, -1f, 1.41f)
            reflectiveCurveToRelative(0.42f, 1.2f, 1f, 1.41f)
            curveToRelative(-0.03f, 1.67f, 0.78f, 3.17f, 2.03f, 4.09f)
            curveToRelative(-1.25f, 0.93f, -2.06f, 2.42f, -2.03f, 4.09f)
            curveToRelative(-0.58f, 0.21f, -1f, 0.76f, -1f, 1.41f)
            reflectiveCurveToRelative(0.42f, 1.2f, 1f, 1.41f)
            curveToRelative(-0.05f, 2.79f, 2.21f, 5.09f, 5f, 5.09f)
            horizontalLineToRelative(6f)
            curveToRelative(2.79f, 0.0f, 5.05f, -2.3f, 5f, -5.09f)
            curveToRelative(0.58f, -0.21f, 1f, -0.76f, 1f, -1.41f)
            reflectiveCurveToRelative(-0.42f, -1.2f, -1f, -1.41f)
            close()
            moveTo(17f, 16f)
            horizontalLineToRelative(-10f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
            moveTo(9f, 10f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            close()
            moveTo(9f, 3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            horizontalLineToRelative(-10f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            close()
            moveTo(15f, 21f)
            horizontalLineToRelative(-6f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            close()
        }
    }.also { _Macarons = it }
