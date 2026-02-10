package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrandStrategy: ImageVector? = null

val Icons.Ss.BrandStrategy: ImageVector
    get() = _BrandStrategy ?: UXIcon(name = "BrandStrategy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-19f)
                close()
                moveTo(3f, 8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(6f, 20f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -6.19f, 2.81f, -8.65f, 5.28f, -10.83f)
                curveToRelative(0.53f, -0.47f, 1.04f, -0.91f, 1.51f, -1.38f)
                lineToRelative(-1.79f, -1.79f)
                horizontalLineToRelative(3.75f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(3.75f)
                lineToRelative(-1.79f, -1.79f)
                curveToRelative(-0.52f, 0.52f, -1.07f, 1.0f, -1.6f, 1.47f)
                curveToRelative(-2.37f, 2.08f, -4.6f, 4.04f, -4.6f, 9.32f)
                close()
                moveTo(15.01f, 18.59f)
                lineTo(13.59f, 20.01f)
                lineTo(12f, 18.41f)
                lineTo(10.41f, 20.01f)
                lineTo(8.99f, 18.59f)
                lineTo(10.59f, 17f)
                lineTo(8.99f, 15.41f)
                lineTo(10.41f, 13.99f)
                lineTo(12f, 15.59f)
                lineTo(13.59f, 13.99f)
                lineTo(15.01f, 15.41f)
                lineTo(13.41f, 17f)
                close()
                moveTo(24f, 22f)
                lineTo(22f, 24f)
                lineTo(20f, 22f)
                verticalLineToRelative(-20f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _BrandStrategy = it}
