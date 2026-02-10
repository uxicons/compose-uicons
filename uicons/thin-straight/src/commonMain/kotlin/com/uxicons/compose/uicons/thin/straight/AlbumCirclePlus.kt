package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlbumCirclePlus: ImageVector? = null

val Icons.Ts.AlbumCirclePlus: ImageVector
    get() = _AlbumCirclePlus ?: UXIcon(name = "AlbumCirclePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 23f)
                lineTo(17f, 23f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                lineTo(21.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(11f, 12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, 0.34f, -0.03f, 0.67f, -0.08f, 1f)
                horizontalLineToRelative(1.01f)
                curveToRelative(0.04f, -0.33f, 0.07f, -0.66f, 0.07f, -1f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveTo(4f, 7.59f, 4f, 12f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                curveToRelative(0.34f, 0f, 0.67f, -0.03f, 1f, -0.07f)
                verticalLineToRelative(-1.01f)
                curveToRelative(-0.33f, 0.05f, -0.66f, 0.08f, -1f, 0.08f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(20f, 15f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _AlbumCirclePlus = it}
