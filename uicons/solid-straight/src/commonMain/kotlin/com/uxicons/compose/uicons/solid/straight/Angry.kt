package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angry: ImageVector? = null

val Icons.Ss.Angry: ImageVector
    get() = _Angry ?: UXIcon(name = "Angry") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.89f, 24f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(6f, 7f)
                curveToRelative(3.28f, 0f, 4f, 2.5f, 4f, 3.46f)
                horizontalLineToRelative(0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.47f, 9.41f)
                arcTo(2.29f, 2.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9f)
                close()
                moveTo(16.34f, 17.75f)
                arcToRelative(6.36f, 6.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.67f, 0f)
                lineToRelative(-1.33f, -1.49f)
                arcToRelative(8.38f, 8.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.33f, 0f)
                close()
                moveTo(18f, 9f)
                arcToRelative(2.3f, 2.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.47f, 0.41f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14f, 10.46f)
                horizontalLineToRelative(0f)
                curveTo(14f, 9.5f, 14.72f, 7f, 18f, 7f)
                close()
            }
        }.also { _Angry = it}
