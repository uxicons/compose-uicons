package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Total: ImageVector? = null

val Icons.Tr.Total: ImageVector
    get() = _Total ?: UXIcon(name = "Total") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 20.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineTo(4.41f)
                curveToRelative(-0.99f, 0f, -1.86f, -0.6f, -2.21f, -1.52f)
                reflectiveCurveToRelative(-0.1f, -1.95f, 0.64f, -2.6f)
                lineToRelative(8.9f, -7.87f)
                lineTo(2.85f, 4.13f)
                curveToRelative(-0.74f, -0.66f, -0.99f, -1.68f, -0.64f, -2.6f)
                reflectiveCurveToRelative(1.22f, -1.52f, 2.21f, -1.52f)
                horizontalLineToRelative(14.09f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineTo(4.41f)
                curveToRelative(-0.69f, 0f, -1.11f, 0.45f, -1.27f, 0.88f)
                curveToRelative(-0.16f, 0.42f, -0.15f, 1.04f, 0.37f, 1.5f)
                lineToRelative(9.32f, 8.25f)
                curveToRelative(0.11f, 0.1f, 0.17f, 0.23f, 0.17f, 0.38f)
                reflectiveCurveToRelative(-0.06f, 0.28f, -0.17f, 0.38f)
                lineTo(3.51f, 20.62f)
                curveToRelative(-0.52f, 0.46f, -0.53f, 1.08f, -0.37f, 1.5f)
                curveToRelative(0.16f, 0.42f, 0.58f, 0.88f, 1.27f, 0.88f)
                horizontalLineToRelative(14.09f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _Total = it}
