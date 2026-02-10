package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlane: ImageVector? = null

val Icons.Rr.PaperPlane: ImageVector
    get() = _PaperPlane ?: UXIcon(name = "PaperPlane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.12f, 0.88f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.8f, -0.8f)
                lineToRelative(-16f, 3.37f)
                arcToRelative(5.0f, 5.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.85f, 8.48f)
                lineTo(3.18f, 13.65f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.29f, 0.71f)
                verticalLineToRelative(3.17f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.3f, 1.28f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(0.03f, 0.03f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.16f, 20.2f)
                lineToRelative(0.03f, 0.03f)
                lineToRelative(0.01f, -0.01f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.28f, 0.3f)
                lineTo(9.64f, 20.52f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.71f, 0.29f)
                lineToRelative(1.72f, 1.72f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.59f, 24f)
                arcToRelative(5.05f, 5.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, -0.26f)
                arcToRelative(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.34f, -3.99f)
                lineTo(23.91f, 3.71f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.12f, 0.88f)
                close()
                moveTo(4.6f, 12.24f)
                lineTo(2.88f, 10.52f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.72f, -3.07f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, -2.03f)
                lineTo(20.5f, 2.09f)
                lineTo(5.47f, 17.11f)
                lineTo(5.47f, 14.36f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.6f, 12.24f)
                close()
                moveTo(18.57f, 19.41f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.09f, 1.71f)
                lineTo(11.76f, 19.4f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -0.88f)
                lineTo(6.89f, 18.52f)
                lineTo(21.91f, 3.5f)
                close()
            }
        }.also { _PaperPlane = it}
