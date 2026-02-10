package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PcChair: ImageVector? = null

val Icons.Br.PcChair: ImageVector
    get() = _PcChair ?: UXIcon(name = "PcChair") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21f, 7f)
            verticalLineToRelative(5.5f)
            curveToRelative(-0.47f, 0.18f, -1.16f, 0.4f, -2f, 0.62f)
            verticalLineToRelative(-9.63f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(9.62f)
            curveToRelative(-0.84f, -0.22f, -1.53f, -0.45f, -2f, -0.62f)
            verticalLineToRelative(-5.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(7.43f)
            curveToRelative(1.62f, 0.72f, 3.45f, 2.02f, 10.5f, 2.54f)
            verticalLineToRelative(2.04f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-2.04f)
            curveToRelative(7.06f, -0.52f, 8.87f, -1.81f, 10.5f, -2.54f)
            verticalLineToRelative(-7.43f)
            close()
            moveTo(8.5f, 3f)
            horizontalLineToRelative(7f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            verticalLineToRelative(8.03f)
            curveToRelative(-2.64f, -0.67f, -5.36f, -0.67f, -8f, 0f)
            verticalLineToRelative(-8.03f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.also { _PcChair = it }
