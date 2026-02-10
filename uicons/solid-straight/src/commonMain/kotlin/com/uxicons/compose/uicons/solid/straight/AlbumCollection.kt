package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlbumCollection: ImageVector? = null

val Icons.Ss.AlbumCollection: ImageVector
    get() = _AlbumCollection ?: UXIcon(name = "AlbumCollection") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 13f)
                curveToRelative(-4.01f, 0f, -7f, 1.58f, -7f, 3f)
                reflectiveCurveToRelative(2.99f, 3f, 7f, 3f)
                reflectiveCurveToRelative(7f, -1.58f, 7f, -3f)
                reflectiveCurveToRelative(-2.99f, -3f, -7f, -3f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.45f, -1.5f, -1f)
                reflectiveCurveToRelative(0.67f, -1f, 1.5f, -1f)
                reflectiveCurveToRelative(1.5f, 0.45f, 1.5f, 1f)
                reflectiveCurveToRelative(-0.67f, 1f, -1.5f, 1f)
                close()
                moveTo(21f, 8f)
                lineTo(3f, 8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(13f)
                lineTo(24f, 24f)
                lineTo(24f, 11f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-5.13f, 0f, -9f, -2.15f, -9f, -5f)
                reflectiveCurveToRelative(3.87f, -5f, 9f, -5f)
                reflectiveCurveToRelative(9f, 2.15f, 9f, 5f)
                reflectiveCurveToRelative(-3.87f, 5f, -9f, 5f)
                close()
                moveTo(0f, 3.03f)
                verticalLineToRelative(-0.03f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(0.03f)
                curveToRelative(-0.84f, -0.63f, -1.87f, -1.03f, -3f, -1.03f)
                lineTo(3f, 2f)
                curveToRelative(-1.13f, 0f, -2.16f, 0.39f, -3f, 1.03f)
                close()
                moveTo(0f, 7.03f)
                verticalLineToRelative(-0.03f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(0.03f)
                curveToRelative(-0.84f, -0.63f, -1.87f, -1.03f, -3f, -1.03f)
                lineTo(3f, 6f)
                curveToRelative(-1.13f, 0f, -2.16f, 0.39f, -3f, 1.03f)
                close()
            }
        }.also { _AlbumCollection = it}
