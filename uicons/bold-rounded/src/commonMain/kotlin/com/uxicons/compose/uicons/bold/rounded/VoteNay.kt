package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VoteNay: ImageVector? = null

val Icons.Br.VoteNay: ImageVector
    get() = _VoteNay ?: UXIcon(name = "VoteNay") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 13.13f)
            lineTo(21f, 7.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(5.63f)
            curveToRelative(-1.72f, 0.45f, -3f, 2.01f, -3f, 3.87f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            lineTo(20f, 22f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.86f, -1.28f, -3.43f, -3f, -3.87f)
            close()
            moveTo(6f, 7.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9.5f)
            lineTo(6f, 17f)
            lineTo(6f, 7.5f)
            close()
            moveTo(8.44f, 12.44f)
            lineToRelative(1.44f, -1.44f)
            lineToRelative(-1.44f, -1.44f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0f)
            lineToRelative(1.44f, 1.44f)
            lineToRelative(1.44f, -1.44f)
            curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
            lineToRelative(-1.44f, 1.44f)
            lineToRelative(1.44f, 1.44f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineToRelative(-1.44f, -1.44f)
            lineToRelative(-1.44f, 1.44f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0f, -2.12f)
            close()
        }
    }.also { _VoteNay = it }
