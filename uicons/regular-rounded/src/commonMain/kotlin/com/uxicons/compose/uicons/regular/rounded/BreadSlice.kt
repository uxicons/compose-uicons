package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadSlice: ImageVector? = null

val Icons.Rr.BreadSlice: ImageVector
    get() = _BreadSlice ?: UXIcon(name = "BreadSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 23f)
                lineTo(7f, 23f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                lineTo(2f, 10.45f)
                arcToRelative(1.12f, 1.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.39f, -0.79f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.07f, 5.18f)
                curveTo(0.48f, 2.6f, 2.85f, 1f, 6.24f, 1f)
                lineTo(18.85f, 1f)
                arcToRelative(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.09f, 4.18f)
                horizontalLineToRelative(0f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.55f, 4.48f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.39f, 0.79f)
                lineTo(22f, 18f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 23f)
                close()
                moveTo(6.24f, 3f)
                curveToRelative(-2.41f, 0f, -3.94f, 0.91f, -4.2f, 2.5f)
                arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.92f, 2.69f)
                arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 10.45f)
                lineTo(4f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(17f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(20f, 10.45f)
                arcToRelative(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.03f, -2.26f)
                arcTo(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.96f, 5.5f)
                horizontalLineToRelative(0f)
                arcTo(3.11f, 3.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.85f, 3f)
                close()
                moveTo(8f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                close()
                moveTo(12f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                close()
                moveTo(8f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 16f)
                close()
            }
        }.also { _BreadSlice = it}
