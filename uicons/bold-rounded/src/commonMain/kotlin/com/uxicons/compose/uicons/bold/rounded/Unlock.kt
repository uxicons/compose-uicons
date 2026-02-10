package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Unlock: ImageVector? = null

val Icons.Br.Unlock: ImageVector
    get() = _Unlock ?: UXIcon(name = "Unlock", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(352.02f, 170.7f)
            horizontalLineTo(170.68f)
            verticalLineToRelative(-16.49f)
            curveToRelative(0.01f, -49.81f, 40.4f, -90.19f, 90.21f, -90.18f)
            curveToRelative(32.8f, 0.01f, 63.01f, 17.82f, 78.89f, 46.51f)
            curveToRelative(8.58f, 15.45f, 28.06f, 21.02f, 43.51f, 12.45f)
            reflectiveCurveToRelative(21.02f, -28.06f, 12.45f, -43.51f)
            lineToRelative(0f, 0f)
            curveTo(354.47f, 4.99f, 260.62f, -21.92f, 186.13f, 19.36f)
            curveToRelative(-49.02f, 27.17f, -79.44f, 78.8f, -79.45f, 134.85f)
            verticalLineToRelative(29.44f)
            curveToRelative(-39.24f, 20.02f, -63.95f, 60.33f, -64f, 104.38f)
            verticalLineTo(394.7f)
            curveToRelative(0.07f, 64.77f, 52.56f, 117.26f, 117.33f, 117.33f)
            horizontalLineToRelative(192f)
            curveToRelative(64.77f, -0.07f, 117.26f, -52.56f, 117.33f, -117.33f)
            verticalLineTo(288.03f)
            curveTo(469.28f, 223.26f, 416.79f, 170.77f, 352.02f, 170.7f)
            close()
            moveTo(405.35f, 394.7f)
            curveToRelative(0f, 29.45f, -23.88f, 53.33f, -53.33f, 53.33f)
            horizontalLineToRelative(-192f)
            curveToRelative(-29.45f, 0f, -53.33f, -23.88f, -53.33f, -53.33f)
            verticalLineTo(288.03f)
            curveToRelative(0f, -29.45f, 23.88f, -53.33f, 53.33f, -53.33f)
            horizontalLineToRelative(192f)
            curveToRelative(29.45f, 0f, 53.33f, 23.88f, 53.33f, 53.33f)
            verticalLineTo(394.7f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(245.35f, 298.7f)
            horizontalLineToRelative(21.33f)
            curveToRelative(17.67f, 0f, 32f, 14.33f, 32f, 32f)
            lineToRelative(0f, 0f)
            curveToRelative(0f, 17.67f, -14.33f, 32f, -32f, 32f)
            horizontalLineTo(245.35f)
            curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
            lineToRelative(0f, 0f)
            curveTo(213.35f, 313.03f, 227.68f, 298.7f, 245.35f, 298.7f)
            close()
        }
    }.also { _Unlock = it }
