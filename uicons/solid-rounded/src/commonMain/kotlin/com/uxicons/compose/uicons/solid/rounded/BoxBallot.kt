package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxBallot: ImageVector? = null

val Icons.Sr.BoxBallot: ImageVector
    get() = _BoxBallot ?: UXIcon(name = "BoxBallot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 17f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.41f, 1.72f, -4.43f, 4f, -4.9f)
                verticalLineToRelative(4.9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4.9f)
                curveToRelative(2.28f, 0.47f, 4f, 2.48f, 4f, 4.9f)
                verticalLineToRelative(4f)
                lineTo(0f, 17f)
                close()
                moveTo(18f, 12f)
                lineTo(18f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                lineTo(6f, 12f)
                horizontalLineToRelative(12f)
                close()
                moveTo(5f, 24f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(0f, 19f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                close()
            }
        }.also { _BoxBallot = it}
