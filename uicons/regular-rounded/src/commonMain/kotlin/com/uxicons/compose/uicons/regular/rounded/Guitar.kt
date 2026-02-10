package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Guitar: ImageVector? = null

val Icons.Rr.Guitar: ImageVector
    get() = _Guitar ?: UXIcon(name = "Guitar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 14f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.71f, 16.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 1.41f)
                lineToRelative(2f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.48f, 0.52f)
                arcToRelative(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, 0f)
                lineToRelative(-0.21f, 0.21f)
                arcToRelative(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.53f, 2.62f)
                lineTo(16.26f, 6.33f)
                arcToRelative(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.7f, 0.23f)
                arcToRelative(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.45f, 0.51f)
                arcToRelative(2.28f, 2.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.55f, 0.96f)
                arcToRelative(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.5f, 2.04f)
                curveToRelative(-2.96f, 2.96f, -2.7f, 8.03f, 0.57f, 11.3f)
                arcTo(8.8f, 8.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.81f, 24f)
                arcToRelative(7.16f, 7.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.12f, -2.06f)
                arcToRelative(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.04f, -4.5f)
                arcToRelative(2.28f, 2.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.96f, -1.55f)
                arcToRelative(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.51f, -0.45f)
                arcToRelative(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.23f, -7.7f)
                lineToRelative(2.98f, -2.98f)
                arcToRelative(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.62f, -1.53f)
                lineToRelative(0.21f, -0.21f)
                arcTo(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.48f, 0.52f)
                close()
                moveTo(16.03f, 14.03f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, 0.27f)
                arcToRelative(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.75f, 2.99f)
                arcToRelative(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.46f, 3.24f)
                curveToRelative(-2.17f, 2.17f, -5.97f, 1.92f, -8.47f, -0.57f)
                reflectiveCurveTo(1.3f, 13.65f, 3.48f, 11.48f)
                arcToRelative(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.24f, -1.46f)
                arcToRelative(4.19f, 4.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.99f, -1.75f)
                arcToRelative(2.89f, 2.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.27f, -0.3f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.42f, 7f)
                arcToRelative(4.43f, 4.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.42f, 0.75f)
                lineTo(13.29f, 9.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                lineToRelative(1.54f, -1.54f)
                arcTo(3.86f, 3.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.03f, 14.03f)
                close()
            }
        }.also { _Guitar = it}
