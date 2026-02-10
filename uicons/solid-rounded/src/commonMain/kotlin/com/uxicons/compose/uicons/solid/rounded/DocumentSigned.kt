package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentSigned: ImageVector? = null

val Icons.Sr.DocumentSigned: ImageVector
    get() = _DocumentSigned ?: UXIcon(name = "DocumentSigned") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 0.3f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.88f, 1.16f)
                lineToRelative(1.66f, 1.66f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.17f, 1.88f)
                horizontalLineToRelative(-4.7f)
                close()
                moveTo(21f, 7f)
                verticalLineToRelative(12f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                horizontalLineToRelative(-8f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                verticalLineToRelative(-14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                close()
                moveTo(16.81f, 17.41f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.4f, -0.22f)
                arcToRelative(4.59f, 4.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.27f, 0.81f)
                arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.86f, -0.34f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.83f, -0.66f)
                arcToRelative(5.86f, 5.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.05f, 1.21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.21f, 1.59f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.83f, -0.79f)
                curveToRelative(0.25f, 0f, 0.37f, 0.08f, 0.7f, 0.3f)
                arcToRelative(3.25f, 3.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0.7f)
                arcToRelative(6.46f, 6.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.46f, -1.19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.21f, -1.39f)
                close()
                moveTo(17f, 14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
                moveTo(17f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                close()
            }
        }.also { _DocumentSigned = it}
