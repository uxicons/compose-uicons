package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mobile: ImageVector? = null

val Icons.Ss.Mobile: ImageVector
    get() = _Mobile ?: UXIcon(name = "Mobile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.19f, 9f)
                arcToRelative(4.9f, 4.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, -0.77f)
                lineToRelative(0.57f, -1.19f)
                lineToRelative(0.54f, 1.19f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, 0.77f)
                close()
                moveTo(21f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(9f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.71f)
                arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.62f, -2.88f)
                lineToRelative(-0.52f, -1.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.7f, -0.04f)
                lineToRelative(-0.54f, 1.19f)
                arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.62f, 2.88f)
                close()
                moveTo(13f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(16f, 14f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _Mobile = it}
