package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerHome: ImageVector? = null

val Icons.Sr.MapMarkerHome: ImageVector
    get() = _MapMarkerHome ?: UXIcon(name = "MapMarkerHome", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(422.05f, 69.43f)
                curveToRelative(-91.07f, -91.92f, -239.4f, -92.61f, -331.32f, -1.54f)
                reflectiveCurveToRelative(-92.61f, 239.4f, -1.54f, 331.32f)
                curveToRelative(0.71f, 0.72f, 1.42f, 1.43f, 2.14f, 2.13f)
                lineToRelative(83.98f, 77.55f)
                curveToRelative(44.89f, 43.94f, 116.6f, 44.13f, 161.72f, 0.43f)
                lineToRelative(85.02f, -78.57f)
                curveTo(513.54f, 309.25f, 513.54f, 160.92f, 422.05f, 69.43f)
                lineTo(422.05f, 69.43f)
                close()
                moveTo(384.18f, 288.33f)
                curveToRelative(0f, 29.41f, -23.84f, 53.25f, -53.25f, 53.25f)
                horizontalLineTo(181.85f)
                curveToRelative(-29.41f, 0f, -53.25f, -23.84f, -53.25f, -53.25f)
                verticalLineToRelative(-71.82f)
                curveToRelative(0f, -20.95f, 10.27f, -40.56f, 27.48f, -52.5f)
                lineToRelative(63.9f, -44.32f)
                curveToRelative(21.92f, -15.15f, 50.92f, -15.15f, 72.84f, 0f)
                lineToRelative(63.9f, 44.32f)
                curveToRelative(17.21f, 11.94f, 27.48f, 31.56f, 27.48f, 52.5f)
                verticalLineTo(288.33f)
                close()
                moveTo(341.58f, 216.51f)
                verticalLineToRelative(71.82f)
                curveToRelative(0f, 5.88f, -4.77f, 10.65f, -10.65f, 10.65f)
                horizontalLineToRelative(-31.95f)
                verticalLineToRelative(-42.6f)
                curveToRelative(0f, -11.76f, -9.54f, -21.3f, -21.3f, -21.3f)
                horizontalLineToRelative(-42.6f)
                curveToRelative(-11.76f, 0f, -21.3f, 9.54f, -21.3f, 21.3f)
                verticalLineToRelative(42.6f)
                horizontalLineToRelative(-31.95f)
                curveToRelative(-5.88f, 0f, -10.65f, -4.77f, -10.65f, -10.65f)
                verticalLineToRelative(-71.82f)
                curveToRelative(-0f, -6.98f, 3.42f, -13.53f, 9.16f, -17.51f)
                lineToRelative(63.9f, -44.32f)
                curveToRelative(7.31f, -5.03f, 16.97f, -5.03f, 24.28f, 0f)
                lineToRelative(63.9f, 44.32f)
                curveTo(338.16f, 202.99f, 341.59f, 209.53f, 341.58f, 216.51f)
                close()
            }
        }.also { _MapMarkerHome = it}
