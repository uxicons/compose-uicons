package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Effect: ImageVector? = null

val Icons.Ss.Effect: ImageVector
    get() = _Effect ?: UXIcon(name = "Effect") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(15.16f)
                curveToRelative(-1.44f, 0.43f, -2.5f, 1.76f, -2.5f, 3.34f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.58f, -1.06f, -2.9f, -2.5f, -3.34f)
                verticalLineTo(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(15.16f)
                curveToRelative(-1.44f, 0.43f, -2.5f, 1.76f, -2.5f, 3.34f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.58f, -1.06f, -2.9f, -2.5f, -3.34f)
                verticalLineTo(2f)
                horizontalLineToRelative(2.11f)
                lineToRelative(4.93f, 15.61f)
                curveToRelative(-0.93f, 0.63f, -1.54f, 1.69f, -1.54f, 2.9f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.02f, 0f, -0.04f, 0.01f, -0.06f, 0.01f)
                lineTo(15.71f, 2f)
                horizontalLineToRelative(8.29f)
                close()
            }
        }.also { _Effect = it}
