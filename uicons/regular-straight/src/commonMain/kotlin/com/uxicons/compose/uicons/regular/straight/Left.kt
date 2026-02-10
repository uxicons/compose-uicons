package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Left: ImageVector? = null

val Icons.Rs.Left: ImageVector
    get() = _Left ?: UXIcon(name = "Left") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 23.94f)
                lineTo(0.89f, 14.13f)
                curveTo(0.31f, 13.55f, 0f, 12.79f, 0f, 11.99f)
                curveTo(0f, 11.19f, 0.31f, 10.43f, 0.88f, 9.87f)
                horizontalLineToRelative(0f)
                reflectiveCurveTo(11f, 0.06f, 11f, 0.06f)
                verticalLineTo(6.99f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(10f)
                horizontalLineTo(11f)
                verticalLineToRelative(6.95f)
                close()
                moveTo(2.29f, 11.29f)
                curveToRelative(-0.19f, 0.19f, -0.29f, 0.44f, -0.29f, 0.71f)
                reflectiveCurveToRelative(0.1f, 0.52f, 0.29f, 0.71f)
                lineToRelative(6.71f, 6.51f)
                verticalLineToRelative(-4.22f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-6f)
                horizontalLineTo(9f)
                verticalLineTo(4.79f)
                lineTo(2.29f, 11.29f)
                close()
            }
        }.also { _Left = it}
