package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonXmark: ImageVector? = null

val Icons.Ss.OctagonXmark: ImageVector
    get() = _OctagonXmark ?: UXIcon(name = "OctagonXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.12f, 6.15f)
                lineTo(17.85f, 0.88f)
                curveToRelative(-0.57f, -0.57f, -1.32f, -0.88f, -2.12f, -0.88f)
                horizontalLineToRelative(-7.46f)
                curveToRelative(-0.8f, 0f, -1.55f, 0.31f, -2.12f, 0.88f)
                lineTo(0.88f, 6.15f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                verticalLineToRelative(7.46f)
                curveToRelative(0f, 0.8f, 0.31f, 1.55f, 0.88f, 2.12f)
                lineToRelative(5.27f, 5.27f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                horizontalLineToRelative(7.46f)
                curveToRelative(0.8f, 0f, 1.55f, -0.31f, 2.12f, -0.88f)
                lineToRelative(5.27f, -5.27f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                verticalLineToRelative(-7.46f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.88f, -2.12f)
                close()
                moveTo(16.44f, 15.06f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.04f, -3.04f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(-3.04f, -3.04f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.04f, 3.04f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(3.04f, 3.04f)
                close()
            }
        }.also { _OctagonXmark = it}
