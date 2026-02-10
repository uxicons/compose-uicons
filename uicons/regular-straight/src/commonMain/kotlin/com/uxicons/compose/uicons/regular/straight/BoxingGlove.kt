package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxingGlove: ImageVector? = null

val Icons.Rs.BoxingGlove: ImageVector
    get() = _BoxingGlove ?: UXIcon(name = "BoxingGlove") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 7.13f)
                lineTo(20f, 7f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7f, -7f)
                lineTo(8f, 0f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 7f)
                verticalLineToRelative(6.87f)
                arcToRelative(7.96f, 7.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.45f, 4.59f)
                lineToRelative(0.55f, 0.79f)
                lineTo(3f, 24f)
                lineTo(20f, 24f)
                lineTo(20f, 19.36f)
                lineToRelative(0.51f, -0.49f)
                arcTo(8.03f, 8.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 13.07f)
                lineTo(23f, 11f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 7.13f)
                close()
                moveTo(5f, 22f)
                lineTo(5f, 20f)
                lineTo(18f, 20f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 13.07f)
                arcToRelative(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.87f, 4.35f)
                lineTo(18.53f, 18f)
                lineTo(4.57f, 18f)
                lineToRelative(-0.48f, -0.69f)
                arcTo(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 13.87f)
                lineTo(3f, 10.44f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 11f)
                horizontalLineToRelative(8f)
                lineTo(13f, 9f)
                lineTo(5f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 7f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 2f)
                horizontalLineToRelative(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                verticalLineToRelative(0.13f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 11f)
                verticalLineToRelative(3.14f)
                horizontalLineToRelative(2f)
                lineTo(17f, 11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                close()
            }
        }.also { _BoxingGlove = it}
