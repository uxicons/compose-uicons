package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AlbumCollection: ImageVector? = null

val Icons.Bs.AlbumCollection: ImageVector
    get() = _AlbumCollection ?: UXIcon(name = "AlbumCollection") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 10f)
                lineTo(3.5f, 10f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                lineTo(24f, 24f)
                lineTo(24f, 13.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-3.87f, 0f, -7f, 1.34f, -7f, 3f)
                reflectiveCurveToRelative(3.13f, 3f, 7f, 3f)
                reflectiveCurveToRelative(7f, -1.34f, 7f, -3f)
                reflectiveCurveToRelative(-3.13f, -3f, -7f, -3f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-1.38f, 0f, -2.5f, -0.45f, -2.5f, -1f)
                reflectiveCurveToRelative(1.12f, -1f, 2.5f, -1f)
                reflectiveCurveToRelative(2.5f, 0.45f, 2.5f, 1f)
                reflectiveCurveToRelative(-1.12f, 1f, -2.5f, 1f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(0.76f)
                curveToRelative(-0.95f, -0.79f, -2.17f, -1.26f, -3.5f, -1.26f)
                lineTo(3.5f, 3f)
                curveToRelative(-1.33f, 0f, -2.55f, 0.47f, -3.5f, 1.26f)
                verticalLineToRelative(-0.76f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(20.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(24f, 8.5f)
                verticalLineToRelative(0.76f)
                curveToRelative(-0.95f, -0.79f, -2.17f, -1.26f, -3.5f, -1.26f)
                lineTo(3.5f, 8f)
                curveToRelative(-1.33f, 0f, -2.55f, 0.47f, -3.5f, 1.26f)
                verticalLineToRelative(-0.76f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(20.5f, 5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
            }
        }.also { _AlbumCollection = it}
