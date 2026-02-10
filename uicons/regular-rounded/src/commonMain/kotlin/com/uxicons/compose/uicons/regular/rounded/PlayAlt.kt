package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayAlt: ImageVector? = null

val Icons.Rr.PlayAlt: ImageVector
    get() = _PlayAlt ?: UXIcon(name = "PlayAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 24f)
                horizontalLineToRelative(-14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                verticalLineToRelative(-14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -5f)
                horizontalLineToRelative(14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                close()
                moveTo(5f, 2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                close()
                moveTo(9.34f, 17.0f)
                arcToRelative(2.37f, 2.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.19f, -0.32f)
                arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.16f, -2.02f)
                verticalLineToRelative(-5.32f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, -2.03f)
                lineToRelative(5.28f, 2.63f)
                arcToRelative(2.34f, 2.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.05f, 4.08f)
                lineToRelative(-5.38f, 2.69f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.1f, 0.29f)
                close()
                moveTo(9.32f, 9.01f)
                arcToRelative(0.31f, 0.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.16f, 0.04f)
                arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.17f, 0.29f)
                verticalLineToRelative(5.32f)
                arcToRelative(0.34f, 0.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 0.29f)
                lineToRelative(5.38f, -2.69f)
                arcToRelative(0.31f, 0.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.12f, -0.27f)
                arcToRelative(0.33f, 0.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.17f, -0.29f)
                lineToRelative(-5.27f, -2.63f)
                arcToRelative(0.46f, 0.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.23f, -0.07f)
                close()
            }
        }.also { _PlayAlt = it}
