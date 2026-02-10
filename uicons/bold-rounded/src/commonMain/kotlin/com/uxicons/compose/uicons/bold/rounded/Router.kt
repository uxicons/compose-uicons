package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Router: ImageVector? = null

val Icons.Br.Router: ImageVector
    get() = _Router ?: UXIcon(name = "Router") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.5f, 15f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(3.5f)
            lineTo(4.5f, 15f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(15f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(19.5f, 21f)
            lineTo(4.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(15f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(20.18f, 6.94f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-1.41f, -1.41f, -3.71f, -1.41f, -5.12f, 0f)
            curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(2.58f, -2.58f, 6.78f, -2.58f, 9.36f, 0f)
            close()
            moveTo(7.41f, 5.29f)
            curveToRelative(-0.57f, -0.6f, -0.54f, -1.55f, 0.07f, -2.12f)
            curveToRelative(4.5f, -4.22f, 11.55f, -4.22f, 16.05f, 0f)
            curveToRelative(0.6f, 0.57f, 0.64f, 1.52f, 0.07f, 2.12f)
            curveToRelative(-0.3f, 0.32f, -0.69f, 0.47f, -1.09f, 0.47f)
            curveToRelative(-0.37f, 0f, -0.74f, -0.13f, -1.02f, -0.41f)
            curveToRelative(-3.35f, -3.14f, -8.6f, -3.14f, -11.95f, 0f)
            curveToRelative(-0.6f, 0.57f, -1.55f, 0.54f, -2.12f, -0.07f)
            close()
        }
    }.also { _Router = it }
