package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GifSquare: ImageVector? = null

val Icons.Ts.GifSquare: ImageVector
    get() = _GifSquare ?: UXIcon(name = "GifSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 2f)
                lineTo(2.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 21f)
                lineTo(1f, 21f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(16.5f)
                close()
                moveTo(12f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-1f)
                lineTo(12f, 7f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-1f)
                lineTo(15f, 7f)
                close()
                moveTo(5f, 10f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
            }
        }.also { _GifSquare = it}
