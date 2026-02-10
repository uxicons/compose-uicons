package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanPlus: ImageVector? = null

val Icons.Br.TrashCanPlus: ImageVector
    get() = _TrashCanPlus ?: UXIcon(name = "TrashCanPlus") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.5f, 13.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
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
    }.also { _TrashCanPlus = it }
