package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Train: ImageVector? = null

val Icons.Rr.Train: ImageVector
    get() = _Train ?: UXIcon(name = "Train") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                lineTo(10f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5f)
                close()
                moveTo(21f, 5.72f)
                lineTo(21f, 16.18f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.33f, 3.39f)
                lineToRelative(1.25f, 3.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.85f, 0.76f)
                lineTo(18f, 20.75f)
                arcTo(13.57f, 13.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcToRelative(13.58f, 13.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -1.25f)
                lineTo(4.93f, 23.38f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.85f, -0.76f)
                lineToRelative(1.25f, -3.05f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16.18f)
                lineTo(3f, 5.72f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.47f, 0.96f)
                arcTo(18.37f, 18.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
                arcToRelative(18.33f, 18.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.53f, 0.96f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.72f)
                close()
                moveTo(19f, 11.74f)
                curveTo(17.45f, 14.06f, 15.05f, 16f, 12f, 16f)
                reflectiveCurveToRelative(-5.45f, -1.94f, -7f, -4.26f)
                verticalLineToRelative(4.44f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.51f, 2.61f)
                arcTo(11.33f, 11.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                arcToRelative(11.32f, 11.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.49f, -1.22f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 16.18f)
                close()
                moveTo(19f, 6f)
                lineTo(19f, 5.72f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.08f, -2.86f)
                arcTo(16.36f, 16.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                arcToRelative(16.4f, 16.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.92f, 0.86f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5.72f)
                lineTo(5f, 6f)
                curveToRelative(0f, 2.44f, 2.65f, 8f, 7f, 8f)
                reflectiveCurveTo(19f, 8.44f, 19f, 6f)
                close()
                moveTo(12f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                close()
            }
        }.also { _Train = it}
