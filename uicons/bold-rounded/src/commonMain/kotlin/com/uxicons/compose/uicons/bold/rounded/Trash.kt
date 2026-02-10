package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trash: ImageVector? = null

val Icons.Br.Trash: ImageVector
    get() = _Trash ?: UXIcon(name = "Trash", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(490.67f, 96f)
            curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
            horizontalLineToRelative(-80.56f)
            curveTo(364.63f, 25.76f, 328.55f, 0.13f, 288f, 0f)
            horizontalLineToRelative(-64f)
            curveToRelative(-40.55f, 0.13f, -76.63f, 25.76f, -90.11f, 64f)
            horizontalLineTo(53.33f)
            curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
            lineToRelative(0f, 0f)
            curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
            horizontalLineTo(64f)
            verticalLineToRelative(266.67f)
            curveTo(64f, 459.47f, 116.53f, 512f, 181.33f, 512f)
            horizontalLineToRelative(149.33f)
            curveTo(395.47f, 512f, 448f, 459.47f, 448f, 394.67f)
            verticalLineTo(128f)
            horizontalLineToRelative(10.67f)
            curveTo(476.34f, 128f, 490.67f, 113.67f, 490.67f, 96f)
            close()
            moveTo(384f, 394.67f)
            curveTo(384f, 424.12f, 360.12f, 448f, 330.67f, 448f)
            horizontalLineTo(181.33f)
            curveTo(151.88f, 448f, 128f, 424.12f, 128f, 394.67f)
            verticalLineTo(128f)
            horizontalLineToRelative(256f)
            verticalLineTo(394.67f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(202.67f, 384f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            verticalLineTo(224f)
            curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
            reflectiveCurveToRelative(-32f, 14.33f, -32f, 32f)
            verticalLineToRelative(128f)
            curveTo(170.67f, 369.67f, 184.99f, 384f, 202.67f, 384f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(309.33f, 384f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            verticalLineTo(224f)
            curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
            reflectiveCurveToRelative(-32f, 14.33f, -32f, 32f)
            verticalLineToRelative(128f)
            curveTo(277.33f, 369.67f, 291.66f, 384f, 309.33f, 384f)
            close()
        }
    }.also { _Trash = it }
