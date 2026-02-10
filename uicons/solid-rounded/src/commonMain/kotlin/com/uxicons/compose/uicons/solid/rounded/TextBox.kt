package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextBox: ImageVector? = null

val Icons.Sr.TextBox: ImageVector
    get() = _TextBox ?: UXIcon(name = "TextBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 9f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(20f, 17.04f)
                lineTo(20f, 6.96f)
                curveToRelative(-1.53f, -0.22f, -2.74f, -1.43f, -2.96f, -2.96f)
                lineTo(6.96f, 4f)
                curveToRelative(-0.22f, 1.53f, -1.43f, 2.74f, -2.96f, 2.96f)
                verticalLineToRelative(10.07f)
                curveToRelative(1.53f, 0.22f, 2.74f, 1.43f, 2.96f, 2.96f)
                horizontalLineToRelative(10.07f)
                curveToRelative(0.22f, -1.53f, 1.43f, -2.74f, 2.96f, -2.96f)
                close()
                moveTo(24f, 20.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-1.39f, 0f, -2.6f, -0.82f, -3.16f, -2f)
                lineTo(6.66f, 22f)
                curveToRelative(-0.56f, 1.18f, -1.77f, 2f, -3.16f, 2f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -1.39f, 0.82f, -2.6f, 2f, -3.16f)
                lineTo(2f, 6.66f)
                curveToRelative(-1.18f, -0.56f, -2f, -1.77f, -2f, -3.16f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                curveToRelative(1.39f, 0f, 2.6f, 0.82f, 3.16f, 2f)
                horizontalLineToRelative(10.68f)
                curveToRelative(0.56f, -1.18f, 1.77f, -2f, 3.16f, -2f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 1.39f, -0.82f, 2.6f, -2f, 3.16f)
                verticalLineToRelative(10.68f)
                curveToRelative(1.18f, 0.56f, 2f, 1.77f, 2f, 3.16f)
                close()
            }
        }.also { _TextBox = it}
