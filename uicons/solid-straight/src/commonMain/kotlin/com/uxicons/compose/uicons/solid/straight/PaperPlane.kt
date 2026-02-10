package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlane: ImageVector? = null

val Icons.Ss.PaperPlane: ImageVector
    get() = _PaperPlane ?: UXIcon(name = "PaperPlane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.52f, 19.9f)
                horizontalLineToRelative(5.32f)
                lineToRelative(3.52f, 3.52f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.44f, 0.6f)
                arcToRelative(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.52f, -0.07f)
                arcToRelative(2.03f, 2.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.45f, -1.41f)
                lineTo(23.99f, 1.43f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.09f, 18.5f)
                lineTo(22.57f, 0.01f)
                lineTo(1.48f, 6.23f)
                arcToRelative(2.05f, 2.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.89f, 3.42f)
                lineToRelative(3.5f, 3.49f)
                close()
            }
        }.also { _PaperPlane = it}
