package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Starfighter: ImageVector? = null

val Icons.Sc.Starfighter: ImageVector
    get() = _Starfighter ?: UXIcon(name = "Starfighter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.02f, 8.78f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.95f, 0.01f, -3.64f, 1.17f, -4.34f, 2.99f)
                verticalLineToRelative(8.53f)
                curveToRelative(0f, 0.4f, 0.23f, 0.75f, 0.59f, 0.91f)
                curveToRelative(0.06f, 0.03f, 1.57f, 0.69f, 3.75f, 0.69f)
                curveToRelative(2.2f, 0f, 3.69f, -0.66f, 3.75f, -0.69f)
                curveToRelative(0.36f, -0.16f, 0.59f, -0.52f, 0.59f, -0.91f)
                verticalLineTo(11.77f)
                curveToRelative(-0.71f, -1.82f, -2.39f, -2.98f, -4.33f, -2.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 6.78f)
                horizontalLineToRelative(0.02f)
                curveToRelative(1.63f, 0f, 3.13f, 0.57f, 4.3f, 1.57f)
                curveToRelative(-0.34f, -4.74f, -3.8f, -6.13f, -3.96f, -6.19f)
                curveToRelative(-0.23f, -0.09f, -0.49f, -0.09f, -0.72f, 0.0f)
                curveToRelative(-0.15f, 0.06f, -3.61f, 1.47f, -3.95f, 6.2f)
                curveToRelative(1.17f, -1f, 2.68f, -1.58f, 4.31f, -1.58f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.66f, 10.27f)
                curveToRelative(-0.07f, -0.0f, -0.15f, -0.0f, -0.23f, -0.0f)
                curveToRelative(-0.94f, 0f, -1.77f, 0.18f, -2.43f, 0.39f)
                verticalLineToRelative(-2.71f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                curveToRelative(0.4f, 0f, 0.75f, -0.24f, 0.91f, -0.58f)
                lineToRelative(2.75f, 1.91f)
                verticalLineTo(10.27f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6.94f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.71f)
                curveToRelative(-0.66f, -0.21f, -1.49f, -0.39f, -2.43f, -0.39f)
                curveToRelative(-0.08f, 0f, -0.15f, 0.0f, -0.23f, 0.0f)
                verticalLineToRelative(9.51f)
                lineToRelative(2.75f, -1.91f)
                curveToRelative(0.16f, 0.34f, 0.51f, 0.58f, 0.91f, 0.58f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(7.94f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Starfighter = it}
