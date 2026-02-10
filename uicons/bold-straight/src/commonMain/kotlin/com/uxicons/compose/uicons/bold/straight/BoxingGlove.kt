package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxingGlove: ImageVector? = null

val Icons.Bs.BoxingGlove: ImageVector
    get() = _BoxingGlove ?: UXIcon(name = "BoxingGlove") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 7.26f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 0f)
                horizontalLineToRelative(-4f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 7.5f)
                verticalLineToRelative(6.37f)
                arcToRelative(8.46f, 8.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.54f, 4.88f)
                lineTo(4f, 20.46f)
                lineTo(4f, 24f)
                lineTo(18f, 24f)
                lineTo(18f, 21.62f)
                lineToRelative(2.36f, -2.39f)
                arcTo(8.54f, 8.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 13.07f)
                lineTo(23f, 11.5f)
                arcTo(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 7.26f)
                close()
                moveTo(20f, 13.07f)
                arcToRelative(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.74f, 4.02f)
                lineTo(16.37f, 19f)
                lineTo(6.69f, 19f)
                lineTo(4.96f, 16.97f)
                arcTo(5.48f, 5.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 13.87f)
                lineTo(4f, 11.74f)
                arcTo(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 9f)
                lineTo(5.5f, 9f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 7.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 3f)
                horizontalLineToRelative(4f)
                arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.49f, 4.26f)
                arcTo(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 11.5f)
                lineTo(14f, 14f)
                horizontalLineToRelative(3f)
                lineTo(17f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                close()
            }
        }.also { _BoxingGlove = it}
