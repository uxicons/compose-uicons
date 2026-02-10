package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Diamond: ImageVector? = null

val Icons.Rr.Diamond: ImageVector
    get() = _Diamond ?: UXIcon(name = "Diamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.22f, 5.74f)
                lineToRelative(-3.01f, -4.07f)
                arcToRelative(4.0f, 4.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.25f, -1.68f)
                horizontalLineToRelative(-9.91f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.25f, 1.66f)
                lineToRelative(-3.06f, 4.1f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.12f, 4.78f)
                lineToRelative(8.79f, 12.33f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.35f, 1.14f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.38f, -1.18f)
                lineToRelative(8.72f, -12.19f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.12f, -4.89f)
                close()
                moveTo(18.59f, 2.85f)
                lineTo(21.61f, 6.93f)
                curveToRelative(0.02f, 0.02f, 0.02f, 0.05f, 0.04f, 0.07f)
                horizontalLineToRelative(-4.89f)
                lineToRelative(-1.43f, -5f)
                horizontalLineToRelative(1.63f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.64f, 0.85f)
                close()
                moveTo(12f, 19.12f)
                lineTo(9.3f, 9f)
                horizontalLineToRelative(5.4f)
                close()
                moveTo(9.33f, 7f)
                lineTo(10.75f, 2f)
                horizontalLineToRelative(2.49f)
                lineToRelative(1.43f, 5f)
                close()
                moveTo(5.42f, 2.84f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.63f, -0.84f)
                horizontalLineToRelative(1.63f)
                lineToRelative(-1.43f, 5f)
                horizontalLineToRelative(-4.93f)
                curveToRelative(0.01f, -0.02f, 0.02f, -0.05f, 0.03f, -0.07f)
                close()
                moveTo(2.45f, 9.32f)
                arcToRelative(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.18f, -0.33f)
                horizontalLineToRelative(4.97f)
                lineToRelative(2.99f, 11.23f)
                close()
                moveTo(13.77f, 20.24f)
                lineTo(16.77f, 9f)
                horizontalLineToRelative(4.99f)
                arcToRelative(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.24f, 0.42f)
                close()
            }
        }.also { _Diamond = it}
