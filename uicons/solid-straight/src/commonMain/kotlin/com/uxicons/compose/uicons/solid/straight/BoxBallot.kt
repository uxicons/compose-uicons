package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxBallot: ImageVector? = null

val Icons.Ss.BoxBallot: ImageVector
    get() = _BoxBallot ?: UXIcon(name = "BoxBallot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 20f)
                verticalLineToRelative(4f)
                lineTo(0f, 24f)
                verticalLineToRelative(-4f)
                lineTo(24f, 20f)
                close()
                moveTo(18f, 12f)
                lineTo(18f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(6f, 12f)
                horizontalLineToRelative(12f)
                close()
                moveTo(21f, 8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                lineTo(4f, 14f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7f)
                lineTo(24f, 18f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _BoxBallot = it}
