package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ProductHunt: ImageVector? = null

val Icons.Brand.ProductHunt: ImageVector
    get() = _ProductHunt ?: UXIcon(name = "ProductHunt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.87f, 8.93f)
            curveTo(15.2f, 9.25f, 15.4f, 9.7f, 15.4f, 10.2f)
            curveToRelative(0f, 0.99f, -0.81f, 1.8f, -1.8f, 1.8f)
            horizontalLineToRelative(-3.4f)
            verticalLineTo(8.4f)
            horizontalLineToRelative(3.4f)
            curveTo(14.1f, 8.4f, 14.55f, 8.6f, 14.87f, 8.93f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.37f, 0f, 0f, 5.37f, 0f, 12f)
            reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.37f, 12f, -12f)
            reflectiveCurveTo(18.63f, 0f, 12f, 0f)
            close()
            moveTo(16.57f, 13.17f)
            curveToRelative(-0.76f, 0.76f, -1.81f, 1.23f, -2.97f, 1.23f)
            horizontalLineToRelative(-3.4f)
            verticalLineTo(18f)
            horizontalLineTo(7.8f)
            verticalLineTo(6f)
            horizontalLineToRelative(5.8f)
            curveToRelative(2.32f, 0f, 4.2f, 1.88f, 4.2f, 4.2f)
            curveTo(17.8f, 11.36f, 17.33f, 12.41f, 16.57f, 13.17f)
            close()
        }
    }.also { _ProductHunt = it }
