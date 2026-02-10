package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlbumCirclePlus: ImageVector? = null

val Icons.Sr.AlbumCirclePlus: ImageVector
    get() = _AlbumCirclePlus ?: UXIcon(name = "AlbumCirclePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 19f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(12.02f, 6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(12.02f, 13.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(14.02f, 20f)
                curveToRelative(0f, -0.09f, 0.01f, -0.18f, 0.02f, -0.27f)
                curveToRelative(-1.62f, 0.42f, -3.41f, 0.41f, -5.32f, -0.51f)
                curveToRelative(-2.65f, -1.27f, -4.53f, -3.87f, -4.68f, -6.8f)
                curveToRelative(-0.25f, -4.73f, 3.65f, -8.64f, 8.38f, -8.41f)
                curveToRelative(2.93f, 0.14f, 5.54f, 2.02f, 6.82f, 4.66f)
                curveToRelative(0.93f, 1.91f, 0.94f, 3.7f, 0.53f, 5.32f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.64f, -0.05f, 3.13f, 0.54f, 4.25f, 1.55f)
                lineTo(24.03f, 5f)
                curveTo(24.02f, 2.24f, 21.78f, 0f, 19.02f, 0f)
                lineTo(5.02f, 0f)
                curveTo(2.26f, 0f, 0.02f, 2.24f, 0.02f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                lineTo(15.55f, 24f)
                curveToRelative(-0.95f, -1.06f, -1.54f, -2.46f, -1.54f, -4f)
                close()
            }
        }.also { _AlbumCirclePlus = it}
