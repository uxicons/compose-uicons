package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Diamond: ImageVector? = null

val Icons.Rs.Diamond: ImageVector
    get() = _Diamond ?: UXIcon(name = "Diamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.36f, 9.8f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.08f, -3.6f)
                lineToRelative(-3.53f, -4.94f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.44f, -1.26f)
                horizontalLineToRelative(-10.94f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.44f, 1.26f)
                lineToRelative(-3.53f, 4.94f)
                arcToRelative(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.09f, 3.6f)
                lineToRelative(11.36f, 14.31f)
                close()
                moveTo(7.25f, 9f)
                lineTo(10.05f, 18.43f)
                lineTo(2.56f, 9f)
                close()
                moveTo(21.44f, 9f)
                lineTo(13.95f, 18.43f)
                lineTo(16.75f, 9f)
                close()
                moveTo(14.66f, 9f)
                lineTo(12f, 17.98f)
                lineTo(9.34f, 9f)
                close()
                moveTo(9.33f, 7f)
                lineTo(10.75f, 2f)
                horizontalLineToRelative(2.49f)
                lineToRelative(1.43f, 5f)
                close()
                moveTo(18.28f, 2.42f)
                lineTo(21.55f, 7f)
                horizontalLineToRelative(-4.8f)
                lineToRelative(-1.43f, -5f)
                horizontalLineToRelative(2.14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.81f, 0.42f)
                close()
                moveTo(5.72f, 2.42f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.81f, -0.42f)
                horizontalLineToRelative(2.14f)
                lineToRelative(-1.43f, 5f)
                horizontalLineToRelative(-4.8f)
                close()
            }
        }.also { _Diamond = it}
