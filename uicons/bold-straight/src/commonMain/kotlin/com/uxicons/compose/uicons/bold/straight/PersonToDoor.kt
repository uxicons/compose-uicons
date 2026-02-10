package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonToDoor: ImageVector? = null

val Icons.Bs.PersonToDoor: ImageVector
    get() = _PersonToDoor ?: UXIcon(name = "PersonToDoor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-0.39f)
                lineToRelative(-2.93f, -2.85f)
                curveToRelative(-0.66f, -0.73f, -1.6f, -1.15f, -2.59f, -1.15f)
                horizontalLineTo(2.32f)
                lineTo(0.11f, 11.44f)
                lineToRelative(2.78f, 1.13f)
                lineToRelative(1.45f, -3.56f)
                horizontalLineToRelative(1.67f)
                lineToRelative(-1.26f, 3.08f)
                curveToRelative(-0.65f, 1.57f, -0.07f, 3.38f, 1.37f, 4.29f)
                lineToRelative(3.89f, 2.46f)
                verticalLineToRelative(5.17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6.83f)
                lineToRelative(-3.97f, -2.5f)
                lineToRelative(1.76f, -4.21f)
                lineToRelative(2.6f, 2.54f)
                horizontalLineToRelative(4.61f)
                verticalLineTo(3f)
                horizontalLineToRelative(3f)
                verticalLineTo(21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(9f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(4.23f, 17.43f)
                lineToRelative(-0.23f, 0.57f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(6f)
                lineToRelative(0.76f, -1.85f)
                lineToRelative(-1.72f, -1.09f)
                curveToRelative(-0.3f, -0.19f, -0.57f, -0.4f, -0.81f, -0.63f)
                close()
            }
        }.also { _PersonToDoor = it}
