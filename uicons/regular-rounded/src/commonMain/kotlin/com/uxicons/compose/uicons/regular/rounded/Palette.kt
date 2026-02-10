package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Palette: ImageVector? = null

val Icons.Rr.Palette: ImageVector
    get() = _Palette ?: UXIcon(name = "Palette") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.11f, 8.05f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 18.95f, 9.12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.11f, 8.05f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.12f, 5.05f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.95f, 6.12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.12f, 5.05f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.12f, 8.05f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.95f, 9.12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.12f, 8.05f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.12f, 14.05f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.95f, 15.12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.12f, 14.05f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 0.01f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.08f, 12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
                curveToRelative(0.34f, 0f, 0.67f, -0.02f, 1f, -0.05f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.92f, -1f)
                lineToRelative(-0.03f, -3.59f)
                arcTo(3.57f, 3.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.06f, 16.8f)
                lineToRelative(0.1f, 0.1f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.77f, 0.52f)
                arcToRelative(1.89f, 1.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.38f, -1.18f)
                arcTo(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24.08f, 11.7f)
                arcTo(12.15f, 12.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 0.01f)
                close()
                moveTo(21.48f, 15.41f)
                lineTo(21.47f, 15.39f)
                arcToRelative(5.57f, 5.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.5f, 3.98f)
                lineTo(11.99f, 22f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.09f, -20f)
                curveToRelative(0.12f, 0f, 0.23f, 0f, 0.35f, 0.01f)
                arcToRelative(10.13f, 10.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.64f, 9.74f)
                arcTo(9.89f, 9.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.48f, 15.4f)
                close()
            }
        }.also { _Palette = it}
