package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Wellbeing: ImageVector? = null

val Icons.Sr.Wellbeing: ImageVector
    get() = _Wellbeing ?: UXIcon(name = "Wellbeing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(21.74f, 17.68f)
                curveToRelative(-0.48f, 0.62f, -0.74f, 1.46f, -0.74f, 2.35f)
                verticalLineToRelative(0.97f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(-0.49f)
                curveToRelative(-2.5f, 0f, -4.63f, -1.87f, -4.96f, -4.34f)
                lineToRelative(-0.22f, -1.66f)
                horizontalLineToRelative(-0.33f)
                curveToRelative(-1.3f, 0f, -2f, -1.03f, -2f, -2f)
                curveToRelative(0f, -1.42f, 2.93f, -7.01f, 4.22f, -8.61f)
                curveToRelative(2.41f, -3.23f, 6.28f, -4.84f, 10.32f, -4.28f)
                curveToRelative(5.0f, 0.69f, 8.95f, 4.84f, 9.41f, 9.88f)
                curveToRelative(0.25f, 2.77f, -0.54f, 5.5f, -2.21f, 7.69f)
                close()
                moveTo(19f, 9.24f)
                curveToRelative(0f, -1.79f, -1.34f, -3.24f, -3f, -3.24f)
                reflectiveCurveToRelative(-3f, 1f, -3f, 1f)
                reflectiveCurveToRelative(-1.34f, -1f, -3f, -1f)
                reflectiveCurveToRelative(-3f, 1.45f, -3f, 3.24f)
                curveToRelative(0f, 2.12f, 2.33f, 4.53f, 4.09f, 6.05f)
                curveToRelative(1.1f, 0.95f, 2.72f, 0.95f, 3.82f, 0f)
                curveToRelative(1.76f, -1.52f, 4.09f, -3.94f, 4.09f, -6.05f)
                close()
            }
        }.also { _Wellbeing = it}
