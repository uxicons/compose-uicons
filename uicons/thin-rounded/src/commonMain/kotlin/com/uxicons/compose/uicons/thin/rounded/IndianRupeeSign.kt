package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndianRupeeSign: ImageVector? = null

val Icons.Tr.IndianRupeeSign: ImageVector
    get() = _IndianRupeeSign ?: UXIcon(name = "IndianRupeeSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                horizontalLineTo(4.88f)
                lineToRelative(10.94f, 9.12f)
                curveToRelative(0.21f, 0.18f, 0.24f, 0.49f, 0.06f, 0.7f)
                curveToRelative(-0.1f, 0.12f, -0.24f, 0.18f, -0.38f, 0.18f)
                curveToRelative(-0.11f, 0f, -0.23f, -0.04f, -0.32f, -0.12f)
                lineTo(3.18f, 13.88f)
                curveToRelative(-0.16f, -0.13f, -0.22f, -0.36f, -0.15f, -0.55f)
                curveToRelative(0.07f, -0.2f, 0.26f, -0.33f, 0.47f, -0.33f)
                horizontalLineToRelative(6.5f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineTo(15.92f)
                curveToRelative(-0.48f, -2.83f, -2.95f, -5f, -5.92f, -5f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineTo(20.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-6.9f)
                curveToRelative(1.76f, 1.06f, 3.02f, 2.88f, 3.33f, 5f)
                horizontalLineToRelative(3.57f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _IndianRupeeSign = it}
