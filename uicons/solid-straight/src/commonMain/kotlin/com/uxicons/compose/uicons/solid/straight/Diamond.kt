package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Diamond: ImageVector? = null

val Icons.Ss.Diamond: ImageVector
    get() = _Diamond ?: UXIcon(name = "Diamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.73f, 9f)
                lineToRelative(-3.73f, 15f)
                lineToRelative(-3.73f, -15f)
                close()
                moveTo(10.97f, 0f)
                lineTo(8.43f, 7f)
                horizontalLineToRelative(7.14f)
                lineToRelative(-2.54f, -7f)
                close()
                moveTo(17.7f, 7f)
                horizontalLineToRelative(6.14f)
                arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.4f, -0.8f)
                lineToRelative(-3.53f, -4.94f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.44f, -1.26f)
                horizontalLineToRelative(-2.31f)
                close()
                moveTo(17.79f, 9f)
                lineTo(15.02f, 20.3f)
                lineTo(23.36f, 9.8f)
                arcToRelative(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.44f, -0.8f)
                close()
                moveTo(6.21f, 9f)
                horizontalLineToRelative(-6.01f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.45f, 0.8f)
                lineToRelative(8.34f, 10.5f)
                close()
                moveTo(6.3f, 7f)
                lineTo(8.85f, 0f)
                horizontalLineToRelative(-2.31f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.44f, 1.26f)
                lineToRelative(-3.53f, 4.94f)
                arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.4f, 0.8f)
                close()
            }
        }.also { _Diamond = it}
