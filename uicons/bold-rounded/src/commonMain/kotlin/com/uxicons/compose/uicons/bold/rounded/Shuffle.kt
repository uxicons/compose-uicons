package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shuffle: ImageVector? = null

val Icons.Br.Shuffle: ImageVector
    get() = _Shuffle ?: UXIcon(name = "Shuffle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.41f, 7.9f)
            verticalLineTo(9.59f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.71f, 0.71f)
            lineToRelative(3.59f, -3.59f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.41f)
            lineTo(20.12f, 1.71f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.71f, 0.71f)
            verticalLineToRelative(2.4f)
            curveToRelative(-3.35f, 0.73f, -5.6f, 2.78f, -7.51f, 4.91f)
            curveTo(8.72f, 7.32f, 6.08f, 5.02f, 1.83f, 4.59f)
            curveToRelative(-0.05f, -0.01f, -0.31f, -0.04f, -0.33f, -0.04f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.13f, 2.99f)
            horizontalLineToRelative(0f)
            curveToRelative(3.46f, 0.3f, 5.5f, 2.16f, 7.55f, 4.46f)
            curveToRelative(-2.05f, 2.3f, -4.09f, 4.17f, -7.55f, 4.46f)
            horizontalLineToRelative(0f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 19.45f)
            curveToRelative(0.04f, 0f, 0.07f, 0f, 0.11f, -0.01f)
            horizontalLineToRelative(0f)
            curveTo(6.84f, 19f, 9.65f, 15.75f, 12.15f, 12.86f)
            curveTo(14.06f, 10.65f, 15.79f, 8.7f, 18.41f, 7.9f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.12f, 13.71f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.71f, 0.71f)
            verticalLineToRelative(1.7f)
            arcToRelative(9.19f, 9.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.45f, -2f)
            arcToRelative(1.47f, 1.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.06f, 0.16f)
            lineToRelative(-0.03f, 0.03f)
            arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.17f, 2.11f)
            arcTo(11.98f, 11.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.41f, 19.2f)
            verticalLineToRelative(2.39f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.71f, 0.71f)
            lineToRelative(3.59f, -3.59f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.41f)
            close()
        }
    }.also { _Shuffle = it }
