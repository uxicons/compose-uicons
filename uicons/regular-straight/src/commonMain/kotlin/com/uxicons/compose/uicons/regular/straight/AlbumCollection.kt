package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlbumCollection: ImageVector? = null

val Icons.Rs.AlbumCollection: ImageVector
    get() = _AlbumCollection ?: UXIcon(name = "AlbumCollection") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8f)
                lineTo(3f, 8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(13f)
                lineTo(24f, 24f)
                lineTo(24f, 11f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 11f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(11f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-3.98f, 0f, -8f, 1.37f, -8f, 4f)
                reflectiveCurveToRelative(4.02f, 4f, 8f, 4f)
                reflectiveCurveToRelative(8f, -1.37f, 8f, -4f)
                reflectiveCurveToRelative(-4.02f, -4f, -8f, -4f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-3.72f, 0f, -6f, -1.29f, -6f, -2f)
                reflectiveCurveToRelative(2.28f, -2f, 6f, -2f)
                reflectiveCurveToRelative(6f, 1.29f, 6f, 2f)
                reflectiveCurveToRelative(-2.28f, 2f, -6f, 2f)
                close()
                moveTo(13.5f, 16f)
                curveToRelative(0f, 0.55f, -0.67f, 1f, -1.5f, 1f)
                reflectiveCurveToRelative(-1.5f, -0.45f, -1.5f, -1f)
                reflectiveCurveToRelative(0.67f, -1f, 1.5f, -1f)
                reflectiveCurveToRelative(1.5f, 0.45f, 1.5f, 1f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(0.03f)
                curveToRelative(-0.84f, -0.63f, -1.87f, -1.03f, -3f, -1.03f)
                lineTo(3f, 2f)
                curveToRelative(-1.13f, 0f, -2.16f, 0.39f, -3f, 1.03f)
                verticalLineToRelative(-0.03f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(0.03f)
                curveToRelative(-0.84f, -0.63f, -1.87f, -1.03f, -3f, -1.03f)
                lineTo(3f, 6f)
                curveToRelative(-1.13f, 0f, -2.16f, 0.39f, -3f, 1.03f)
                verticalLineToRelative(-0.03f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _AlbumCollection = it}
