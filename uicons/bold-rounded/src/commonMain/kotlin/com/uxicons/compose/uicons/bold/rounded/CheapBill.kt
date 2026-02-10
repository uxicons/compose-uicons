package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheapBill: ImageVector? = null

val Icons.Br.CheapBill: ImageVector
    get() = _CheapBill ?: UXIcon(name = "CheapBill") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.5f, 0f)
            lineTo(6.5f, 0f)
            curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(4.0f)
            lineToRelative(-0.01f, 5.34f)
            lineToRelative(-1.44f, -1.41f)
            curveToRelative(-0.59f, -0.58f, -1.54f, -0.57f, -2.12f, 0.02f)
            curveToRelative(-0.58f, 0.59f, -0.57f, 1.54f, 0.02f, 2.12f)
            lineToRelative(3.27f, 3.2f)
            curveToRelative(0.49f, 0.49f, 1.13f, 0.73f, 1.77f, 0.73f)
            curveToRelative(0.64f, 0f, 1.27f, -0.24f, 1.75f, -0.72f)
            lineToRelative(3.31f, -3.21f)
            curveToRelative(0.59f, -0.58f, 0.61f, -1.53f, 0.03f, -2.12f)
            curveToRelative(-0.58f, -0.59f, -1.53f, -0.61f, -2.12f, -0.03f)
            lineToRelative(-1.47f, 1.42f)
            lineToRelative(0.01f, -5.34f)
            horizontalLineToRelative(4.0f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(19f, 9.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(6.5f, 11f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(11f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(5f)
            close()
            moveTo(15f, 7f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            close()
        }
    }.also { _CheapBill = it }
