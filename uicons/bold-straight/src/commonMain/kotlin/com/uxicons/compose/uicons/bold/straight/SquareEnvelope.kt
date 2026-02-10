package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareEnvelope: ImageVector? = null

val Icons.Bs.SquareEnvelope: ImageVector
    get() = _SquareEnvelope ?: UXIcon(name = "SquareEnvelope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.65f, 10.85f)
                lineToRelative(-3.73f, -3.85f)
                curveToRelative(0.03f, -0.0f, 8.21f, 0.0f, 8.27f, 0.01f)
                lineToRelative(-3.83f, 3.83f)
                curveToRelative(-0.18f, 0.18f, -0.53f, 0.18f, -0.71f, 0f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-0.94f, 0f, -1.81f, -0.36f, -2.48f, -1.03f)
                lineToRelative(-3.5f, -3.5f)
                curveToRelative(-0.01f, 0.17f, -0.03f, 0.33f, -0.03f, 0.52f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-7.55f)
                lineToRelative(-3.52f, 3.52f)
                curveToRelative(-0.66f, 0.66f, -1.54f, 1.02f, -2.48f, 1.02f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-17f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(18f)
                close()
            }
        }.also { _SquareEnvelope = it}
