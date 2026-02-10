package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ZoomIn: ImageVector? = null

val Icons.Rs.ZoomIn: ImageVector
    get() = _ZoomIn ?: UXIcon(name = "ZoomIn", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(512f, 481.89f)
                lineTo(378.67f, 348.57f)
                curveToRelative(74.55f, -91.18f, 61.07f, -225.53f, -30.11f, -300.09f)
                reflectiveCurveTo(123.03f, -12.6f, 48.48f, 78.59f)
                reflectiveCurveToRelative(-61.07f, 225.53f, 30.11f, 300.09f)
                curveToRelative(78.54f, 64.22f, 191.44f, 64.22f, 269.98f, 0f)
                lineTo(481.89f, 512f)
                lineTo(512f, 481.89f)
                close()
                moveTo(213.92f, 384.25f)
                curveToRelative(-94.07f, 0f, -170.33f, -76.26f, -170.33f, -170.33f)
                reflectiveCurveTo(119.84f, 43.58f, 213.92f, 43.58f)
                reflectiveCurveTo(384.25f, 119.84f, 384.25f, 213.92f)
                curveTo(384.14f, 307.95f, 307.95f, 384.14f, 213.92f, 384.25f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(235.21f, 128.75f)
                lineToRelative(-42.58f, 0f)
                lineToRelative(0f, 63.88f)
                lineToRelative(-63.88f, 0f)
                lineToRelative(0f, 42.58f)
                lineToRelative(63.88f, 0f)
                lineToRelative(0f, 63.88f)
                lineToRelative(42.58f, 0f)
                lineToRelative(0f, -63.88f)
                lineToRelative(63.88f, 0f)
                lineToRelative(0f, -42.58f)
                lineToRelative(-63.88f, 0f)
                close()
            }
        }.also { _ZoomIn = it}
