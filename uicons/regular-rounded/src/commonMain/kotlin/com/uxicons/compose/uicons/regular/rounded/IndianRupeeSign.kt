package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndianRupeeSign: ImageVector? = null

val Icons.Rr.IndianRupeeSign: ImageVector
    get() = _IndianRupeeSign ?: UXIcon(name = "IndianRupeeSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3.02f)
                curveToRelative(-0.26f, 3.9f, -3.52f, 7f, -7.48f, 7f)
                horizontalLineToRelative(-2.7f)
                lineToRelative(8.83f, 7.23f)
                curveToRelative(0.43f, 0.35f, 0.49f, 0.98f, 0.14f, 1.41f)
                curveToRelative(-0.2f, 0.24f, -0.49f, 0.37f, -0.78f, 0.37f)
                curveToRelative(-0.22f, 0f, -0.45f, -0.07f, -0.63f, -0.23f)
                lineTo(3.37f, 14.77f)
                curveToRelative(-0.33f, -0.27f, -0.45f, -0.71f, -0.31f, -1.11f)
                curveToRelative(0.14f, -0.4f, 0.52f, -0.66f, 0.94f, -0.66f)
                horizontalLineToRelative(5.5f)
                curveToRelative(2.86f, 0f, 5.22f, -2.2f, 5.48f, -5f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineTo(14.79f)
                curveToRelative(-0.65f, -2.31f, -2.78f, -4f, -5.29f, -4f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineTo(20f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5.41f)
                curveToRelative(1.13f, 1.05f, 1.94f, 2.44f, 2.25f, 4f)
                horizontalLineToRelative(3.15f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _IndianRupeeSign = it}
