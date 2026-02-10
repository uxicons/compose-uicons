package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinHearts: ImageVector? = null

val Icons.Br.GrinHearts: ImageVector
    get() = _GrinHearts ?: UXIcon(name = "GrinHearts") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
            curveTo(0.6f, -3.9f, 23.4f, -3.89f, 24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
            close()
            moveTo(12f, 3f)
            arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, 9f)
            curveToRelative(0.45f, 11.92f, 17.55f, 11.92f, 18f, 0f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
            close()
            moveTo(16.79f, 14.02f)
            arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
            arcTo(15.4f, 15.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.2f, 14.02f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.05f, 1.52f)
            arcTo(6.84f, 6.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 19f)
            arcToRelative(6.83f, 6.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.84f, -3.46f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.79f, 14.02f)
            close()
            moveTo(17.5f, 7f)
            arcTo(1.58f, 1.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 8.65f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
            curveToRelative(0f, 1.3f, 1.69f, 2.82f, 2.54f, 3.49f)
            arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.93f, 0f)
            curveTo(17.31f, 11.47f, 19f, 9.95f, 19f, 8.65f)
            arcTo(1.58f, 1.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 7f)
            close()
            moveTo(9.5f, 7f)
            arcTo(1.58f, 1.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8.65f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
            curveToRelative(0f, 1.3f, 1.69f, 2.82f, 2.54f, 3.49f)
            arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.93f, 0f)
            curveTo(9.31f, 11.47f, 11f, 9.95f, 11f, 8.65f)
            arcTo(1.58f, 1.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 7f)
            close()
        }
    }.also { _GrinHearts = it }
