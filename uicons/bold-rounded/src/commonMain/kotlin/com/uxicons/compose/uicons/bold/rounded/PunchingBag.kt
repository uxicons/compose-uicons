package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PunchingBag: ImageVector? = null

val Icons.Br.PunchingBag: ImageVector
    get() = _PunchingBag ?: UXIcon(name = "PunchingBag") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.22f, 8.63f)
            lineToRelative(-4.72f, -6.61f)
            verticalLineToRelative(-0.52f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.52f)
            lineToRelative(-4.72f, 6.61f)
            curveToRelative(-0.1f, 0.15f, -0.78f, 1.17f, -0.78f, 2.87f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(3f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.55f, -0.68f, -2.73f, -0.78f, -2.87f)
            close()
            moveTo(12f, 5.08f)
            lineTo(12.66f, 6f)
            horizontalLineToRelative(-1.31f)
            lineToRelative(0.66f, -0.92f)
            close()
            moveTo(16f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-4.45f)
            curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.45f, -2f)
            horizontalLineToRelative(3f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
        }
    }.also { _PunchingBag = it }
