package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _3: ImageVector? = null

val Icons.Bs.Three: ImageVector
    get() = _3 ?: UXIcon(name = "3") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 16.5f)
            curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
            horizontalLineTo(4f)
            verticalLineToRelative(-3f)
            horizontalLineTo(12.5f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
            horizontalLineTo(6f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
            reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
            horizontalLineTo(4f)
            verticalLineTo(0f)
            horizontalLineTo(12f)
            curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
            curveToRelative(0f, 1.58f, -0.62f, 3.02f, -1.62f, 4.09f)
            curveToRelative(2.17f, 1.32f, 3.62f, 3.69f, 3.62f, 6.41f)
            close()
        }
    }.also { _3 = it }
