package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UrbanPlanning: ImageVector? = null

val Icons.Bs.UrbanPlanning: ImageVector
    get() = _UrbanPlanning ?: UXIcon(name = "UrbanPlanning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 21f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.66f)
                verticalLineToRelative(5.77f)
                curveToRelative(-0.41f, 0.2f, -0.8f, 0.45f, -1.14f, 0.79f)
                lineToRelative(-1.86f, 1.86f)
                verticalLineToRelative(-6.09f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-9f)
                close()
                moveTo(23.36f, 13.64f)
                curveToRelative(-0.85f, -0.85f, -2.23f, -0.85f, -3.09f, 0f)
                lineToRelative(-7.28f, 7.28f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(3.09f)
                lineToRelative(7.28f, -7.28f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
                close()
                moveTo(11f, 9.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.59f)
                lineToRelative(-1.91f, 1.91f)
                horizontalLineToRelative(-8.09f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(9f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(9f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _UrbanPlanning = it}
