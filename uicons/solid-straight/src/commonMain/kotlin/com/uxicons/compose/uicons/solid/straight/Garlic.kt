package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Garlic: ImageVector? = null

val Icons.Ss.Garlic: ImageVector
    get() = _Garlic ?: UXIcon(name = "Garlic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                arcTo(22.15f, 22.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.15f, 9.47f)
                lineTo(12f, 8.13f)
                lineToRelative(0.85f, 1.34f)
                arcTo(22.15f, 22.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 20f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(10.36f, 7.52f)
                curveToRelative(0.48f, -0.69f, 0.82f, -1.1f, 0.87f, -1.17f)
                lineTo(12f, 5.44f)
                lineToRelative(0.77f, 0.92f)
                curveToRelative(0.05f, 0.06f, 0.39f, 0.48f, 0.88f, 1.17f)
                arcTo(31.26f, 31.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 3.95f)
                lineTo(16f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 3.88f)
                arcTo(32.39f, 32.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.36f, 7.52f)
                close()
                moveTo(16.89f, 6.12f)
                arcToRelative(21.62f, 21.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 3.37f)
                arcTo(21.65f, 21.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 20f)
                arcToRelative(5.87f, 5.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.58f, 2.48f)
                arcTo(4.46f, 4.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 23f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
                curveTo(24f, 12.44f, 19.29f, 8f, 16.89f, 6.13f)
                close()
                moveTo(6f, 20f)
                arcTo(21.64f, 21.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.11f, 9.5f)
                arcTo(22.36f, 22.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.13f, 6.11f)
                curveTo(4.74f, 7.97f, 0f, 12.42f, 0f, 18.5f)
                arcToRelative(4.48f, 4.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.6f, 3.97f)
                arcTo(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 20f)
                close()
            }
        }.also { _Garlic = it}
