package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlane: ImageVector? = null

val Icons.Rs.PaperPlane: ImageVector
    get() = _PaperPlane ?: UXIcon(name = "PaperPlane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.44f, 6.67f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.86f, 3.34f)
                lineToRelative(3.41f, 3.41f)
                lineTo(3.99f, 20f)
                horizontalLineToRelative(6.59f)
                lineToRelative(3.44f, 3.43f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0.59f)
                arcToRelative(2.03f, 2.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.51f, -0.07f)
                arcToRelative(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, -1.38f)
                lineTo(23.99f, 0.02f)
                close()
                moveTo(2f, 8.59f)
                lineToRelative(17.03f, -5.02f)
                lineTo(5.99f, 16.59f)
                verticalLineToRelative(-4f)
                close()
                moveTo(15.44f, 22.02f)
                lineTo(11.41f, 18f)
                horizontalLineToRelative(-4f)
                lineTo(20.45f, 4.98f)
                close()
            }
        }.also { _PaperPlane = it}
