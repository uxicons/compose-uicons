package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxBallot: ImageVector? = null

val Icons.Ts.BoxBallot: ImageVector
    get() = _BoxBallot ?: UXIcon(name = "BoxBallot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 8f)
                horizontalLineToRelative(-2.5f)
                lineTo(19f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(7.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                lineTo(2.5f, 8f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13.5f)
                lineTo(24f, 24f)
                lineTo(24f, 10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(6f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(18f, 13f)
                lineTo(6f, 13f)
                lineTo(6f, 2.5f)
                close()
                moveTo(2.5f, 9f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                lineTo(1f, 18f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 23f)
                verticalLineToRelative(-4f)
                lineTo(23f, 19f)
                verticalLineToRelative(4f)
                lineTo(1f, 23f)
                close()
            }
        }.also { _BoxBallot = it}
