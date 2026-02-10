package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Powerbank: ImageVector? = null

val Icons.Ss.Powerbank: ImageVector
    get() = _Powerbank ?: UXIcon(name = "Powerbank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                verticalLineToRelative(7.18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(19f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7.18f)
                curveToRelative(1.16f, -0.41f, 2f, -1.51f, 2f, -2.82f)
                verticalLineToRelative(-4f)
                close()
                moveTo(10f, 21f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(10.87f, 10.99f)
                lineTo(8.3f, 15.5f)
                lineTo(6.57f, 14.51f)
                lineTo(8.57f, 11.0f)
                horizontalLineToRelative(-2.16f)
                curveToRelative(-0.49f, 0f, -0.94f, -0.25f, -1.19f, -0.67f)
                curveToRelative(-0.26f, -0.42f, -0.28f, -0.93f, -0.06f, -1.36f)
                lineToRelative(2.56f, -4.47f)
                lineToRelative(1.73f, 0.99f)
                lineToRelative(-2.01f, 3.5f)
                horizontalLineToRelative(2.16f)
                curveToRelative(0.48f, 0f, 0.92f, 0.24f, 1.18f, 0.65f)
                reflectiveCurveToRelative(0.29f, 0.91f, 0.09f, 1.34f)
                close()
            }
        }.also { _Powerbank = it}
