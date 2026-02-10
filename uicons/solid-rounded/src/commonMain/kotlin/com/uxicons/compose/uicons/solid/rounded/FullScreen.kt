package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FullScreen: ImageVector? = null

val Icons.Sr.FullScreen: ImageVector
    get() = _FullScreen ?: UXIcon(name = "FullScreen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 11.12f)
                verticalLineToRelative(-2.77f)
                curveToRelative(0f, -0.76f, 0.91f, -1.14f, 1.45f, -0.6f)
                lineToRelative(0.69f, 0.69f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(-0.69f, 0.69f)
                curveToRelative(-0.54f, 0.54f, -1.45f, 0.16f, -1.45f, -0.6f)
                verticalLineToRelative(-2.77f)
                curveToRelative(0f, -0.48f, 0.39f, -0.88f, 0.88f, -0.88f)
                horizontalLineToRelative(2.77f)
                curveToRelative(0.76f, 0f, 1.14f, 0.91f, 0.6f, 1.45f)
                lineToRelative(-0.69f, 0.69f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(-0.69f, -0.69f)
                curveToRelative(-0.54f, -0.54f, -0.16f, -1.45f, 0.6f, -1.45f)
                horizontalLineToRelative(2.77f)
                curveToRelative(0.48f, 0f, 0.88f, 0.39f, 0.88f, 0.88f)
                verticalLineToRelative(2.77f)
                curveToRelative(0f, 0.76f, -0.91f, 1.14f, -1.45f, 0.6f)
                lineToRelative(-0.69f, -0.69f)
                lineToRelative(-2.44f, 2.44f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(0.69f, -0.69f)
                curveToRelative(0.54f, -0.54f, 1.45f, -0.16f, 1.45f, 0.6f)
                verticalLineToRelative(2.77f)
                curveToRelative(0f, 0.48f, -0.39f, 0.88f, -0.88f, 0.88f)
                horizontalLineToRelative(-2.77f)
                curveToRelative(-0.76f, 0f, -1.14f, -0.91f, -0.6f, -1.45f)
                lineToRelative(0.69f, -0.69f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(-2.44f, 2.44f)
                lineToRelative(0.69f, 0.69f)
                curveToRelative(0.54f, 0.54f, 0.16f, 1.45f, -0.6f, 1.45f)
                horizontalLineToRelative(-2.77f)
                curveToRelative(-0.48f, 0f, -0.88f, -0.39f, -0.88f, -0.88f)
                close()
                moveTo(20f, 2.1f)
                verticalLineToRelative(9.02f)
                curveToRelative(0f, 1.59f, -1.29f, 2.88f, -2.88f, 2.88f)
                horizontalLineToRelative(-10.25f)
                curveToRelative(-1.59f, 0f, -2.88f, -1.29f, -2.88f, -2.88f)
                verticalLineToRelative(-9.02f)
                curveToRelative(-2.28f, 0.47f, -4f, 2.48f, -4f, 4.9f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -2.41f, -1.72f, -4.43f, -4f, -4.9f)
                close()
            }
        }.also { _FullScreen = it}
