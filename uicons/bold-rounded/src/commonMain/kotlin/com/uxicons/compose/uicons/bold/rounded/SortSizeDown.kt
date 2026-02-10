package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortSizeDown: ImageVector? = null

val Icons.Br.SortSizeDown: ImageVector
    get() = _SortSizeDown ?: UXIcon(name = "SortSizeDown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 4f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            lineTo(14f, 4f)
            curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
            horizontalLineToRelative(4f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            close()
            moveTo(21f, 15f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
            horizontalLineToRelative(2f)
            curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
            close()
            moveTo(9.97f, 17.91f)
            lineToRelative(-1.97f, 1.86f)
            lineTo(8f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            lineTo(5f, 19.77f)
            lineToRelative(-1.97f, -1.86f)
            curveToRelative(-0.6f, -0.57f, -1.55f, -0.54f, -2.12f, 0.06f)
            curveToRelative(-0.57f, 0.6f, -0.54f, 1.55f, 0.06f, 2.12f)
            lineToRelative(3.05f, 2.88f)
            curveToRelative(0.66f, 0.66f, 1.54f, 1.03f, 2.48f, 1.03f)
            reflectiveCurveToRelative(1.81f, -0.36f, 2.44f, -1f)
            lineToRelative(3.09f, -2.91f)
            curveToRelative(0.6f, -0.57f, 0.63f, -1.52f, 0.06f, -2.12f)
            curveToRelative(-0.57f, -0.6f, -1.52f, -0.63f, -2.12f, -0.06f)
            close()
        }
    }.also { _SortSizeDown = it }
