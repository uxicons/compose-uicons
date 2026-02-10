package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpToArc: ImageVector? = null

val Icons.Br.ArrowUpToArc: ImageVector
    get() = _ArrowUpToArc ?: UXIcon(name = "ArrowUpToArc") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.92f, 12.47f)
            curveToRelative(0.57f, 0.6f, 0.55f, 1.55f, -0.05f, 2.12f)
            curveToRelative(-0.29f, 0.28f, -0.66f, 0.41f, -1.03f, 0.41f)
            curveToRelative(-0.4f, 0f, -0.79f, -0.16f, -1.09f, -0.47f)
            lineToRelative(-3.25f, -3.41f)
            verticalLineToRelative(11.37f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-11.37f)
            lineToRelative(-3.25f, 3.41f)
            curveToRelative(-0.57f, 0.6f, -1.52f, 0.62f, -2.12f, 0.05f)
            curveToRelative(-0.6f, -0.57f, -0.62f, -1.52f, -0.05f, -2.12f)
            lineToRelative(4.07f, -4.27f)
            curveToRelative(1.56f, -1.56f, 4.17f, -1.54f, 5.68f, -0.03f)
            lineToRelative(4.09f, 4.29f)
            close()
            moveTo(12f, 0f)
            curveTo(5.58f, 0f, 0.31f, 5.02f, 0.01f, 11.43f)
            curveToRelative(-0.04f, 0.83f, 0.6f, 1.53f, 1.43f, 1.57f)
            curveToRelative(0.84f, 0.05f, 1.53f, -0.6f, 1.57f, -1.43f)
            curveToRelative(0.23f, -4.81f, 4.17f, -8.57f, 8.99f, -8.57f)
            reflectiveCurveToRelative(8.77f, 3.77f, 8.99f, 8.57f)
            curveToRelative(0.04f, 0.8f, 0.7f, 1.43f, 1.5f, 1.43f)
            curveToRelative(0.83f, -0.04f, 1.54f, -0.74f, 1.5f, -1.57f)
            curveToRelative(-0.3f, -6.41f, -5.57f, -11.43f, -11.99f, -11.43f)
            close()
        }
    }.also { _ArrowUpToArc = it }
