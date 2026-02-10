package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bolt: ImageVector? = null

val Icons.Rr.Bolt: ImageVector
    get() = _Bolt ?: UXIcon(name = "Bolt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.24f, 24f)
                arcToRelative(2.26f, 2.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.95f, -0.21f)
                arcToRelative(2.18f, 2.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.2f, -2.62f)
                lineTo(10.65f, 16f)
                horizontalLineTo(6.97f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.1f, 12.13f)
                lineToRelative(3.02f, -10f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0f)
                horizontalLineToRelative(3.69f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.43f, 3.51f)
                lineTo(14.44f, 8f)
                horizontalLineTo(17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.48f, 4.68f)
                lineToRelative(-6.4f, 10.3f)
                arcTo(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.24f, 24f)
                close()
                moveTo(10f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.96f, 0.71f)
                lineToRelative(-3.02f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.97f, 14f)
                horizontalLineTo(12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.96f, 1.29f)
                lineTo(11.01f, 21.73f)
                arcToRelative(0.18f, 0.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.12f, 0.24f)
                arcTo(0.19f, 0.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.4f, 21.9f)
                lineToRelative(6.4f, -10.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.08f, -1.06f)
                arcTo(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 10f)
                horizontalLineTo(13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.94f, -1.35f)
                lineToRelative(2.19f, -5.84f)
                arcTo(0.6f, 0.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.69f, 2f)
                close()
            }
        }.also { _Bolt = it}
