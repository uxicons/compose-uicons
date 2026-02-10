package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crane: ImageVector? = null

val Icons.Ts.Crane: ImageVector
    get() = _Crane ?: UXIcon(name = "Crane") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                verticalLineToRelative(-1.34f)
                lineToRelative(-16.82f, -6.66f)
                horizontalLineToRelative(-0.72f)
                lineToRelative(-6.46f, 6.8f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(8.04f)
                curveToRelative(0f, 0.92f, 0.46f, 1.74f, 1.21f, 2.14f)
                curveToRelative(0.49f, 0.26f, 0.79f, 0.77f, 0.79f, 1.32f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.92f, -0.51f, -1.77f, -1.32f, -2.2f)
                curveToRelative(-0.41f, -0.22f, -0.68f, -0.72f, -0.68f, -1.26f)
                verticalLineToRelative(-8.04f)
                close()
                moveTo(6.89f, 1f)
                lineTo(22.14f, 7f)
                horizontalLineToRelative(-20.95f)
                close()
                moveTo(10f, 21.79f)
                lineTo(6.21f, 18f)
                lineTo(10f, 14.21f)
                close()
                moveTo(6f, 16.79f)
                verticalLineToRelative(-7.59f)
                lineToRelative(3.79f, 3.79f)
                close()
                moveTo(6f, 19.21f)
                lineTo(9.79f, 23f)
                horizontalLineToRelative(-3.79f)
                close()
                moveTo(10f, 11.79f)
                lineTo(6.21f, 8f)
                horizontalLineToRelative(3.79f)
                close()
            }
        }.also { _Crane = it}
