package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sad: ImageVector? = null

val Icons.Sr.Sad: ImageVector
    get() = _Sad ?: UXIcon(name = "Sad") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(8f, 8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                curveToRelative(0f, 1f, -0.9f, 1f, -2f, 1f)
                reflectiveCurveToRelative(-2f, 0f, -2f, -1f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                close()
                moveTo(17.75f, 17.67f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0.08f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                arcToRelative(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.34f, 1.75f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.33f, -1.49f)
                arcTo(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14f)
                arcToRelative(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.67f, 2.25f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.75f, 17.67f)
                close()
                moveTo(16f, 11f)
                curveToRelative(-1.1f, 0f, -2f, 0f, -2f, -1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                curveTo(18f, 11f, 17.11f, 11f, 16f, 11f)
                close()
            }
        }.also { _Sad = it}
