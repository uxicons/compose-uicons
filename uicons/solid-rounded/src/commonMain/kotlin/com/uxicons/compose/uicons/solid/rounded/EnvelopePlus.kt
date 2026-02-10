package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopePlus: ImageVector? = null

val Icons.Sr.EnvelopePlus: ImageVector
    get() = _EnvelopePlus ?: UXIcon(name = "EnvelopePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.88f, 14.55f)
                lineTo(0.74f, 5.41f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineToRelative(7.29f)
                arcToRelative(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.67f, 8.7f)
                lineToRelative(-2.85f, 2.85f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.88f, 14.55f)
                close()
                moveTo(15.54f, 15.96f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.07f, 0f)
                lineTo(0.05f, 7.54f)
                curveTo(0.03f, 7.7f, 0f, 7.84f, 0f, 8f)
                lineTo(0f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(19f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 9.89f)
                arcToRelative(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.48f, 2.08f)
                close()
                moveTo(15f, 6f)
                horizontalLineToRelative(3f)
                lineTo(18f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(20f, 6f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                lineTo(20f, 4f)
                lineTo(20f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(18f, 4f)
                lineTo(15f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 6f)
                close()
            }
        }.also { _EnvelopePlus = it}
