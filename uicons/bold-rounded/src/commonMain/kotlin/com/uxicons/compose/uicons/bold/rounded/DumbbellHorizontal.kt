package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DumbbellHorizontal: ImageVector? = null

val Icons.Br.DumbbellHorizontal: ImageVector
    get() = _DumbbellHorizontal ?: UXIcon(name = "DumbbellHorizontal") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 12f)
            curveToRelative(0f, -0.65f, -0.42f, -1.2f, -1f, -1.41f)
            lineTo(23f, 6.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-6f)
            lineTo(9f, 6.5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(4.09f)
            curveToRelative(-0.58f, 0.21f, -1f, 0.76f, -1f, 1.41f)
            reflectiveCurveToRelative(0.42f, 1.2f, 1f, 1.41f)
            verticalLineToRelative(4.09f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(1f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(1f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-4.09f)
            curveToRelative(0.58f, -0.21f, 1f, -0.76f, 1f, -1.41f)
            close()
            moveTo(6f, 17.5f)
            curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
            lineTo(4f, 6.5f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
            verticalLineToRelative(11f)
            close()
            moveTo(20f, 17.5f)
            curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
            lineTo(18f, 6.5f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
            verticalLineToRelative(11f)
            close()
        }
    }.also { _DumbbellHorizontal = it }
