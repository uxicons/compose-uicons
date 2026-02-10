package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ring: ImageVector? = null

val Icons.Tr.Ring: ImageVector
    get() = _Ring ?: UXIcon(name = "Ring") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9.5f)
                curveToRelative(0f, -3.65f, -5.27f, -6.5f, -12f, -6.5f)
                reflectiveCurveTo(0f, 5.86f, 0f, 9.5f)
                verticalLineToRelative(5.25f)
                curveToRelative(0f, 3.5f, 5.27f, 6.25f, 12f, 6.25f)
                reflectiveCurveToRelative(12f, -2.75f, 12f, -6.25f)
                verticalLineToRelative(-5.23f)
                reflectiveCurveToRelative(0f, -0.01f, 0f, -0.01f)
                curveToRelative(0f, -0.01f, 0f, -0.01f, 0f, -0.02f)
                close()
                moveTo(12f, 4f)
                curveToRelative(5.96f, 0f, 11f, 2.52f, 11f, 5.5f)
                curveToRelative(0f, 0.6f, -0.21f, 1.19f, -0.59f, 1.74f)
                curveToRelative(-2.11f, -1.98f, -6.09f, -3.24f, -10.41f, -3.24f)
                reflectiveCurveToRelative(-8.31f, 1.26f, -10.41f, 3.24f)
                curveToRelative(-0.38f, -0.55f, -0.59f, -1.13f, -0.59f, -1.74f)
                curveToRelative(0f, -2.98f, 5.04f, -5.5f, 11f, -5.5f)
                close()
                moveTo(21.76f, 11.99f)
                curveToRelative(-1.85f, 1.77f, -5.58f, 3.01f, -9.76f, 3.01f)
                reflectiveCurveToRelative(-7.91f, -1.24f, -9.76f, -3.01f)
                curveToRelative(1.91f, -1.83f, 5.66f, -2.99f, 9.76f, -2.99f)
                reflectiveCurveToRelative(7.86f, 1.16f, 9.76f, 2.99f)
                close()
                moveTo(23f, 14.75f)
                curveToRelative(0f, 2.85f, -5.04f, 5.25f, -11f, 5.25f)
                reflectiveCurveTo(1f, 17.6f, 1f, 14.75f)
                verticalLineToRelative(-2.61f)
                curveToRelative(1.84f, 2.29f, 6.02f, 3.86f, 11f, 3.86f)
                curveToRelative(8.35f, 0f, 10.96f, -3.74f, 10.99f, -3.84f)
                curveToRelative(0.0f, -0.01f, 0.01f, -0.01f, 0.01f, -0.02f)
                verticalLineToRelative(2.61f)
                close()
            }
        }.also { _Ring = it}
