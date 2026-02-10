package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DirectionSignal: ImageVector? = null

val Icons.Sr.DirectionSignal: ImageVector
    get() = _DirectionSignal ?: UXIcon(name = "DirectionSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.71f, 13.79f)
                lineToRelative(-1.91f, -1.91f)
                curveToRelative(-0.57f, -0.57f, -1.32f, -0.88f, -2.12f, -0.88f)
                horizontalLineToRelative(-5.67f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-6.51f)
                lineToRelative(0.01f, -0.99f)
                curveToRelative(0.0f, -0.55f, -0.44f, -1.0f, -0.99f, -1.01f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.55f, 0f, -1.0f, 0.44f, -1f, 0.99f)
                lineToRelative(-0.01f, 1.01f)
                horizontalLineToRelative(-5.67f)
                curveToRelative(-0.8f, 0f, -1.55f, 0.31f, -2.12f, 0.88f)
                lineToRelative(-1.91f, 1.91f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(1.91f, 1.91f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                horizontalLineToRelative(5.67f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(6.49f)
                lineToRelative(0.01f, 5.0f)
                curveToRelative(0f, 0.55f, 0.45f, 1.0f, 1f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineToRelative(-0.01f, -5.0f)
                horizontalLineToRelative(5.68f)
                curveToRelative(0.8f, 0f, 1.55f, -0.31f, 2.12f, -0.88f)
                lineToRelative(1.91f, -1.91f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
            }
        }.also { _DirectionSignal = it}
