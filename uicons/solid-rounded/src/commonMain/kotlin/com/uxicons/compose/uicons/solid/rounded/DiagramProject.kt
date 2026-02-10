package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramProject: ImageVector? = null

val Icons.Sr.DiagramProject: ImageVector
    get() = _DiagramProject ?: UXIcon(name = "DiagramProject") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                horizontalLineTo(8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineTo(3f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(2f)
                curveToRelative(0.3f, 0f, 0.58f, -0.04f, 0.85f, -0.12f)
                lineToRelative(4.52f, 7.68f)
                curveToRelative(-0.24f, 0.43f, -0.37f, 0.92f, -0.37f, 1.45f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.39f, 0f, -0.76f, 0.07f, -1.1f, 0.21f)
                lineTo(7.48f, 7.69f)
                curveToRelative(0.33f, -0.48f, 0.52f, -1.06f, 0.52f, -1.69f)
                horizontalLineToRelative(8f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _DiagramProject = it}
