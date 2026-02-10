package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chalkboard: ImageVector? = null

val Icons.Br.Chalkboard: ImageVector
    get() = _Chalkboard ?: UXIcon(name = "Chalkboard") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23f, 18.09f)
            verticalLineToRelative(-9.59f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            horizontalLineTo(6.5f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(9.59f)
            curveToRelative(-0.58f, 0.21f, -1f, 0.76f, -1f, 1.41f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -0.65f, -0.42f, -1.2f, -1f, -1.41f)
            close()
            moveTo(6.5f, 6f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineTo(4f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
        }
    }.also { _Chalkboard = it }
