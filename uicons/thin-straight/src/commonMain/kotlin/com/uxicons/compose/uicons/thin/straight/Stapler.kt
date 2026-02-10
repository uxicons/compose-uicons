package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stapler: ImageVector? = null

val Icons.Ts.Stapler: ImageVector
    get() = _Stapler ?: UXIcon(name = "Stapler") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.24f, 8.45f)
                lineToRelative(-17.2f, -4.37f)
                curveToRelative(-1.35f, -0.36f, -2.83f, 0.54f, -3.14f, 1.9f)
                lineToRelative(-1.01f, 4.13f)
                lineToRelative(2.1f, 0.5f)
                verticalLineToRelative(4.4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-16f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-8.03f)
                curveToRelative(0f, -1.67f, -1.14f, -3.12f, -2.76f, -3.53f)
                close()
                moveTo(3f, 14f)
                verticalLineToRelative(-3.17f)
                lineToRelative(13f, 3.06f)
                verticalLineToRelative(0.1f)
                horizontalLineToRelative(-13f)
                close()
                moveTo(23f, 19f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-5.01f)
                lineToRelative(6f, 0.01f)
                close()
                moveTo(23f, 13f)
                horizontalLineToRelative(-6.44f)
                lineToRelative(-15.45f, -3.64f)
                lineToRelative(0.77f, -3.15f)
                curveToRelative(0.18f, -0.84f, 1.1f, -1.39f, 1.92f, -1.17f)
                lineToRelative(17.2f, 4.37f)
                curveToRelative(1.18f, 0.29f, 2f, 1.34f, 2f, 2.56f)
                close()
                moveTo(19f, 16.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _Stapler = it}
