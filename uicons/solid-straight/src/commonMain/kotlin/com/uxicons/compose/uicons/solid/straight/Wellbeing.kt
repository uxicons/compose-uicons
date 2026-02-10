package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wellbeing: ImageVector? = null

val Icons.Ss.Wellbeing: ImageVector
    get() = _Wellbeing ?: UXIcon(name = "Wellbeing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.95f, 9.98f)
                curveToRelative(-0.46f, -5.04f, -4.41f, -9.19f, -9.41f, -9.88f)
                curveToRelative(-4.04f, -0.56f, -7.91f, 1.06f, -10.32f, 4.28f)
                curveToRelative(-1.44f, 1.74f, -2.97f, 5.59f, -4.22f, 8.4f)
                verticalLineToRelative(2.21f)
                horizontalLineToRelative(2.33f)
                lineToRelative(0.45f, 3.39f)
                curveToRelative(0.2f, 1.49f, 1.48f, 2.61f, 2.97f, 2.61f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-4.71f)
                curveToRelative(0f, -0.46f, 0.16f, -0.91f, 0.46f, -1.26f)
                curveToRelative(1.88f, -2.25f, 2.76f, -5.11f, 2.5f, -8.04f)
                close()
                moveTo(13f, 16.8f)
                reflectiveCurveToRelative(-6f, -4.17f, -6f, -7.56f)
                curveToRelative(0f, -1.79f, 1.34f, -3.24f, 3f, -3.24f)
                reflectiveCurveToRelative(3f, 1f, 3f, 1f)
                reflectiveCurveToRelative(1.34f, -1f, 3f, -1f)
                reflectiveCurveToRelative(3f, 1.45f, 3f, 3.24f)
                curveToRelative(0f, 3.39f, -6f, 7.56f, -6f, 7.56f)
                close()
                moveTo(14f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Wellbeing = it}
