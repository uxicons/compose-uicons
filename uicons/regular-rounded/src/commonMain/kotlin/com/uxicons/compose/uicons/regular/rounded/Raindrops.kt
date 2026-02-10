package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Raindrops: ImageVector? = null

val Icons.Rr.Raindrops: ImageVector
    get() = _Raindrops ?: UXIcon(name = "Raindrops") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 24f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -6f)
                curveToRelative(0f, -1.56f, 1.2f, -4.04f, 3.55f, -7.39f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.9f, 0f)
                curveTo(17.8f, 13.96f, 19f, 16.44f, 19f, 18f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 24f)
                close()
                moveTo(13f, 11.34f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.81f, 0.42f)
                curveTo(9.31f, 15.84f, 9f, 17.48f, 9f, 18f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 0f)
                curveToRelative(0f, -0.52f, -0.31f, -2.16f, -3.19f, -6.24f)
                arcTo(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 11.34f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 11f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6f)
                curveToRelative(0f, -1.26f, 0.84f, -2.85f, 2.57f, -4.88f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.85f, 0f)
                curveTo(9.16f, 3.14f, 10f, 4.74f, 10f, 6f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 11f)
                close()
                moveTo(5f, 2f)
                arcToRelative(1.17f, 1.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.91f, 0.42f)
                curveTo(2.15f, 4.69f, 2f, 5.73f, 2f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 6f)
                curveToRelative(0f, -0.27f, -0.15f, -1.31f, -2.09f, -3.58f)
                arcTo(1.17f, 1.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 9.96f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, -4.5f)
                curveToRelative(0f, -1.09f, 0.7f, -2.51f, 2.15f, -4.33f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.71f, 0f)
                curveTo(23.3f, 2.96f, 24f, 4.37f, 24f, 5.46f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 9.96f)
                close()
                moveTo(19.5f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.79f, 0.38f)
                curveTo(17.12f, 4.38f, 17f, 5.25f, 17f, 5.46f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
                curveToRelative(0f, -0.22f, -0.12f, -1.08f, -1.71f, -3.08f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 2f)
                close()
            }
        }.also { _Raindrops = it}
