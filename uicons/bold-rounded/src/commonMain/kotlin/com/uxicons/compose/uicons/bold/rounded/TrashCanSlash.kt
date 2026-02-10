package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanSlash: ImageVector? = null

val Icons.Br.TrashCanSlash: ImageVector
    get() = _TrashCanSlash ?: UXIcon(name = "TrashCanSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-6f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(23.56f, 23.56f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(0.44f, 2.56f)
            curveTo(-0.15f, 1.98f, -0.15f, 1.02f, 0.44f, 0.44f)
            reflectiveCurveTo(1.98f, -0.15f, 2.56f, 0.44f)
            lineToRelative(2.56f, 2.56f)
            horizontalLineToRelative(1.14f)
            curveToRelative(0.62f, -1.75f, 2.29f, -3f, 4.24f, -3f)
            horizontalLineToRelative(3f)
            curveToRelative(1.96f, 0f, 3.62f, 1.25f, 4.24f, 3f)
            horizontalLineToRelative(3.76f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(12.88f)
            lineToRelative(2.56f, 2.56f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            close()
            moveTo(18f, 6f)
            horizontalLineToRelative(-9.88f)
            lineToRelative(9.88f, 9.88f)
            lineTo(18f, 6f)
            close()
            moveTo(20.99f, 18.87f)
            lineToRelative(0.0f, 0.0f)
            curveToRelative(0f, -0.01f, -0.0f, -0.01f, -0.0f, -0.0f)
            close()
        }
    }.also { _TrashCanSlash = it }
