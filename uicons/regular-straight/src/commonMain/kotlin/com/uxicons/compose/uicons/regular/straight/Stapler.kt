package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stapler: ImageVector? = null

val Icons.Rs.Stapler: ImageVector
    get() = _Stapler ?: UXIcon(name = "Stapler") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.86f, 7.1f)
                lineToRelative(-15.99f, -4.01f)
                curveToRelative(-1.61f, -0.43f, -3.38f, 0.64f, -3.74f, 2.27f)
                lineToRelative(-1.12f, 4.6f)
                lineToRelative(2.0f, 0.51f)
                verticalLineToRelative(4.52f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-8.86f)
                curveToRelative(0f, -1.9f, -1.29f, -3.55f, -3.14f, -4.01f)
                close()
                moveTo(4f, 10.97f)
                lineTo(11.93f, 12.98f)
                horizontalLineToRelative(-7.93f)
                close()
                moveTo(22f, 17.98f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4.02f)
                lineToRelative(5f, 0.02f)
                close()
                moveTo(22f, 11.98f)
                horizontalLineToRelative(-5.88f)
                lineToRelative(-13.71f, -3.48f)
                lineToRelative(0.65f, -2.67f)
                curveToRelative(0.13f, -0.57f, 0.75f, -0.95f, 1.32f, -0.8f)
                lineToRelative(15.99f, 4.01f)
                curveToRelative(0.95f, 0.24f, 1.62f, 1.09f, 1.62f, 2.07f)
                verticalLineToRelative(0.86f)
                close()
                moveTo(18f, 15.98f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _Stapler = it}
