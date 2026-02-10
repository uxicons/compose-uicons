package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SadTear: ImageVector? = null

val Icons.Rr.SadTear: ImageVector
    get() = _SadTear ?: UXIcon(name = "SadTear") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 9.5f)
                close()
                moveTo(15.5f, 8f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 8f)
                close()
                moveTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                curveTo(-3.9f, 0.6f, -3.89f, 23.4f, 12f, 24f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                close()
                moveTo(22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                curveTo(-1.25f, 21.5f, -1.24f, 2.5f, 12f, 2f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                close()
                moveTo(17.75f, 17.67f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.08f, -1.41f)
                arcTo(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcToRelative(7.52f, 7.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.34f, 1.75f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -0.08f)
                close()
                moveTo(5f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                arcToRelative(6.57f, 6.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.54f, -3.39f)
                curveTo(6.46f, 11.51f, 4.95f, 15.15f, 5f, 16f)
                close()
            }
        }.also { _SadTear = it}
