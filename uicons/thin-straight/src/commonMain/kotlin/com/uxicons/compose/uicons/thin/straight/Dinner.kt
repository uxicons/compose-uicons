package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dinner: ImageVector? = null

val Icons.Ts.Dinner: ImageVector
    get() = _Dinner ?: UXIcon(name = "Dinner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 17.64f)
                verticalLineToRelative(1.49f)
                curveToRelative(-1.8f, 1.77f, -4.28f, 2.87f, -7f, 2.87f)
                curveTo(4.49f, 22f, 0f, 17.51f, 0f, 12f)
                reflectiveCurveTo(4.49f, 2f, 10f, 2f)
                curveToRelative(1.44f, 0f, 2.81f, 0.31f, 4.05f, 0.86f)
                curveToRelative(-0.13f, 0.31f, -0.24f, 0.63f, -0.35f, 0.94f)
                curveToRelative(-1.13f, -0.51f, -2.38f, -0.81f, -3.7f, -0.81f)
                curveTo(5.04f, 3f, 1f, 7.04f, 1f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                curveToRelative(2.83f, 0f, 5.35f, -1.31f, 7f, -3.36f)
                close()
                moveTo(20f, 11.95f)
                verticalLineToRelative(12.05f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-12.05f)
                curveToRelative(-2.24f, -0.25f, -4f, -2.14f, -4f, -4.45f)
                curveToRelative(0f, -2.23f, 1.72f, -7.5f, 4.42f, -7.5f)
                curveToRelative(2.75f, 0f, 4.58f, 5.34f, 4.58f, 7.5f)
                curveToRelative(0f, 2.31f, -1.76f, 4.2f, -4f, 4.45f)
                close()
                moveTo(23f, 7.5f)
                curveToRelative(0f, -2.04f, -1.8f, -6.5f, -3.58f, -6.5f)
                curveToRelative(-1.77f, 0f, -3.42f, 4.47f, -3.42f, 6.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
                moveTo(9.5f, 11.79f)
                lineToRelative(-3.35f, 3.35f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.65f, -3.65f)
                verticalLineToRelative(-6.21f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5.79f)
                close()
            }
        }.also { _Dinner = it}
