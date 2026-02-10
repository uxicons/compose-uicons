package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartLock: ImageVector? = null

val Icons.Ts.HeartLock: ImageVector
    get() = _HeartLock ?: UXIcon(name = "HeartLock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 7.05f)
                verticalLineToRelative(-2.05f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveTo(7f, 2.24f, 7f, 5f)
                verticalLineToRelative(2.05f)
                curveToRelative(-2.52f, 0.26f, -4.5f, 2.36f, -4.5f, 4.95f)
                curveToRelative(0f, 5.08f, 6.45f, 9.79f, 9.23f, 11.58f)
                lineToRelative(0.27f, 0.17f)
                lineToRelative(0.27f, -0.17f)
                curveToRelative(2.17f, -1.4f, 9.23f, -6.38f, 9.23f, -11.58f)
                curveToRelative(0f, -2.59f, -1.98f, -4.69f, -4.5f, -4.95f)
                close()
                moveTo(12f, 1f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(2.03f)
                curveToRelative(-1.76f, 0.18f, -3.26f, 1.26f, -4f, 2.79f)
                curveToRelative(-0.74f, -1.53f, -2.24f, -2.61f, -4f, -2.79f)
                verticalLineToRelative(-2.03f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
                moveTo(12f, 22.56f)
                curveToRelative(-2.32f, -1.53f, -8.5f, -6.04f, -8.5f, -10.56f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.8f, 4f, 4.0f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -2.21f, 1.79f, -4.0f, 4f, -4.0f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 3.65f, -4.34f, 7.81f, -8.5f, 10.56f)
                close()
                moveTo(11.5f, 13.87f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.27f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.27f)
                close()
            }
        }.also { _HeartLock = it}
