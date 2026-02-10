package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HomeLocationAlt: ImageVector? = null

val Icons.Rr.HomeLocationAlt: ImageVector
    get() = _HomeLocationAlt ?: UXIcon(name = "HomeLocationAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9.72f)
                lineTo(24f, 19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                lineTo(18f, 24f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                lineTo(22f, 9.72f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.32f, -2.49f)
                lineToRelative(-7f, -4.72f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.36f, 0f)
                lineToRelative(-7f, 4.72f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9.72f)
                lineTo(2f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(6f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                lineTo(5f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                lineTo(0f, 9.72f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.2f, 5.58f)
                lineTo(9.2f, 0.85f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.59f, 0f)
                lineToRelative(7f, 4.72f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 9.72f)
                close()
                moveTo(19f, 15.01f)
                arcToRelative(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.05f, 4.95f)
                lineToRelative(-3.52f, 3.44f)
                arcToRelative(2.06f, 2.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.87f, 0f)
                lineToRelative(-3.51f, -3.43f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 19f, 15.01f)
                close()
                moveTo(17f, 15.01f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8.54f, 3.54f)
                lineToRelative(3.5f, 3.42f)
                lineToRelative(3.58f, -3.43f)
                arcTo(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 15.01f)
                close()
                moveTo(15f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, -3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 15f)
                close()
            }
        }.also { _HomeLocationAlt = it}
