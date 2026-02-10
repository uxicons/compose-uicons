package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilterCheck: ImageVector? = null

val Icons.Ts.FilterCheck: ImageVector
    get() = _FilterCheck ?: UXIcon(name = "FilterCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.44f, 4.55f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(-3.46f, 3.4f)
                curveToRelative(-0.22f, 0.22f, -0.51f, 0.34f, -0.82f, 0.34f)
                reflectiveCurveToRelative(-0.6f, -0.12f, -0.82f, -0.34f)
                lineToRelative(-1.85f, -1.79f)
                lineToRelative(0.69f, -0.72f)
                lineToRelative(1.86f, 1.8f)
                curveToRelative(0.1f, 0.1f, 0.16f, 0.09f, 0.24f, 0.01f)
                lineToRelative(3.46f, -3.4f)
                close()
                moveTo(13f, 13.7f)
                verticalLineToRelative(8.53f)
                lineToRelative(-4f, -2.4f)
                verticalLineToRelative(-6.03f)
                lineToRelative(-8f, -9.0f)
                verticalLineToRelative(-2.31f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineToRelative(8.54f, 0.01f)
                curveToRelative(0.31f, -0.36f, 0.64f, -0.7f, 1.0f, -1f)
                horizontalLineToRelative(-9.54f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.11f, -2.5f, 2.49f)
                verticalLineToRelative(2.69f)
                lineToRelative(8f, 9f)
                verticalLineToRelative(6.22f)
                lineToRelative(6f, 3.6f)
                verticalLineToRelative(-9.76f)
                curveToRelative(-0.35f, -0.16f, -0.68f, -0.34f, -1f, -0.54f)
                close()
                moveTo(24f, 6.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                curveToRelative(3.73f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(23f, 6.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                close()
            }
        }.also { _FilterCheck = it}
