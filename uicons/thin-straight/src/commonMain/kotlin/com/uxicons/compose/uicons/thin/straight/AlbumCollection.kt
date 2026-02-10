package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlbumCollection: ImageVector? = null

val Icons.Ts.AlbumCollection: ImageVector
    get() = _AlbumCollection ?: UXIcon(name = "AlbumCollection") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 6f)
                lineTo(2.5f, 6f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                lineTo(24f, 24f)
                lineTo(24f, 8.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-4.49f, 0f, -8f, 2.2f, -8f, 5f)
                reflectiveCurveToRelative(3.51f, 5f, 8f, 5f)
                reflectiveCurveToRelative(8f, -2.2f, 8f, -5f)
                reflectiveCurveToRelative(-3.51f, -5f, -8f, -5f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.79f, 0f, -7f, -1.83f, -7f, -4f)
                reflectiveCurveToRelative(3.21f, -4f, 7f, -4f)
                reflectiveCurveToRelative(7f, 1.83f, 7f, 4f)
                reflectiveCurveToRelative(-3.21f, 4f, -7f, 4f)
                close()
                moveTo(13.5f, 15f)
                curveToRelative(0f, 0.55f, -0.67f, 1f, -1.5f, 1f)
                reflectiveCurveToRelative(-1.5f, -0.45f, -1.5f, -1f)
                reflectiveCurveToRelative(0.67f, -1f, 1.5f, -1f)
                reflectiveCurveToRelative(1.5f, 0.45f, 1.5f, 1f)
                close()
                moveTo(2.5f, 1f)
                curveTo(1.64f, 1f, 0.84f, 1.26f, 0.15f, 1.68f)
                curveTo(0.49f, 0.71f, 1.41f, 0f, 2.5f, 0f)
                lineTo(21.5f, 0f)
                curveToRelative(1.09f, 0f, 2.01f, 0.71f, 2.35f, 1.68f)
                curveToRelative(-0.69f, -0.42f, -1.49f, -0.68f, -2.35f, -0.68f)
                lineTo(2.5f, 1f)
                close()
                moveTo(2.5f, 4f)
                curveToRelative(-0.86f, 0f, -1.66f, 0.26f, -2.35f, 0.68f)
                curveToRelative(0.34f, -0.97f, 1.26f, -1.68f, 2.35f, -1.68f)
                lineTo(21.5f, 3f)
                curveToRelative(1.09f, 0f, 2.01f, 0.71f, 2.35f, 1.68f)
                curveToRelative(-0.69f, -0.42f, -1.49f, -0.68f, -2.35f, -0.68f)
                lineTo(2.5f, 4f)
                close()
            }
        }.also { _AlbumCollection = it}
