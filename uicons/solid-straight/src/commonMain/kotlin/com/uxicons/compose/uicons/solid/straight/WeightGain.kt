package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WeightGain: ImageVector? = null

val Icons.Ss.WeightGain: ImageVector
    get() = _WeightGain ?: UXIcon(name = "WeightGain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(19f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.45f)
                lineToRelative(2.69f, -2.69f)
                curveToRelative(0.42f, -0.42f, 1.09f, -0.42f, 1.51f, 0f)
                lineToRelative(2.69f, 2.69f)
                close()
                moveTo(12.73f, 24f)
                horizontalLineToRelative(-12.73f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2.69f)
                curveToRelative(-0.43f, 0.91f, -0.69f, 1.93f, -0.69f, 3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.07f, -0.25f, -2.09f, -0.69f, -3f)
                horizontalLineToRelative(2.69f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7.73f)
                curveToRelative(-1.47f, -1.67f, -3.61f, -2.73f, -6f, -2.73f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                curveToRelative(0f, 2.39f, 1.06f, 4.53f, 2.73f, 6f)
                close()
                moveTo(9.84f, 7f)
                horizontalLineToRelative(-2.84f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.91f)
                lineToRelative(1.8f, -3.55f)
                lineToRelative(-1.78f, -0.91f)
                lineToRelative(-2.27f, 4.45f)
                close()
            }
        }.also { _WeightGain = it}
