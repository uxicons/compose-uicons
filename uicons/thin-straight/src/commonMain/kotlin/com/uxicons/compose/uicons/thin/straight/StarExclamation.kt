package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarExclamation: ImageVector? = null

val Icons.Ts.StarExclamation: ImageVector
    get() = _StarExclamation ?: UXIcon(name = "StarExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 18f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 9f)
                horizontalLineToRelative(-8.48f)
                lineTo(12.49f, 0.37f)
                horizontalLineToRelative(-0.99f)
                lineToRelative(-3.02f, 8.63f)
                lineTo(0f, 9f)
                verticalLineToRelative(0.92f)
                lineToRelative(6.29f, 5.07f)
                lineToRelative(-2.32f, 7.75f)
                lineToRelative(0.79f, 0.6f)
                lineToRelative(4.24f, -2.75f)
                verticalLineToRelative(-1.19f)
                lineToRelative(-3.71f, 2.41f)
                lineToRelative(2.15f, -7.18f)
                lineTo(1.69f, 10f)
                horizontalLineToRelative(7.5f)
                lineTo(12f, 1.99f)
                lineToRelative(2.81f, 8.01f)
                horizontalLineToRelative(7.5f)
                lineToRelative(-5.75f, 4.63f)
                lineToRelative(2.15f, 7.18f)
                lineToRelative(-3.71f, -2.4f)
                verticalLineToRelative(1.19f)
                lineToRelative(4.24f, 2.75f)
                lineToRelative(0.79f, -0.6f)
                lineToRelative(-2.32f, -7.75f)
                lineToRelative(6.29f, -5.07f)
                verticalLineToRelative(-0.92f)
                close()
            }
        }.also { _StarExclamation = it}
