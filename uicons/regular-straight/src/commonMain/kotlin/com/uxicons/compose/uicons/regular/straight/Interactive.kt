package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interactive: ImageVector? = null

val Icons.Rs.Interactive: ImageVector
    get() = _Interactive ?: UXIcon(name = "Interactive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 6f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.8f, 2.83f)
                lineToRelative(2.18f, 0.79f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6.36f, 6.36f)
                lineTo(8.83f, 13.8f)
                arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 6f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, -8f)
                curveToRelative(0f, 0.12f, -0.01f, 0.23f, -0.02f, 0.35f)
                lineToRelative(1.96f, 0.71f)
                arcToRelative(10.02f, 10.02f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8.88f, 8.88f)
                lineToRelative(-0.71f, -1.96f)
                curveTo(10.23f, 17.99f, 10.12f, 18f, 10f, 18f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 14.78f)
                lineToRelative(-10.46f, -3.8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.56f, 2.56f)
                lineTo(14.78f, 24f)
                lineToRelative(3.9f, -3.9f)
                lineToRelative(2.79f, 2.79f)
                lineToRelative(1.41f, -1.41f)
                lineTo(20.1f, 18.68f)
                close()
                moveTo(15.59f, 20.36f)
                lineTo(12.86f, 12.86f)
                lineTo(20.36f, 15.59f)
                close()
            }
        }.also { _Interactive = it}
