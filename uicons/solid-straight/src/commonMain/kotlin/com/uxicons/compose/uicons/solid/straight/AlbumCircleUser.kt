package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlbumCircleUser: ImageVector? = null

val Icons.Ss.AlbumCircleUser: ImageVector
    get() = _AlbumCircleUser ?: UXIcon(name = "AlbumCircleUser") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(0.95f, 0f, 1.84f, -0.23f, 2.63f, -0.62f)
                curveToRelative(-0.39f, -0.71f, -0.63f, -1.52f, -0.63f, -2.38f)
                curveToRelative(0f, -2.31f, 1.58f, -4.24f, 3.72f, -4.81f)
                curveToRelative(-0.77f, -2.42f, -3.04f, -4.19f, -5.72f, -4.19f)
                close()
                moveTo(12f, 13.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(12f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(24f, 15f)
                curveToRelative(0f, -2.5f, -1.85f, -4.56f, -4.24f, -4.92f)
                curveToRelative(-0.86f, -3.48f, -4.01f, -6.08f, -7.76f, -6.08f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                curveToRelative(0.15f, 0f, 0.29f, -0.01f, 0.44f, -0.02f)
                curveToRelative(-0.28f, 0.62f, -0.44f, 1.3f, -0.44f, 2.02f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 24f)
                lineTo(14f, 24f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                close()
                moveTo(19f, 18f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _AlbumCircleUser = it}
