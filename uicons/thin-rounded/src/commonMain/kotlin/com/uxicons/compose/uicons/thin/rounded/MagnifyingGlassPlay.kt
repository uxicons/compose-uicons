package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MagnifyingGlassPlay: ImageVector? = null

val Icons.Tr.MagnifyingGlassPlay: ImageVector
    get() = _MagnifyingGlassPlay ?: UXIcon(name = "MagnifyingGlassPlay") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.85f, 23.15f)
                lineToRelative(-6.45f, -6.45f)
                curveToRelative(1.61f, -1.77f, 2.6f, -4.12f, 2.6f, -6.7f)
                curveToRelative(-0.0f, -5.51f, -4.49f, -10f, -10.0f, -10f)
                reflectiveCurveToRelative(-10f, 4.49f, -10f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.58f, 0f, 4.92f, -0.99f, 6.7f, -2.6f)
                lineToRelative(6.45f, 6.45f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(1f, 10f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                reflectiveCurveToRelative(-9f, -4.04f, -9f, -9f)
                close()
                moveTo(13.73f, 8.69f)
                lineTo(9.23f, 6.23f)
                curveToRelative(-0.95f, -0.58f, -2.27f, 0.19f, -2.23f, 1.3f)
                verticalLineToRelative(4.94f)
                curveToRelative(-0.04f, 1.11f, 1.28f, 1.88f, 2.22f, 1.31f)
                lineToRelative(4.51f, -2.47f)
                curveToRelative(1.01f, -0.52f, 1.01f, -2.09f, 0f, -2.61f)
                close()
                moveTo(13.25f, 10.43f)
                reflectiveCurveToRelative(-4.51f, 2.47f, -4.51f, 2.47f)
                curveToRelative(-0.44f, 0.15f, -0.66f, 0.02f, -0.74f, -0.43f)
                verticalLineToRelative(-4.94f)
                curveToRelative(0.05f, -0.46f, 0.39f, -0.59f, 0.74f, -0.43f)
                lineToRelative(4.5f, 2.47f)
                curveToRelative(0.36f, 0.3f, 0.36f, 0.56f, 0.01f, 0.86f)
                close()
            }
        }.also { _MagnifyingGlassPlay = it}
