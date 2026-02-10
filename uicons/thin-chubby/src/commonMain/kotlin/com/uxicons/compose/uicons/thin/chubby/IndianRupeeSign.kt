package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndianRupeeSign: ImageVector? = null

val Icons.Tc.IndianRupeeSign: ImageVector
    get() = _IndianRupeeSign ?: UXIcon(name = "IndianRupeeSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 6.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-2.52f)
                curveToRelative(0.01f, 0.17f, 0.02f, 0.33f, 0.02f, 0.5f)
                curveToRelative(0f, 4.31f, -3.2f, 6.5f, -9.5f, 6.5f)
                horizontalLineToRelative(-1.16f)
                curveToRelative(3.8f, 2.35f, 7.29f, 5.33f, 9.56f, 8.19f)
                curveToRelative(0.17f, 0.22f, 0.14f, 0.53f, -0.08f, 0.7f)
                curveToRelative(-0.21f, 0.17f, -0.53f, 0.14f, -0.7f, -0.08f)
                curveToRelative(-2.5f, -3.16f, -6.55f, -6.47f, -10.85f, -8.87f)
                curveToRelative(-0.2f, -0.11f, -0.3f, -0.34f, -0.24f, -0.56f)
                reflectiveCurveToRelative(0.26f, -0.37f, 0.48f, -0.37f)
                horizontalLineToRelative(3f)
                curveToRelative(5.72f, 0f, 8.5f, -1.8f, 8.5f, -5.5f)
                curveToRelative(0f, -0.17f, -0.01f, -0.34f, -0.02f, -0.5f)
                horizontalLineToRelative(-11.48f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11.31f)
                curveToRelative(-0.7f, -2.67f, -3.44f, -3.98f, -8.31f, -4f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-6.08f)
                curveToRelative(1.9f, 0.83f, 3.05f, 2.16f, 3.44f, 4f)
                horizontalLineToRelative(2.65f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _IndianRupeeSign = it}
