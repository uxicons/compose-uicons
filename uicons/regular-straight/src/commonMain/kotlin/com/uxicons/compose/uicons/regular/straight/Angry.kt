package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angry: ImageVector? = null

val Icons.Rs.Angry: ImageVector
    get() = _Angry ?: UXIcon(name = "Angry") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                arcToRelative(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.67f, 2.25f)
                lineToRelative(-1.33f, 1.49f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                arcToRelative(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.34f, 1.75f)
                lineToRelative(-1.33f, -1.49f)
                arcTo(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14f)
                close()
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 22f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                close()
                moveTo(14f, 10.46f)
                horizontalLineToRelative(0f)
                lineTo(14f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.53f, -1.09f)
                arcTo(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 9f)
                lineTo(18f, 7f)
                curveTo(14.72f, 7f, 14f, 9.5f, 14f, 10.46f)
                close()
                moveTo(7f, 10.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
                verticalLineToRelative(-0.04f)
                horizontalLineToRelative(0f)
                curveTo(10f, 9.5f, 9.28f, 7f, 6f, 7f)
                lineTo(6f, 9f)
                arcToRelative(2.31f, 2.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.47f, 0.41f)
                arcTo(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 10.5f)
                close()
            }
        }.also { _Angry = it}
