package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Train: ImageVector? = null

val Icons.Rs.Train: ImageVector
    get() = _Train ?: UXIcon(name = "Train") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 6f)
                lineTo(9f, 6f)
                lineTo(9f, 4f)
                horizontalLineToRelative(6f)
                close()
                moveTo(21f, 18.3f)
                lineTo(20.83f, 18.55f)
                arcToRelative(6.19f, 6.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.48f, 1.41f)
                lineTo(21f, 24f)
                lineTo(18.84f, 24f)
                lineToRelative(-1.25f, -3.05f)
                arcTo(13.94f, 13.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcToRelative(13.94f, 13.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.59f, -1.05f)
                lineTo(5.16f, 24f)
                lineTo(3f, 24f)
                lineToRelative(1.65f, -4.03f)
                arcToRelative(6.19f, 6.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.48f, -1.41f)
                lineTo(3f, 18.3f)
                lineTo(3f, 4f)
                arcTo(2.93f, 2.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.88f, 1.52f)
                arcTo(20.15f, 20.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                arcToRelative(20.15f, 20.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.12f, 1.52f)
                arcTo(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 4f)
                close()
                moveTo(5.01f, 4.25f)
                curveTo(5.1f, 8.42f, 7.52f, 14f, 12f, 14f)
                reflectiveCurveToRelative(6.9f, -5.58f, 6.99f, -9.75f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.61f, -0.86f)
                arcTo(18.52f, 18.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                arcTo(18.52f, 18.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.62f, 3.38f)
                arcTo(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.01f, 4.25f)
                close()
                moveTo(19f, 11.41f)
                curveTo(17.42f, 14.09f, 14.98f, 16f, 12f, 16f)
                reflectiveCurveToRelative(-5.42f, -1.91f, -7f, -4.59f)
                verticalLineToRelative(6.24f)
                curveTo(5.55f, 18.26f, 7.53f, 20f, 12f, 20f)
                reflectiveCurveToRelative(6.44f, -1.74f, 7f, -2.35f)
                close()
                moveTo(12f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                close()
            }
        }.also { _Train = it}
