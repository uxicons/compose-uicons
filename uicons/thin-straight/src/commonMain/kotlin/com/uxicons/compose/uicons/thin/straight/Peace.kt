package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Peace: ImageVector? = null

val Icons.Ts.Peace: ImageVector
    get() = _Peace ?: UXIcon(name = "Peace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 2.3f, -0.71f, 4.44f, -1.92f, 6.2f)
                lineToRelative(-8.58f, -8.58f)
                lineTo(12.5f, 1.01f)
                curveToRelative(5.83f, 0.26f, 10.5f, 5.09f, 10.5f, 10.99f)
                close()
                moveTo(11.5f, 1.01f)
                verticalLineToRelative(8.57f)
                lineTo(2.9f, 18.18f)
                curveToRelative(-1.2f, -1.76f, -1.9f, -3.89f, -1.9f, -6.18f)
                curveTo(1f, 6.1f, 5.67f, 1.27f, 11.5f, 1.01f)
                close()
                moveTo(3.51f, 18.99f)
                lineToRelative(7.99f, -7.99f)
                verticalLineToRelative(11.99f)
                curveToRelative(-3.21f, -0.14f, -6.07f, -1.67f, -7.99f, -4.0f)
                close()
                moveTo(12.5f, 22.99f)
                verticalLineToRelative(-11.95f)
                lineToRelative(7.97f, 7.97f)
                curveToRelative(-1.92f, 2.32f, -4.77f, 3.83f, -7.97f, 3.98f)
                close()
            }
        }.also { _Peace = it}
