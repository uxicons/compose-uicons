package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramProject: ImageVector? = null

val Icons.Ts.DiagramProject: ImageVector
    get() = _DiagramProject ?: UXIcon(name = "DiagramProject") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                lineTo(8f, 5f)
                lineTo(8f, 3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(2f, 1f)
                curveTo(0.9f, 1f, 0f, 1.9f, 0f, 3f)
                verticalLineToRelative(6f)
                lineTo(7.19f, 9f)
                lineToRelative(3.33f, 6.66f)
                curveToRelative(-0.32f, 0.35f, -0.52f, 0.83f, -0.52f, 1.34f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.22f, 0f, -0.44f, 0.04f, -0.64f, 0.1f)
                lineToRelative(-3.36f, -6.72f)
                verticalLineToRelative(-2.38f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                close()
                moveTo(17f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-6f)
                lineTo(17f, 3f)
                close()
                moveTo(7f, 8f)
                lineTo(1f, 8f)
                lineTo(1f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(6f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                close()
                moveTo(16f, 16f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _DiagramProject = it}
