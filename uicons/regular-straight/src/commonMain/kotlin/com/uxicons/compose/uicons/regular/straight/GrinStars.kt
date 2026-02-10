package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinStars: ImageVector? = null

val Icons.Rs.GrinStars: ImageVector
    get() = _GrinStars ?: UXIcon(name = "GrinStars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
                moveTo(11.99f, 15f)
                arcTo(21.92f, 21.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 14f)
                curveToRelative(-0.61f, 2.28f, -2.66f, 5f, -6f, 5f)
                reflectiveCurveToRelative(-5.39f, -2.72f, -6.01f, -5f)
                arcTo(21.84f, 21.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.99f, 15f)
                close()
                moveTo(16.39f, 6f)
                lineTo(17.04f, 8.01f)
                horizontalLineToRelative(2.11f)
                lineToRelative(0.3f, 0.92f)
                lineToRelative(-1.71f, 1.24f)
                lineToRelative(0.65f, 2.01f)
                lineToRelative(-0.78f, 0.57f)
                lineTo(15.9f, 11.5f)
                lineTo(14.2f, 12.74f)
                lineToRelative(-0.78f, -0.57f)
                lineToRelative(0.65f, -2.01f)
                lineToRelative(-1.71f, -1.24f)
                lineToRelative(0.3f, -0.92f)
                horizontalLineToRelative(2.11f)
                lineToRelative(0.65f, -2f)
                close()
                moveTo(8.58f, 6f)
                lineToRelative(0.65f, 2.0f)
                lineTo(11.34f, 8.01f)
                lineToRelative(0.3f, 0.92f)
                lineToRelative(-1.71f, 1.24f)
                lineToRelative(0.65f, 2.01f)
                lineToRelative(-0.78f, 0.57f)
                lineTo(8.1f, 11.5f)
                lineTo(6.39f, 12.74f)
                lineToRelative(-0.78f, -0.57f)
                lineToRelative(0.65f, -2.01f)
                lineTo(4.55f, 8.92f)
                lineToRelative(0.3f, -0.92f)
                lineTo(6.96f, 8.01f)
                lineToRelative(0.65f, -2f)
                close()
            }
        }.also { _GrinStars = it}
