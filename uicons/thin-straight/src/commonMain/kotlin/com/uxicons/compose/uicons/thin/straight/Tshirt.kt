package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tshirt: ImageVector? = null

val Icons.Ts.Tshirt: ImageVector
    get() = _Tshirt ?: UXIcon(name = "Tshirt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6.14f)
                curveToRelative(0f, -2.12f, -1.12f, -4.03f, -2.92f, -5f)
                curveToRelative(-1.4f, -0.75f, -2.88f, -1.14f, -4.39f, -1.14f)
                lineTo(7.31f, 0f)
                curveToRelative(-1.51f, 0f, -2.98f, 0.38f, -4.39f, 1.14f)
                curveTo(1.12f, 2.1f, 0f, 4.02f, 0f, 6.14f)
                verticalLineToRelative(4.89f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(12.98f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4.86f)
                close()
                moveTo(15.46f, 1f)
                curveToRelative(-0.24f, 1.69f, -1.7f, 3f, -3.46f, 3f)
                reflectiveCurveToRelative(-3.22f, -1.31f, -3.46f, -3f)
                horizontalLineToRelative(6.93f)
                close()
                moveTo(23f, 10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(16f)
                lineTo(5f, 23f)
                lineTo(5f, 7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3.02f)
                lineTo(1f, 10.02f)
                verticalLineToRelative(-3.89f)
                curveToRelative(0f, -1.75f, 0.92f, -3.33f, 2.4f, -4.12f)
                curveToRelative(1.26f, -0.67f, 2.57f, -1.02f, 3.92f, -1.02f)
                horizontalLineToRelative(0.22f)
                curveToRelative(0.25f, 2.25f, 2.16f, 4f, 4.47f, 4f)
                reflectiveCurveToRelative(4.22f, -1.75f, 4.47f, -4f)
                horizontalLineToRelative(0.22f)
                curveToRelative(1.34f, 0f, 2.66f, 0.34f, 3.92f, 1.02f)
                curveToRelative(1.48f, 0.79f, 2.4f, 2.37f, 2.4f, 4.12f)
                verticalLineToRelative(3.86f)
                close()
            }
        }.also { _Tshirt = it}
