package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Home: ImageVector? = null

val Icons.Sr.Home: ImageVector
    get() = _Home ?: UXIcon(name = "Home", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 319.84f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-128f)
                curveTo(320f, 348.49f, 291.35f, 319.84f, 256f, 319.84f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(362.67f, 383.84f)
                verticalLineToRelative(128f)
                horizontalLineTo(448f)
                curveToRelative(35.35f, 0f, 64f, -28.65f, 64f, -64f)
                verticalLineTo(253.26f)
                curveToRelative(0f, -11.08f, -4.3f, -21.73f, -12.01f, -29.7f)
                lineToRelative(-181.29f, -195.99f)
                curveToRelative(-31.99f, -34.61f, -85.98f, -36.74f, -120.59f, -4.75f)
                curveToRelative(-1.64f, 1.52f, -3.23f, 3.1f, -4.75f, 4.75f)
                lineTo(12.4f, 223.5f)
                curveTo(4.45f, 231.5f, -0f, 242.31f, 0f, 253.58f)
                verticalLineToRelative(194.26f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 64f, 64f)
                horizontalLineToRelative(85.33f)
                verticalLineToRelative(-128f)
                curveToRelative(0.4f, -58.17f, 47.37f, -105.68f, 104.07f, -107.04f)
                curveTo(312.01f, 275.38f, 362.22f, 323.7f, 362.67f, 383.84f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 319.84f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-128f)
                curveTo(320f, 348.49f, 291.35f, 319.84f, 256f, 319.84f)
                close()
            }
        }.also { _Home = it}
