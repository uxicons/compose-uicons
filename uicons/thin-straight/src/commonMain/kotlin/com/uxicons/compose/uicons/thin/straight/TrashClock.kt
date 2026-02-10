package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashClock: ImageVector? = null

val Icons.Ts.TrashClock: ImageVector
    get() = _TrashClock ?: UXIcon(name = "TrashClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.03f, 23f)
                horizontalLineToRelative(-5.19f)
                curveToRelative(-0.77f, 0f, -1.41f, -0.58f, -1.49f, -1.34f)
                lineTo(2.56f, 5f)
                horizontalLineToRelative(16.89f)
                lineToRelative(-0.45f, 4.14f)
                curveToRelative(0.33f, 0.06f, 0.66f, 0.13f, 0.98f, 0.23f)
                lineToRelative(0.48f, -4.37f)
                horizontalLineToRelative(1.55f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                lineTo(0f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.55f)
                lineToRelative(1.8f, 16.77f)
                curveToRelative(0.14f, 1.27f, 1.21f, 2.23f, 2.48f, 2.23f)
                horizontalLineToRelative(6.19f)
                curveToRelative(-0.36f, -0.3f, -0.7f, -0.64f, -1.0f, -1f)
                close()
                moveTo(7f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(7f, 4f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 23f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(18f, 17.29f)
                lineToRelative(1.85f, 1.85f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.15f, -2.15f)
                verticalLineToRelative(-3.21f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.79f)
                close()
            }
        }.also { _TrashClock = it}
