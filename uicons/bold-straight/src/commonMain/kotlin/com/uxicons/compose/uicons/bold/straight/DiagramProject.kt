package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramProject: ImageVector? = null

val Icons.Bs.DiagramProject: ImageVector
    get() = _DiagramProject ?: UXIcon(name = "DiagramProject") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineTo(3f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(6f)
                horizontalLineTo(5.75f)
                lineToRelative(3.5f, 7.78f)
                curveToRelative(-0.17f, 0.37f, -0.26f, 0.78f, -0.26f, 1.22f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.08f, 0f, -0.17f, 0.0f, -0.25f, 0.01f)
                lineToRelative(-2.75f, -6.11f)
                verticalLineToRelative(-2.9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                close()
                moveTo(3f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                close()
                moveTo(15f, 21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(18f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineTo(3f)
                close()
            }
        }.also { _DiagramProject = it}
