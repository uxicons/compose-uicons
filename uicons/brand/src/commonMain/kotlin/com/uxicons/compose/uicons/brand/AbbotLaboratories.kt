package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AbbotLaboratories: ImageVector? = null

val Icons.Brand.AbbotLaboratories: ImageVector
    get() = _AbbotLaboratories ?: UXIcon(name = "AbbotLaboratories") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.81f, 2.4f)
            horizontalLineTo(0f)
            verticalLineToRelative(3.2f)
            horizontalLineToRelative(19.77f)
            verticalLineToRelative(0.0f)
            curveToRelative(0.57f, 0f, 1.03f, 0.46f, 1.03f, 1.03f)
            verticalLineToRelative(10.74f)
            lineTo(20.8f, 17.38f)
            curveToRelative(-0.0f, 0.57f, -0.47f, 1.02f, -1.03f, 1.02f)
            horizontalLineTo(4.23f)
            curveToRelative(-0.57f, 0f, -1.03f, -0.46f, -1.03f, -1.03f)
            verticalLineToRelative(-4.34f)
            curveToRelative(0f, -0.57f, 0.47f, -1.03f, 1.03f, -1.03f)
            horizontalLineToRelative(13.37f)
            verticalLineTo(8.8f)
            horizontalLineTo(3.19f)
            curveTo(1.43f, 8.8f, 0f, 10.23f, 0f, 11.99f)
            verticalLineToRelative(6.42f)
            curveToRelative(0f, 1.76f, 1.43f, 3.19f, 3.19f, 3.19f)
            horizontalLineToRelative(17.62f)
            curveToRelative(1.76f, 0f, 3.19f, -1.43f, 3.19f, -3.19f)
            verticalLineTo(5.59f)
            curveTo(24f, 3.83f, 22.57f, 2.4f, 20.81f, 2.4f)
        }
    }.also { _AbbotLaboratories = it }
