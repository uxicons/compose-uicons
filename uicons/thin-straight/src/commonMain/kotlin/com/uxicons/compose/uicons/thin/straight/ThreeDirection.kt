package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThreeDirection: ImageVector? = null

val Icons.Ts.ThreeDirection: ImageVector
    get() = _ThreeDirection ?: UXIcon(name = "ThreeDirection") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.29f)
                lineToRelative(-5.27f, 5.27f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.11f, -0.73f, 1.77f)
                verticalLineToRelative(8.26f)
                horizontalLineToRelative(-1f)
                verticalLineTo(15.74f)
                curveToRelative(0f, -0.92f, 0.37f, -1.82f, 1.02f, -2.48f)
                lineToRelative(5.27f, -5.27f)
                horizontalLineToRelative(-4.29f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(1.71f, 8f)
                horizontalLineTo(6f)
                verticalLineToRelative(-1f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineTo(1f)
                verticalLineToRelative(-4.29f)
                lineToRelative(5.27f, 5.27f)
                curveToRelative(0.47f, 0.47f, 0.73f, 1.11f, 0.73f, 1.77f)
                verticalLineToRelative(8.26f)
                horizontalLineToRelative(1f)
                verticalLineTo(15.74f)
                curveToRelative(0f, -0.92f, -0.37f, -1.82f, -1.02f, -2.48f)
                lineTo(1.71f, 8f)
                close()
                moveTo(16.3f, 3.7f)
                lineTo(13.19f, 0.54f)
                curveToRelative(-0.61f, -0.68f, -1.8f, -0.67f, -2.4f, -0.01f)
                lineToRelative(-3.06f, 3.22f)
                lineToRelative(0.72f, 0.69f)
                lineToRelative(3.05f, -3.2f)
                verticalLineTo(24f)
                horizontalLineToRelative(1f)
                verticalLineTo(1.27f)
                lineToRelative(3.09f, 3.14f)
                lineToRelative(0.71f, -0.7f)
                close()
            }
        }.also { _ThreeDirection = it}
