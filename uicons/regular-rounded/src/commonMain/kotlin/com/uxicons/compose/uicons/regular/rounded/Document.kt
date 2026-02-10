package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Document: ImageVector? = null

val Icons.Rr.Document: ImageVector
    get() = _Document ?: UXIcon(name = "Document") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                close()
                moveTo(22f, 10.48f)
                verticalLineToRelative(8.52f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                horizontalLineToRelative(-10f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                verticalLineToRelative(-14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                horizontalLineToRelative(4.51f)
                arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.95f, 2.05f)
                lineToRelative(3.48f, 3.49f)
                arcToRelative(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.05f, 4.95f)
                close()
                moveTo(15.05f, 3.46f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.05f, -0.78f)
                verticalLineToRelative(4.32f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(4.32f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.78f, -1.05f)
                close()
                moveTo(20f, 10.48f)
                curveToRelative(0f, -0.17f, -0.03f, -0.32f, -0.05f, -0.48f)
                horizontalLineToRelative(-4.95f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-4.95f)
                curveToRelative(-0.16f, -0.01f, -0.32f, -0.05f, -0.48f, -0.05f)
                horizontalLineToRelative(-4.51f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                close()
            }
        }.also { _Document = it}
