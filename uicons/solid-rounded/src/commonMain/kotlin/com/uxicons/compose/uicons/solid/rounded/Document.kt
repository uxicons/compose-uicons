package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Document: ImageVector? = null

val Icons.Sr.Document: ImageVector
    get() = _Document ?: UXIcon(name = "Document") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 7f)
                verticalLineToRelative(-6.54f)
                arcToRelative(6.98f, 6.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                arcToRelative(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
                moveTo(22f, 10.48f)
                verticalLineToRelative(8.52f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                horizontalLineToRelative(-10f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                verticalLineToRelative(-14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                horizontalLineToRelative(4.51f)
                curveToRelative(0.16f, 0f, 0.32f, 0.01f, 0.48f, 0.02f)
                verticalLineToRelative(6.98f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(6.98f)
                curveToRelative(0.01f, 0.16f, 0.02f, 0.32f, 0.02f, 0.48f)
                close()
                moveTo(14f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
                moveTo(17f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
            }
        }.also { _Document = it}
