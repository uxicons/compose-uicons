package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interactive: ImageVector? = null

val Icons.Bs.Interactive: ImageVector
    get() = _Interactive ?: UXIcon(name = "Interactive") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.94f, 7.44f)
                arcToRelative(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.54f, 0.27f)
                lineToRelative(0.47f, 0.17f)
                arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6.06f, 6.07f)
                lineToRelative(-0.17f, -0.47f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.22f, -6.04f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 10f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.91f, 8.96f)
                lineTo(20f, 10.08f)
                curveToRelative(0f, -0.03f, 0f, -0.06f, 0f, -0.08f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 20f)
                curveToRelative(0.03f, 0f, 0.06f, 0f, 0.09f, 0f)
                lineToRelative(-1.12f, -3.08f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.67f)
                lineTo(12.8f, 9.6f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.2f, 3.2f)
                lineTo(13.67f, 24f)
                lineTo(17.77f, 19.9f)
                lineTo(21.88f, 24f)
                lineTo(24f, 21.88f)
                lineTo(19.9f, 17.77f)
                close()
                moveTo(12.78f, 12.78f)
                lineTo(18.55f, 14.88f)
                lineTo(14.88f, 18.55f)
                close()
            }
        }.also { _Interactive = it}
