package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashRestoreAlt: ImageVector? = null

val Icons.Br.TrashRestoreAlt: ImageVector
    get() = _TrashRestoreAlt ?: UXIcon(name = "TrashRestoreAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.5f, 3f)
            horizontalLineToRelative(-3.76f)
            curveToRelative(-0.62f, -1.75f, -2.29f, -3f, -4.24f, -3f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.96f, 0f, -3.62f, 1.25f, -4.24f, 3f)
            horizontalLineToRelative(-3.76f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(7f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(21f, 6f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(18f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(6f, 6f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(12.5f)
            close()
            moveTo(15.75f, 12.35f)
            curveToRelative(0.61f, 0.61f, 0.18f, 1.65f, -0.69f, 1.65f)
            horizontalLineToRelative(-1.56f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(-1.56f)
            curveToRelative(-0.86f, 0f, -1.29f, -1.04f, -0.69f, -1.65f)
            lineToRelative(3.06f, -3.06f)
            curveToRelative(0.38f, -0.38f, 0.99f, -0.38f, 1.37f, 0f)
            lineToRelative(3.06f, 3.06f)
            close()
        }
    }.also { _TrashRestoreAlt = it }
