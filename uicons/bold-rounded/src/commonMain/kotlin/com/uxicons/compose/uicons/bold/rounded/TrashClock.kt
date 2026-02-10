package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashClock: ImageVector? = null

val Icons.Br.TrashClock: ImageVector
    get() = _TrashClock ?: UXIcon(name = "TrashClock") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10.18f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-2.84f, 0f, -5.25f, -2.21f, -5.48f, -5.04f)
            lineToRelative(-1.08f, -12.96f)
            horizontalLineToRelative(-0.62f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4.76f)
            curveToRelative(0.62f, -1.75f, 2.29f, -3f, 4.24f, -3f)
            horizontalLineToRelative(3f)
            curveToRelative(1.96f, 0f, 3.62f, 1.25f, 4.24f, 3f)
            horizontalLineToRelative(4.76f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.62f)
            lineToRelative(-0.14f, 1.62f)
            curveToRelative(-0.07f, 0.78f, -0.74f, 1.47f, -1.62f, 1.37f)
            curveToRelative(-1.12f, -0.12f, -1.44f, -0.79f, -1.37f, -1.62f)
            lineToRelative(0.12f, -1.38f)
            lineTo(5.13f, 6f)
            lineToRelative(1.06f, 12.71f)
            curveToRelative(0.11f, 1.29f, 1.2f, 2.29f, 2.49f, 2.29f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 17.5f)
            curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
            reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
            reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
            reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
            close()
            moveTo(19.84f, 17.72f)
            lineToRelative(-0.84f, -0.84f)
            verticalLineToRelative(-1.38f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.79f)
            curveToRelative(0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
            lineToRelative(1.14f, 1.14f)
            curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            close()
        }
    }.also { _TrashClock = it }
