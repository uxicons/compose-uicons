package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaughSquint: ImageVector? = null

val Icons.Rr.LaughSquint: ImageVector
    get() = _LaughSquint ?: UXIcon(name = "LaughSquint") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.55f, 7.83f)
                lineTo(15.8f, 9f)
                lineToRelative(1.75f, 1.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.11f, 1.66f)
                lineToRelative(-3f, -2f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.66f)
                lineToRelative(3f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, 1.66f)
                close()
                moveTo(7.55f, 11.83f)
                lineTo(10.55f, 9.83f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.66f)
                lineToRelative(-3f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.11f, 1.66f)
                lineTo(8.2f, 9f)
                lineTo(6.45f, 10.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.11f, 1.66f)
                close()
                moveTo(15.99f, 14f)
                lineTo(8.01f, 14f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.95f, 1.3f)
                arcToRelative(5.18f, 5.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.9f, -0.01f)
                arcTo(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.99f, 14f)
                close()
                moveTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                curveTo(-3.9f, 23.4f, -3.89f, 0.6f, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                curveToRelative(-13.25f, 0.5f, -13.24f, 19.5f, 0f, 20f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                close()
            }
        }.also { _LaughSquint = it}
