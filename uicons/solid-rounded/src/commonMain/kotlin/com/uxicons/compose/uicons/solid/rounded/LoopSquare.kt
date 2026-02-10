package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LoopSquare: ImageVector? = null

val Icons.Sr.LoopSquare: ImageVector
    get() = _LoopSquare ?: UXIcon(name = "LoopSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 10.07f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.3f, -0.71f, 0.3f)
                curveToRelative(-0.26f, 0f, -0.51f, -0.1f, -0.7f, -0.29f)
                lineToRelative(-2.3f, -2.28f)
                verticalLineToRelative(10.2f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                lineTo(7f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(18f, 7.8f)
                lineToRelative(-2.3f, 2.28f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, -0.01f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.01f, -1.41f)
                lineToRelative(2.96f, -2.93f)
                curveToRelative(0.93f, -0.93f, 2.56f, -0.93f, 3.49f, 0.0f)
                lineToRelative(2.96f, 2.93f)
                curveToRelative(0.39f, 0.39f, 0.4f, 1.02f, 0.01f, 1.41f)
                close()
                moveTo(9.7f, 15.34f)
                curveToRelative(0.39f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.4f, -1.41f, -0.01f)
                lineToRelative(-2.3f, 2.28f)
                lineTo(6f, 6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                verticalLineToRelative(10.2f)
                lineToRelative(-2.3f, -2.28f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.01f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.01f, 1.41f)
                lineToRelative(2.96f, 2.93f)
                curveToRelative(0.47f, 0.47f, 1.09f, 0.72f, 1.75f, 0.72f)
                reflectiveCurveToRelative(1.28f, -0.26f, 1.75f, -0.72f)
                lineToRelative(2.96f, -2.93f)
                close()
            }
        }.also { _LoopSquare = it}
