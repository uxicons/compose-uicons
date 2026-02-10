package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndianRupeeSign: ImageVector? = null

val Icons.Rc.IndianRupeeSign: ImageVector
    get() = _IndianRupeeSign ?: UXIcon(name = "IndianRupeeSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 5.55f, -4.46f, 6.76f, -8.46f, 6.97f)
                curveToRelative(3.04f, 2.0f, 5.43f, 4.11f, 7.25f, 6.41f)
                curveToRelative(0.34f, 0.43f, 0.27f, 1.06f, -0.16f, 1.41f)
                curveToRelative(-0.43f, 0.34f, -1.06f, 0.27f, -1.41f, -0.16f)
                curveToRelative(-2.22f, -2.81f, -5.4f, -5.34f, -9.7f, -7.75f)
                curveToRelative(-0.4f, -0.22f, -0.6f, -0.69f, -0.48f, -1.13f)
                curveToRelative(0.12f, -0.44f, 0.51f, -0.75f, 0.97f, -0.75f)
                horizontalLineToRelative(0.0f)
                lineToRelative(2.0f, 0.01f)
                curveToRelative(7.03f, 0f, 8.0f, -2.41f, 8.0f, -5.01f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(9.68f)
                curveToRelative(-0.65f, -1.7f, -2.55f, -2.98f, -7.69f, -3f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4.09f)
                curveToRelative(0.87f, 0.72f, 1.53f, 1.69f, 1.86f, 3f)
                horizontalLineToRelative(2.24f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _IndianRupeeSign = it}
