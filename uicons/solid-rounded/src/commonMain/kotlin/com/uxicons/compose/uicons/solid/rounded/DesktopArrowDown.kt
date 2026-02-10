package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DesktopArrowDown: ImageVector? = null

val Icons.Sr.DesktopArrowDown: ImageVector
    get() = _DesktopArrowDown ?: UXIcon(name = "DesktopArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.1f, 15f)
                horizontalLineToRelative(23.8f)
                curveToRelative(-0.47f, 2.28f, -2.48f, 4f, -4.9f, 4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.41f, 0f, -4.43f, -1.72f, -4.9f, -4f)
                close()
                moveTo(19f, 1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(7.42f)
                lineToRelative(2.32f, -2.15f)
                curveToRelative(0.4f, -0.38f, 1.04f, -0.35f, 1.41f, 0.05f)
                curveToRelative(0.38f, 0.41f, 0.35f, 1.04f, -0.05f, 1.41f)
                lineToRelative(-2.61f, 2.43f)
                curveToRelative(-0.56f, 0.56f, -1.31f, 0.84f, -2.06f, 0.84f)
                curveToRelative(-0.76f, 0f, -1.52f, -0.29f, -2.1f, -0.87f)
                lineToRelative(-2.59f, -2.4f)
                curveToRelative(-0.4f, -0.38f, -0.43f, -1.01f, -0.05f, -1.41f)
                curveToRelative(0.37f, -0.41f, 1.01f, -0.43f, 1.41f, -0.05f)
                lineToRelative(2.32f, 2.15f)
                verticalLineTo(1f)
                horizontalLineToRelative(-6f)
                curveTo(2.24f, 1f, 0f, 3.24f, 0f, 6f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
            }
        }.also { _DesktopArrowDown = it}
