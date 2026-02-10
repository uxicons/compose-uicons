package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Onion: ImageVector? = null

val Icons.Ss.Onion: ImageVector
    get() = _Onion ?: UXIcon(name = "Onion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                curveToRelative(-1.24f, 0f, -2f, -2.91f, -2f, -5f)
                arcToRelative(13.44f, 13.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -7.35f)
                arcTo(13.45f, 13.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 15f)
                curveTo(14f, 17.09f, 13.24f, 20f, 12f, 20f)
                close()
                moveTo(15f, 3.24f)
                horizontalLineToRelative(0f)
                verticalLineTo(0f)
                horizontalLineTo(9f)
                verticalLineTo(3.23f)
                horizontalLineTo(9f)
                curveTo(7.33f, 5.71f, 5f, 9.6f, 5f, 13f)
                curveToRelative(0f, 2.55f, 1.75f, 4.47f, 3.56f, 5.65f)
                arcTo(12.38f, 12.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 15f)
                curveToRelative(0f, -6.34f, 3.16f, -9.57f, 3.29f, -9.71f)
                lineTo(12f, 4.59f)
                lineToRelative(0.71f, 0.71f)
                curveTo(12.84f, 5.43f, 16f, 8.66f, 16f, 15f)
                arcToRelative(12.38f, 12.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.56f, 3.65f)
                curveTo(17.25f, 17.47f, 19f, 15.55f, 19f, 13f)
                curveTo(19f, 9.6f, 16.67f, 5.72f, 15f, 3.24f)
                close()
                moveTo(24f, 13f)
                curveToRelative(0f, -4.29f, -2.94f, -6.86f, -5.59f, -8.32f)
                arcTo(18.1f, 18.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 13f)
                curveToRelative(0f, 5.6f, -6.25f, 9f, -9f, 9f)
                reflectiveCurveToRelative(-9f, -3.4f, -9f, -9f)
                arcTo(18.13f, 18.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.61f, 4.65f)
                curveTo(2.95f, 6.1f, 0f, 8.68f, 0f, 13f)
                curveToRelative(0f, 4.52f, 4.04f, 7.98f, 9.58f, 8.44f)
                lineToRelative(-1.36f, 0.87f)
                lineToRelative(1.1f, 1.67f)
                lineTo(11f, 22.86f)
                verticalLineTo(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(22.87f)
                lineTo(14.7f, 24f)
                lineToRelative(1.11f, -1.66f)
                lineToRelative(-1.39f, -0.89f)
                curveTo(20.06f, 21f, 24f, 17.52f, 24f, 13f)
                close()
            }
        }.also { _Onion = it}
