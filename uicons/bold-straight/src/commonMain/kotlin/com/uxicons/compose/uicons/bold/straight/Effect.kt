package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Effect: ImageVector? = null

val Icons.Bs.Effect: ImageVector
    get() = _Effect ?: UXIcon(name = "Effect") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.36f, 3f)
                lineToRelative(3.75f, 13.56f)
                curveToRelative(1.64f, 0.29f, 2.89f, 1.71f, 2.89f, 3.44f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -1.05f, 0.48f, -1.99f, 1.22f, -2.63f)
                lineToRelative(-3.97f, -14.37f)
                horizontalLineToRelative(-2.24f)
                verticalLineToRelative(14.35f)
                curveToRelative(1.18f, 0.56f, 2f, 1.76f, 2f, 3.15f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -1.39f, 0.82f, -2.59f, 2f, -3.15f)
                verticalLineTo(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(14.35f)
                curveToRelative(1.18f, 0.56f, 2f, 1.76f, 2f, 3.15f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -1.39f, 0.82f, -2.59f, 2f, -3.15f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6.64f)
                close()
            }
        }.also { _Effect = it}
