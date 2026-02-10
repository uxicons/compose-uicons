package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsAltV: ImageVector? = null

val Icons.Br.ArrowsAltV: ImageVector
    get() = _ArrowsAltV ?: UXIcon(name = "ArrowsAltV") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.09f, 16.92f)
            horizontalLineToRelative(-3.59f)
            verticalLineTo(6.92f)
            horizontalLineToRelative(3.59f)
            curveToRelative(0.81f, 0f, 1.22f, -0.99f, 0.64f, -1.57f)
            lineTo(12.64f, 0.19f)
            curveToRelative(-0.36f, -0.36f, -0.93f, -0.36f, -1.29f, 0f)
            lineTo(6.27f, 5.35f)
            curveToRelative(-0.57f, 0.58f, -0.17f, 1.57f, 0.64f, 1.57f)
            horizontalLineToRelative(3.59f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(-3.59f)
            curveToRelative(-0.81f, 0f, -1.22f, 0.99f, -0.64f, 1.57f)
            lineToRelative(5.09f, 5.15f)
            curveToRelative(0.36f, 0.36f, 0.93f, 0.36f, 1.29f, 0f)
            lineToRelative(5.09f, -5.15f)
            curveToRelative(0.57f, -0.58f, 0.17f, -1.57f, -0.64f, -1.57f)
            close()
        }
    }.also { _ArrowsAltV = it }
