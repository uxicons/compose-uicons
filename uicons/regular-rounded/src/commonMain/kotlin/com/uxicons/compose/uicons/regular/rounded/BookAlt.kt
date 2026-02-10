package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookAlt: ImageVector? = null

val Icons.Rr.BookAlt: ImageVector
    get() = _BookAlt ?: UXIcon(name = "BookAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.2f, 2.16f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.1f, -1.08f)
                lineToRelative(-3.82f, 0.69f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3.06f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.72f, 1.78f)
                lineTo(5.9f, 1.08f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                lineTo(0f, 16.79f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.11f, 4.92f)
                lineToRelative(6.29f, 1.14f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.22f, 0f)
                lineTo(19.9f, 21.71f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16.79f)
                lineTo(24f, 6f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.2f, 2.16f)
                close()
                moveTo(11f, 20.93f)
                curveToRelative(-0.08f, -0.01f, -0.17f, -0.03f, -0.25f, -0.04f)
                lineTo(4.46f, 19.75f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16.79f)
                lineTo(2f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.54f, 0.05f)
                lineToRelative(3.82f, 0.7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 5.71f)
                close()
                moveTo(22f, 16.79f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.46f, 2.95f)
                lineToRelative(-6.29f, 1.14f)
                curveToRelative(-0.08f, 0.01f, -0.17f, 0.03f, -0.25f, 0.04f)
                lineTo(13f, 5.71f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.64f, -1.97f)
                lineToRelative(3.82f, -0.7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                close()
            }
        }.also { _BookAlt = it}
