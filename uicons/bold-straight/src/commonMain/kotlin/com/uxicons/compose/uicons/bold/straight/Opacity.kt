package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Opacity: ImageVector? = null

val Icons.Bs.Opacity: ImageVector
    get() = _Opacity ?: UXIcon(name = "Opacity") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.61f, 0.48f)
                lineToRelative(0.85f, 2.88f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                verticalLineTo(21f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.54f, -0.36f)
                lineToRelative(-0.85f, 2.88f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 12f)
                arcToRelative(9.11f, 9.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.29f, -2.29f)
                lineTo(0.39f, 8.95f)
                arcToRelative(12.08f, 12.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6.1f)
                lineToRelative(2.9f, -0.76f)
                arcTo(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.35f, 4.3f)
                lineTo(5.79f, 1.73f)
                arcTo(12.08f, 12.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.55f, 6.1f)
                lineTo(4.16f, 7.58f)
                arcTo(9.05f, 9.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.35f, 4.3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.16f, 16.42f)
                lineTo(1.55f, 17.9f)
                arcTo(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.8f, 22.27f)
                lineToRelative(1.55f, -2.57f)
                arcTo(9.05f, 9.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.16f, 16.42f)
                close()
            }
        }.also { _Opacity = it}
