package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Yahoo: ImageVector? = null

val Icons.Brand.Yahoo: ImageVector
    get() = _Yahoo ?: UXIcon(name = "Yahoo") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.35f, 6.3f)
            lineToRelative(-2.81f, 7.1f)
            lineTo(4.76f, 6.3f)
            horizontalLineTo(0f)
            lineToRelative(5.25f, 12.35f)
            lineToRelative(-1.91f, 4.45f)
            horizontalLineToRelative(4.67f)
            lineToRelative(6.99f, -16.8f)
            horizontalLineTo(10.35f)
            close()
            moveTo(15.57f, 13.03f)
            curveToRelative(-1.59f, 0f, -2.89f, 1.29f, -2.89f, 2.89f)
            reflectiveCurveToRelative(1.29f, 2.89f, 2.89f, 2.89f)
            reflectiveCurveToRelative(2.89f, -1.29f, 2.89f, -2.89f)
            lineToRelative(0f, 0f)
            curveTo(18.46f, 14.33f, 17.17f, 13.03f, 15.57f, 13.03f)
            lineTo(15.57f, 13.03f)
            close()
            moveTo(18.82f, 0.9f)
            lineToRelative(-4.61f, 11.08f)
            horizontalLineToRelative(5.2f)
            lineTo(24f, 0.9f)
            horizontalLineTo(18.82f)
            close()
        }
    }.also { _Yahoo = it }
