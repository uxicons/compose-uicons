package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Left: ImageVector? = null

val Icons.Ts.Left: ImageVector
    get() = _Left ?: UXIcon(name = "Left") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 23.67f)
                lineTo(0.77f, 13.84f)
                curveToRelative(-0.5f, -0.5f, -0.77f, -1.15f, -0.77f, -1.84f)
                curveToRelative(0f, -0.69f, 0.27f, -1.34f, 0.76f, -1.83f)
                horizontalLineToRelative(0f)
                reflectiveCurveTo(11f, 0.33f, 11f, 0.33f)
                verticalLineTo(7f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(10f)
                horizontalLineTo(11f)
                verticalLineToRelative(6.67f)
                close()
                moveTo(1.47f, 10.88f)
                curveToRelative(-0.3f, 0.3f, -0.47f, 0.7f, -0.47f, 1.12f)
                curveToRelative(0f, 0.43f, 0.17f, 0.83f, 0.47f, 1.13f)
                lineToRelative(8.53f, 8.2f)
                verticalLineToRelative(-5.33f)
                horizontalLineToRelative(13f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(2.67f)
                lineTo(1.47f, 10.88f)
                close()
            }
        }.also { _Left = it}
