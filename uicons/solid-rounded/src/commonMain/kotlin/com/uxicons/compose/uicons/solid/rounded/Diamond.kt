package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Diamond: ImageVector? = null

val Icons.Sr.Diamond: ImageVector
    get() = _Diamond ?: UXIcon(name = "Diamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.84f, 2.02f)
                lineToRelative(-8.78f, 11.82f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.72f, 0.03f)
                lineToRelative(-8.83f, -12.06f)
                arcToRelative(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.78f, -1.8f)
                horizontalLineToRelative(6.27f)
                lineToRelative(4.75f, 12.36f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.87f, 0f)
                lineToRelative(4.75f, -12.36f)
                close()
                moveTo(17.7f, 7f)
                horizontalLineToRelative(6.26f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.86f, -1.87f)
                lineToRelative(-2.56f, -3.45f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.25f, -1.68f)
                horizontalLineToRelative(-2.2f)
                close()
                moveTo(11.11f, 0f)
                lineTo(8.45f, 7f)
                horizontalLineToRelative(7.11f)
                lineToRelative(-2.61f, -7f)
                close()
                moveTo(6.31f, 7f)
                lineTo(8.97f, 0f)
                horizontalLineToRelative(-2.32f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.23f, 1.65f)
                lineToRelative(-2.47f, 3.24f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.94f, 2.11f)
                close()
                moveTo(15.54f, 9f)
                horizontalLineToRelative(-7.09f)
                lineToRelative(3.54f, 9.21f)
                close()
            }
        }.also { _Diamond = it}
