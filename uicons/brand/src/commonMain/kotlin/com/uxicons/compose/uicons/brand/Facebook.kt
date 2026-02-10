package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Facebook: ImageVector? = null

val Icons.Brand.Facebook: ImageVector
    get() = _Facebook ?: UXIcon(name = "Facebook") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 12.07f)
            curveToRelative(0f, 5.99f, -4.39f, 10.95f, -10.13f, 11.86f)
            verticalLineToRelative(-8.36f)
            horizontalLineToRelative(2.79f)
            lineToRelative(0.53f, -3.46f)
            horizontalLineTo(13.87f)
            verticalLineTo(9.86f)
            curveToRelative(0f, -0.95f, 0.46f, -1.87f, 1.95f, -1.87f)
            horizontalLineToRelative(1.51f)
            verticalLineTo(5.04f)
            curveToRelative(0f, 0f, -1.37f, -0.23f, -2.68f, -0.23f)
            curveToRelative(-2.73f, 0f, -4.52f, 1.66f, -4.52f, 4.66f)
            verticalLineToRelative(2.64f)
            horizontalLineTo(7.09f)
            verticalLineToRelative(3.46f)
            horizontalLineToRelative(3.04f)
            verticalLineToRelative(8.36f)
            curveTo(4.39f, 23.02f, 0f, 18.06f, 0f, 12.07f)
            curveToRelative(0f, -6.63f, 5.37f, -12f, 12f, -12f)
            reflectiveCurveTo(24f, 5.45f, 24f, 12.07f)
            close()
        }
    }.also { _Facebook = it }
