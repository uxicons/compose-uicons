package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gamepad: ImageVector? = null

val Icons.Rr.Gamepad: ImageVector
    get() = _Gamepad ?: UXIcon(name = "Gamepad", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(473.76f, 107.29f)
                curveToRelative(-19.12f, -31.87f, -53.11f, -53.11f, -91.35f, -53.11f)
                horizontalLineTo(127.47f)
                curveToRelative(-38.24f, 0f, -72.23f, 21.25f, -91.35f, 53.11f)
                curveTo(12.75f, 149.78f, 0f, 196.51f, 0f, 245.38f)
                curveToRelative(0f, 116.85f, 46.74f, 212.45f, 106.22f, 212.45f)
                curveToRelative(31.87f, 0f, 57.36f, -29.74f, 76.48f, -91.35f)
                curveToRelative(2.12f, -8.5f, 10.62f, -14.87f, 21.25f, -14.87f)
                horizontalLineToRelative(104.1f)
                curveToRelative(8.5f, 0f, 17f, 6.37f, 21.25f, 14.87f)
                curveToRelative(19.12f, 61.61f, 44.61f, 91.35f, 76.48f, 91.35f)
                curveToRelative(59.49f, 0f, 106.22f, -95.6f, 106.22f, -212.45f)
                curveTo(509.88f, 196.51f, 497.13f, 149.78f, 473.76f, 107.29f)
                close()
                moveTo(403.65f, 415.34f)
                curveToRelative(-6.37f, 0f, -21.25f, -17f, -36.12f, -61.61f)
                curveToRelative(-8.5f, -27.62f, -33.99f, -44.61f, -61.61f, -44.61f)
                horizontalLineTo(203.95f)
                curveToRelative(-27.62f, 0f, -53.11f, 19.12f, -61.61f, 44.61f)
                curveToRelative(-14.87f, 44.61f, -29.74f, 61.61f, -36.12f, 61.61f)
                curveToRelative(-21.25f, 0f, -63.73f, -65.86f, -63.73f, -169.96f)
                curveToRelative(0f, -40.37f, 10.62f, -80.73f, 29.74f, -116.85f)
                curveToRelative(12.75f, -19.12f, 33.99f, -31.87f, 55.24f, -31.87f)
                horizontalLineToRelative(254.94f)
                curveToRelative(21.25f, 0f, 42.49f, 12.75f, 55.24f, 31.87f)
                curveToRelative(19.12f, 36.12f, 29.74f, 76.48f, 29.74f, 116.85f)
                curveTo(467.39f, 349.48f, 424.9f, 415.34f, 403.65f, 415.34f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 192f)
                horizontalLineToRelative(-21.33f)
                verticalLineToRelative(-21.33f)
                curveToRelative(0f, -12.8f, -8.53f, -21.33f, -21.33f, -21.33f)
                curveToRelative(-12.8f, 0f, -21.33f, 8.53f, -21.33f, 21.33f)
                verticalLineTo(192f)
                horizontalLineToRelative(-21.33f)
                curveToRelative(-12.8f, 0f, -21.33f, 8.53f, -21.33f, 21.33f)
                curveToRelative(0f, 12.8f, 8.53f, 21.33f, 21.33f, 21.33f)
                horizontalLineTo(128f)
                verticalLineTo(256f)
                curveToRelative(0f, 12.8f, 8.53f, 21.33f, 21.33f, 21.33f)
                curveToRelative(12.8f, 0f, 21.33f, -8.53f, 21.33f, -21.33f)
                verticalLineToRelative(-21.33f)
                horizontalLineTo(192f)
                curveToRelative(12.8f, 0f, 21.33f, -8.53f, 21.33f, -21.33f)
                curveTo(213.33f, 200.53f, 204.8f, 192f, 192f, 192f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(394.67f, 181.33f)
                moveToRelative(-32f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(330.67f, 245.33f)
                moveToRelative(-32f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
            }
        }.also { _Gamepad = it}
