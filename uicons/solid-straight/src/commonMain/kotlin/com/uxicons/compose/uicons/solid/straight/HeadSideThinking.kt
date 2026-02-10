package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideThinking: ImageVector? = null

val Icons.Ss.HeadSideThinking: ImageVector
    get() = _HeadSideThinking ?: UXIcon(name = "HeadSideThinking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, -2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 11f)
                close()
                moveTo(24f, 12.79f)
                lineTo(24f, 15f)
                lineTo(21.67f, 15f)
                lineToRelative(-0.45f, 3.39f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.25f, 21f)
                lineTo(16f, 21f)
                verticalLineToRelative(3f)
                lineTo(3f, 24f)
                lineTo(3f, 19.29f)
                arcToRelative(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.46f, -1.26f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.45f, 0.11f)
                arcTo(10.9f, 10.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.8f, 4.42f)
                arcToRelative(32.9f, 32.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.47f, 6.71f)
                curveTo(23.49f, 11.62f, 24f, 12.79f, 24f, 12.79f)
                close()
                moveTo(14.84f, 9.94f)
                lineTo(16.7f, 8.87f)
                lineToRelative(-1f, -1.73f)
                lineTo(13.85f, 8.2f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7.14f)
                lineTo(12f, 5f)
                lineTo(10f, 5f)
                lineTo(10f, 7.14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.15f, 8.2f)
                lineTo(6.3f, 7.13f)
                lineToRelative(-1f, 1.73f)
                lineTo(7.16f, 9.94f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 11f)
                arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.16f, 1.06f)
                lineTo(5.3f, 13.13f)
                lineToRelative(1f, 1.73f)
                lineTo(8.15f, 13.8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 14.86f)
                lineTo(10f, 17f)
                horizontalLineToRelative(2f)
                lineTo(12f, 14.86f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.85f, 13.8f)
                lineTo(15.7f, 14.87f)
                lineToRelative(1f, -1.73f)
                lineToRelative(-1.86f, -1.07f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 11f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.84f, 9.94f)
                close()
            }
        }.also { _HeadSideThinking = it}
