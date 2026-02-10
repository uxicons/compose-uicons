package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideThinking: ImageVector? = null

val Icons.Sr.HeadSideThinking: ImageVector
    get() = _HeadSideThinking ?: UXIcon(name = "HeadSideThinking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 11f)
                close()
                moveTo(24f, 13f)
                arcToRelative(1.96f, 1.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                horizontalLineToRelative(-0.33f)
                lineToRelative(-0.22f, 1.66f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.49f, 21f)
                lineTo(16f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(6f, 24f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-0.97f)
                arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.74f, -2.35f)
                arcTo(10.99f, 10.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19.8f, 4.42f)
                curveTo(21.07f, 5.99f, 24f, 11.58f, 24f, 13f)
                close()
                moveTo(14.84f, 9.95f)
                lineToRelative(0.99f, -0.57f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, -1.73f)
                lineToRelative(-0.98f, 0.56f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7.14f)
                lineTo(12f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(10f, 7.14f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.14f, 8.21f)
                lineToRelative(-0.98f, -0.56f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, 1.73f)
                lineToRelative(0.99f, 0.57f)
                arcTo(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 11f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.16f, 1.05f)
                lineToRelative(-0.99f, 0.57f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1.73f)
                lineToRelative(0.98f, -0.56f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 14.86f)
                lineTo(10f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(12f, 14.86f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.85f, -1.06f)
                lineToRelative(0.98f, 0.56f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1f, -1.73f)
                lineToRelative(-0.99f, -0.57f)
                arcTo(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 11f)
                arcTo(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.84f, 9.95f)
                close()
            }
        }.also { _HeadSideThinking = it}
