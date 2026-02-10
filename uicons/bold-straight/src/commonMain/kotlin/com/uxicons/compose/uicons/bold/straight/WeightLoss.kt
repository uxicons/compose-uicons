package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WeightLoss: ImageVector? = null

val Icons.Bs.WeightLoss: ImageVector
    get() = _WeightLoss ?: UXIcon(name = "WeightLoss") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5.5f)
                verticalLineToRelative(6.53f)
                curveToRelative(-0.81f, -0.96f, -1.84f, -1.74f, -3f, -2.27f)
                verticalLineToRelative(-4.26f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.59f)
                curveToRelative(0.06f, 0.33f, 0.09f, 0.66f, 0.09f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5.3f)
                lineToRelative(1.7f, -3.66f)
                lineToRelative(-2.68f, -1.34f)
                lineToRelative(-2.43f, 5f)
                horizontalLineToRelative(-3.29f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.34f, 0.04f, -0.67f, 0.09f, -1f)
                horizontalLineToRelative(-2.59f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(6.76f)
                curveToRelative(0.53f, 1.16f, 1.3f, 2.19f, 2.27f, 3f)
                horizontalLineToRelative(-12.03f)
                verticalLineToRelative(-18.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(4.04f)
                curveToRelative(1.1f, -1.22f, 2.69f, -2f, 4.46f, -2f)
                reflectiveCurveToRelative(3.36f, 0.78f, 4.46f, 2f)
                horizontalLineToRelative(4.04f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
                close()
                moveTo(22f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                lineToRelative(3.79f, 3.71f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                close()
            }
        }.also { _WeightLoss = it}
