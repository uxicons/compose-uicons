package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MeasuringTape: ImageVector? = null

val Icons.Ts.MeasuringTape: ImageVector
    get() = _MeasuringTape ?: UXIcon(name = "MeasuringTape") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 9f)
                curveToRelative(2.24f, 0f, 4.5f, -0.69f, 4.5f, -2f)
                curveToRelative(0f, -2.63f, -9f, -2.63f, -9f, 0f)
                curveToRelative(0f, 1.31f, 2.26f, 2f, 4.5f, 2f)
                close()
                moveTo(9.5f, 6f)
                curveToRelative(2.27f, 0f, 3.5f, 0.71f, 3.5f, 1f)
                reflectiveCurveToRelative(-1.23f, 1f, -3.5f, 1f)
                reflectiveCurveToRelative(-3.5f, -0.71f, -3.5f, -1f)
                reflectiveCurveToRelative(1.23f, -1f, 3.5f, -1f)
                close()
                moveTo(19f, 12f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -3.31f, -4.26f, -6f, -9.5f, -6f)
                curveTo(4.53f, 1f, 0.45f, 3.42f, 0.04f, 6.5f)
                horizontalLineToRelative(-0.04f)
                verticalLineToRelative(11.29f)
                curveToRelative(0f, 2.92f, 3.9f, 5.21f, 8.88f, 5.21f)
                horizontalLineToRelative(15.12f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(18f, 12f)
                horizontalLineToRelative(-3.26f)
                curveToRelative(1.39f, -0.58f, 2.51f, -1.39f, 3.26f, -2.34f)
                verticalLineToRelative(2.34f)
                close()
                moveTo(9.5f, 2f)
                curveToRelative(4.69f, 0f, 8.5f, 2.24f, 8.5f, 5f)
                reflectiveCurveToRelative(-3.81f, 5f, -8.5f, 5f)
                reflectiveCurveTo(1f, 9.76f, 1f, 7f)
                reflectiveCurveTo(4.81f, 2f, 9.5f, 2f)
                close()
                moveTo(23f, 22f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2.12f)
                curveToRelative(-0.3f, 0f, -0.59f, -0.01f, -0.88f, -0.03f)
                verticalLineToRelative(-4.97f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4.87f)
                curveToRelative(-3.4f, -0.47f, -6f, -2.14f, -6f, -4.08f)
                verticalLineToRelative(-8.12f)
                curveToRelative(1.56f, 1.97f, 4.78f, 3.34f, 8.5f, 3.34f)
                horizontalLineToRelative(13.5f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _MeasuringTape = it}
