package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FingerNail: ImageVector? = null

val Icons.Ss.FingerNail: ImageVector
    get() = _FingerNail ?: UXIcon(name = "FingerNail") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4f)
                verticalLineTo(12.5f)
                curveToRelative(0f, 1.3f, -0.56f, 2.46f, -1.44f, 3.28f)
                curveToRelative(-0.82f, -1.08f, -2.11f, -1.78f, -3.56f, -1.78f)
                reflectiveCurveToRelative(-2.74f, 0.7f, -3.56f, 1.78f)
                curveToRelative(-0.88f, -0.82f, -1.44f, -1.98f, -1.44f, -3.28f)
                verticalLineTo(4f)
                curveTo(7f, 1.79f, 8.79f, 0f, 11f, 0f)
                horizontalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(0f, 2.5f)
                lineToRelative(1.67f, 0.83f)
                lineToRelative(0.83f, 1.67f)
                lineToRelative(0.83f, -1.67f)
                lineToRelative(1.67f, -0.83f)
                lineToRelative(-1.67f, -0.83f)
                lineToRelative(-0.83f, -1.67f)
                lineToRelative(-0.83f, 1.67f)
                lineToRelative(-1.67f, 0.83f)
                close()
                moveTo(19f, 6.59f)
                verticalLineToRelative(5.91f)
                curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-3.59f, 0f, -6.5f, -2.91f, -6.5f, -6.5f)
                verticalLineTo(6.59f)
                curveToRelative(-1.9f, 1.78f, -3f, 4.24f, -3f, 6.91f)
                verticalLineToRelative(10.5f)
                horizontalLineTo(18.96f)
                lineToRelative(-1f, -2f)
                lineToRelative(-2f, -1f)
                lineToRelative(2f, -1f)
                lineToRelative(1f, -2f)
                lineToRelative(1f, 2f)
                lineToRelative(2f, 1f)
                lineToRelative(-2f, 1f)
                lineToRelative(-1f, 2f)
                horizontalLineToRelative(3.04f)
                verticalLineTo(13.5f)
                curveToRelative(0f, -2.66f, -1.1f, -5.13f, -3f, -6.91f)
                close()
            }
        }.also { _FingerNail = it}
