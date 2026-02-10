package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sport: ImageVector? = null

val Icons.Rr.Sport: ImageVector
    get() = _Sport ?: UXIcon(name = "Sport") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 24f)
                horizontalLineTo(6f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -6f)
                verticalLineTo(15.16f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.24f, 9.29f)
                lineTo(20.01f, 11.98f)
                lineTo(21.88f, 0.83f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.97f, 0.33f)
                lineTo(21.4f, 15.8f)
                arcToRelative(9.34f, 9.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.67f, 2.51f)
                arcTo(9.52f, 9.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.01f, 24f)
                close()
                moveTo(5.99f, 11.16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.99f, 4f)
                verticalLineTo(18f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(6.01f)
                arcTo(7.52f, 7.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.9f, 17.51f)
                arcToRelative(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.52f, -2.01f)
                lineToRelative(0.26f, -1.54f)
                lineTo(6.82f, 11.25f)
                arcTo(4.04f, 4.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.99f, 11.16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.52f, 17.06f)
                arcToRelative(1.03f, 1.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.21f, -0.02f)
                lineTo(5.8f, 15.25f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.21f, 13.3f)
                lineToRelative(8.51f, 1.78f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.2f, 1.98f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 20.28f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.21f, -0.02f)
                lineTo(4.83f, 19.21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.41f, -1.96f)
                lineToRelative(4.96f, 1.05f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 20.28f)
                close()
            }
        }.also { _Sport = it}
