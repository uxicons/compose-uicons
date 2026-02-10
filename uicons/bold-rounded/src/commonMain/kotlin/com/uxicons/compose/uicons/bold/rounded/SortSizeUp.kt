package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortSizeUp: ImageVector? = null

val Icons.Br.SortSizeUp: ImageVector
    get() = _SortSizeUp ?: UXIcon(name = "SortSizeUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 18f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
            horizontalLineToRelative(2f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            close()
            moveTo(21f, 1f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
            horizontalLineToRelative(4f)
            curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
            lineTo(24f, 4f)
            curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
            close()
            moveTo(8.97f, 1.03f)
            curveToRelative(-1.36f, -1.36f, -3.59f, -1.37f, -4.92f, -0.03f)
            lineTo(0.97f, 3.91f)
            curveToRelative(-0.6f, 0.57f, -0.63f, 1.52f, -0.06f, 2.12f)
            curveToRelative(0.57f, 0.6f, 1.52f, 0.63f, 2.12f, 0.06f)
            lineToRelative(1.97f, -1.86f)
            lineTo(5f, 22.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(8f, 4.23f)
            lineToRelative(1.97f, 1.86f)
            curveToRelative(0.29f, 0.27f, 0.66f, 0.41f, 1.03f, 0.41f)
            curveToRelative(0.4f, 0f, 0.8f, -0.16f, 1.09f, -0.47f)
            curveToRelative(0.57f, -0.6f, 0.54f, -1.55f, -0.06f, -2.12f)
            lineToRelative(-3.06f, -2.88f)
            close()
        }
    }.also { _SortSizeUp = it }
