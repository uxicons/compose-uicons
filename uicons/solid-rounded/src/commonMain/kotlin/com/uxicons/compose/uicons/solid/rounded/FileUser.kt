package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileUser: ImageVector? = null

val Icons.Sr.FileUser: ImageVector
    get() = _FileUser ?: UXIcon(name = "FileUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 24f)
                curveToRelative(0f, 0.01f, 0f, 0.02f, 0f, 0.03f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(0f, -0.01f, 0f, -0.02f, 0f, -0.03f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(14.92f, 8.03f)
                horizontalLineToRelative(6.54f)
                curveToRelative(-0.35f, -0.91f, -0.88f, -1.75f, -1.59f, -2.46f)
                lineToRelative(-3.48f, -3.49f)
                curveToRelative(-0.71f, -0.71f, -1.55f, -1.24f, -2.46f, -1.59f)
                verticalLineToRelative(6.54f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(21.92f, 10.51f)
                verticalLineToRelative(8.52f)
                curveToRelative(0f, 2.73f, -2.2f, 4.96f, -4.92f, 5.0f)
                curveToRelative(0f, -0.01f, 0f, -0.02f, 0f, -0.03f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 0.01f, 0f, 0.02f, 0f, 0.03f)
                horizontalLineToRelative(-0.08f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(1.92f, 5.03f)
                curveTo(1.92f, 2.27f, 4.17f, 0.03f, 6.92f, 0.03f)
                horizontalLineToRelative(4.51f)
                curveToRelative(0.16f, 0f, 0.32f, 0.01f, 0.48f, 0.02f)
                verticalLineToRelative(6.98f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6.98f)
                curveToRelative(0.01f, 0.16f, 0.02f, 0.32f, 0.02f, 0.48f)
                close()
                moveTo(15.5f, 14.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _FileUser = it}
