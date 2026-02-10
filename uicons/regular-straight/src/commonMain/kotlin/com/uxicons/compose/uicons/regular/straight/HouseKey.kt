package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseKey: ImageVector? = null

val Icons.Rs.HouseKey: ImageVector
    get() = _HouseKey ?: UXIcon(name = "HouseKey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.27f, 12.75f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
                curveToRelative(-0.59f, 0.59f, -1.54f, 0.59f, -2.12f, 0f)
                reflectiveCurveToRelative(-0.59f, -1.54f, 0f, -2.12f)
                curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0f)
                close()
                moveTo(22.39f, 18.4f)
                curveToRelative(-1.17f, 1.17f, -2.79f, 1.74f, -4.41f, 1.58f)
                lineToRelative(-4.01f, 4.01f)
                horizontalLineToRelative(-4.94f)
                reflectiveCurveToRelative(-0.02f, -5.49f, -0.02f, -5.49f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.01f, -2f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(-0.39f)
                curveToRelative(-0.6f, -1.96f, -0.09f, -4.05f, 1.35f, -5.5f)
                curveToRelative(2.15f, -2.15f, 5.63f, -2.15f, 7.78f, 0f)
                reflectiveCurveToRelative(2.15f, 5.63f, 0f, 7.78f)
                close()
                moveTo(20.98f, 12.04f)
                curveToRelative(-1.36f, -1.36f, -3.58f, -1.36f, -4.95f, 0f)
                curveToRelative(-0.99f, 0.98f, -1.27f, 2.45f, -0.77f, 3.76f)
                verticalLineToRelative(2.72f)
                horizontalLineToRelative(-2.27f)
                lineToRelative(-0.01f, 2f)
                horizontalLineToRelative(-1.97f)
                lineToRelative(0.01f, 1.49f)
                horizontalLineToRelative(2.12f)
                reflectiveCurveToRelative(4.16f, -4.16f, 4.16f, -4.16f)
                lineToRelative(0.52f, 0.1f)
                curveToRelative(1.15f, 0.23f, 2.33f, -0.13f, 3.16f, -0.96f)
                curveToRelative(1.36f, -1.36f, 1.36f, -3.58f, 0f, -4.95f)
                close()
                moveTo(2f, 10.04f)
                curveToRelative(0f, -0.31f, 0.14f, -0.6f, 0.38f, -0.79f)
                lineTo(11.38f, 2.21f)
                curveToRelative(0.36f, -0.28f, 0.87f, -0.28f, 1.23f, 0f)
                lineToRelative(6.13f, 4.8f)
                curveToRelative(2.02f, 0.07f, 3.84f, 0.93f, 5.15f, 2.29f)
                curveToRelative(-0.16f, -0.64f, -0.52f, -1.21f, -1.05f, -1.63f)
                lineTo(13.85f, 0.64f)
                curveToRelative(-1.09f, -0.85f, -2.61f, -0.85f, -3.7f, 0f)
                lineTo(1.15f, 7.68f)
                curveTo(0.42f, 8.25f, 0f, 9.11f, 0f, 10.04f)
                verticalLineToRelative(13.96f)
                lineTo(7f, 24f)
                verticalLineToRelative(-2f)
                lineTo(2f, 22f)
                lineTo(2f, 10.04f)
                close()
            }
        }.also { _HouseKey = it}
