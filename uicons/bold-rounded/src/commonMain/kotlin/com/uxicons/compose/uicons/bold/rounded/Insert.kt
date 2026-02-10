package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Insert: ImageVector? = null

val Icons.Br.Insert: ImageVector
    get() = _Insert ?: UXIcon(name = "Insert") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(6.45f, 13.57f)
            curveToRelative(-0.59f, -0.58f, -0.6f, -1.53f, -0.02f, -2.12f)
            curveToRelative(0.58f, -0.59f, 1.53f, -0.6f, 2.12f, -0.02f)
            lineToRelative(1.95f, 1.91f)
            lineTo(10.5f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(11.84f)
            lineToRelative(1.95f, -1.91f)
            curveToRelative(0.59f, -0.58f, 1.54f, -0.57f, 2.12f, 0.02f)
            curveToRelative(0.58f, 0.59f, 0.57f, 1.54f, -0.02f, 2.12f)
            lineToRelative(-3.79f, 3.71f)
            curveToRelative(-0.48f, 0.48f, -1.12f, 0.72f, -1.75f, 0.72f)
            curveToRelative(-0.5f, 0f, -1.3f, -0.27f, -1.77f, -0.73f)
            lineToRelative(-3.78f, -3.69f)
            close()
            moveTo(22.5f, 15f)
            horizontalLineToRelative(-1f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            lineTo(7f, 21f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(10f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _Insert = it }
