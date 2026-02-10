package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Peach: ImageVector? = null

val Icons.Rs.Peach: ImageVector
    get() = _Peach ?: UXIcon(name = "Peach") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.33f, 5.05f)
                arcTo(6.67f, 6.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 1.54f)
                lineToRelative(0.07f, -0.69f)
                lineTo(21.44f, 0.55f)
                arcTo(6.82f, 6.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.59f, 0f)
                arcToRelative(7.36f, 7.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.14f, 3.17f)
                arcTo(4.6f, 4.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
                verticalLineTo(2f)
                curveToRelative(1.91f, 0f, 2.6f, 1.61f, 2.85f, 2.79f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.5f)
                curveTo(0f, 18.6f, 8f, 24f, 12f, 24f)
                reflectiveCurveToRelative(12f, -5.4f, 12f, -12.5f)
                arcTo(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.33f, 5.05f)
                close()
                moveTo(18.59f, 2f)
                arcToRelative(6.16f, 6.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.21f, 0.12f)
                arcToRelative(4.82f, 4.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.49f, 2.1f)
                arcToRelative(7.32f, 7.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.93f, 1.33f)
                arcTo(5.6f, 5.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.59f, 2f)
                close()
                moveTo(12f, 22f)
                curveTo(9.02f, 22f, 2f, 17.57f, 2f, 11.5f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.82f, -4.38f)
                arcTo(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 11.5f)
                arcToRelative(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.83f, 5.95f)
                lineToRelative(1.67f, 1.11f)
                arcTo(14.13f, 14.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 11.5f)
                arcToRelative(7.45f, 7.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.13f, -3.95f)
                arcToRelative(9.6f, 9.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.74f, -1.13f)
                arcTo(5.47f, 5.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 11.5f)
                curveTo(22f, 17.57f, 14.98f, 22f, 12f, 22f)
                close()
            }
        }.also { _Peach = it}
