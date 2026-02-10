package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramProject: ImageVector? = null

val Icons.Ss.DiagramProject: ImageVector
    get() = _DiagramProject ?: UXIcon(name = "DiagramProject") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineTo(8f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineTo(2.5f)
                curveTo(1.12f, 1f, 0f, 2.12f, 0f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineTo(5.93f)
                lineToRelative(4.34f, 7.39f)
                curveToRelative(-0.17f, 0.34f, -0.27f, 0.71f, -0.27f, 1.11f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.23f, 0f, -0.45f, 0.04f, -0.66f, 0.1f)
                lineToRelative(-3.84f, -6.52f)
                verticalLineToRelative(-2.58f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _DiagramProject = it}
