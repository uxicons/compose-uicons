package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CitrusSlice: ImageVector? = null

val Icons.Sr.CitrusSlice: ImageVector
    get() = _CitrusSlice ?: UXIcon(name = "CitrusSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.93f, 1.79f)
                curveToRelative(-0.58f, -0.98f, -1.57f, -1.62f, -2.71f, -1.76f)
                curveToRelative(-1.16f, -0.14f, -2.29f, 0.25f, -3.11f, 1.07f)
                lineToRelative(-6.91f, 6.91f)
                horizontalLineToRelative(11.79f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-9.59f)
                lineToRelative(6.79f, 6.79f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-6.79f, -6.79f)
                verticalLineToRelative(9.59f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-11.79f)
                lineToRelative(-6.91f, 6.91f)
                curveToRelative(-0.82f, 0.82f, -1.21f, 1.96f, -1.07f, 3.11f)
                curveToRelative(0.14f, 1.14f, 0.78f, 2.12f, 1.76f, 2.71f)
                curveToRelative(2.34f, 1.4f, 4.94f, 2.08f, 7.52f, 2.08f)
                curveToRelative(3.8f, 0f, 7.55f, -1.47f, 10.39f, -4.31f)
                curveToRelative(4.76f, -4.77f, 5.68f, -12.13f, 2.23f, -17.91f)
                close()
            }
        }.also { _CitrusSlice = it}
