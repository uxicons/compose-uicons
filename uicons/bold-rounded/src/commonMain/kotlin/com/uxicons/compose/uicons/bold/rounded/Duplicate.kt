package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Duplicate: ImageVector? = null

val Icons.Br.Duplicate: ImageVector
    get() = _Duplicate ?: UXIcon(name = "Duplicate", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(437.78f, 36.88f)
            curveTo(415.69f, 13.4f, 384.89f, 0.05f, 352.64f, 0f)
            horizontalLineTo(288f)
            curveToRelative(-60.62f, 0.09f, -111.22f, 46.3f, -116.8f, 106.67f)
            horizontalLineTo(160f)
            curveTo(95.23f, 106.74f, 42.74f, 159.23f, 42.67f, 224f)
            verticalLineToRelative(170.67f)
            curveTo(42.74f, 459.44f, 95.23f, 511.93f, 160f, 512f)
            horizontalLineToRelative(85.33f)
            curveToRelative(64.77f, -0.07f, 117.26f, -52.56f, 117.33f, -117.33f)
            verticalLineToRelative(-11.2f)
            curveToRelative(60.37f, -5.57f, 106.58f, -56.17f, 106.67f, -116.8f)
            verticalLineTo(116.69f)
            curveTo(469.38f, 87.04f, 458.09f, 58.49f, 437.78f, 36.88f)
            close()
            moveTo(298.67f, 394.67f)
            curveToRelative(0f, 29.45f, -23.88f, 53.33f, -53.33f, 53.33f)
            horizontalLineTo(160f)
            curveToRelative(-29.45f, 0f, -53.33f, -23.88f, -53.33f, -53.33f)
            verticalLineTo(224f)
            curveToRelative(0f, -29.45f, 23.88f, -53.33f, 53.33f, -53.33f)
            horizontalLineToRelative(10.67f)
            verticalLineToRelative(96f)
            curveTo(170.74f, 331.44f, 223.23f, 383.93f, 288f, 384f)
            horizontalLineToRelative(10.67f)
            verticalLineTo(394.67f)
            close()
            moveTo(405.33f, 266.67f)
            curveTo(405.33f, 296.12f, 381.45f, 320f, 352f, 320f)
            horizontalLineToRelative(-64f)
            curveToRelative(-29.45f, 0f, -53.33f, -23.88f, -53.33f, -53.33f)
            verticalLineTo(117.33f)
            curveTo(234.67f, 87.88f, 258.55f, 64f, 288f, 64f)
            horizontalLineToRelative(53.33f)
            verticalLineToRelative(21.33f)
            curveTo(341.33f, 108.9f, 360.44f, 128f, 384f, 128f)
            horizontalLineToRelative(21.33f)
            verticalLineTo(266.67f)
            close()
        }
    }.also { _Duplicate = it }
