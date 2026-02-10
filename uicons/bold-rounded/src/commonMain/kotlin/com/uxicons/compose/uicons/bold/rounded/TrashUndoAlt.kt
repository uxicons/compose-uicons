package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashUndoAlt: ImageVector? = null

val Icons.Br.TrashUndoAlt: ImageVector
    get() = _TrashUndoAlt ?: UXIcon(name = "TrashUndoAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17f, 14.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(1.6f)
            curveToRelative(0f, 0.86f, -1.04f, 1.29f, -1.65f, 0.69f)
            lineToRelative(-3.06f, -3.06f)
            curveToRelative(-0.38f, -0.38f, -0.38f, -0.99f, 0f, -1.37f)
            lineToRelative(3.06f, -3.06f)
            curveToRelative(0.61f, -0.61f, 1.65f, -0.18f, 1.65f, 0.69f)
            verticalLineToRelative(1.53f)
            horizontalLineToRelative(1.5f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            close()
            moveTo(23f, 4.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(3f, 6f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3.76f)
            curveToRelative(0.62f, -1.75f, 2.29f, -3f, 4.24f, -3f)
            horizontalLineToRelative(3f)
            curveToRelative(1.96f, 0f, 3.62f, 1.25f, 4.24f, 3f)
            horizontalLineToRelative(3.76f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(18f, 6f)
            lineTo(6f, 6f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(18f, 6f)
            close()
        }
    }.also { _TrashUndoAlt = it }
