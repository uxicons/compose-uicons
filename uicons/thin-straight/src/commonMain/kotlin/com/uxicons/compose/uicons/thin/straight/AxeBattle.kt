package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AxeBattle: ImageVector? = null

val Icons.Ts.AxeBattle: ImageVector
    get() = _AxeBattle ?: UXIcon(name = "AxeBattle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.39f, 0.64f)
                lineToRelative(-0.35f, -0.34f)
                lineToRelative(-0.35f, 0.34f)
                curveToRelative(-2.08f, 2.03f, -4.61f, 3.21f, -7.19f, 3.34f)
                verticalLineToRelative(-1.99f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1.99f)
                curveToRelative(-2.58f, -0.14f, -5.11f, -1.31f, -7.19f, -3.34f)
                lineToRelative(-0.35f, -0.34f)
                lineToRelative(-0.35f, 0.34f)
                curveTo(1.45f, 2.76f, 0f, 6.52f, 0f, 10.01f)
                reflectiveCurveToRelative(1.45f, 7.24f, 3.61f, 9.35f)
                lineToRelative(0.35f, 0.34f)
                lineToRelative(0.35f, -0.34f)
                curveToRelative(2.08f, -2.03f, 4.61f, -3.21f, 7.19f, -3.34f)
                verticalLineToRelative(7.99f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7.99f)
                curveToRelative(2.58f, 0.14f, 5.11f, 1.31f, 7.19f, 3.34f)
                lineToRelative(0.35f, 0.34f)
                lineToRelative(0.35f, -0.34f)
                curveToRelative(2.16f, -2.11f, 3.61f, -5.87f, 3.61f, -9.35f)
                reflectiveCurveToRelative(-1.45f, -7.25f, -3.61f, -9.37f)
                close()
                moveTo(3.98f, 18.3f)
                curveToRelative(-1.79f, -1.99f, -2.98f, -5.25f, -2.98f, -8.29f)
                curveTo(1f, 7.01f, 2.21f, 3.67f, 3.98f, 1.71f)
                curveToRelative(2.2f, 2.0f, 4.83f, 3.16f, 7.52f, 3.28f)
                verticalLineToRelative(10.03f)
                curveToRelative(-2.69f, 0.13f, -5.33f, 1.28f, -7.52f, 3.28f)
                close()
                moveTo(20.02f, 18.3f)
                curveToRelative(-2.2f, -2.0f, -4.83f, -3.16f, -7.52f, -3.28f)
                lineTo(12.5f, 4.99f)
                curveToRelative(2.69f, -0.13f, 5.33f, -1.28f, 7.52f, -3.28f)
                curveToRelative(1.77f, 1.97f, 2.98f, 5.3f, 2.98f, 8.3f)
                curveToRelative(0f, 3.04f, -1.18f, 6.3f, -2.98f, 8.29f)
                close()
            }
        }.also { _AxeBattle = it}
