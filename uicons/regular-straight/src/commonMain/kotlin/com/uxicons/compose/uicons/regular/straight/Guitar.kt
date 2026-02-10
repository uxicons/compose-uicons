package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Guitar: ImageVector? = null

val Icons.Rs.Guitar: ImageVector
    get() = _Guitar ?: UXIcon(name = "Guitar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.04f, 17.46f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 5f)
                lineToRelative(1.98f, -1.98f)
                arcToRelative(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, -2.5f)
                lineTo(19f, 2.5f)
                lineTo(19f, 3.65f)
                lineTo(16.28f, 6.34f)
                arcToRelative(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.72f, 0.21f)
                arcTo(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.6f, 7.9f)
                arcToRelative(0.26f, 0.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.13f, 0.11f)
                arcToRelative(7.17f, 7.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.4f, 2.06f)
                curveToRelative(-2.96f, 2.96f, -2.7f, 8.03f, 0.57f, 11.3f)
                arcTo(8.8f, 8.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.81f, 24f)
                arcToRelative(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.18f, -7.46f)
                arcToRelative(0.17f, 0.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.1f, -0.13f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.34f, -0.96f)
                arcTo(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.69f, 7.76f)
                lineTo(20.48f, 5f)
                close()
                moveTo(16.03f, 14.03f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.81f, 0.58f)
                arcToRelative(2.16f, 2.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.22f, 2f)
                arcToRelative(5.19f, 5.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.47f, 3.92f)
                curveToRelative(-2.17f, 2.17f, -5.97f, 1.92f, -8.47f, -0.57f)
                reflectiveCurveTo(1.3f, 13.65f, 3.48f, 11.48f)
                arcTo(5.16f, 5.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.18f, 10f)
                curveToRelative(0.07f, 0f, 0.14f, 0f, 0.21f, 0f)
                arcToRelative(2.14f, 2.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -1.22f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.58f, -0.81f)
                arcToRelative(3.86f, 3.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.87f, -0.21f)
                lineToRelative(-1.8f, 1.78f)
                lineToRelative(1.41f, 1.42f)
                lineToRelative(1.8f, -1.78f)
                arcTo(3.85f, 3.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.03f, 14.03f)
                close()
            }
        }.also { _Guitar = it}
