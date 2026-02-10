package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownFromArc: ImageVector? = null

val Icons.Br.ArrowDownFromArc: ImageVector
    get() = _ArrowDownFromArc ?: UXIcon(name = "ArrowDownFromArc") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.87f, 16.41f)
            curveToRelative(0.6f, 0.57f, 0.62f, 1.52f, 0.05f, 2.12f)
            lineToRelative(-4.07f, 4.27f)
            curveToRelative(-0.78f, 0.78f, -1.78f, 1.2f, -2.85f, 1.2f)
            reflectiveCurveToRelative(-2.07f, -0.42f, -2.83f, -1.17f)
            lineToRelative(-4.09f, -4.29f)
            curveToRelative(-0.57f, -0.6f, -0.55f, -1.55f, 0.05f, -2.12f)
            curveToRelative(0.6f, -0.57f, 1.55f, -0.55f, 2.12f, 0.05f)
            lineToRelative(3.25f, 3.41f)
            verticalLineToRelative(-11.37f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(11.38f)
            lineToRelative(3.25f, -3.41f)
            curveToRelative(0.57f, -0.6f, 1.52f, -0.62f, 2.12f, -0.05f)
            close()
            moveTo(12f, 0f)
            curveTo(5.58f, 0f, 0.31f, 5.02f, 0.01f, 11.43f)
            curveToRelative(-0.04f, 0.83f, 0.6f, 1.53f, 1.43f, 1.57f)
            curveToRelative(0.86f, 0.03f, 1.53f, -0.6f, 1.57f, -1.43f)
            curveToRelative(0.23f, -4.81f, 4.17f, -8.57f, 8.99f, -8.57f)
            reflectiveCurveToRelative(8.77f, 3.77f, 8.99f, 8.57f)
            curveToRelative(0.04f, 0.8f, 0.7f, 1.43f, 1.5f, 1.43f)
            curveToRelative(0.02f, 0f, 0.05f, 0f, 0.07f, -0.0f)
            curveToRelative(0.83f, -0.04f, 1.47f, -0.74f, 1.43f, -1.57f)
            curveToRelative(-0.3f, -6.41f, -5.57f, -11.43f, -11.99f, -11.43f)
            close()
        }
    }.also { _ArrowDownFromArc = it }
