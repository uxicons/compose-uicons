package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MaskCarnival: ImageVector? = null

val Icons.Ss.MaskCarnival: ImageVector
    get() = _MaskCarnival ?: UXIcon(name = "MaskCarnival") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 10f)
                arcToRelative(34.18f, 34.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.98f, 1.59f)
                curveTo(13.24f, 8.55f, 15.83f, 7f, 19f, 7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4f)
                curveToRelative(-3.31f, 0f, -6f, 1.69f, -6f, 5f)
                lineTo(13f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 8f)
                curveToRelative(0f, -3.31f, -2.69f, -5f, -6f, -5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 7f)
                curveToRelative(3.17f, 0f, 5.76f, 1.55f, 5.98f, 4.59f)
                arcTo(34.18f, 34.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(1f)
                curveTo(0f, 22.31f, 4.39f, 24f, 7f, 24f)
                arcToRelative(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.06f, -1.17f)
                arcTo(3.62f, 3.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcToRelative(3.62f, 3.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.95f, 0.83f)
                arcTo(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 24f)
                curveToRelative(2.61f, 0f, 7f, -1.69f, 7f, -13f)
                lineTo(24f, 10f)
                close()
                moveTo(6.12f, 19.36f)
                curveTo(4.58f, 19.76f, 4.24f, 17.82f, 3.77f, 15f)
                arcToRelative(34.57f, 34.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.26f, 1.62f)
                lineToRelative(0.96f, 0.38f)
                curveTo(8.76f, 17.22f, 7.3f, 19.06f, 6.12f, 19.36f)
                close()
                moveTo(17.85f, 19.36f)
                curveToRelative(-1.18f, -0.3f, -2.64f, -2.15f, -4.87f, -2.36f)
                lineToRelative(0.96f, -0.38f)
                arcTo(34.57f, 34.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.2f, 15f)
                curveTo(19.73f, 17.82f, 19.39f, 19.76f, 17.85f, 19.36f)
                close()
            }
        }.also { _MaskCarnival = it}
