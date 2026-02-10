package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Powerbank: ImageVector? = null

val Icons.Rs.Powerbank: ImageVector
    get() = _Powerbank ?: UXIcon(name = "Powerbank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.78f, 9.65f)
                curveToRelative(0.26f, 0.41f, 0.29f, 0.91f, 0.09f, 1.34f)
                lineToRelative(-2.56f, 4.5f)
                lineToRelative(-1.74f, -0.99f)
                lineToRelative(2.0f, -3.5f)
                horizontalLineToRelative(-2.16f)
                curveToRelative(-0.49f, 0f, -0.94f, -0.25f, -1.19f, -0.67f)
                curveToRelative(-0.26f, -0.42f, -0.28f, -0.93f, -0.06f, -1.36f)
                lineToRelative(2.56f, -4.47f)
                lineToRelative(1.73f, 0.99f)
                lineToRelative(-2.01f, 3.5f)
                horizontalLineToRelative(2.16f)
                curveToRelative(0.48f, 0f, 0.92f, 0.24f, 1.18f, 0.65f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.3f, -0.84f, 2.4f, -2f, 2.82f)
                verticalLineToRelative(7.18f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-19f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7.18f)
                curveToRelative(-1.16f, -0.41f, -2f, -1.51f, -2f, -2.82f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(14f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(12f)
                close()
                moveTo(22f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(6f, 20f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }.also { _Powerbank = it}
