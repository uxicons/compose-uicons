package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndianRupeeSign: ImageVector? = null

val Icons.Sc.IndianRupeeSign: ImageVector
    get() = _IndianRupeeSign ?: UXIcon(name = "IndianRupeeSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 7.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.55f)
                curveToRelative(-0.4f, 4.19f, -3.35f, 5.51f, -6.78f, 5.88f)
                curveToRelative(2.43f, 1.98f, 4.22f, 4.08f, 5.5f, 5.69f)
                curveToRelative(0.51f, 0.65f, 0.4f, 1.59f, -0.25f, 2.11f)
                curveToRelative(-0.65f, 0.51f, -1.59f, 0.41f, -2.11f, -0.25f)
                curveToRelative(-2.79f, -3.52f, -5.43f, -5.87f, -8.55f, -7.62f)
                curveToRelative(-0.6f, -0.33f, -0.89f, -1.03f, -0.72f, -1.69f)
                reflectiveCurveToRelative(0.77f, -1.12f, 1.45f, -1.12f)
                horizontalLineToRelative(2f)
                curveToRelative(5.13f, 0f, 6.23f, -1.2f, 6.45f, -3f)
                horizontalLineToRelative(-8.45f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(8.18f)
                curveToRelative(-0.56f, -1.22f, -2.09f, -1.99f, -6.19f, -2f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.53f)
                curveToRelative(0.37f, 0.56f, 0.65f, 1.22f, 0.83f, 2f)
                horizontalLineToRelative(1.71f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _IndianRupeeSign = it}
