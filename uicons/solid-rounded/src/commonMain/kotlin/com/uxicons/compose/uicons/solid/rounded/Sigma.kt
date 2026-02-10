package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sigma: ImageVector? = null

val Icons.Sr.Sigma: ImageVector
    get() = _Sigma ?: UXIcon(name = "Sigma") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 24f)
                horizontalLineTo(4.87f)
                curveToRelative(-1.15f, 0f, -2.15f, -0.65f, -2.62f, -1.71f)
                curveToRelative(-0.47f, -1.05f, -0.28f, -2.23f, 0.49f, -3.09f)
                curveToRelative(0.03f, -0.04f, 0.07f, -0.07f, 0.1f, -0.1f)
                lineToRelative(8.58f, -7.11f)
                lineTo(2.85f, 4.89f)
                curveToRelative(-0.04f, -0.03f, -0.07f, -0.06f, -0.1f, -0.1f)
                curveToRelative(-0.77f, -0.85f, -0.96f, -2.04f, -0.49f, -3.09f)
                curveToRelative(0.47f, -1.05f, 1.47f, -1.71f, 2.62f, -1.71f)
                horizontalLineToRelative(13.13f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(4.87f)
                curveToRelative(-0.52f, 0f, -0.74f, 0.4f, -0.79f, 0.52f)
                curveToRelative(-0.05f, 0.12f, -0.19f, 0.51f, 0.11f, 0.89f)
                lineToRelative(9.45f, 7.83f)
                curveToRelative(0.23f, 0.19f, 0.36f, 0.47f, 0.36f, 0.77f)
                reflectiveCurveToRelative(-0.13f, 0.58f, -0.36f, 0.77f)
                lineToRelative(-9.45f, 7.83f)
                curveToRelative(-0.3f, 0.38f, -0.16f, 0.77f, -0.11f, 0.89f)
                curveToRelative(0.05f, 0.12f, 0.27f, 0.52f, 0.79f, 0.52f)
                horizontalLineToRelative(13.13f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
            }
        }.also { _Sigma = it}
