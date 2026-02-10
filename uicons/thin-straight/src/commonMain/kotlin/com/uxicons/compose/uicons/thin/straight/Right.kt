package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Right: ImageVector? = null

val Icons.Ts.Right: ImageVector
    get() = _Right ?: UXIcon(name = "Right") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 23.67f)
                verticalLineToRelative(-6.67f)
                horizontalLineTo(0f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(0.33f)
                lineToRelative(10.24f, 9.84f)
                curveToRelative(0.49f, 0.49f, 0.76f, 1.14f, 0.76f, 1.83f)
                reflectiveCurveToRelative(-0.27f, 1.35f, -0.76f, 1.84f)
                lineToRelative(-10.24f, 9.84f)
                close()
                moveTo(1f, 16f)
                horizontalLineTo(14f)
                verticalLineToRelative(5.33f)
                lineToRelative(8.54f, -8.2f)
                curveToRelative(0.3f, -0.29f, 0.46f, -0.7f, 0.46f, -1.12f)
                curveToRelative(0f, -0.42f, -0.17f, -0.82f, -0.47f, -1.12f)
                lineTo(14f, 2.67f)
                verticalLineToRelative(5.33f)
                horizontalLineTo(1f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _Right = it}
