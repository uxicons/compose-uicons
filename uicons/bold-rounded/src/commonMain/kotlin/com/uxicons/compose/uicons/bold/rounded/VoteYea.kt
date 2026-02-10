package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VoteYea: ImageVector? = null

val Icons.Br.VoteYea: ImageVector
    get() = _VoteYea ?: UXIcon(name = "VoteYea") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.94f, 11.95f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0f)
            lineToRelative(1.17f, 1.17f)
            lineToRelative(2.71f, -2.71f)
            curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
            lineToRelative(-2.71f, 2.71f)
            curveToRelative(-0.58f, 0.58f, -1.35f, 0.88f, -2.12f, 0.88f)
            reflectiveCurveToRelative(-1.54f, -0.29f, -2.12f, -0.88f)
            lineToRelative(-1.17f, -1.17f)
            close()
            moveTo(24f, 17f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            lineTo(4f, 22f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.86f, 1.28f, -3.43f, 3f, -3.87f)
            lineTo(3f, 7.5f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(7f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(5.63f)
            curveToRelative(1.72f, 0.45f, 3f, 2.01f, 3f, 3.87f)
            close()
            moveTo(6f, 17f)
            horizontalLineToRelative(12f)
            lineTo(18f, 7.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(9.5f)
            close()
        }
    }.also { _VoteYea = it }
