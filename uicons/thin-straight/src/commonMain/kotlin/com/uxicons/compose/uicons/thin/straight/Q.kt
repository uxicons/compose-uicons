package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Q: ImageVector? = null

val Icons.Ts.Q: ImageVector
    get() = _Q ?: UXIcon(name = "Q") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.02f, 23.31f)
                lineToRelative(-3.15f, -3.15f)
                curveToRelative(1.33f, -1.7f, 2.13f, -3.84f, 2.13f, -6.16f)
                verticalLineToRelative(-4f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                reflectiveCurveTo(2f, 4.49f, 2f, 10f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                curveToRelative(2.83f, 0f, 5.39f, -1.18f, 7.21f, -3.08f)
                lineToRelative(3.1f, 3.1f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                verticalLineToRelative(-4f)
                curveTo(3f, 5.04f, 7.04f, 1f, 12f, 1f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.05f, -0.69f, 3.94f, -1.84f, 5.45f)
                lineToRelative(-3.47f, -3.47f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.53f, 3.53f)
                curveToRelative(-1.64f, 1.72f, -3.95f, 2.79f, -6.51f, 2.79f)
                close()
            }
        }.also { _Q = it}
